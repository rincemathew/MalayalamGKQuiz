package com.melisa.rincemathew.malayalamgkquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Sahithyam extends AppCompatActivity {

    ListView listView;
    android.support.v7.widget.Toolbar toolbar;
    String[] mobileArray = {"മലയാളത്തിലെ ആത്മകഥകൾ","തൂലികാനാമങ്ങൾ"};
    String ministers  = "ആത്മകഥകൾ";
    String ministers1  = "ജീവിതസമരം - സി. കേശവൻ\n" +
            "കഴിഞ്ഞകാലം -- -- കെ.പി. കേശവമേനോൻ\n" +
            "ആത്മകഥ- ഇ.എം.എസ്. നമ്പൂതിരിപ്പാട്\n" +
            "എന്റെ ജീവിതകഥ - എ.കെ. ഗോപാലൻ\n" +
            "സഹസപൂർണിമ - സി.കെ. ദേവമ\n" +
            "പിന്നിട്ട ജീവിതപ്പാത - ഡോ. ജി. രാമചന്ദ്രൻ\n" +
            "കൊഴിഞ്ഞ ഇലകൾ - ജോസഫ് മുണ്ടശ്ശേരി\n" +
            "അനുഭവചുരുളുകൾ - നെട്ടൂർ പി. ദാമോദരൻ\n" +
            "ഇടങ്ങഴിയിലെ കുരിശ് - ആനി തയ്യിൽ\n" +
            "വിപ്ലവസ്മരണകൾ - പുതുപ്പള്ളി രാഘവൻ\n" +
            "സ്മതിദർപ്പണം - എം.പി. മന്മഥൻ\n" +
            "കണ്ണീരും കിനാവും - വി.ടി. ഭട്ടതിരിപ്പാട്\n" +
            "എന്റെ കഴിഞ്ഞകാലസ്മരണകൾ -കുമ്പളത്ത് ശങ്കുപിള്ള \n" +
            "ഒരു സർജന്റെ ഓർമക്കുറിപ്പുകൾ - ടി.വി. വാര്യർ \n" +
            "മൗലവിയുടെ ആത്മകഥകൾ - മൊയ്തുമൗലവി\n" +
            "അടിമകളെങ്ങനെ ഉടമകളായി - വിഷ്ണുഭാരതീയൻ\n" +
            "തിരിഞ്ഞുനോക്കുമ്പോൾ - കെ.എ. ദാമോദരമേനോൻ \n" +
            "എന്റെ കുതിപ്പും കിതപ്പും - ഫാ. വടക്കൻ \n" +
            "എന്റെ സഞ്ചാരപഥങ്ങൾ - കളത്തിൽ വേലായുധൻ നായർ \n" +
            "എന്റെ ജീവിതസ്മരണകൾ - മന്നത്ത് പത്മനാഭൻ";
    String big = "തൂലികാനാമങ്ങൾ";
    String big1  = "സഞ്ജയന്\u200D : എം.ആർ, നായർ.\n" +
            "ജി. : ജി. ശങ്കരക്കുറുപ്പ്\n" +
            "കേസരി : എ. ബാലകൃഷ്ണപ്പിള്ള\n" +
            "വിലാസിനി : എം.കെ. മേനോൻ\n" +
            "കോവിലൻ :  വി.വി. അയ്യപ്പൻ\n" +
            "നന്തനാർ : പി.സി. ഗോപാലൻ \n" +
            "പാറപ്പുറത്ത് : കെ.ഇ. മത്തായി\n" +
            "ആനന്ദ് : പി. സച്ചിദാനന്ദൻ \n" +
            "ഇന്ദുചൂഡൻ : കെ.കെ. നീലകണ്ഠൻ \n" +
            "പ്രേംജി : എം.പി. ഭട്ടതിരിപ്പാട് \n" +
            "ചെറുകാട് : ഗോവിന്ദ പിഷാരടി \n" +
            "വൈശാഖൻ : ഗോപിനാഥൻ നായർ \n" +
            "കാക്കനാടൻ : ജോർജ് വർഗീസ് \n" +
            "വിക്രമൻ : സി.ആർ. കേരളവർമ്മ\n" +
            "പി : പി. കുഞ്ഞിരാമൻനായർ \n" +
            "സുരാസു : ബാലഗോപാലൻ \n" +
            "തിക്കൊടിയൻ: പി. കുഞ്ഞനന്തൻ നായർ \n" +
            "മാലി : വി. മാധവൻനായർ \n" +
            "സുകുമാർ : എസ്. സുകുമാരൻ പോറ്റി \n" +
            "സിനിക്: എം. വാസുദേവൻനായർ \n" +
            "സുമംഗല : ലീലാ നമ്പൂതിരിപ്പാട് \n" +
            "ഉറൂബ് : പി.സി. കുട്ടികൃഷ്ണൻ\n" +
            "ശ്രീ : വൈലോപ്പിള്ളി ശ്രീധരമേനോൻ \n" +
            "പവനന്\u200D : പി.വി. നാരായണൻ നായർ \n" +
            "വി.കെ.എൻ : വി.കെ. നാരായണൻ നായർ \n" +
            "എൻ.എൻ. കക്കാട് : കെ. നാരായണൻ നമ്പൂതിരി";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahithyam);
        toolbar= (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), allLearn.class);
                    myIntent.putExtra("epuzzle", ministers);
                    myIntent.putExtra("epuzzle1", ministers1);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), allLearn.class);
                    myIntent.putExtra("epuzzle", big);
                    myIntent.putExtra("epuzzle1", big1);
                    startActivityForResult(myIntent, 0);
                }



            }
        });


    }
}
