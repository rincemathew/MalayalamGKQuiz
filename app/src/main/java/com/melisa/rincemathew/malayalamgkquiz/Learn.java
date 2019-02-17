package com.melisa.rincemathew.malayalamgkquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.ListView;
import android.widget.Toolbar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class Learn extends AppCompatActivity {
    ListView listView;
    private InterstitialAd mInterstitialAd;
    android.support.v7.widget.Toolbar toolbar;
    String[] mobileArray = {"Kerala","India","world",
            "Important Days","Abbreviation","Literature","Science"};


    String importantdays  = "പ്രധാന ദിനങ്ങൾ";
    String importantdays1  = "ലോകം ലോക തണ്ണീർത്തടദിനം : ഫെബ്രുവരി 2 \n" +
            "കമിതാക്കളുടെ ദിനം : ഫെബ്രുവരി 14 \n" +
            "അന്തർദേശീയ വനിതാ ദിനം : മാർച്ച് 8 \n" +
            "ലോക ഉപഭോക്തൃ ദിനം : മാർച്ച് 15 \n" +
            "ലോക വനദിനം : മാർച്ച് 21 \n" +
            "ലോക ജലദിനം : മാർച്ച് 22\n" +
            "ലോക കാലാവസ്ഥാദിനം: മാർച്ച് 23\n" +
            "വിഡ്ഢിദിനം : ഏപ്രിൽ 1 \n" +
            "ലോകാരോഗ്യദിനം : ഏപ്രിൽ 7\n" +
            "ഭൗമദിനം: ഏപ്രിൽ 22 \n" +
            "ലോക പുസ്തകദിനം : ഏപ്രിൽ 23 \n" +
            "തൊഴിലാളി ദിനം : മെയ് 1\n" +
            "ലോക റെഡ്ക്രോസ് ദിനം : മെയ് 8 \n" +
            "അന്തർദേശീയ കുടുംബദിനം : മെയ് 15 \n" +
            "അന്താരാഷ്ട്ര ജൈവ വൈവിധ്യദിനം : മെയ് 22 \n" +
            "പുകയില വിരുദ്ധ ദിനം : മെയ് 31 \n" +
            "ലോക പരിസ്ഥിതി ദിനം : ജൂൺ 5 \n" +
            "ലോക ജനസംഖ്യ ദിനം : ജൂലൈ 11 \n" +
            "ഹിരോഷിമ ദിനം : ആഗസ്റ്റ് 6 \n" +
            "നാഗസാക്കി ദിനം : ആഗസ്റ്റ് 9 \n" +
            "ലോക സാക്ഷരതാ ദിനം : സെപ്തംബർ 8 \n" +
            "അന്താരാഷ്ട്ര ഓസോൺ ദിനം: സെപ്തംബർ 16 \n" +
            "ലോക വൃദ്ധദിനം : ഒക്ടോബർ 1 \n" +
            "ലോകഭക്ഷ്യ ദിനം : ഒക്ടോബർ 16 \n" +
            "ഐക്യരാഷ്ട ദിനം : ഒക്ടോബർ 24\n" +
            "പ്രമേഹ ദിനം : നവംബർ 14 \n" +
            "ലോക എയ്ഡ്സ് ദിനം : ഡിസംബർ 1 \n" +
            "ലോക വികലാംഗ ദിനം : ഡിസംബർ 3 \n" +
            "മനുഷ്യാവകാശ ദിനം : ഡിസംബർ 10";

    String abbrevations  = "ABBREVIATIONS";
    String abbrevations1  = "AAFI:The Amateur Athletics Federation of India\n" +
            "АВС:Audit Bureau of Circulation\n" +
            "ILO:International Labour Organisation\n" +
            "IMF:International Monetary Fund\n" +
            "AMC:Army Medical Corps\n" +
            "INA:Indian National Army \n" +
            "ANERT:Agency for Non-Conventional Energy and Rural Technology\n" +
            "IPC:Indian Penal Code \n" +
            "IPS:indian Police Service \n" +
            "AIDS:Acquired Immuno Deficiency Syndrome\n" +
            "AINEC:All India Newspaper Editors' Conference\n" +
            "ASEAN:Association of South East Asian Nations\n" +
            "KFDC:Kerala Fim Development Corporation \n" +
            "ASSOCHAM:Associated Chamber of Commerce and Industry \n" +
            "KSRTC:Kerala State Road Transport Corporation \n" +
            "KTDC:Kerala Tourism Development Corporation \n" +
            "LIC:Life Insurance Corporation of India \n" +
            "BARC:Bhabha Atomic Research Centre\n" +
            "LPG:Liquefied Petroleum Gas \n" +
            "BBC:British Broadcasting Corporation\n" +
            "MBA:Master of Business Administration \n" +
            "MBBS:Bachelor of Medicine & Bachelor of Surgery \n" +
            "MLA:Member of Legislative Assembly \n" +
            "BSE:Bombay Stock Exchange \n" +
            "MNC:Multi-National Corporation\n" +
            "BSF:Border Security Force\n" +
            "CA:Chartered Accountant\n" +
            "MP:Member of Parliament\n" +
            "NABARD:National Bank for Agricultural and Rural Development\n" +
            "CBI:Central Bureau of Investigation\n" +
            "CFC:Chloro Fluro Carbon\n" +
            "NASA:National Aeronautics and Space Administration \n" +
            "NATPAC:National Transportation Planning and Research Center\n" +
            "CPWD:Central Public Works Department\n" +
            "CSIR:Council of Scientific and Industrial Research\n" +
            "NB:nota bene \n" +
            "DIG:Deputy Inspector General (of police)\n" +
            "NPT:Nuclear Non-proliferation Treaty \n" +
            "DNA:Deoxyribo-nucleic acid\n" +
            "NTPC:National Thermal Power Corporation \n" +
            "DPEP:District Primary Education Programme\n" +
            "OPEC:Organisation of Petroleum Exporting Countries \n" +
            "FIR:First Information Report\n" +
            "FM:Frequency Modulation\n" +
            "HIV:Human Immunodeficiency Virus\n" +
            "SPCA:Society for Prevention of Cruelty to Animais \n" +
            "SSC:Staff Selection Commission \n" +
            "IAAL:International Airport Authority of India\n" +
            "STD:Subscriber Trunk Dialing \n" +
            "IAS:Indian Administrative Service\n" +
            "TADA:Terrorists & Disruptive Activities (Prevention) Act \n" +
            "ICAR:Indian Council of Agricultural Research\n" +
            "TB:tubercle bacillus \n" +
            "ICICI:Industrial Credit Investment Corporation of India\n" +
            "UPSC:Union Public Service Commission \n" +
            "IDBI:Industrial Development Bank of India\n" +
            "IFC:Industrial Finance Corporation\n" +
            "VAT:Value Added Tax \n" +
            "IFS:Indian Foreign Service\n" +
            "WHO:World Health Organisation \n" +
            "WTO:World Trade Organisation\n";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        toolbar= (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        mInterstitialAd = new InterstitialAd(this);
          mInterstitialAd.setAdUnitId("ca-app-pub-6234689785392855/5143066920");
       // mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    gameover();
                    Intent myIntent = new Intent(view.getContext(), LearnKerala.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    gameover();
                    Intent myIntent = new Intent(view.getContext(), LearnIndia.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    gameover();
                    Intent myIntent = new Intent(view.getContext(), World.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), allLearn.class);
                    myIntent.putExtra("epuzzle", importantdays);
                    myIntent.putExtra("epuzzle1", importantdays1);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), allLearn.class);
                    myIntent.putExtra("epuzzle", abbrevations);
                    myIntent.putExtra("epuzzle1", abbrevations1);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 5) {
                    gameover();
                    Intent myIntent = new Intent(view.getContext(), Sahithyam.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 6) {
                    gameover();
                    Intent myIntent = new Intent(view.getContext(), Shastram.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });

    }
    public void gameover() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);

        }


    }



}
