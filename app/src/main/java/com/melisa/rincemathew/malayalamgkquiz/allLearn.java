package com.melisa.rincemathew.malayalamgkquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class allLearn extends AppCompatActivity {
    ListView listView;
    android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_learn);
        toolbar= (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        TextView txtScore=(TextView)findViewById(R.id.textView);
        TextView txtScore1=(TextView)findViewById(R.id.textView1);
        Intent intent = getIntent();
        String easyPuzzle = intent.getExtras().getString("epuzzle");
        String easyPuzzle1 = intent.getExtras().getString("epuzzle1");
        Typeface fontHindi = Typeface.createFromAsset(getAssets(),
                "Dyuthi-Regular.ttf");
        txtScore.setTypeface(fontHindi);
        txtScore1.setTypeface(fontHindi);


        txtScore.setText(easyPuzzle);
        txtScore1.setText(easyPuzzle1);
    }

}
