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
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class timerActivity extends AppCompatActivity {

    QstnArray qstnArray;
    AnswerArray answerArray;
    Utils.OptionArray optionArray;
    String question;
    int score=0;
    int life=3;
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
    ImageView life1;
    ImageView life2;
    ImageView life3;
    TextView textView;
    //CountDownTimer timer;
    int count=30;
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
        setContentView(R.layout.activity_timer);

        MobileAds.initialize(this,"ca-app-pub-6234689785392855~6425193150");
        //MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        questionTextView = (TextView) findViewById(R.id.questionTextView);
        quizProgress = (TextView) findViewById(R.id.quizProgress);
        scoreTextView = (TextView) findViewById(R.id.scoreTextView);
        textView = findViewById(R.id.time);
        countDownTimer = new MyCountDownTimer(startTime, interval);
        textView.setText(textView.getText() + String.valueOf(startTime / 1000));
        //time();

        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-6234689785392855/5143066920");
        //mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intent = new Intent(getApplicationContext(), ScoreActivity.class);
                intent.putExtra("SCORE", score);
                startActivity(intent);
                // startActivity(new Intent(QuizActivity.this,ScoreActivity.class));
            }
        });


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

        life1 = (ImageView) findViewById(R.id.life1);
        life2 = (ImageView) findViewById(R.id.life2);
        life3 = (ImageView) findViewById(R.id.life3);

        qstnArray = new QstnArray();
        answerArray = new AnswerArray();


        questionNumber = new ArrayList<>();

        for (int j = 0; j < qstnArray.getquestionListLength(); j++) {
            questionNumber.add(j);
        }

        Collections.shuffle(questionNumber);


        setQuestion(i);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    i++;
                    score += 10;


                    button1.setBackgroundResource(R.drawable.right);

                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button1.setBackgroundResource(R.drawable.normal);
                            setQuestion(i);

                        }
                    });
                } else {
                    greenlite();
                    i++;
                    score -= 5;
                    scoreTextView.setText("Score : " + score + "");
                    life -= 1;
                    button1.setBackgroundResource(R.drawable.wrong);
                    setLife(life);
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button1.setBackgroundResource(R.drawable.normal);
                            setQuestion(i);

                        }
                    });
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    i++;
                    score += 10;


                    button2.setBackgroundResource(R.drawable.right);

                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button2.setBackgroundResource(R.drawable.normal);
                            setQuestion(i);
                        }
                    });
                } else {
                    greenlite();
                    i++;
                    score -= 5;
                    scoreTextView.setText("Score : " + score + "");
                    life -= 1;
                    button2.setBackgroundResource(R.drawable.wrong);
                    setLife(life);
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button2.setBackgroundResource(R.drawable.normal);
                            setQuestion(i);

                        }
                    });
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    i++;
                    score += 10;


                    button3.setBackgroundResource(R.drawable.right);

                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button3.setBackgroundResource(R.drawable.normal);
                            setQuestion(i);
                        }
                    });
                } else {
                    greenlite();
                    i++;
                    score -= 5;
                    scoreTextView.setText("Score : " + score + "");
                    life -= 1;
                    button3.setBackgroundResource(R.drawable.wrong);
                    setLife(life);
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button3.setBackgroundResource(R.drawable.normal);
                            setQuestion(i);

                        }
                    });
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
                    i++;
                    score += 10;


                    button4.setBackgroundResource(R.drawable.right);

                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button4.setBackgroundResource(R.drawable.normal);
                            setQuestion(i);
                        }
                    });
                } else {
                    greenlite();
                    i++;
                    score -= 5;
                    scoreTextView.setText("Score : " + score + "");
                    life -= 1;
                    button4.setBackgroundResource(R.drawable.wrong);
                    setLife(life);
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            button4.setBackgroundResource(R.drawable.normal);
                            setQuestion(i);

                        }
                    });
                }
            }
        });
    }





    public void setQuestion(int i) {

        try {
            if (i < questionNumber.size()) {
                countDownTimer.start();
                questionTextView.setText(qstnArray.getQuestion(questionNumber.get(i)));
                optionArray = new Utils.OptionArray(questionNumber.get(i));
                optArray = new ArrayList<>(optionArray.getOptionArray());

                Collections.shuffle(optArray);
                button1.setText(optArray.get(0));
                button2.setText(optArray.get(1));
                button3.setText(optArray.get(2));
                button4.setText(optArray.get(3));

                scoreTextView.setText("Score : " + score + "");
                quizProgress.setText((i + 1) + " Of " + qstnArray.getquestionListLength());
            } else {
                scoreTextView.setText("Score : " + score + "");
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                gameover();

            }
        } catch (Exception e) {

        }


    }

    public void setLife(int i) {

        try {

            if (life == 2) {
                life3.setImageResource(R.drawable.heartbroke);
            }
            if (life == 1) {
                life2.setImageResource(R.drawable.heartbroke);
            }
            if (life == 0) {
                life1.setImageResource(R.drawable.heartbroke);

                gameover();


            }

        } catch (Exception e) {

        }


    }

    private void greenlite(){
        if (button1.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))) {
            button1.setBackgroundResource(R.drawable.right);
            Utils.delay(secs, new Utils.DelayCallback() {
                @Override
                public void afterDelay() {
                    button1.setBackgroundResource(R.drawable.normal);
                }
            });

        }
        else if (button2.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))){
            button2.setBackgroundResource(R.drawable.right);
            Utils.delay(secs, new Utils.DelayCallback() {
                @Override
                public void afterDelay() {
                    button2.setBackgroundResource(R.drawable.normal);
                }
            });
        }
        else if (button3.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))){
            button3.setBackgroundResource(R.drawable.right);
            Utils.delay(secs, new Utils.DelayCallback() {
                @Override
                public void afterDelay() {
                    button3.setBackgroundResource(R.drawable.normal);
                }
            });
        }
        else if (button4.getText().toString().equals(answerArray.getAnswer(questionNumber.get(i)))){
            button4.setBackgroundResource(R.drawable.right);
            Utils.delay(secs, new Utils.DelayCallback() {
                @Override
                public void afterDelay() {
                    button4.setBackgroundResource(R.drawable.normal);
                }
            });
        }

    }

    public void gameover() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent = new Intent(getApplicationContext(), ScoreActivity.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);

            // startActivity(new Intent(this,QuizActivity.class));
        }
