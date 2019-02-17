package com.melisa.rincemathew.malayalamgkquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class questionanswer extends AppCompatActivity {
    android.support.v7.widget.Toolbar toolbar;

    Button next;
    Button check;
    QstnArray qstnArray;
    AnswerArray answerArray;
    Utils.OptionArray optionArray;
    String question;
    int score=0;
    int secs = 1;
    AdView mAdview;
    private InterstitialAd mInterstitialAd;


    List<Integer> questionNumber;
    List<String> optArray;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    int i=0;


    TextView questionTextView;
    TextView scoreTextView;
    TextView quizProgress;
    TextView textView;
    Thread t;
    private int[] Numbers;
    Random random;
    private CountDownTimer countDownTimer;
    private boolean timerHasStarted = false;
    private final long startTime = 30 * 1000;
    private final long interval = 1 * 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionanswer);
        toolbar= (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        next=findViewById(R.id.button6);
        check=findViewById(R.id.button5);
       ;
        MobileAds.initialize(this,"ca-app-pub-6234689785392855~6425193150");
       // MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        questionTextView = (TextView) findViewById(R.id.questionTextView);
        quizProgress = (TextView) findViewById(R.id.quizProgress);
        scoreTextView = (TextView) findViewById(R.id.scoreTextView);

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);


        mInterstitialAd = new InterstitialAd(this);
         mInterstitialAd.setAdUnitId("ca-app-pub-6234689785392855/5143066920");
        //mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
//        mInterstitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdClosed() {
//                Intent intent = new Intent(getApplicationContext(), ScoreActivity.class);
//                intent.putExtra("SCORE", score);
//                startActivity(intent);
//                // startActivity(new Intent(QuizActivity.this,ScoreActivity.class));
//            }
//        });


        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        Typeface fontHindi = Typeface.createFromAsset(getAssets(),
                "Dyuthi-Regular.ttf");
        questionTextView.setTypeface(fontHindi);
        button1.setTypeface(fontHindi);
        button2.setTypeface(fontHindi);
        button3.setTypeface(fontHindi);
        button4.setTypeface(fontHindi);

        qstnArray = new QstnArray();
        answerArray = new AnswerArray();


        questionNumber = new ArrayList<>();

        for (int j = 0; j < qstnArray.getquestionListLength(); j++) {
            questionNumber.add(j);
        }

        Collections.shuffle(questionNumber);


        setQuestion(i);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button1.setBackgroundResource(R.drawable.normal);
                button2.setBackgroundResource(R.drawable.normal);
                button3.setBackgroundResource(R.drawable.normal);
                button4.setBackgroundResource(R.drawable.normal);
                i++;
                setQuestion(i);

            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                greenlite();
            }
        });
    }





    public void setQuestion(int i) {

        try {
            if (i < questionNumber.size()) {
                questionTextView.setText(qstnArray.getQuestion(questionNumber.get(i)));
                optionArray = new Utils.OptionArray(questionNumber.get(i));
                optArray = new ArrayList<>(optionArray.getOptionArray());

                Collections.shuffle(optArray);
                button1.setText(optArray.get(0));
                button2.setText(optArray.get(1));
                button3.setText(optArray.get(2));
                button4.setText(optArray.get(3));
                quizProgress.setText((i + 1) + " Of " + qstnArray.getquestionListLength());
            } else {
                gameover();

            }
        } catch (Exception e) {

        }


    }



    private void greenlite(){
        if (button1.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
            button1.setBackgroundResource(R.drawable.right);

        }
        else if (button2.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))){
            button2.setBackgroundResource(R.drawable.right);
        }
        else if (button3.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))){
            button3.setBackgroundResource(R.drawable.right);
        }
        else if (button4.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))){
            button4.setBackgroundResource(R.drawable.right);
        }

    }

    public void gameover() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);

        }


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Are you sure you want to exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }



}
