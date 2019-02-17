package com.melisa.rincemathew.malayalamgkquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LearnIndia extends AppCompatActivity {
    ListView listView;
    android.support.v7.widget.Toolbar toolbar;
    String[] mobileArray = {"അടിസ്ഥാന വിവരങ്ങൾ","(പധാനമന്ത്രിമാർ","രാഷ്ട്രപതിമാർ","ഉപരാഷ്ട്രപതിമാർ"};
    String enquery  = "വിവരങ്ങൾ";
    String enquery1  = "തലസ്ഥാനം : ന്യൂഡൽഹി\n" +
            "ദേശീയഗാനം : ജനഗണമന\n" +
            "ദേശീയവൃക്ഷം : ആൽമരം\n" +
            "ദേശീയവിനോദം : ഹോക്കി\n" +
            "ദേശീയമൃഗം : കടുവ \n" +
            "ദേശീയ പുഷ്പം : താമര \n" +
            "ദേശീയപക്ഷി : മയിൽ \n" +
            "ദേശീയജലജീവി : ഗംഗാ ഡോൾഫിൻ \n" +
            "ദേശീയപൈതൃക മ്യഗം : ആന \n" +
            "ദേശീയനദി : ഗംഗ \n" +
            "ദേശീയഫലം : മാങ്ങ";
    String primeminister  = "(പധാനമന്ത്രിമാർ";
    String primeminister1  = "ജവഹർലാൽ നെഹ്റു (1947 - 1964) \n" +
            "ഗുൽസാരിലാൽ നന്ദ (1964 - 1964) \n" +
            "ലാൽ ബഹദൂർ ശാസ്ത്രി (1964 - 1966) \n" +
            "ഗുൽസാരിലാൽ നന്ദ - (1966) - 1966) \n" +
            "ഇന്ദിരാഗാന്ധി- (1966 - 1977) \n" +
            "മൊറാർജി ദേശായി (1977 - 1979)\n" +
            "ചരൺസിംഗ് (1979-1980)\n" +
            "ഇന്ദിരാഗാന്ധി (1980 - 1984)\n" +
            "രാജീവ്ഗാന്ധി (1984 - 1989)\n" +
            "വി.പി. സിംഗ് (1989 - 1990)\n" +
            "എസ്. ചന്ദ്രശേഖർ (1990 1991) \n" +
            "പി.വി. നരസിംഹറാവു (1991 - 1996)\n" +
            "എ.ബി. വാജ്പേയി (1996, 1996) \n" +
            "എച്ച്.ഡി. ദേവഗൗഡ) (1996, 1997)\n" +
            "ഐ.കെ. ഗുജറാൾ(1997-1998) \n" +
            "എ ബി. വാജ്പേയി (1998- 2004)\n" +
            "മൻമോഹൻസിംഗ് (2004-2014)\n" +
            "നരേന്ദ്ര മോഡി(2014-)";
    String president  = "രാഷ്ട്രപതിമാർ";
    String president1  = "രാജേന്ദ്രപ്രസാദ് (1950 -1962)\n" +
            "സർവേപള്ളി രാധാകൃഷ്ണൻ (1962 -1967)\n" +
            "സക്കീർ ഹുസൈൻ (1967 -1969)\n" +
            "വി.വി. ഗിരി (1969 - 1974)\n" +
            "ഫക്രുദ്ദീൻ അലി അഹമ്മദ് (1974 -1977)\n" +
            "എൻ. സഞ്ജീവറെഡ്ഡി (1977 -1982)\n" +
            "ഗ്യാനി സെയിൽ സിംഗ്\u200C (1982-1987)\n" +
            "രാമസ്വാമി വെങ്കടരാമൻ (1987 -1992)\n" +
            "ശങ്കർ ദയാൽ ശർമ്മ (1992 -1997)\n" +
            "കോച്ചേരിൽ രാമൻ നാരായണൻ (1997 -2002)\n" +
            "എ.പി.ജെ. അബ്ദുൽ കലാം (2002 -2007)\n" +
            "പ്രതിഭാ പാട്ടിൽ (2007 -2012)\n" +
            "പ്രണബ് മുഖർജി (2012 -2017)\n" +
            "റാംനാഥ് കോവിന്ദ് (2017-)";
    String vicepresident  = "ഉപരാഷ്ട്രപതിമാർ";
    String vicepresident1  = "മുഖർജി ഡോ. എസ്. രാധാകൃഷ്ണ ൻ (1952 - 1962) \n" +
            "സക്കീർ ഹുസൈൻ(1962 - 1967) \n" +
            "വി.വി. ഗിരി(1967 - 1969) \n" +
            "ജി.എസ്. പഥക്(1969 - 1974) \n" +
            "ബി.ഡി. ജട്ടി(1974 - 1979) \n" +
            "എം. ഹിദായത്തുള്ള (1979 - 1984) \n" +
            "ആർ. വെങ്കിട്ടരാമൻ(1984 - 1987) \n" +
            "എസ്.ഡി. ശർമ്മ(1987 - 1992) \n" +
            "കെ.ആർ. നാരായണൻ - (1992 - 1997) \n" +
            "കൃഷ്ണകാന്ത്(1997 - 2002) \n" +
            "ബെറോൺസിങ് ഷെഖാവത്ത് (2002 - 2007) \n" +
            "മുഹമ്മദ് ഹമീദ് അൻസാരി (2007 -2017)\n" +
            "വെങ്കയ്യ നായിഡു(2017-)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_india);
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
                    myIntent.putExtra("epuzzle", enquery);
                    myIntent.putExtra("epuzzle1", enquery1);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), allLearn.class);
                    myIntent.putExtra("epuzzle", primeminister);
                    myIntent.putExtra("epuzzle1", primeminister1);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), allLearn.class);
                    myIntent.putExtra("epuzzle", president);
                    myIntent.putExtra("epuzzle1", president1);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), allLearn.class);
                    myIntent.putExtra("epuzzle", vicepresident);
                    myIntent.putExtra("epuzzle1", vicepresident1);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}