//        Intent intent=new Intent(getApplicationContext(),ScoreActivity.class);
//        intent.putExtra("SCORE", score);
//        startActivity(intent);

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
//    public void time(){
//        timer =new CountDownTimer(40200,1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//                textView.setText(String.valueOf(millisUntilFinished/1000)+"s");
//                if (millisUntilFinished<=10200){
//                    textView.setTextColor(Color.RED);
//                }else {
//                    textView.setTextColor(Color.BLUE);
//                }
//
//            }
//
//            @Override
//            public void onFinish() {
//                i++;
//                score -= 5;
//                scoreTextView.setText("Score : " + score + "");
//                life -= 1;
//                setQuestion(i);
//
//            }
//        }.start();
//    }
public class MyCountDownTimer extends CountDownTimer {
    public MyCountDownTimer(long startTime, long interval) {
        super(startTime, interval);
    }
    @Override
    public void onFinish() {
        i++;
        score -= 5;
        scoreTextView.setText("Score : " + score + "");
        life -= 1;
        setLife(life);
        setQuestion(i);
    }
    @Override
    public void onTick(long millisUntilFinished) {
        textView.setText("" + millisUntilFinished / 1000);
        if (millisUntilFinished<=10200){
            textView.setTextColor(Color.RED);
                }else {
                    textView.setTextColor(Color.BLUE);
                }

    }

}

}
