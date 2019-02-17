package com.melisa.rincemathew.malayalamgkquiz;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class setting extends AppCompatActivity {
    android.support.v7.widget.Toolbar toolbar;
    Button button1,button2,button3,button4;


    String first  = "How to Play";
    String first1  = "Malayalam GK Quiz ല്\u200D Speed Test,Questionnaire,Learn എന്നി മൂന്ന്\u200C കാര്യങ്ങള്\u200D ഒണ്ട്.\n" +
            "    Speed Test ല്\u200D ചോദ്യങളും അവയ്ക്ക് 4 ഉത്തരങളും തന്നിരിക്കുന്നു ശരിയായ ഉത്തരം click" +
            "ചെയുംബോള്\u200D അടുത്ത ചോദ്യത്തിലേക്ക് പോകുന്നു. ശരിയായ ഉത്തരത്തിനു 10" +
            "point ലഭിക്കുന്നു. ആകെ 3 ലൈഫ് ആണ് ഒള്ളത് ഉത്തരം തെറ്റിപോയാല്\u200D ഒരു ലൈഫ് " +
            "നഷ്ടമാകും മാത്രമല്ല Total score ല്\u200D നിന്നും ഓരോ തെറ്റുഉത്തരത്തിനും -5 point നഷ്ടമാകും." +
            "നിങളുടെ High score ചെക്ക്\u200C ചെയാനുള്ള option ഉം ഈ appല്\u200D ഉണ്ട്. 3 ലൈഫും ഉപയോഗിച്ച് കഴിയുബോള്\u200D" +
            "game അവസാനിക്കുന്നു. വീണ്ടും കളിക്കണമെഗില്\u200D new game start ചെയണം. ഓരോ gameലും ചോദ്യങല്\u200D" +
            "ആവര്\u200Dത്തിക്കുന്നതല്ല.\n" +
            "        Questionnaire ല്\u200D മുന്\u200Dപ് പറഞ്ഞപോലെ തന്നെ ചോദ്യങളും അവയ്ക്ക് 4 ഉത്തരങലും" +
            "തയാറാക്കിയിരിക്കുന്നു. ശരിയായ ഉത്തരം മനസിലാക്കി check option click ചെതാല്\u200D ശരിഉത്തരം" +
            "കാണാന്\u200D സാധിക്കും. നിങളുടെ ഉത്തരവുംമായി ചേര്\u200Dത്തു നോക്കി ശരിയോ തെറ്റോ" +
            "എന്ന് മനസിലാക്കാം. 500+ ചോദ്യോത്തരങ്ങള്\u200D  ഈ വിഭാഗത്തില്\u200D " +
            "ഉള്\u200Dപെടുത്തിയിരിക്കുനത്.\n" +
            "      Learn എന്ന optionല്\u200D വിവിധങളായ GK അറിവുകള്\u200D notes ആയി കൊടുത്തിരിക്കുന്നു." +
            "Kerala,India,world,Important Days,Abbreviation,Literature,Science എന്നിവയാണ് ഉള്\u200Dപെടുത്തിയിരിക്കുന്ന വിഷയങ്ങള്\u200D. ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        toolbar= (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), allLearn.class);
                myIntent.putExtra("epuzzle", first);
               myIntent.putExtra("epuzzle1", first1);
                startActivityForResult(myIntent, 0);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(Intent.ACTION_VIEW);
                sharingIntent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=melisa"));
                startActivity(sharingIntent);
            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(Intent.ACTION_VIEW);
                sharingIntent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.melisa.rincemathew.malayalamgkquiz"));
                startActivity(sharingIntent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"melisamediacreations@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
               // i.putExtra(Intent.EXTRA_TEXT   , "body of email");
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(setting.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
