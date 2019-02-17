package com.melisa.rincemathew.malayalamgkquiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {
    GridLayout mainGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainGrid=(GridLayout)findViewById(R.id.gridView);
        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i =0;i<mainGrid.getChildCount();i++)
        {
            CardView cardView=(CardView)mainGrid.getChildAt(i);
            final int finalI=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI==0){
                        Intent intent=new Intent(getApplicationContext(),timerActivity.class);
                        startActivity(intent);
                    }
                   else if (finalI==1){
                        Intent intent=new Intent(getApplicationContext(),questionanswer.class);
                       startActivity(intent);
                    }
                    else if (finalI==2){
                        Intent intent=new Intent(getApplicationContext(),Learn.class);
                     startActivity(intent);
                    }

                    else if (finalI==3){
                        Intent intent=new Intent(getApplicationContext(),ScoreActivity.class);
                       startActivity(intent);
                    }

                    else if (finalI==4){
                        Intent intent=new Intent(getApplicationContext(),setting.class);
                      startActivity(intent);
                    }

                    else if (finalI==5){
                        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.melisa.rincemathew.malayalamgkquiz");
                        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Malayalam GK Quiz");
                        startActivity(Intent.createChooser(sharingIntent, "Share using"));
                    }


                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }

}
