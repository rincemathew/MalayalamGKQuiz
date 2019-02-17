package com.melisa.rincemathew.malayalamgkquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LearnKerala extends AppCompatActivity {
    ListView listView;
    android.support.v7.widget.Toolbar toolbar;
    String[] mobileArray = {"മുഖ്യമന്ത്രിമാരും ഭരണകാലവും","കേരളത്തിലെ ഏറ്റവും വലുത്","കേരളത്തിൽ ഏറ്റവും ആദ്യം"
    ,"അടിസ്ഥാന വിവരങ്ങൾ","ആദ്യത്തെ മന്ത്രിസഭ","കേരളത്തിലെ ആർ.ടി.ഒ. ഓഫീസുകളുടെ പട്ടിക"};
    String ministers  = "മുഖ്യമന്ത്രിമാര്\u200D";
    String ministers1  = "ഇ.എം.എസ്. നമ്പൂതിരിപ്പാട് 05-04-1957 - 31-07-1959 \n" +
            "പട്ടം താണുപിള്ള 22-02-1960 - 25-09-1962 \n" +
            "ആർ. ശങ്കർ 26-09-1962 - 10-09-1964 \n" +
            "ഇ.എം.എസ്. നമ്പൂതിരിപ്പാട് 06-03-1967 - 24-10-1969\n" +
            "ഇ.എം .എ സി. അച്യുതമേനോൻ - 01-11-1969 - 01-08-1970 \n" +
            "സി. അച്യുതമേനോൻ 04-10-1970 - 25-03-1977\n" +
            "കെ. കരുണാകരൻ 25-03-1977 - 27-04-1977 \n" +
            "എ.കെ. ആന്റണി 27-04-1977 - 27-10-1978 \n" +
            "പി.കെ. വാസുദേവൻ നായർ 29-10-1978 - 07-10-1979 \n" +
            "സി.എച്ച്. മുഹമ്മദ്കോയ 12-10-1979 - 01 -12-1979 \n" +
            "ഇ.കെ. നായനാർ 25-01-1980 - 20-10-1981 \n" +
            "കെ. കരുണാകരൻ 28-12-1981 - 17-03-1982\n" +
            "കെ. കരുണാകരൻ 25-04-1982 - 22-03-1987 \n" +
            "ഇ.കെ. നായനാർ 26-03-1987 - 05-04-1991 \n" +
            "കെ. കരുണാകരൻ 24-06-1991 - 16-03-1995\n" +
            "എ.കെ. ആന്റണി 22-03-1995 - 27-04-1996  \n" +
            "ഇ.കെ. നായനാർ 20-05-1996 - 17-05-2001 \n" +
            "എ.കെ. ആന്റണി 17-05-2001 - 29-08-2004 \n" +
            "ഉമ്മൻചാണ്ടി 31-08-2004 - 18-05-2006 \n" +
            "വി.എസ്.അച്യുതാനന്ദൻ 18-05-2006 - 14-05-2011 \n" +
            "ഉമ്മൻചാണ്ടി 18-05-2011 - 20-05-2016\n" +
            "പിണറായി വിജയൻ 25-05-2016";
    String big = "ഏറ്റവും വലുത്";
    String big1  = "ഏറ്റവും വലിയ ശുദ്ധജലതടാകം : ശാസ്താംകോട്ട \n" +
            "ഏറ്റവും ഉയരം കൂടിയ കൊടുമുടി : ആനമുടി \n" +
            "ഏറ്റവും വലിയ ജലവൈദ്യുത പദ്ധതി : ഇടുക്കി \n" +
            "ഏറ്റവും വലിയ റെയിൽവേ സ്റ്റേഷൻ : ഷൊർണൂർ\n" +
            "ഏറ്റവും കൂടുതൽ ജനസംഖ്യയുള്ള ജില്ല : മലപ്പുറം\n" +
            "ഏറ്റവും വലിയ ജലസേചന പദ്ധതി ; കല്ലട\n" +
            "ഏറ്റവുമധികം ജലസമൃദ്ധിയുള്ള നദി : പെരിയാർ\n" +
            "ഏറ്റവും വലിയ കായൽ : വേമ്പനാട്ടുകായല്\u200D\n" +
            "ഏറ്റവും വലിയ ജില്ല : പാലക്കാട്\n" +
            "ഏറ്റവും വലിയ താലൂക്ക് : ഏറനാട്\n" +
            "ഏറ്റവും നീളം കൂടിയ നദി: പെരിയാർ";
    String first  = "ഏറ്റവും ആദ്യം";
    String first1  = "പത്രം: രാജ്യസമാചാരം\n" +
            "പക്ഷിസങ്കേതം : തട്ടേക്കാട്\n" +
            "കാഴ്ചബംഗ്ലാവ് : തിരുവനന്തപുരം\n" +
            "മലയാള പുസ്തകം :സംക്ഷേപവേദാർത്ഥം\n" +
            "മെഡിക്കൽ കോളേജ് :തിരുവനന്തപുരം\n" +
            "വനിതാ മജിസ്ട്രേട്ട്:ഓമനക്കുഞ്ഞമ്മ \n" +
            "ജലവൈദ്യുത പദ്ധതി: പള്ളിവാസൽ \n" +
            "മലയാള ഖണ്ഡകാവ്യം : വീണപൂവ്\n" +
            "സ്പീക്കർ : കെ.ഒ. ഐഷാഭായി\n" +
            "പ്രതിപക്ഷ നേതാവ് : പി.ടി. ചാക്കോ\n" +
            "വിദ്യാഭ്യാസമന്തി ; പാഫ.ജോസഫ് മുണ്ടശ്ശേരി\n" +
            "കോളേജ് : സി.എം.എസ്. കോളേജ് (കോട്ടയം) \n" +
            "അച്ചടിശാല : സി.എം.എസ്. പ്രസ്സ് (കോട്ടയം) \n" +
            "സർവകലാശാല : തിരുവിതാംകൂർ (കേരള) \n" +
            "മലയാള പുസ്തകം :സംക്ഷേപവേദാർത്ഥം \n" +
            "മലയാള സിനിമ (ശബ്ദ സിനിമ) : ബാലൻ\n" +
            "മലയാള സിനിമ (നിശ്ശബ്ദ സിനിമ) : വിഗതകുമാരൻ";

    String vivaram  = "വിവരങ്ങൾ";
    String vivaram1  = "തലസ്ഥാനം: തിരുവനന്തപുരം\n" +
            "വിസ്തീർണം: 38,863 ച.കി.മീ.\n" +
            "പ്രധാന ഭാഷ: മലയാളം\n" +
            "ജില്ലകൾ  :14\n" +
            "റവന്യു ഡിവിഷനുകൾ  :21\n" +
            "താലൂക്കുകൾ  :75\n" +
            "വില്ലേജുകൾ  :1452.\n" +
            "ജില്ലാ പഞ്ചായത്തുകൾ  :14\n" +
            "ബ്ലോക്ക് പഞ്ചായത്തുകൾ  :152\n" +
            "ഗ്രാമ പഞ്ചായത്തുകൾ  :941\n" +
            "നഗരസഭകൾ  :87\n" +
            "കോർപ്പരേഷനുകൾ  :6\n" +
            "കണ്ടോന്റ്മെന്റ്റ്  :1 (കണ്ണൂർ)\n" +
            "നിയമസഭാ മണ്ഡലങ്ങൾ  : 140\n" +
            "ലോക സഭാ മണ്ഡലങ്ങൾ : 20\n" +
            "രാജ്യ സഭാ സീറ്റുകൾ  : 9\n" +
            "തീരപ്രദേശദൈർഘ്യം : 580 കി.മീ. \n" +
            "സംസ്ഥാന പക്ഷി : മലമുഴക്കി വേഴാമ്പൽ \n" +
            "സംസ്ഥാന മത്സ്യം : കരിമീൻ \n" +
            "സംസ്ഥാന മൃഗം : ആന് \n" +
            "സംസ്ഥാന പുഷ്പം : കണിക്കൊന്ന് \n" +
            "സംസ്ഥാന വൃക്ഷം : തെങ്ങ് \n" +
            "സംസ്ഥാന ഫലം: ചക്ക\n" +
            "ഔദ്യോഗിക പാനീയം  : ഇളനീർ\n" +
            "ഏറ്റവും വലിയ ജില്ല  : പാലക്കാട് (4480 ച. കി. മീ.)\n" +
            "ഏറ്റവും ചെറിയ ജില്ല  : ആലപ്പുഴ (1414 ച. കി. മീ)\n" +
            "കേരള സംസ്ഥാനം നിലവിൽ വന്നത് : 1956 നവംബർ1";
    String ministersf  = "മന്ത്രിസഭ";
    String ministersf1  = "ഇ.എം.എസ്. നമ്പൂതിരിപ്പാട് - മുഖ്യമന്ത്രി \n" +
            "സി. അച്യുതമേനോൻ - ധനകാര്യം \n" +
            "ജോസഫ് മുണ്ടശ്ശേരി - വിദ്യാഭ്യാസം \n" +
            "ടി.വി. തോമസ്- തൊഴിൽ, ട്രാൻസ്പോർട്ട് \n" +
            "കെ.പി. ഗോപാലൻ- വ്യവസായം \n" +
            "കെ.ആർ. ഗൗരി- റവന്യൂ, എക്സൈസ് \n" +
            "വി.ആർ. കൃഷ്ണയ്യർ - നിയമം, വൈദ്യുതി \n" +
            "കെ.സി. ജോർജ്- ഭക്ഷ്യം , വനം \n" +
            "ടി.എ. മജീദ്- പൊതുമരാമത്ത് \n" +
            "പി.കെ. ചാത്തൻ- തദ്ദേശസ്വയംഭരണം \n" +
            "ഡോ. എ.ആർ. മേനോൻ - ആരോഗ്യം";
    String rto  = "ആർ.ടി.ഒ.";
    String rto1  = "KL-01\tതിരുവനന്തപുരം\n" +
            "KL-02\tകൊല്ലം\n" +
            "KL-03\tപത്തനംതിട്ട\n" +
            "KL-04\tആലപ്പുഴ\n" +
            "KL-05\tകോട്ടയം\n" +
            "KL-06\tഇടുക്കി\n" +
            "KL-07\tഎറണാകുളം\n" +
            "KL-08\tതൃശ്ശൂർ\n" +
            "KL-09\tപാലക്കാട്\n" +
            "KL-10\tമലപ്പുറം\n" +
            "KL-11\tകോഴിക്കോട്\n" +
            "KL-12\tവയനാട്\n" +
            "KL-13\tകണ്ണൂർ\n" +
            "KL-14\tകാസർഗോഡ്\n" +
            "KL-15\tകേരള സ്റ്റേറ്റ് റോഡ് ട്രാൻസ്പോർട്ട് കോർപ്പറേഷന് അനുവദിച്ചിരിക്കുന്ന നമ്പർ\n" +
            "KL-16\tആറ്റിങ്ങൽ\n" +
            "KL-17\tമൂവാറ്റുപുഴ\n" +
            "KL-18\tവടകര\n" +
            "KL-19\tപാറശ്ശാല\n" +
            "KL-20\tനെയ്യാറ്റിൻകര\n" +
            "KL-21\tനെടുമങ്ങാട്\n" +
            "KL-22\tകഴക്കൂട്ടം\n" +
            "KL-23\tകരുനാഗപ്പള്ളി\n" +
            "KL-24\tകൊട്ടാരക്കര\n" +
            "KL-25\tപുനലൂർ\n" +
            "KL-26\tഅടൂർ\n" +
            "KL-27\tതിരുവല്ല\n" +
            "KL-28\tമല്ലപ്പള്ളി\n" +
            "KL-29\tകായംകുളം\n" +
            "KL-30\tചെങ്ങന്നൂർ\n" +
            "KL-31\tമാവേലിക്കര\n" +
            "KL-32\tചേർത്തല\n" +
            "KL-33\tചങ്ങനാശ്ശേരി\n" +
            "KL-34\tകാഞ്ഞിരപ്പള്ളി\n" +
            "KL-35\tപാലാ\n" +
            "KL-36\tവൈക്കം\n" +
            "KL-37\tവണ്ടിപ്പെരിയാർ\n" +
            "KL-38\tതൊടുപുഴ\n" +
            "KL-39\tതൃപ്പൂണിത്തുറ\n" +
            "KL-40\tപെരുമ്പാവൂർ\n" +
            "KL-41\tആലുവ\n" +
            "KL-42\tവടക്കൻ പറവൂർ\n" +
            "KL-43\tമട്ടാഞ്ചേരി\n" +
            "KL-44\tകോതമംഗലം\n" +
            "KL-45\tഇരിഞ്ഞാലക്കുട\n" +
            "KL-46\tഗുരുവായൂർ\n" +
            "KL-47\tകൊടുങ്ങല്ലൂർ\n" +
            "KL-48\tവടക്കാഞ്ചേരി\n" +
            "KL-49\tആലത്തൂർ\n" +
            "KL-50\tമണ്ണാർക്കാട്\n" +
            "KL-51\tഒറ്റപ്പാലം\n" +
            "KL-52\tപട്ടാമ്പി\n" +
            "KL-53\tപെരിന്തൽമണ്ണ\n" +
            "KL-54\tപൊന്നാനി\n" +
            "KL-55\tതിരൂർ\n" +
            "KL-56\tകൊയിലാണ്ടി\n" +
            "KL-57\tകൊടുവള്ളി\n" +
            "KL-58\tതലശ്ശേരി\n" +
            "KL-59\tതളിപ്പറമ്പ്\n" +
            "KL-60\tകാഞ്ഞങ്ങാട്\n" +
            "KL-61\tകുന്നത്തൂർ\n" +
            "KL-62\tറാന്നി\n" +
            "KL-63\tഅങ്കമാലി\n" +
            "KL-64\tചാലക്കുടി\n" +
            "KL-65\tതിരൂരങ്ങാടി\n" +
            "KL-66\tകുട്ടനാട്\n" +
            "KL-67\tഉഴവൂർ\n" +
            "KL-68\tദേവികുളം\n" +
            "KL-69\tഉടുമ്പൻചോല\n" +
            "KL-70\tചിറ്റൂർ\n" +
            "KL-71\tനിലമ്പൂർ\n" +
            "KL-72\tമാനന്തവാടി\n" +
            "KL-73\tസുൽത്താൻബത്തേരി ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_kerala);
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
                    myIntent.putExtra("epuzzle", vivaram);
                    myIntent.putExtra("epuzzle1", vivaram1);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), allLearn.class);
                    myIntent.putExtra("epuzzle", ministersf);
                    myIntent.putExtra("epuzzle1", ministersf1);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), allLearn.class);
                    myIntent.putExtra("epuzzle", rto);
                    myIntent.putExtra("epuzzle1", rto1);
                    startActivityForResult(myIntent, 0);
                }

            }
        });

    }
}
