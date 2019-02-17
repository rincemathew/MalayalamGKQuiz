package com.melisa.rincemathew.malayalamgkquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {


    TextView scorefinal;
    private String score;
    private  String scoreFormat;
    ImageButton button;
    //private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);


//        mInterstitialAd = new InterstitialAd(this);
//        mInterstitialAd.setAdUnitId("ca-app-pub-6234689785392855/5143066920");
//        mInterstitialAd.loadAd(new AdRequest.Builder().build());
//        mInterstitialAd.setAdListener(new AdListener()
//        {
//            @Override
//            public void onAdClosed(){
//                startActivity(new Intent(ScoreActivity.this,QuizActivity.class));
//            }
//        });


        button=findViewById(R.id.button);
        TextView txtScore=(TextView)findViewById(R.id.scoreTextView);
        TextView txtHighScore = (TextView) findViewById(R.id.textHighScore);
        Intent intent = getIntent();
        int score = intent.getIntExtra("SCORE", 0);
        // display current score
        txtScore.setText("Your score: " + score);

        // use Shared preferences to save the best score
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        if(highscore>= score)
            txtHighScore.setText("High score: "+highscore);
        else
        {
            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }
    }

    public void onClick(View view) {
//        if (mInterstitialAd.isLoaded()){
//            mInterstitialAd.show();
//        }
//        else {
//            startActivity(new Intent(this,QuizActivity.class));
//        }
        Intent intent = new Intent(ScoreActivity.this, timerActivity.class);
        startActivity(intent);
    }
    public void home(View view) {
        Intent intent = new Intent(ScoreActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

    }
}
