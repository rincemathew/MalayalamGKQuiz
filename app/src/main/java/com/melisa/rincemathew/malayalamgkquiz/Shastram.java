package com.melisa.rincemathew.malayalamgkquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Shastram extends AppCompatActivity {

    ListView listView;
    android.support.v7.widget.Toolbar toolbar;
    String[] mobileArray = {"കണ്ടുപിടിത്തങ്ങൾ","പഠനവിഷയങ്ങൾ","അസുഖങ്ങളും അതു ബാധിക്കുന്ന ശരീര ഭാഗങ്ങളും","വിറ്റാമിനുകൾ"};
    String ministers  = "കണ്ടുപിടിത്തങ്ങൾ";
    String ministers1  = "അച്ചടിയന്ത്രം : ജോൺ ഗുട്ടൻബർഗ് \n" +
            "ആസ്പിരിൻ : ഡസ്സർ \n" +
            "ആവിയന്ത്രം : ജയിംസ് വാട്ട് \n" +
            "ആറ്റംബോംബ് : ഓപ്പൺ ഹൈമർ \n" +
            "കമ്പ്യൂട്ടർ : ചാൾസ് ബാബേജ് \n" +
            "കാർ (പെട്രോള്\u200D): ബെൻസ് \n" +
            "ക്ലോറോഫോം : ഗുദ്റി എസ് \n" +
            "കോസ്മിക് രശ്മി : എം.എ. മിലിക്കൺ \n" +
            "ക്ലോക്ക് : ക്രിസ്റ്റ്യൻ ഹൈജൻസ് \n" +
            "വിമാനം : ഓർവിൽ, വിൽബർ റൈറ്റ് \n" +
            "സിനിമ : നിക്കോളസ് ജീൻ ലൂമിയർ\n" +
            "സൈക്കിൾ : കിക്പാടിക്ക് മാക്മില്ലൻ \n" +
            "തീപ്പെട്ടി : ജോൺ വാക്കർ \n" +
            "ഇൻസുലിൻ: ഫെഡറിക് ബാന്റിംഗ് \n" +
            "എക്സറേ : വില്ല്യം കോൺറാഡ് റോൺജൺ \n" +
            "ഡി.ഡി.റ്റി : സിഡർ \n" +
            "റേഡിയോ : മാർക്കോണി\n" +
            "ടെലിസ്കോപ്പ് : ഗലീലിയോ \n" +
            "ടൈപ്പ് റൈറ്റർ : ക്രിസ്റ്റഫർ ഷൂൾസ് \n" +
            "ട്രാൻസിസ്റ്റർ : വില്യം ഷോക്ക്ലി \n" +
            "തെർമോമീറ്റർ : ഗലീലിയോ ഗലീലി \n" +
            "സേഫ്റ്റി ലാംപ് : ഹംഫ്രി ഡേവി \n" +
            "സേഫ്റ്റി പിൻ : വാൾട്ടർ ഹണ്ട് \n" +
            "വൈദ്യുത മോട്ടോർ : നിക്കോള ടെസ്ല \n" +
            "വൈദ്യുത കാന്തം : വില്യം സ്റ്റർജിയൻ \n" +
            "ഡീസൽ എഞ്ചിൻ ; റുഡോൾഫ് ഡീസൽ \n" +
            "റെയിൽവേ എഞ്ചിൻ : ജോർജ് സ്റ്റീഫൻസൺ \n" +
            "റെഫ്രിജറേറ്റർ : ജെയിംസ് ഹാരിസൺ \n" +
            "ടെലിഫോൺ : അലക്സാണ്ടർ ഗ്രഹാം ബെൽ\n" +
            "ടെലിവിഷൻ : ജോൺ ലോഗ് ബയേഡ് \n" +
            "ബാരോമീറ്റർ : ഐവാൻ ജെലിൻ ടോറിസെല്ലി \n" +
            "ഡൈനാമോ : മൈക്കൽ ഫാരഡെ \n" +
            "ഡൈനാമിറ്റ് : ആൽഫ്രഡ് നോബൽ \n" +
            "പെനിസിലിൻ : അലക്സാണ്ടർ ഫ്ളെമിങ് \n" +
            "ഫൗണ്ടൻ പെൻ ; ലൂവിസ് ഇ. വാട്ടർമാൻ \n" +
            "വൈദ്യുത ബാറ്ററി : അലക്സാൻടാ വോൾട്ട \n" +
            "വൈദ്യുത ബൾബ് : തോമസ് ആൽവ എഡിസൺ \n" +
            "ഗ്രാമഫോൺ : തോമസ് ആൽവ എഡിസൺ \n" +
            "റഡാർ: എ.എച്ച്. ടെയ്ലർ, ലിയൊ സി. യംഗ് ";
    String big = "പഠനവിഷയങ്ങൾ";
    String big1  = "ആന്ത്രപ്പോളജി - നരവംശശാസ്ത്രം \n" +
            "ബയാമെടി : ജൈവഗണിതശാസ്ത്രം \n" +
            "ബയോളജി : ജീവശാസ്ത്രം \n" +
            "ഹെമറ്റോളജി: രക്തത്തെപ്പറ്റിയുള്ള പഠനം \n" +
            "ന്യൂറോളജി : നാഡീവിജ്ഞാനം \n" +
            "ഓർണിത്തോളജി : പക്ഷിനിരീക്ഷണശാസ്ത്രം \n" +
            "പാത്തോളജി : രോഗശാസ്ത്രം \n" +
            "സൈക്കോളജി : മനഃശാസ്ത്രം \n" +
            "സീമോളജി : ഭൂകമ്പവിജ്ഞാനം \n" +
            "എക്കോളജി : പരിസ്ഥിതിപഠനം \n" +
            "യൂറോളജി : മൂത്രരോഗപഠനം \n" +
            "ഓങ്കോളജി : ട്യൂമറുകളെക്കുറിച്ചുള്ള പഠനം \n" +
            "നെഫറോളജി : വൃക്കകളെക്കുറിച്ചുള്ള പഠനം \n" +
            "ഫിസിയോളജി : ശരീരശാസ്ത്രം \n" +
            "ഹൈഡാളജി : ജലശാസ്ത്രം \n" +
            "എന്റമോളജി : ഷഡ്പദ വിജ്ഞാനം \n" +
            "തിയോളജി : ദൈവശാസ്ത്രം \n" +
            "ഗൈനക്കോളജി - : സീരോഗശാസ്ത്രം \n" +
            "എംബയോളജി: ഭ്രൂണത്തെക്കുറിച്ചുള്ള പഠനം\n" +
            "മെറ്റീരിയോളജി : അന്തരീക്ഷശാസ്ത്രം\n" +
            "ജനിറ്റിക്സ് : ജനിതകശാസ്ത്രം\n" +
            "പാലിയന്റോളജി : ഫോസിലുകളെക്കുറിച്ചുള്ള പഠനം\n" +
            "സെലനോളജി : ചന്ദ്രനെക്കുറിച്ചുള്ള പഠനം";
    String first  = "അസുഖങ്ങളും";
    String first1  = "ക്ഷയം : ശ്വാസകോശം  \n" +
            "വാതം : സന്ധികൾ \n" +
            "പ്രമേഹം : പാൻക്രിയാസ് \n" +
            "ലൂക്കീമിയ : രക്തം \n" +
            "കണ് : എല്ല് \n" +
            "പേപ്പട്ടി വിഷം : തലച്ചോറ് \n" +
            "മയോപ്പിയ : കണ്ണ് \n" +
            "മലേറിയ : സ്പീൻ \n" +
            "എക്സിമ : ത്വക്ക് \n" +
            "ഡിഫ്ത്തീരിയ : തൊണ്ട\n" +
            "ആസ്ത്മ - : ശ്വസനവ്യ വസ്ഥ \n" +
            "പയോറിയ : പല്ല്, മോണ്\n" +
            "മഞ്ഞപ്പിത്തം : കരൾ \n" +
            "ന്യൂമോണിയ : ശ്വാസകോശം \n" +
            "ഗോയിറ്റർ : തൈറോയിഡ് ഗ്രന്ഥി \n" +
            "മെനിഞ്ചറ്റിസ്: തലച്ചോറ്, സുഷുമ്ന \n" +
            "ടോൺസിലൈറ്റിസ് : ടോൺസിൽസ് \n" +
            "തിമിരം, ഗ്ലൗക്കോമ : കണ്ണ് \n" +
            "അപ്പന്റിസൈറ്റീസ് : അപ്പെന്റിക് \n" +
            "കൺജങ്റിവിറ്റിസ് : കണ്ണ് \n" +
            "നെഫ്രൈറ്റിസ് : വൃക്ക \n" +
            "ടൈഫോയിഡ് : കുടൽ \n" +
            "ബാങ്കെറ്റിസ് : ശ്വാസകോശങ്ങൾ";
    String vitamin  = "വിറ്റാമിനുകൾ";
    String vitamin1  = "രക്തം കട്ടപിടിക്കാൻ സഹായിക്കുന്നത് : വിറ്റാമിൻ K \n" +
            "കൊഴുപ്പുകളിൽ ലയിക്കുന്നത് : വിറ്റാമിൻ A, D, E, K \n" +
            "കണ്ണിന്റെ ആരോഗ്യപരിപാലനത്തിന് ആവശ്യമായത്: വിറ്റാമിൻ A \n" +
            "പ്രത്യുത്പാദന ധർമ്മങ്ങൾക്ക് ആവശ്യമായത്: വിറ്റാമിൻ E \n" +
            "ശരീരത്തിൽ സൂര്യപ്രകാശത്തിന്റെ സഹായത്താൽനിർമിക്കുന്നത് : വിറ്റാമിൻ D \n" +
            "ഇലക്കറികളിൽ ധാരാളമായി കാണപ്പെടുന്ന വിറ്റാമിൻ: വിറ്റാമിൻ K";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shastram);
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

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), allLearn.class);
                    myIntent.putExtra("epuzzle", first);
                    myIntent.putExtra("epuzzle1", first1);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), allLearn.class);
                    myIntent.putExtra("epuzzle", vitamin);
                    myIntent.putExtra("epuzzle1", vitamin1);
                    startActivityForResult(myIntent, 0);
                }

            }
        });

    }
}
