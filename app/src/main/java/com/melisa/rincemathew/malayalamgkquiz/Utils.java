package com.melisa.rincemathew.malayalamgkquiz;

import android.os.Handler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RinceMathew on 24-02-2018.
 */

public class Utils {
    public interface DelayCallback{
        void afterDelay();
    }
    public static void delay(int secs, final DelayCallback delayCallback){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                delayCallback.afterDelay();
            }
        }, secs * 1000);
    }

    /**
     * Created by RinceMathew on 24-02-2018.
     */

    public static class OptionArray {

        private int questionNumber;
        private List<String> optionArray=new ArrayList<>();

        public OptionArray(int questionNumber)
        {
            this.questionNumber=questionNumber;

            if (questionNumber==0)
            {
                optionArray.add("1950");
                optionArray.add("1952");
                optionArray.add("1951");
                optionArray.add("1953");
            }
            else if (questionNumber==1)
            {
                optionArray.add("കോഴിക്കോട്");
                optionArray.add("തിരുവനന്തപുരം");
                optionArray.add("ഏറണാകുളം");
                optionArray.add("കണ്ണൂര്\u200D");
            }
            else if (questionNumber==2)
            {
                optionArray.add("വയനാട്");
                optionArray.add("കൊച്ചി");
                optionArray.add("കോട്ടയം");
                optionArray.add("ഇടുക്കി");
            }
            else if (questionNumber==3)
            {
                optionArray.add("കോഴിക്കോട്");
                optionArray.add("വയനാട്");
                optionArray.add("പാലക്കാട്");
                optionArray.add("ഇടുക്കി");
            }
            else if (questionNumber==4)
            {
                optionArray.add("കൊച്ചി");
                optionArray.add("കൊല്ലം");
                optionArray.add("തൃശൂര്\u200D");
                optionArray.add("കോഴിക്കോട്");
            }
            else if (questionNumber==5)
            {
                optionArray.add("അടൂര്\u200D");
                optionArray.add("ആലപുഴ");
                optionArray.add("ഗുരുവായൂര്");
                optionArray.add("ഹരിപാട്");
            }
            else if (questionNumber==6)
            {
                optionArray.add("കോഴിക്കോട്");
                optionArray.add("തിരുവനന്തപുരം");
                optionArray.add("ആലപുഴ");
                optionArray.add("പാലക്കാട്");
            }
            else if (questionNumber==7)
            {
                optionArray.add("കോഴിക്കോട്");
                optionArray.add("തിരുവനന്തപുരം");
                optionArray.add("മലപ്പുറം");
                optionArray.add("ഏറണാകുളം");
            }
            else if (questionNumber==8)
            {
                optionArray.add("മലപ്പുറം");
                optionArray.add("പാലക്കാട്");
                optionArray.add("വയനാട്");
                optionArray.add("കോഴിക്കോട്");
            }
            else if (questionNumber==9)
            {
                optionArray.add("പുതുച്ചേരി");
                optionArray.add("ഡല്\u200Dഹി");
                optionArray.add("ലക്ഷ്യദിപ്");
                optionArray.add("മാഹി");
            }
            else if (questionNumber==10)
            {
                optionArray.add("മലപ്പുറം");
                optionArray.add("കാസര്\u200Dഗോഡ്\u200C");
                optionArray.add("കണ്ണൂര്\u200D");
                optionArray.add("കോഴിക്കോട്");
            }
            else if (questionNumber==11)
            {
                optionArray.add("ഐസാക് പിറ്റ്മാൻ");
                optionArray.add("ഐസക് പിറ്റ്മാൻ");
                optionArray.add("ജേക്കബ്‌ പിറ്റ്മാൻ");
                optionArray.add("എബ്രഹാം ലവേര്ടോന്‍");
            }
            else if (questionNumber==12)
            {
                optionArray.add("എഡിസണ്‍");
                optionArray.add("മാർക്കോണി");
                optionArray.add("ഫാരഡെ");
                optionArray.add("ഫോര്‍ഡ്");
            }
            else if (questionNumber==13)
            {
                optionArray.add("ഇസ്രയേല്‍");
                optionArray.add("ജോര്‍ദാന്‍");
                optionArray.add("ഈജിപ്ത്");
                optionArray.add("ലിബിയ");
            }
            else if (questionNumber==14)
            {
                optionArray.add("ആലപ്പുഴ");
                optionArray.add("കൊച്ചി");
                optionArray.add("കുമരകം");
                optionArray.add("തേകടി");
            }
            else if (questionNumber==15)
            {
                optionArray.add("1215ഓഗസ്റ്റ്‌ 15");
                optionArray.add("1215ജൂലൈ 15");
                optionArray.add("1215സെപ്തംബർ 15");
                optionArray.add("1215 ജൂൺ 15");
            }
            else if (questionNumber==16)
            {
                optionArray.add("1939 സെപ്തംബർ 1");
                optionArray.add("1938 ജൂൺ 15");
                optionArray.add("1935 ജൂലൈ 15 ");
                optionArray.add("1935 ഓഗസ്റ്റ്‌ 1");
            }
            else if (questionNumber==17)
            {
                optionArray.add("1775 ജൂൺ 6");
                optionArray.add("1778 സെപ്തംബർ 15");
                optionArray.add("1776 ജൂലൈ 4");
                optionArray.add("1777 ഓഗസ്റ്റ്‌ 14");
            }
            else if (questionNumber==18)
            {
                optionArray.add("കര കൌശല വസ്തുകല്‍");
                optionArray.add("ചിത്ര രചന");
                optionArray.add("സാഹിത്യം");
                optionArray.add("ഭാഷ");
            }
            else if (questionNumber==19)
            {
                optionArray.add("സിന്ധു");
                optionArray.add("ഗംഗ");
                optionArray.add("കാവേരി");
                optionArray.add("യമുന");
            }
            else if (questionNumber==20)
            {
                optionArray.add("ഫോര്‍ഡ്");
                optionArray.add("റുഡോൾഫ് ഡീസൽ");
                optionArray.add("മാര്‍കോണി");
                optionArray.add("എഡിസണ്‍");
            }
            else if (questionNumber==21)
            {
                optionArray.add("ജവഹര്‍ലാല്‍ നെഹറു");
                optionArray.add("എ.ഒ.ഹും");
                optionArray.add("അബെദകര്‍");
                optionArray.add("ആനി ബസന്ത്");
            }
            else if (questionNumber==22)
            {
                optionArray.add("കോണ്‍ഗ്രസ്‌ ബ്യൂറോ ഓഫ് ഇൻവെസ്റ്റിഗേഷൻ");
                optionArray.add("കര്രെപ്റ്റ്ബ്യൂറോ ഓഫ് ഇൻവെസ്റ്റിഗേഷൻ");
                optionArray.add("കോണ്‍ഗ്രസ്‌ ബ്യൂറോ ഓഫ് ഇന്ട്രോഗ്രറേന്‍");
                optionArray.add("സെൻടൽ ബ്യൂറോ ഓഫ് ഇൻവെസ്റ്റിഗേഷൻ");
            }
            else if (questionNumber==23)
            {
                optionArray.add("ഗാന്ധിസ്മാരക നിധിയുടെ പ്രവർത്തനം");
                optionArray.add("തൊഴിലില്ലായ്മ");
                optionArray.add("കുടിവെള്ള പദ്ധതി");
                optionArray.add("സ്ത്രീ സബ്രക്ഷണം");
            }
            else if (questionNumber==24)
            {
                optionArray.add("എ കെ ജി");
                optionArray.add("കെ കേളപന്‍");
                optionArray.add("മന്നത്ത് പദ്മനാഭൻ");
                optionArray.add("ഇ ചന്ദ്രശേഖരന്‍");
            }
            else if (questionNumber==25)
            {
                optionArray.add("തിരുവനന്തപുരം");
                optionArray.add("കൊല്ലം");
                optionArray.add("പത്തനംതിട്ട");
                optionArray.add("കോട്ടയം");
            }
            else if (questionNumber==26)
            {
                optionArray.add("സംസ്കൃതം");
                optionArray.add("ഭൌമശാസ്ത്രം");
                optionArray.add("രസതന്ത്രം");
                optionArray.add("ഗണിതം");
            }
            else if (questionNumber==27)
            {
                optionArray.add("റോം");
                optionArray.add("വത്തിക്കാന്‍");
                optionArray.add("ഗ്രീസ്");
                optionArray.add("ജനിവ");
            }
            else if (questionNumber==28)
            {
                optionArray.add("മെകോ ബാക്ടീരിയം ലെപ്രേ");
                optionArray.add("ഇ.കോളി");
                optionArray.add("ക്ലോസ്ട്രീഡിയം പെര്‍ഫ്രിന്‍ജെസ്");
                optionArray.add("സാല്‍മൊണല്ല");
            }
            else if (questionNumber==29)
            {
                optionArray.add("വിറ്റാമിൻ ബി");
                optionArray.add("വിറ്റാമിൻ ഡി");
                optionArray.add("വിറ്റാമിൻ കെ");
                optionArray.add("വിറ്റാമിൻ എ");
            }
            else if (questionNumber==30)
            {
                optionArray.add("ബോറിക് അമ്ളം");
                optionArray.add("നൈട്രക് അമ്ളം");
                optionArray.add("സിടിക് അമ്ളം");
                optionArray.add("ക്ലോറിക് അമ്ളം");
            }
            else if (questionNumber==31)
            {
                optionArray.add("ജി.ശങ്കരക്കുറുപ്പ്");
                optionArray.add("കുമാരനാശാന്‍");
                optionArray.add("ഉല്ലുര്‍");
                optionArray.add("വള്ളത്തോള്‍");
            }
            else if (questionNumber==32)
            {
                optionArray.add("കാര്‍ബണ്‍ മോണോസൈറ്റ്");
                optionArray.add("നൈട്രജന്‍");
                optionArray.add("ഫോസ്ഫറസ്");
                optionArray.add("അമോണിയ");
            }
            else if (questionNumber==33)
            {
                optionArray.add("ഋഗ്വേദം");
                optionArray.add("സാമവേദം");
                optionArray.add("യജുര്‍‌വേദം");
                optionArray.add("അഥര്‍വവേദം");
            }
            else if (questionNumber==34)
            {
                optionArray.add("അമോണിയം കാർബണേറ്റ്");
                optionArray.add("അമോണിയം സള്‍ഫേറ്റ്");
                optionArray.add("അമോണിയം നൈട്രറ്റ്");
                optionArray.add("അമോണിയം ക്ലോറഡ്");
            }
            else if (questionNumber==35)
            {
                optionArray.add("ഖേല്‍രത്ന അവാർഡ്");
                optionArray.add("അര്‍ജുനന്‍ അവാർഡ്");
                optionArray.add("ദോണാചാര്യ അവാർഡ്");
                optionArray.add("കീര്‍ത്തിചക്ര അവാർഡ്");
            }
            else if (questionNumber==36)
            {
                optionArray.add("ഗുരു നാനാക്ക്");
                optionArray.add("മഹാവീരൻ");
                optionArray.add("ബസവ");
                optionArray.add("വേദവ്യാസ");
            }
            else if (questionNumber==37)
            {
                optionArray.add("തെര്‍മോമീറ്റര്‍");
                optionArray.add("സ്ഫിഗ്മാമാനോമീറ്റർ");
                optionArray.add("ലാക്ടടോമീറ്റർ");
                optionArray.add("ബാരോമീറ്റർ");
            }
            else if (questionNumber==38)
            {
                optionArray.add("വാട്ട്‌");
                optionArray.add("ആപിയര്‍");
                optionArray.add("all of the above");
                optionArray.add("കിലോവാട്ട് അവർ");
            }
            else if (questionNumber==39)
            {
                optionArray.add("അയോധ്യ");
                optionArray.add("ദ്വാരക");
                optionArray.add("ഹസ്തിനപുരം");
                optionArray.add("പാടലീപുത്രം");
            }
            else if (questionNumber==40)
            {
                optionArray.add("1528ലെ ഒന്നാം പാനിപ്പട്ടുയുദ്ധം");
                optionArray.add("1527ലെ രണ്ടാം പാനിപ്പട്ടുയുദ്ധം");
                optionArray.add("1529-ലെ ഒന്നാം പാനിപ്പട്ടുയുദ്ധം");
                optionArray.add("1526-ലെ ഒന്നാം പാനിപ്പട്ടുയുദ്ധം");
            }
            else if (questionNumber==41)
            {
                optionArray.add("മുത്ത്");
                optionArray.add("പേര്");
                optionArray.add("നാണയം");
                optionArray.add("സ്വര്‍ണം");
            }
            else if (questionNumber==42)
            {
                optionArray.add("രാജ്കുമാരി അമൃത്കൗർ");
                optionArray.add("ഇന്ദിരാഗാന്ധി");
                optionArray.add("സരോജിനി നായിഡു");
                optionArray.add("ആകാമ ചെറിയാന്‍");
            }
            else if (questionNumber==43)
            {
                optionArray.add("കന്യാകുമാരി");
                optionArray.add("ഇന്ദിരാ പോയിന്റ്");
                optionArray.add("കൊല്‍ക്കത്ത");
                optionArray.add("തിരുനല്‍വേലി");
            }
            else if (questionNumber==44)
            {
                optionArray.add("അങ്കോർവാട്ട്");
                optionArray.add("പളനി");
                optionArray.add("അക്ഷരധാം");
                optionArray.add("മുകാബിക");
            }
            else if (questionNumber==45)
            {
                optionArray.add("ശ്രീരാമകൃഷ്ണ പരമഹംസർ");
                optionArray.add("ചട്ടമ്പിസ്വാമി");
                optionArray.add("ശ്രി നാരായണ ഗുരു");
                optionArray.add("വരരുചി");
            }
            else if (questionNumber==46)
            {
                optionArray.add("കുവൈറ്റി ദിനാർ");
                optionArray.add("രാണ്ട്");
                optionArray.add("ദിനാർ");
                optionArray.add("റിയാല്‍");
            }
            else if (questionNumber==47)
            {
                optionArray.add("രബീന്ദ്ര നാഥ് ടാഗോർ");
                optionArray.add("അമര്‍ത്യസെന്‍");
                optionArray.add("ദാദ ശാഹിബ് ഫല്കെ");
                optionArray.add("സ്വാമി വിവേകാനന്ദന്‍");
            }
            else if (questionNumber==48)
            {
                optionArray.add("ആൽബർട്ട് ഐൻസ്റ്റീൻ");
                optionArray.add("തോമസ്‌ ആല്‍വാഎഡിസണ്‍");
                optionArray.add("ഐസക് നൂട്ടന്‍");
                optionArray.add("ലുയി പാസ്ച്ചര്‍");
            }
            else if (questionNumber==49)
            {
                optionArray.add("ഓസ്ട്രേലിയ");
                optionArray.add("സൗത്ത് ആഫ്രിക്ക");
                optionArray.add("ഇന്ത്യ");
                optionArray.add("ഇംഗ്ലണ്ട്");
            }
            else if (questionNumber==50)
            {
                optionArray.add("കരൾ");
                optionArray.add("ശ്വാസകോശം");
                optionArray.add("പാന്‍ക്രയാസ്");
                optionArray.add("കിഡ്നി");
            }
            else if (questionNumber==51)
            {
                optionArray.add("ജോനാഥൻ സ്വിഫ്റ്റ്");
                optionArray.add("ലിയോ ടോല്‍സ്ടോയി");
                optionArray.add("മാര്‍ക്ക്‌ ട്വൈന്‍");
                optionArray.add("ചാള്‍സ് ടികെന്‍സ്");
            }
            else if (questionNumber==52)
            {
                optionArray.add("മ്യാൻമർ");
                optionArray.add("സിഗപൂര്‍");
                optionArray.add("കബോടിയ");
                optionArray.add("ലാവോസ്");
            }
            else if (questionNumber==53)
            {
                optionArray.add("മേരി കുറി");
                optionArray.add("ഫ്ളോറൻസ് നൈറ്റിം ഗേൽ");
                optionArray.add("ഹെലെന്‍ കെല്ലെര്‍");
                optionArray.add("ആന്‍ ഫ്രാങ്ക്");
            }
            else if (questionNumber==54)
            {
                optionArray.add("ക്രിക്കറ്റ്");
                optionArray.add("ഫുട്ബോൾ");
                optionArray.add("ഹോക്കി");
                optionArray.add("ബാസ്കെറ്റ്ബോള്‍");
            }
            else if (questionNumber==55)
            {
                optionArray.add("താര്‍");
                optionArray.add("സഹാറ");
                optionArray.add("പാമീർ");
                optionArray.add("ഡെക്കാന്‍");
            }
            else if (questionNumber==56)
            {
                optionArray.add("ശ്വര്യചക്ര");
                optionArray.add("കിര്‍ത്തിച്ചക്ര");
                optionArray.add("പരമവീരചകം");
                optionArray.add("മഹാവിരച്ചക്ര");
            }
            else if (questionNumber==57)
            {
                optionArray.add("ശനി");
                optionArray.add("ബുധന്‍");
                optionArray.add("ശുക്രൻ");
                optionArray.add("വ്യാഴം");
            }
            else if (questionNumber==58)
            {
                optionArray.add("മുംബൈ");
                optionArray.add("പഞ്ചാബ്‌");
                optionArray.add("ന്യൂഡൽഹി");
                optionArray.add("കൊല്‍ക്കത്ത");
            }
            else if (questionNumber==59)
            {
                optionArray.add("കൊല്‍ക്കത്ത");
                optionArray.add("രാമേശ്വരം");
                optionArray.add("കൊച്ചി");
                optionArray.add("പനാജി");
            }
            else if (questionNumber==60)
            {
                optionArray.add("ന്യൂ യോര്‍ക്ക്");
                optionArray.add("ജനിവ");
                optionArray.add("സെബു");
                optionArray.add("മനില");
            }
            else if (questionNumber==61)
            {
                optionArray.add("ഐൻസ്റ്റീൻ");
                optionArray.add("നൂട്ടന്‍");
                optionArray.add("മഗല്ലന്‍");
                optionArray.add("ഗലീലിയോ");
            }
            else if (questionNumber==62)
            {
                optionArray.add("ഹൈഗോമീറ്റർ");
                optionArray.add("നാനോമീറ്റർ");
                optionArray.add("ബാരോമീറ്റർ");
                optionArray.add("ഹൈഡ്രോമീറ്റർ");
            }
            else if (questionNumber==63)
            {
                optionArray.add("ഹിമാചൽ പ്രദേശ്");
                optionArray.add("ഉത്തര്‍ പ്രദേശ്");
                optionArray.add("സിക്കിം");
                optionArray.add("നാഗാലാ‌‍ന്‍ഡ്");
            }
            else if (questionNumber==64)
            {
                optionArray.add("ജല സംരക്ഷണം");
                optionArray.add("പരിസ്ഥിതി സംരക്ഷണം");
                optionArray.add("റോഡ്‌ വികസനം");
                optionArray.add("വന സംരക്ഷണം");
            }
            else if (questionNumber==65)
            {
                optionArray.add("ഉത്തരാഖണ്ഡ്");
                optionArray.add("ബീഹാര്‍");
                optionArray.add("ജാര്‍ഖണ്ഡ്");
                optionArray.add("ബംഗാള്‍");
            }
            else if (questionNumber==66)
            {
                optionArray.add("പി.സി. മഹലനോബിസ്");
                optionArray.add("എന്‍.ഡി.തിവാരി");
                optionArray.add("മൊറാര്‍ജി ദേശായി");
                optionArray.add("പ്രണബ് മുഗര്‍ജി");
            }
            else if (questionNumber==67)
            {
                optionArray.add("അറ്റ്ലാന്റിക്");
                optionArray.add("ഇന്ത്യന്‍");
                optionArray.add("മെഡിറ്ററെനിയന്‍");
                optionArray.add("പസഫിക്");
            }
            else if (questionNumber==68)
            {
                optionArray.add("ഹരിയാന");
                optionArray.add("ഗുജറാത്ത്");
                optionArray.add("രാജസ്ഥാന്‍");
                optionArray.add("പഞ്ചാബ്");
            }
            else if (questionNumber==69)
            {
                optionArray.add("സച്ചിധാനഥന്‍");
                optionArray.add("വള്ളത്തോള്‍");
                optionArray.add("ഒള്ളൂര്‍");
                optionArray.add("പി.കുഞ്ഞിരാമൻ നായർ");
            }
            else if (questionNumber==70)
            {
                optionArray.add("38863 ച.കി.മീ.");
                optionArray.add("35034ച.കി.മീ");
                optionArray.add("48562ച.കി.മീ");
                optionArray.add("58962ച.കി.മീ");
            }
            else if (questionNumber==71)
            {
                optionArray.add("തമിഴ്നാട്");
                optionArray.add("ഗോവ");
                optionArray.add("കര്‍ണാടക");
                optionArray.add("ആന്ധ്രാപ്രദേശ്");
            }
            else if (questionNumber==72)
            {
                optionArray.add("പട്ടം എ.താണു പിള്ള");
                optionArray.add("സി.അച്യുതമേനോന്‍");
                optionArray.add("ഇ.എം.എസ്.");
                optionArray.add("ആര്‍.ശങ്കര്‍");
            }
            else if (questionNumber==73)
            {
                optionArray.add("ആന്ധ്രാപ്രദേശ്");
                optionArray.add("കർണാടകം");
                optionArray.add("തമിഴ്നാട്");
                optionArray.add("കേരളം");
            }
            else if (questionNumber==74)
            {
                optionArray.add("തമിഴും സംസ്ക്കൃതവും");
                optionArray.add("മലയാളവും സംസ്ക്കൃതവും");
                optionArray.add("മലയാളവും തമിഴും");
                optionArray.add("കന്നഡയും സംസ്ക്കൃതവും");
            }
            else if (questionNumber==75)
            {
                optionArray.add("വിഗതകുമാരന്‍");
                optionArray.add("പഥേര്‍ പാഞ്ചാലി");
                optionArray.add("രാജാ ഹരിശ്ചന്ദ്ര");
                optionArray.add("കീചകവധം");
            }
            else if (questionNumber==76)
            {
                optionArray.add("ഹൈദരാബാദ്");
                optionArray.add("കൊല്‍ക്കത്ത");
                optionArray.add("ബാംഗ്ലൂർ");
                optionArray.add("മുംബൈ");
            }
            else if (questionNumber==77)
            {
                optionArray.add("ന്യൂഡല്‍ഹി");
                optionArray.add("പുണെ");
                optionArray.add("കൊൽക്കത്ത");
                optionArray.add("ചെന്നൈ");
            }
            else if (questionNumber==78)
            {
                optionArray.add("മധുര");
                optionArray.add("മൈസൂർ");
                optionArray.add("കൊച്ചി");
                optionArray.add("മംഗലാപുരം");
            }
            else if (questionNumber==79)
            {
                optionArray.add("അരുണാചല്‍പ്രദേശ്");
                optionArray.add("മേഗാലയ");
                optionArray.add("അസം");
                optionArray.add("നാഗാലാ‌‍ന്‍ഡ്");
            }
            else if (questionNumber==80)
            {
                optionArray.add("പ്രധാനമന്ത്രി");
                optionArray.add("ഗവര്‍ണര്‍");
                optionArray.add("പ്രസിഡന്റ്");
                optionArray.add("ഉപരാഷ്ട്രപതി");
            }
            else if (questionNumber==81)
            {
                optionArray.add("ലളിതാബിക അന്ധര്‍ജനം");
                optionArray.add("എ.കെ.ജി");
                optionArray.add("ബാലാമണിയമ്മ");
                optionArray.add("വി.ടി.ഭട്ടതിരിപ്പാട്");
            }
            else if (questionNumber==82)
            {
                optionArray.add("സത്യജിത് റേ");
                optionArray.add("റസൂല്‍ പൂക്കുട്ടി");
                optionArray.add("എ.ആര്‍.റഹ്മാന്‍");
                optionArray.add("ഭാനുഅത്തയ്യ");
            }
            else if (questionNumber==83)
            {
                optionArray.add("ഹരപ്പാ");
                optionArray.add("ഘാഗ്ഗർ-ഹാക്രാ");
                optionArray.add("ബലൂചിസ്ഥാൻ");
                optionArray.add("മൊഹൻജൊദാരോ");
            }
            else if (questionNumber==84)
            {
                optionArray.add("നാരദന്‍");
                optionArray.add("പരമശിവന്‍");
                optionArray.add("പരശുരാമന്‍");
                optionArray.add("വാമനന്‍");
            }
            else if (questionNumber==85)
            {
                optionArray.add("ഹോണ്ടുറാസ്");
                optionArray.add("ലിത്വാനിയ");
                optionArray.add("ഹംഗറി");
                optionArray.add("ലിബിയ");
            }
            else if (questionNumber==86)
            {
                optionArray.add("മണ്ണ്");
                optionArray.add("വായു");
                optionArray.add("ജലം");
                optionArray.add("all of the above");
            }
            else if (questionNumber==87)
            {
                optionArray.add("പി കുഞ്ഞിരാമന്‍ നായര്‍");
                optionArray.add("പേരുംബടവം ശ്രീധരന്‍");
                optionArray.add("പി ശങ്കരൻ നമ്പൂതിരി");
                optionArray.add("തോപ്പില്‍ ഭാസി");
            }
            else if (questionNumber==88)
            {
                optionArray.add("കണ്ണിരും കിന്നാവും");
                optionArray.add("എന്റെ വഴിയബലങ്ങള്‍");
                optionArray.add("കവിയുടെ കാല്‍പാടുകല്‍");
                optionArray.add("എന്റെ ജീവിത സ്മരണകൾ");
            }
            else if (questionNumber==89)
            {
                optionArray.add("ബെലുഗ തിമിംഗിലം");
                optionArray.add("ചാര തിമിംഗിലം");
                optionArray.add("കൊലയാളി തിമിംഗിലം");
                optionArray.add("ബാലീൻ തിമിംഗിലം");
            }
            else if (questionNumber==90)
            {
                optionArray.add("തിക്കോടിയന്‍");
                optionArray.add("കേശവദേവ്");
                optionArray.add("കുമാരനാശാൻ");
                optionArray.add("തകഴി");
            }
            else if (questionNumber==91)
            {
                optionArray.add("സ്പെയിന്‍");
                optionArray.add("അമേരിക്ക");
                optionArray.add("അര്‍ജന്റീന");
                optionArray.add("ബ്രസീല്‍");
            }
            else if (questionNumber==92)
            {
                optionArray.add("അമേരിക്ക");
                optionArray.add("ഇംഗ്ലണ്ട്");
                optionArray.add("കാനഡ");
                optionArray.add("ജര്‍മ്മനി");
            }
            else if (questionNumber==93)
            {
                optionArray.add("ചൈതന്യ");
                optionArray.add("സദ്ഗുരു ശിവഗിരിദാസ");
                optionArray.add("ബോധാനന്ദ");
                optionArray.add("ഗോവിന്ദനന്ദ");
            }
            else if (questionNumber==94)
            {
                optionArray.add("ക്ഷയം");
                optionArray.add("ടെറ്റനി");
                optionArray.add("ന്യുമോണിയ");
                optionArray.add("ഡിഫ്തീരിയ");
            }
            else if (questionNumber==95)
            {
                optionArray.add("ഓക്സിടോസിൻ");
                optionArray.add("കാൽസിനോണിൻ");
                optionArray.add("പ്രോലാക്ടിന്‍");
                optionArray.add("റെനിൻ");
            }
            else if (questionNumber==96)
            {
                optionArray.add("റാഡ്ക്ലിഫ് ലൈൻ");
                optionArray.add("മാജി നോട്ട് ലൈൻ");
                optionArray.add("ആൽപൈൻ ലൈൻ");
                optionArray.add("മാർജിനൽ ലൈൻ");
            }
            else if (questionNumber==97)
            {
                optionArray.add("1818");
                optionArray.add("1819");
                optionArray.add("1820");
                optionArray.add("1821");
            }
            else if (questionNumber==98)
            {
                optionArray.add("1827");
                optionArray.add("1828");
                optionArray.add("1829");
                optionArray.add("1826");
            }
            else if (questionNumber==99)
            {
                optionArray.add("കോലോത്തുനാട്");
                optionArray.add("പെരുംബടപ്പ്");
                optionArray.add("തിരുവിതാംകൂർ");
                optionArray.add("കൊച്ചി രാജകുടുംബം");
            }
            else if (questionNumber==100)
            {
                optionArray.add("സൂററ്റ്");
                optionArray.add("നാസിക്");
                optionArray.add("ഭോപാല്‍");
                optionArray.add("ഹൂബ്ലി");
            }
            else if (questionNumber==101)
            {
                optionArray.add("യു.എസ്.എ");
                optionArray.add("ഫ്രാൻസ്");
                optionArray.add("ഇന്ത്യ");
                optionArray.add("ശ്രീലങ്ക");
            }
            else if (questionNumber==102)
            {
                optionArray.add("സ്റ്റേപ്പിഡിയസ്");
                optionArray.add("സാർട്ടോറിയസ്");
                optionArray.add("ഫീമർ");
                optionArray.add("ഗ്ലൂട്ടിയസ്");
            }
            else if (questionNumber==103)
            {
                optionArray.add("വൃക്ക");
                optionArray.add("സ്പീൻ");
                optionArray.add("കരൾ");
                optionArray.add("ആമാശയം");
            }
            else if (questionNumber==104)
            {
                optionArray.add("ഭരണഘടനയുണ്ടായിരിക്കും");
                optionArray.add("രാഷ്ട്രത്തലവനുണ്ടായിരിക്കും");
                optionArray.add("അധികാരവിഭജനം");
                optionArray.add("സുപ്രീംകോടതിയുണ്ടായിരിക്കും");
            }
            else if (questionNumber==105)
            {
                optionArray.add("രബീന്ദ്രനാഥ് ടാഗോർ");
                optionArray.add("ഗുരു നാനാക്ക്");
                optionArray.add("വിവേകാനന്ദൻ");
                optionArray.add("ഗാന്ധിജി");
            }
            else if (questionNumber==106)
            {
                optionArray.add("19");
                optionArray.add("32");
                optionArray.add("44");
                optionArray.add("40");
            }
            else if (questionNumber==107)
            {
                optionArray.add("ജയപ്രകാശ് നാരായൺ");
                optionArray.add("മഹാത്മാഗാന്ധി");
                optionArray.add("വിനോബാഭാവെ");
                optionArray.add("ബാബാ ആംതെ");
            }
            else if (questionNumber==108)
            {
                optionArray.add("1643");
                optionArray.add("1635");
                optionArray.add("1653");
                optionArray.add("1633");
            }
            else if (questionNumber==109)
            {
                optionArray.add("സ്റ്റാഫോർഡ് ക്രിപ്സ്");
                optionArray.add("ജോൺ സൈമൺ");
                optionArray.add("എ.വി.അലക്സാണ്ടർ");
                optionArray.add("പെത്തിക് ലോറൻസ്");
            }
            else if (questionNumber==110)
            {
                optionArray.add("സുമേരിയക്കാർ");
                optionArray.add("ചൈനക്കാർ");
                optionArray.add("ഇന്ത്യക്കാർ");
                optionArray.add("ഈജിപ്ത്കാർ");
            }
            else if (questionNumber==111)
            {
                optionArray.add("1888");
                optionArray.add("1890");
                optionArray.add("1903");
                optionArray.add("1907");
            }
            else if (questionNumber==112)
            {
                optionArray.add("മാർച്ച് 21");
                optionArray.add("ജൂൺ 21");
                optionArray.add("സെപ്തംബർ 23");
                optionArray.add("ഡിസംബർ 22");
            }
            else if (questionNumber==113)
            {
                optionArray.add("കുമാരനാശാൻ");
                optionArray.add("ശ്രീനാരായണഗുരു");
                optionArray.add("വള്ളത്തോൾ");
                optionArray.add("കുഞ്ചൻ നമ്പ്യാർ");
            }
            else if (questionNumber==114)
            {
                optionArray.add("സംവാദ് കൗമുദി");
                optionArray.add("യങ് ഇന്ത്യ");
                optionArray.add("ദ ഹിന്ദു");
                optionArray.add("വന്ദേമാതരം");
            }
            else if (questionNumber==115)
            {
                optionArray.add("ഫ്രാൻസ്");
                optionArray.add("യു.എസ്.എ.");
                optionArray.add("ജപ്പാൻ");
                optionArray.add("ബ്രിട്ടൺ");
            }
            else if (questionNumber==116)
            {
                optionArray.add("ഈജിപ്ഷ്യൻ സംസ്കാരം");
                optionArray.add("മായൻ സംസ്കാരം");
                optionArray.add("മെസൊപൊട്ടാമിയൻ സംസ്കാരം");
                optionArray.add("ചൈനീസ് സംസ്കാരം");
            }
            else if (questionNumber==117)
            {
                optionArray.add("ഡോ.രാജേന്ദ്രപ്രസാദ്");
                optionArray.add("ആർ.വെങ്കട്ടരാമൻ");
                optionArray.add("ഡോ.രാധാകൃഷ്ണൻ");
                optionArray.add("വി.വി.ഗിരി");
            }
            else if (questionNumber==118)
            {
                optionArray.add("അലക്സാണ്ടർ കരൺസ്കി");
                optionArray.add("ലെനിൻ");
                optionArray.add("ട്രോട്സ്കി");
                optionArray.add("ജോസഫ് സ്റ്റാലിൻ");
            }
            else if (questionNumber==119)
            {
                optionArray.add("കറുത്തമണ്ണ്");
                optionArray.add("ചെമ്മണ്ണ്");
                optionArray.add("ചെങ്കൽ മണ്ണ്");
                optionArray.add("ലാറ്ററൈറ്റ്");
            }
            else if (questionNumber==120)
            {
                optionArray.add("ഇന്ത്യ");
                optionArray.add("ഫ്രാൻസ്");
                optionArray.add("ജപ്പാൻ");
                optionArray.add("ബ്രിട്ടൺ");
            }
            else if (questionNumber==121)
            {
                optionArray.add("18");
                optionArray.add("21");
                optionArray.add("25");
                optionArray.add("17");
            }
            else if (questionNumber==122)
            {
                optionArray.add("അക്ബർ");
                optionArray.add("ബാബർ");
                optionArray.add("അലാവുദ്ദീൻ ഖിൽജി");
                optionArray.add("ഇൽത്തുമിഷ്");
            }
            else if (questionNumber==123)
            {
                optionArray.add("ചിത്തിര തിരുനാൾ");
                optionArray.add("വേലുത്തമ്പി ദളവ");
                optionArray.add("രാജാ കേശവദാസൻ");
                optionArray.add("വിശാഖം തിരുനാൾ");
            }
            else if (questionNumber==124)
            {
                optionArray.add("ജാദുഗുഡ");
                optionArray.add("ഖേത്രി");
                optionArray.add("കോളാർ");
                optionArray.add("ഹുട്ടി");
            }
            else if (questionNumber==125)
            {
                optionArray.add("ചരകൻ");
                optionArray.add("ധന്വന്തരി");
                optionArray.add("സുശ്രുതൻ");
                optionArray.add("അത്രേയൻ");
            }
            else if (questionNumber==126)
            {
                optionArray.add("കാമർലിങ് ഓനസ്");
                optionArray.add("അലക്സാണ്ടർ വോൾട്ട");
                optionArray.add("ആമ്പിയർ");
                optionArray.add("ഒാഫ് റോമർ");
            }
            else if (questionNumber==127)
            {
                optionArray.add("1945");
                optionArray.add("1946");
                optionArray.add("1948");
                optionArray.add("1956");
            }
            else if (questionNumber==128)
            {
                optionArray.add("പഞ്ചായത്തീരാജ്");
                optionArray.add("ധർമരാജ്യം");
                optionArray.add("രാമരാജ്യം");
                optionArray.add("സ്വരാജ്");
            }
            else if (questionNumber==129)
            {
                optionArray.add("1893-1915");
                optionArray.add("1893-1914");
                optionArray.add("1869-1915");
                optionArray.add("1893-1917");
            }
            else if (questionNumber==130)
            {
                optionArray.add("യമുന");
                optionArray.add("കോസി");
                optionArray.add("ചംബൽ");
                optionArray.add("ഷയോക്");
            }
            else if (questionNumber==131)
            {
                optionArray.add("1869");
                optionArray.add("1914");
                optionArray.add("1966");
                optionArray.add("1956");
            }
            else if (questionNumber==132)
            {
                optionArray.add("ക്രോമോസ്ഫിയർ");
                optionArray.add("ലിത്തോസ്ഫിയർ");
                optionArray.add("ഫോട്ടോസ്ഫിയർ");
                optionArray.add("ട്രോപ്പോസ്ഫിയർ");
            }
            else if (questionNumber==133)
            {
                optionArray.add("552");
                optionArray.add("550");
                optionArray.add("540");
                optionArray.add("544");
            }
            else if (questionNumber==134)
            {
                optionArray.add("മഗ്സസേ അവാർഡ്");
                optionArray.add("ഓസ്കർ അവാർഡ് ");
                optionArray.add("ഭട്നഗർ അവാർഡ്");
                optionArray.add("റൈറ്റ് ലൈവിഹുഡ് അവാർഡ്");
            }
            else if (questionNumber==135)
            {
                optionArray.add("ആന");
                optionArray.add("കുതിര");
                optionArray.add("ഒട്ടകം");
                optionArray.add("പശു");
            }
            else if (questionNumber==136)
            {
                optionArray.add("15");
                optionArray.add("16");
                optionArray.add("17");
                optionArray.add("18");
            }
            else if (questionNumber==137)
            {
                optionArray.add("വി.വിശ്വനാഥൻ");
                optionArray.add("എ.ജെ.ജോൺ");
                optionArray.add("പട്ടം താണുപിള്ള");
                optionArray.add("വി.പി.മേനോൻ");
            }
            else if (questionNumber==138)
            {
                optionArray.add("മലബാർ കലാപം");
                optionArray.add("പുന്നപ്ര-വയലാർ");
                optionArray.add("വൈക്കം സത്യാഗ്രഹം");
                optionArray.add("ഗുരുവായൂർ സത്യാഗ്രഹം");
            }
            else if (questionNumber==139)
            {
                optionArray.add("ബുദ്ധമതം");
                optionArray.add("ജൈനമതം");
                optionArray.add("പാഴ്സി മതം");
                optionArray.add("ജൂതമതം");
            }
            else if (questionNumber==140)
            {
                optionArray.add("ഫ്രഞ്ചുവിപ്ലവം");
                optionArray.add("അമേരിക്കൻ വിപ്ലവം");
                optionArray.add("റഷ്യൻ വിപ്ലവം");
                optionArray.add("ചൈനീസ് വിപ്ലവം");
            }
            else if (questionNumber==141)
            {
                optionArray.add("ഡെൻമാർക്ക്");
                optionArray.add("സ്വിറ്റ്സർലൻഡ്");
                optionArray.add("ബെൽജിയം");
                optionArray.add("തുർക്കി");
            }
            else if (questionNumber==142)
            {
                optionArray.add("കോഴിക്കോട്");
                optionArray.add("പയ്യാമ്പലം");
                optionArray.add("പയ്യന്നൂർ");
                optionArray.add("പിണറായി");
            }
            else if (questionNumber==143)
            {
                optionArray.add("സുൽത്താൻ ബത്തേരി");
                optionArray.add("മാനന്തവാടി");
                optionArray.add("കൽപ്പറ്റ");
                optionArray.add("തിരുനെല്ലി");
            }
            else if (questionNumber==144)
            {
                optionArray.add("ബാക്ടീരിയ");
                optionArray.add("പ്രോട്ടോസോവ");
                optionArray.add("ഫംഗസ്");
                optionArray.add("വൈറസ്");
            }
            else if (questionNumber==145)
            {
                optionArray.add("കൃഷി");
                optionArray.add("വ്യവസായം");
                optionArray.add("വാർത്താവിനിമയം");
                optionArray.add("തുറമുഖവികസനം");
            }
            else if (questionNumber==146)
            {
                optionArray.add("മുഹമ്മദലി ജിന്ന");
                optionArray.add("ഷൗക്കത്ത് അലി");
                optionArray.add("റഹ്മത്ത് അലി");
                optionArray.add("സയ്യദ് അഹമ്മദ് ഖാൻ");
            }
            else if (questionNumber==147)
            {
                optionArray.add("ഹിമാലയം");
                optionArray.add("ആൽപ്സ്");
                optionArray.add("ആൻഡീസ്");
                optionArray.add("റോക്കീസ്");
            }
            else if (questionNumber==148)
            {
                optionArray.add("മൈക്കൽ ഫാരഡേ");
                optionArray.add("ബഞ്ചമിൻ ഫ്രാങ്ക്ളിൻ");
                optionArray.add("ജോൺ ബേർഡ്");
                optionArray.add("വില്യം ഹാർവി");
            }
            else if (questionNumber==149)
            {
                optionArray.add("മഹാനദി");
                optionArray.add("ഗംഗ");
                optionArray.add("നർമദ");
                optionArray.add("യമുന");
            }
            else if (questionNumber==150)
            {
                optionArray.add("മാർച്ച്-മെയ്");
                optionArray.add("ഡിസംബർ-ഫിബ്രവരി");
                optionArray.add("ഒക്ടോബർ-നവംബർ");
                optionArray.add("ജൂൺ-സെപ്തംബർ");
            }
            else if (questionNumber==151)
            {
                optionArray.add("മൈനസ് 40");
                optionArray.add("212");
                optionArray.add("40");
                optionArray.add("0");
            }
            else if (questionNumber==152)
            {
                optionArray.add("ഡൗൺ സിൻഡാം");
                optionArray.add("ഹാൻസൺസ് രോഗം");
                optionArray.add("വീൽസ് ഡിസീസ്");
                optionArray.add("സാർസ്");
            }
            else if (questionNumber==153)
            {
                optionArray.add("സി.കേശവൻ");
                optionArray.add("ഡോ.പൽപു");
                optionArray.add("ടി.കെ.മാധവൻ");
                optionArray.add("വി.കെ.വേലായുധൻ");
            }
            else if (questionNumber==154)
            {
                optionArray.add("തോമസ് മാൻ");
                optionArray.add("തോമസ് മൂർ");
                optionArray.add("ഡാന്റേ");
                optionArray.add("ഫ്രാൻസിസ് ബേക്കൺ");
            }
            else if (questionNumber==155)
            {
                optionArray.add("കലിബംഗൻ");
                optionArray.add("ബനവാലി");
                optionArray.add("ഹാരപ്പ");
                optionArray.add("മൊഹൻജൊദാരോ");
            }
            else if (questionNumber==156)
            {
                optionArray.add("ജലസേചനം");
                optionArray.add("അടിസ്ഥാനവിദ്യാഭ്യാസം");
                optionArray.add("വ്യവസായം");
                optionArray.add("ദാരിദ്ര്യനിർമാർജനം");
            }
            else if (questionNumber==157)
            {
                optionArray.add("സിംപ്ലെയർ");
                optionArray.add("ചാൾസ് ബാബേജ്");
                optionArray.add("അലൻ ട്യൂറിങ്");
                optionArray.add("ബിൽ ഗേറ്റ്സ്");
            }
            else if (questionNumber==158)
            {
                optionArray.add("കണ്ണ്");
                optionArray.add("ചെറുകുടൽ");
                optionArray.add("അസ്ഥികൾ");
                optionArray.add("മസ്തിഷ്കം");
            }
            else if (questionNumber==159)
            {
                optionArray.add("തൈമസ്");
                optionArray.add("അഡ്രീനൽ");
                optionArray.add("പീനിയൽ");
                optionArray.add("പിറ്റ്യൂറ്ററി");
            }
            else if (questionNumber==160)
            {
                optionArray.add("ബൈറൺ പ്രഭു");
                optionArray.add("കീറ്റ്സ്");
                optionArray.add("ഷെല്ലി");
                optionArray.add("റുഡ്യാർഡ് കിപ്ലിങ്");
            }
            else if (questionNumber==161)
            {
                optionArray.add("വേമ്പനാട്");
                optionArray.add("വേളി");
                optionArray.add("വെള്ളായണി");
                optionArray.add("നടയറ");
            }
            else if (questionNumber==162)
            {
                optionArray.add("കൊറോബസ്");
                optionArray.add("ജെ.ബി.കൊണോലി");
                optionArray.add("കുബർട്ടിൻ");
                optionArray.add("തിയോഡോഷ്യസ്");
            }
            else if (questionNumber==163)
            {
                optionArray.add("സുനിത വില്യംസ്");
                optionArray.add("ബചേന്ദ്രി പാൽ");
                optionArray.add("ആരതി ഗുപ്ത");
                optionArray.add("കൽപനാ ചൗള");
            }
            else if (questionNumber==164)
            {
                optionArray.add("ലാഹോർ");
                optionArray.add("ഡൽഹി");
                optionArray.add("കാബൂൾ");
                optionArray.add("ഇസ്ലാമാബാദ്");
            }
            else if (questionNumber==165)
            {
                optionArray.add("ചന്ദ്രൻ");
                optionArray.add("ബുധൻ");
                optionArray.add("സൂര്യൻ");
                optionArray.add("ശുക്രൻ");
            }
            else if (questionNumber==166)
            {
                optionArray.add("മുഹമ്മദ്");
                optionArray.add("അബ്ദുൾ സത്താർ");
                optionArray.add("ആലി മുസലിയാർ");
                optionArray.add("കുഞ്ഞാലി");
            }
            else if (questionNumber==167)
            {
                optionArray.add("ഇടുക്കി");
                optionArray.add("പാലക്കാട്");
                optionArray.add("കൊല്ലം");
                optionArray.add("കോട്ടയം");
            }
            else if (questionNumber==168)
            {
                optionArray.add("മൂങ്ങ");
                optionArray.add("പ്രാവ്");
                optionArray.add("കാക്ക");
                optionArray.add("പെൻഗ്വിൻ");
            }
            else if (questionNumber==169)
            {
                optionArray.add("എറണാകുളം");
                optionArray.add("കോട്ടയം");
                optionArray.add("ദക്ഷിണ കാനറ");
                optionArray.add("അജ്മീർ");
            }
            else if (questionNumber==170)
            {
                optionArray.add("ജൂലിയസ് നെരേര");
                optionArray.add("ബാബാ ആംതെ");
                optionArray.add("എ.ടി.അരിയരത്നെ");
                optionArray.add("നെൽസൺ മണ്ടേല");
            }
            else if (questionNumber==171)
            {
                optionArray.add("ഭൂമി");
                optionArray.add("യുറാനസ്");
                optionArray.add("ചൊവ്വ");
                optionArray.add("നെപ്റ്റൺ");
            }
            else if (questionNumber==172)
            {
                optionArray.add("മാനവേദൻ രാജാവ്");
                optionArray.add("കുഞ്ചൻ നമ്പ്യാർ");
                optionArray.add("സ്വാതി തിരുനാൾ");
                optionArray.add("കൊട്ടാരക്കരത്തമ്പുരാൻ");
            }
            else if (questionNumber==173)
            {
                optionArray.add("ബ്രിട്ടൺ");
                optionArray.add("യു.എസ്.എ");
                optionArray.add("കാനഡ");
                optionArray.add("അയർലൻഡ്");
            }
            else if (questionNumber==174)
            {
                optionArray.add("പി.ശിവശങ്കർ");
                optionArray.add("ബി.രാമകൃഷ്ണറാവു");
                optionArray.add("സിക്കന്ദർ ഭക്ത്");
                optionArray.add("ബി.രാച്ചയ്യ");
            }
            else if (questionNumber==175)
            {
                optionArray.add("സ്വാതന്ത്ര്യം, സമത്വം, സാഹോദര്യം");
                optionArray.add("അധികാരം തൊഴിലാളികൾക്ക്");
                optionArray.add("പ്രാതിനിധ്യമില്ലാതെ നികുതിയില്ല");
                optionArray.add("സമാധാനം വിപ്ലവകാലത്ത്");
            }
            else if (questionNumber==176)
            {
                optionArray.add("വില്യം മക്ലിയോഡ്");
                optionArray.add("വില്യം ലോഗൻ");
                optionArray.add("വില്യം ഫാർമർ");
                optionArray.add("കൊനോലി");
            }
            else if (questionNumber==177)
            {
                optionArray.add("ഡോ.പൽപു");
                optionArray.add("കെ.പി.ശങ്കരമേനോൻ");
                optionArray.add("മന്നത്ത് പദ്മനാഭൻ");
                optionArray.add("എം.ഇ.നായിഡു");
            }
            else if (questionNumber==178)
            {
                optionArray.add("കൃഷ്ണദേവരായർ");
                optionArray.add("ശിവജി");
                optionArray.add("അക്ബർ");
                optionArray.add("വിക്രമാദിത്യൻ");
            }
            else if (questionNumber==179)
            {
                optionArray.add("ബാബർ");
                optionArray.add("ഷാജഹാൻ");
                optionArray.add("അക്ബർ");
                optionArray.add("ഹുമയൂൺ");
            }
            else if (questionNumber==180)
            {
                optionArray.add("ലളിതാംബിക അന്തർജനം");
                optionArray.add("എം.ആർ.ബി");
                optionArray.add("വി.ടി.ഭട്ടതിരിപ്പാട്");
                optionArray.add("കുറൂർ നീലകണ്ഠൻ നമ്പൂതിരിപ്പാട്");
            }
            else if (questionNumber==181)
            {
                optionArray.add("എം.കമലം");
                optionArray.add("കെ.ആർ.ഗൗരിയമ്മ ");
                optionArray.add("സുഗതകുമാരി");
                optionArray.add("നഫീസത്തുബീവി");
            }
            else if (questionNumber==182)
            {
                optionArray.add("വില്ലോ");
                optionArray.add("ആഞ്ഞിലി");
                optionArray.add("വേങ്ങ");
                optionArray.add("മഹാഗണി");
            }
            else if (questionNumber==183)
            {
                optionArray.add("മൈക്കൽ ഫാരഡെ");
                optionArray.add("ചാൾസ് ബാബേജ്");
                optionArray.add("ന്യൂട്ടൺ");
                optionArray.add("ഗലീലിയോ");
            }
            else if (questionNumber==184)
            {
                optionArray.add("1957");
                optionArray.add("1958");
                optionArray.add("1959");
                optionArray.add("1960");
            }
            else if (questionNumber==185)
            {
                optionArray.add("ബ്രിട്ടണും ചൈനയും");
                optionArray.add("ജർമനിയും ഫാൻസും");
                optionArray.add("ജപ്പാനും ചൈനയും");
                optionArray.add("ഐക്യനാടുകളും റഷ്യയും");
            }
            else if (questionNumber==186)
            {
                optionArray.add("1999");
                optionArray.add("2000");
                optionArray.add("1998");
                optionArray.add("2001");
            }
            else if (questionNumber==187)
            {
                optionArray.add("റോം");
                optionArray.add("കെയറോ");
                optionArray.add("ഉർ");
                optionArray.add("അലക്സാണ്ടിയ");
            }
            else if (questionNumber==188)
            {
                optionArray.add("കാറൽ മാർക്സ്");
                optionArray.add("റോബർട്ട് ഓവൻ");
                optionArray.add("ഹെഗൽ");
                optionArray.add("റൂസ്സോ");
            }
            else if (questionNumber==189)
            {
                optionArray.add("അയർലൻഡ്");
                optionArray.add("ഇസയേൽ");
                optionArray.add("ഈസ്റ്റ് തിമൂർ");
                optionArray.add("പലസ്തീൻ");
            }
            else if (questionNumber==190)
            {
                optionArray.add("രക്തം");
                optionArray.add("യൂറിയ");
                optionArray.add("പാൽ");
                optionArray.add("സ്വർണം");
            }
            else if (questionNumber==191)
            {
                optionArray.add("വട്ടമേശ സമ്മേളനത്തിനു പോകുംമുമ്പ്");
                optionArray.add("ദണ്ഡിയാത്ര തുടങ്ങുന്ന സമയത്ത്");
                optionArray.add("ഇർവിൻ പ്രഭുവുമായി ഉടമ്പടിയിലേർപ്പെടും മുമ്പ്");
                optionArray.add("ചമ്പാരൻ സത്യാഗ്രഹം ആരംഭിക്കുമ്പോൾ");
            }
            else if (questionNumber==192)
            {
                optionArray.add("പ്രസിഡന്റ്");
                optionArray.add("ജനങ്ങൾ");
                optionArray.add("ഗവർണർ");
                optionArray.add("സുപ്രീം കോടതി");
            }
            else if (questionNumber==193)
            {
                optionArray.add("പത്രപ്രവർത്തനം");
                optionArray.add("സംഗീതം");
                optionArray.add("സിനിമ");
                optionArray.add("സാഹിത്യം");
            }
            else if (questionNumber==194)
            {
                optionArray.add("പ്രസിഡന്റ്");
                optionArray.add("പ്രധാനമന്ത്രി");
                optionArray.add("ഗവർണർ");
                optionArray.add("സുപ്രീം കോടതി");
            }
            else if (questionNumber==195)
            {
                optionArray.add("കുമ്മായം");
                optionArray.add("ക്ളാവ് ");
                optionArray.add("തുരുമ്പ്");
                optionArray.add("തകരം");
            }
            else if (questionNumber==196)
            {
                optionArray.add("കുശിനഗരം");
                optionArray.add("ബോധ്ഗയ");
                optionArray.add("രാജഗൃഹം");
                optionArray.add("പാറ്റ്ന");
            }
            else if (questionNumber==197)
            {
                optionArray.add("ബാക്ടീരിയ");
                optionArray.add("വൈറസ്");
                optionArray.add("പ്രോട്ടോസോവ");
                optionArray.add("ഫംഗസ്");
            }
            else if (questionNumber==198)
            {
                optionArray.add("ഹൃദയം");
                optionArray.add("കരൾ");
                optionArray.add("കണ്ണ്");
                optionArray.add("വൃക്ക");
            }
            else if (questionNumber==199)
            {
                optionArray.add("തെലുങ്ക്");
                optionArray.add("തമിഴ്");
                optionArray.add("കന്നഡ");
                optionArray.add("മലയാളം");
            }
            else if (questionNumber==200)
            {
                optionArray.add("സിട്രിക് ആസിഡ്");
                optionArray.add("അസെറ്റിക് ആസിഡ്");
                optionArray.add("ലാക്ടിക് ആസിഡ്");
                optionArray.add("മാലിക് ആസിഡ്");
            }
            else if (questionNumber==201)
            {
                optionArray.add("പോർച്ചുഗീസുകാർ");
                optionArray.add("ഫ്രഞ്ചുകാർ");
                optionArray.add("ബ്രിട്ടീഷുകാർ");
                optionArray.add("ഡച്ചുകാർ");
            }
            else if (questionNumber==202)
            {
                optionArray.add("പുസ്തകം");
                optionArray.add("ലിപി");
                optionArray.add("രാജാവ്");
                optionArray.add("രാജവംശം");
            }
            else if (questionNumber==203)
            {
                optionArray.add("കാലടി");
                optionArray.add("തിരൂർ");
                optionArray.add("കോട്ടയം");
                optionArray.add("തിരുവനന്തപുരം");
            }
            else if (questionNumber==204)
            {
                optionArray.add("സർദാർ കെ.എം.പണിക്കർ");
                optionArray.add("വള്ളത്തോൾ നാരായണമേനോൻ");
                optionArray.add("തകഴി");
                optionArray.add("ജി.ശങ്കരക്കുറുപ്പ്");
            }
            else if (questionNumber==205)
            {
                optionArray.add("കെ.കേളപ്പൻ");
                optionArray.add("എ.കെ.ഗോപാലൻ");
                optionArray.add("ഇ.എം.എസ്.");
                optionArray.add("ടി.കെ.മാധവൻ");
            }
            else if (questionNumber==206)
            {
                optionArray.add("ചൈനാക്കടൽ");
                optionArray.add("സഹാറ");
                optionArray.add("വെസ്റ്റിൻഡീസ്");
                optionArray.add("ഓസ്ട്രേലിയ");
            }
            else if (questionNumber==207)
            {
                optionArray.add("1987");
                optionArray.add("1976");
                optionArray.add("1986");
                optionArray.add("1988");
            }
            else if (questionNumber==208)
            {
                optionArray.add("അസം");
                optionArray.add("മേഘാലയ");
                optionArray.add("അരുണാചൽ പ്രദേശ്");
                optionArray.add("നാഗാലാൻഡ്");
            }
            else if (questionNumber==209)
            {
                optionArray.add("ഭൂകമ്പം");
                optionArray.add("മഴ");
                optionArray.add("നദി");
                optionArray.add("കാറ്റ്");
            }
            else if (questionNumber==210)
            {
                optionArray.add("ജോസ് ഡി സാൽമാർട്ടിൻ");
                optionArray.add("ഫ്രാൻസിസ്കോ മിരാൻഡ");
                optionArray.add("സൈമൺ ബൊളിവർ");
                optionArray.add("ചെ ഗുവേര");
            }
            else if (questionNumber==211)
            {
                optionArray.add("ബ്രിട്ടൺ");
                optionArray.add("ദക്ഷിണാഫ്രിക്ക");
                optionArray.add("ചൈന");
                optionArray.add("റഷ്യ");
            }
            else if (questionNumber==212)
            {
                optionArray.add("വർക്കല");
                optionArray.add("മുസിരിസ്");
                optionArray.add("തിരുനാവായ");
                optionArray.add("വിഴിഞ്ഞം");
            }
            else if (questionNumber==213)
            {
                optionArray.add("ശ്രീനാരായണഗുരു");
                optionArray.add("കുഞ്ചൻ നമ്പ്യാർ");
                optionArray.add("കുമാരനാശാൻ");
                optionArray.add("ചട്ടമ്പിസ്വാമികൾ");
            }
            else if (questionNumber==214)
            {
                optionArray.add("ഇളങ്കോവടികൾ");
                optionArray.add("ചെങ്കുട്ടുവൻ");
                optionArray.add("കോവലൻ");
                optionArray.add("ചാത്തനാർ");
            }
            else if (questionNumber==215)
            {
                optionArray.add("മാർട്ടിന ഹിബിസ്");
                optionArray.add("സ്റ്റെഫിഗ്രാഫ്");
                optionArray.add("മാർട്ടിന നവരത്തിലോവ");
                optionArray.add("വീനസ് വില്യംസ്");
            }
            else if (questionNumber==216)
            {
                optionArray.add("മുക്തിബാഹിനി");
                optionArray.add("ശാന്തിവാഹിനി");
                optionArray.add("രൺവീർസേന");
                optionArray.add("ജാതിയ സങ്സദ്");
            }
            else if (questionNumber==217)
            {
                optionArray.add("സംക്ഷേപവേദാർഥം");
                optionArray.add("ഹോർത്തൂസ് മലബാറിക്കസ്");
                optionArray.add("രാമചരിതം");
                optionArray.add("എന്റെ റോമായാത");
            }
            else if (questionNumber==218)
            {
                optionArray.add("ലിഥിയം");
                optionArray.add("ഹീലിയം");
                optionArray.add("കാർബൺ");
                optionArray.add("ഹൈഡ്രജൻ");
            }
            else if (questionNumber==219)
            {
                optionArray.add("മേഘനാഥ് സാഹ");
                optionArray.add("സി.വി.രാമൻ");
                optionArray.add("വിക്രം സാരാഭായി");
                optionArray.add("ഹോമി ജഹാംഗീർ ഭാഭ");
            }
            else if (questionNumber==220)
            {
                optionArray.add("1984 നവംബർ 1");
                optionArray.add("1984 ഒക്ടോബർ 31");
                optionArray.add("1984 ഒക്ടോബർ 30");
                optionArray.add("1984 നവംബർ 30");
            }
            else if (questionNumber==221)
            {
                optionArray.add("കേരളം");
                optionArray.add("ഹരിയാന");
                optionArray.add("പഞ്ചാബ്");
                optionArray.add("അസം");
            }
            else if (questionNumber==222)
            {
                optionArray.add("ഹിന്ദു");
                optionArray.add("ക്രിസ്ത്യൻ");
                optionArray.add("ജൈനർ");
                optionArray.add("മുസ്ലിം");
            }
            else if (questionNumber==223)
            {
                optionArray.add("ഹുസൈൻ സാഗർ");
                optionArray.add("കൊല്ലേരു");
                optionArray.add("മേട്ടൂർ");
                optionArray.add("ചിൽക്ക");
            }
            else if (questionNumber==224)
            {
                optionArray.add("കൊല്ലം");
                optionArray.add("കണ്ണൂർ");
                optionArray.add("എറണാകുളം");
                optionArray.add("പാലക്കാട്");
            }
            else if (questionNumber==225)
            {
                optionArray.add("മലബാർ മാന്വൽ");
                optionArray.add("കേരളാരാമം");
                optionArray.add("മിറാബിലിയ ഡിസ്ക്രിപ്ഷ്യ");
                optionArray.add("ഹോർത്തൂസ് മലബാറിക്കസ്");
            }
            else if (questionNumber==226)
            {
                optionArray.add("ഡോ. ആർ.മേനോൻ");
                optionArray.add("വി.ആർ.കൃഷ്ണയ്യർ");
                optionArray.add("ജോസഫ് മുണ്ടശ്ശേരി");
                optionArray.add("കെ.ആർ.ഗൗരി");
            }
            else if (questionNumber==227)
            {
                optionArray.add("തഞ്ചാവൂർ");
                optionArray.add("പളനി");
                optionArray.add("മധുര");
                optionArray.add("തിരുച്ചിറപ്പള്ളി");
            }
            else if (questionNumber==228)
            {
                optionArray.add("ശ്രീമൂലം തിരുനാൾ");
                optionArray.add("ചിത്തിര തിരുനാൾ");
                optionArray.add("വിശാഖം തിരുനാൾ");
                optionArray.add("സ്വാതി തിരുനാൾ");
            }
            else if (questionNumber==229)
            {
                optionArray.add("1951");
                optionArray.add("1950");
                optionArray.add("1952");
                optionArray.add("1954");
            }
            else if (questionNumber==230)
            {
                optionArray.add("റിപ്പബ്ലിക്");
                optionArray.add("ഫെഡറേഷൻ");
                optionArray.add("ഡൊമിനിയൻ");
                optionArray.add("സ്റ്റേറ്റ്");
            }
            else if (questionNumber==231)
            {
                optionArray.add("ഏഴ്");
                optionArray.add("അഞ്ച്");
                optionArray.add("നാല്");
                optionArray.add("ആറ്");
            }
            else if (questionNumber==232)
            {
                optionArray.add("ന്യൂഡൽഹി");
                optionArray.add("മുംബൈ");
                optionArray.add("ചെന്നെ");
                optionArray.add("കൊൽക്കത്തെ");
            }
            else if (questionNumber==233)
            {
                optionArray.add("ജനീവ");
                optionArray.add("ലണ്ടൻ");
                optionArray.add("പാരീസ്");
                optionArray.add("മോൺട്രിയൽ");
            }
            else if (questionNumber==234)
            {
                optionArray.add("യൂറോകാം");
                optionArray.add("ഹീമോഗ്ളോബിൻ");
                optionArray.add("ആന്തോസയാനിൻ");
                optionArray.add("മെലാനിൻ");
            }
            else if (questionNumber==235)
            {
                optionArray.add("ഓർഡിനൻസ്");
                optionArray.add("വിജ്ഞാപനം");
                optionArray.add("റിട്ട്");
                optionArray.add("വിളംബരം");
            }
            else if (questionNumber==236)
            {
                optionArray.add("അമേരിക്കൻ ഐക്യനാടുകൾ");
                optionArray.add("ഫ്രാൻസ്");
                optionArray.add("ചൈന");
                optionArray.add("സോവിയറ്റ് യൂണിയൻ");
            }
            else if (questionNumber==237)
            {
                optionArray.add("ദാദാഭായ് നവറോജി");
                optionArray.add("അരവിന്ദഘോഷ്");
                optionArray.add("സുരേന്ദ്രനാഥ് ബാനർജി");
                optionArray.add("ആർ.സി.ദത്ത്");
            }
            else if (questionNumber==238)
            {
                optionArray.add("വിന്ധ്യാനിരകൾ");
                optionArray.add("സാത്പുരനിരകൾ");
                optionArray.add("ആരവല്ലി കുന്നുകൾ ");
                optionArray.add("പൂർവഘട്ടം");
            }
            else if (questionNumber==239)
            {
                optionArray.add("സി.ശങ്കരൻ നായർ");
                optionArray.add("ആർ.കെ.ഷൺമുഖം ചെട്ടി");
                optionArray.add("വി.പി.മേനോൻ");
                optionArray.add("വി.കെ.കൃഷ്ണമേനോൻ");
            }
            else if (questionNumber==240)
            {
                optionArray.add("മുഖ്യമന്ത്രിക്ക്");
                optionArray.add("സ്പീക്കർക്ക്");
                optionArray.add("നിയമസഭാസെക്രട്ടറിക്ക്");
                optionArray.add("പാർട്ടി നേതാവിന്");
            }
            else if (questionNumber==241)
            {
                optionArray.add("മലബാർ കലാപം");
                optionArray.add("വാഗൺ ദുരന്തം");
                optionArray.add("ചൗരിചൗര സംഭവം");
                optionArray.add("സ്വരാജ് പാർട്ടിയുടെ രൂപവൽക്കരണം");
            }
            else if (questionNumber==242)
            {
                optionArray.add("മഹാരാഷ്ട്ര");
                optionArray.add("രാജസ്ഥാൻ");
                optionArray.add("ഉത്തരാഞ്ചൽ");
                optionArray.add("ഉത്തർപ്രദേശ്");
            }
            else if (questionNumber==243)
            {
                optionArray.add("കുമാരനാശാൻ");
                optionArray.add("എ.ആർ.രാജരാജവർമ");
                optionArray.add("ഡോ.പൽപു");
                optionArray.add("കുഞ്ഞിക്കുട്ടൻ തമ്പുരാൻ");
            }
            else if (questionNumber==244)
            {
                optionArray.add("കർണാടകം");
                optionArray.add("കേരളം");
                optionArray.add("തമിഴ്നാട്");
                optionArray.add("ബംഗാൾ");
            }
            else if (questionNumber==245)
            {
                optionArray.add("ഗിരീഷ് കർണാട്");
                optionArray.add("ശിവരാമകാരന്ത്");
                optionArray.add("യു.ആർ.അനന്തമൂർത്തി");
                optionArray.add("സീതാകാന്ത് മഹാപാത്");
            }
            else if (questionNumber==246)
            {
                optionArray.add("മരിയൻ ജോൺസ്");
                optionArray.add("ഫ്ളോറൻസ് ഗ്രിഫിത്ത് ജോയർ");
                optionArray.add("ക്രിസ്റ്റിൻ ഓട്ടോ");
                optionArray.add("സ്റ്റെഫി ഗ്രാഫ്");
            }
            else if (questionNumber==247)
            {
                optionArray.add("സ്റ്റീഫൻ പാദുവ");
                optionArray.add("ഡബ്ലൂ.എച്ച്.ഡിക്രൂസ്");
                optionArray.add("ലൂഡി ലൂയിസ്");
                optionArray.add("ഇവരാരുമല്ല");
            }
            else if (questionNumber==248)
            {
                optionArray.add("ഉത്തർപ്രദേശ്");
                optionArray.add("ഹിമാചൽപ്രദേശ്");
                optionArray.add("കേരളം");
                optionArray.add("രാജസ്ഥാൻ");
            }
            else if (questionNumber==249)
            {
                optionArray.add("പഞ്ചാബ്");
                optionArray.add("ഉത്തർ പ്രദേശ്");
                optionArray.add("രാജസ്ഥാൻ");
                optionArray.add("ഹരിയാന");
            }
            else if (questionNumber==250)
            {
                optionArray.add("543");
                optionArray.add("776");
                optionArray.add("4896");
                optionArray.add("790");
            }
            else if (questionNumber==251)
            {
                optionArray.add("ബുധൻ");
                optionArray.add("ആൽഫാ സെന്റോറി");
                optionArray.add("പ്രോക്സിമ സെന്റോറി");
                optionArray.add("സെഡ്");
            }
            else if (questionNumber==252)
            {
                optionArray.add("മെക്സിക്കോ");
                optionArray.add("ഫിലിപ്പെൻസ്");
                optionArray.add("ഇന്ത്യ");
                optionArray.add("യു.എസ്.എ");
            }
            else if (questionNumber==253)
            {
                optionArray.add("ശ്രീനാരായണഗുരു");
                optionArray.add("കുഞ്ചൻ നമ്പ്യാർ");
                optionArray.add("കുമാരനാശാൻ");
                optionArray.add("ചട്ടമ്പിസ്വാമികൾ");
            }
            else if (questionNumber==254)
            {
                optionArray.add("തപ്സി");
                optionArray.add("ലൂണി");
                optionArray.add("ചംബൽ");
                optionArray.add("നർമദ");
            }
            else if (questionNumber==255)
            {
                optionArray.add("കെ.ടി.കോശി");
                optionArray.add("പി.ഗോവിന്ദമേനോൻ");
                optionArray.add("വി.ആർ.കൃഷ്ണയ്യർ");
                optionArray.add("ഫാത്തിമാബീവി");
            }
            else if (questionNumber==256)
            {
                optionArray.add("സൂറിച്ച്");
                optionArray.add("ജനീവ");
                optionArray.add("ന്യൂയോർക്ക്");
                optionArray.add("ബ്രസീലിയ");
            }
            else if (questionNumber==257)
            {
                optionArray.add("ബീഹാർ");
                optionArray.add("പശ്ചിമ ബംഗാൾ");
                optionArray.add("അസം");
                optionArray.add("ജാർഖണ്ഡ്");
            }
            else if (questionNumber==258)
            {
                optionArray.add("ഇറാക്ക്");
                optionArray.add("ഇറാൻ");
                optionArray.add("കുവൈറ്റ്");
                optionArray.add("ഈജിപ്ത്");
            }
            else if (questionNumber==259)
            {
                optionArray.add("ഒന്ന്");
                optionArray.add("മൂന്ന്");
                optionArray.add("അഞ്ച്");
                optionArray.add("രണ്ട്");
            }
            else if (questionNumber==260)
            {
                optionArray.add("46");
                optionArray.add("23");
                optionArray.add("13");
                optionArray.add("48");
            }
            else if (questionNumber==261)
            {
                optionArray.add("പാവോ ക്രിസ്റ്റാറ്റസ്");
                optionArray.add("ഫെലിസ് ഡൊമസ്റ്റിക്കസ്");
                optionArray.add("പാന്തെറ ലിയോ");
                optionArray.add("ഹോമോ സാപിയൻസ്");
            }
            else if (questionNumber==262)
            {
                optionArray.add("ശൂരനാട് കുഞ്ഞൻ പിള്ള");
                optionArray.add("സുഗതകുമാരി");
                optionArray.add("പാലാ നാരായണൻ നായർ");
                optionArray.add("കോവിലൻ");
            }
            else if (questionNumber==263)
            {
                optionArray.add("പ്രസിഡന്റ്");
                optionArray.add("പ്രധാനമന്ത്രി");
                optionArray.add("വൈസ് പ്രസിഡന്റ്");
                optionArray.add("സ്പീക്കര്‍");
            }
            else if (questionNumber==264)
            {
                optionArray.add("തമിഴ്നാട്");
                optionArray.add("മഹാരാഷ്ട്ര");
                optionArray.add("ആന്ധ്രാപ്രദേശ്");
                optionArray.add("കർണാടക");
            }
            else if (questionNumber==265)
            {
                optionArray.add("ഗുപ്ത");
                optionArray.add("നന്ദ");
                optionArray.add("മൗര്യ");
                optionArray.add("ശൈശുനാഗ");
            }
            else if (questionNumber==266)
            {
                optionArray.add("നമീബിയ");
                optionArray.add("സാംബിയ");
                optionArray.add("കെനിയ");
                optionArray.add("എത്യോപ്യ");
            }
            else if (questionNumber==267)
            {
                optionArray.add("ഗുരു");
                optionArray.add("ഗാന്ധി");
                optionArray.add("ലഗാൻ");
                optionArray.add("മദർ ഇന്ത്യ");
            }
            else if (questionNumber==268)
            {
                optionArray.add("ഗോയിറ്റർ");
                optionArray.add("മെനിഞ്ചറ്റിസ്");
                optionArray.add("പയോറിയ");
                optionArray.add("മരാസ്മസ്");
            }
            else if (questionNumber==269)
            {
                optionArray.add("ഓറഞ്ച്");
                optionArray.add("മഞ്ഞ");
                optionArray.add("പച്ച");
                optionArray.add("നീല");
            }
            else if (questionNumber==270)
            {
                optionArray.add("അരിസ്റ്റോട്ടിൽ");
                optionArray.add("ജീൻ ലാമാർക്ക്");
                optionArray.add("ഗ്രിഗർ മെൻഡൽ");
                optionArray.add("വില്യം ജൊഹാൻസൺ");
            }
            else if (questionNumber==271)
            {
                optionArray.add("സി.എൻ.അണ്ണാദുരെ");
                optionArray.add("എം.ജി.ആർ");
                optionArray.add("ഇ.വി.രാമസ്വാമി നായ്ക്കർ");
                optionArray.add("എൻ.ടി.രാമറാവു");
            }
            else if (questionNumber==272)
            {
                optionArray.add("ഹൃദയം");
                optionArray.add("മസ്തിഷ്കം");
                optionArray.add("കരൾ");
                optionArray.add("സന്ധികൾ");
            }
            else if (questionNumber==273)
            {
                optionArray.add("അയർലൻഡ്");
                optionArray.add("ഓസ്ട്രേലിയ");
                optionArray.add("ബ്രിട്ടൺ");
                optionArray.add("യു.എസ്.എ");
            }
            else if (questionNumber==274)
            {
                optionArray.add("19");
                optionArray.add("32");
                optionArray.add("11");
                optionArray.add("23");
            }
            else if (questionNumber==275)
            {
                optionArray.add("36");
                optionArray.add("1000");
                optionArray.add("3600");
                optionArray.add("36000");
            }
            else if (questionNumber==276)
            {
                optionArray.add("നീല");
                optionArray.add("വെളുപ്പ്");
                optionArray.add("ചുവപ്പ്");
                optionArray.add("കറുപ്പ്");
            }
            else if (questionNumber==277)
            {
                optionArray.add("ഡയബറ്റിസ് മെലിറ്റസ് ");
                optionArray.add("ഡയബറ്റിസ് ഇൻസിപ്പിഡസ്");
                optionArray.add("ഹെർണിയ");
                optionArray.add("ഫിസ്റ്റുല");
            }
            else if (questionNumber==278)
            {
                optionArray.add("മുഖ്യമന്ത്രി");
                optionArray.add("സ്പീക്കർ");
                optionArray.add("പ്രതിപക്ഷനേതാവ്");
                optionArray.add("ഗവർണർ");
            }
            else if (questionNumber==279)
            {
                optionArray.add("മീഥൈൽ സാലിസൈലേറ്റ്");
                optionArray.add("സൈക്ലോറോമീഥേൻ");
                optionArray.add("ക്ലോറോപിക്രിം");
                optionArray.add("അസറ്റൈൽ സാലിസൈലിക് ആസിഡ്");
            }
            else if (questionNumber==280)
            {
                optionArray.add("ജപ്പാൻ");
                optionArray.add("യുണൈറ്റഡ് കിങ്ഡം");
                optionArray.add("യു.എസ്.എ");
                optionArray.add("ഇന്ത്യ");
            }
            else if (questionNumber==281)
            {
                optionArray.add("മഗ്നലിയം");
                optionArray.add("ഡുറാലുമിൻ");
                optionArray.add("സ്റ്റെയിൻലെസ് സ്റ്റീൽ");
                optionArray.add("അൽനിക്കോ");
            }
            else if (questionNumber==282)
            {
                optionArray.add("പാരഫിൻ");
                optionArray.add("കൈറോസിൻ");
                optionArray.add("ടാർ");
                optionArray.add("ക്രൂഡ് ഓയിൽ");
            }
            else if (questionNumber==283)
            {
                optionArray.add("കബനി");
                optionArray.add("ഭാരതപ്പുഴ");
                optionArray.add("പെരിയാർ");
                optionArray.add("പമ്പ്");
            }
            else if (questionNumber==284)
            {
                optionArray.add("1904");
                optionArray.add("1898");
                optionArray.add("1924");
                optionArray.add("1885 - 85");
            }
            else if (questionNumber==285)
            {
                optionArray.add("ജപ്പാൻ");
                optionArray.add("ചൈന");
                optionArray.add("നേപ്പാൾ");
                optionArray.add("ഭൂട്ടാൻ");
            }
            else if (questionNumber==286)
            {
                optionArray.add("പത്രപ്രവർത്തനം");
                optionArray.add("സാഹിത്യം");
                optionArray.add("സിനിമ");
                optionArray.add("സ്പോർട്സ്");
            }
            else if (questionNumber==287)
            {
                optionArray.add("ഒളിമ്പിക്സ്");
                optionArray.add("ഏഷ്യൻ ഗെയിംസ്");
                optionArray.add("കോമൺവെൽത്ത് ഗെയിംസ്");
                optionArray.add("ആഫ്രോ- ഏഷ്യൻ ഗെയിംസ്");
            }
            else if (questionNumber==288)
            {
                optionArray.add("കെ.കേളപ്പൻ");
                optionArray.add("പി.ടി.ഭാസ്കരപ്പണിക്കർ");
                optionArray.add("കെ.പി.കേശവമേനോൻ");
                optionArray.add("പി.എൻ.പണിക്കർ");
            }
            else if (questionNumber==289)
            {
                optionArray.add("നെല്ല്");
                optionArray.add("തെങ്ങ്");
                optionArray.add("മരച്ചീനി");
                optionArray.add("വാഴ");
            }
            else if (questionNumber==290)
            {
                optionArray.add("ഡോ. അംബേദ്കർ");
                optionArray.add("ജവാഹർലാൽ നെഹ്രറു");
                optionArray.add("ബി.എൻ.റാവു");
                optionArray.add("ഡോ.രാജേന്ദ്രപ്രസാദ്");
            }
            else if (questionNumber==291)
            {
                optionArray.add("പ്ലാസ്മ");
                optionArray.add("ബോസ്-ഐൻസ്റ്റൈൻ കണ്ടൻസേറ്റ്");
                optionArray.add("ഫെർമിയോണിക് കണ്ടൻസേറ്റ്");
                optionArray.add("ഇവയൊന്നുമല്ല");
            }
            else if (questionNumber==292)
            {
                optionArray.add("ഫെഡറേഷൻ ബാങ്ക്");
                optionArray.add("ഹിന്ദുസ്ഥാൻ ബാങ്ക്");
                optionArray.add("ഇംപീരിയൽ ബാങ്ക് ");
                optionArray.add("ഇൻഡസ് ബാങ്ക്");
            }
            else if (questionNumber==293)
            {
                optionArray.add("70-72");
                optionArray.add("50-55");
                optionArray.add("30-34");
                optionArray.add("13-17");
            }
            else if (questionNumber==294)
            {
                optionArray.add("3");
                optionArray.add("3.3");
                optionArray.add("0.3");
                optionArray.add("0.03");
            }
            else if (questionNumber==295)
            {
                optionArray.add("കാൺപൂർ-ലക്നൗ");
                optionArray.add("ന്യൂഡൽഹി-മുംബൈ");
                optionArray.add("മുംബൈ-പൂനെ");
                optionArray.add("കല്യാൺ-പൂനെ");
            }
            else if (questionNumber==296)
            {
                optionArray.add("പഞ്ചാബ്");
                optionArray.add("ഗുജറാത്ത്");
                optionArray.add("കേരളം");
                optionArray.add("തമിഴ്നാട്");
            }
            else if (questionNumber==297)
            {
                optionArray.add("കരസേന");
                optionArray.add("വായുസേന");
                optionArray.add("നാവികസേന");
                optionArray.add("ഇവയൊന്നുമല്ല");
            }
            else if (questionNumber==298)
            {
                optionArray.add("ടി.കെ.നായർ");
                optionArray.add("കോങ്ങാട്ടിൽ രാമൻ മേനോൻ");
                optionArray.add("ഇക്കണ്ടവാര്യർ");
                optionArray.add("ടി.കെ.നാരായണപിള്ള");
            }
            else if (questionNumber==299)
            {
                optionArray.add("മാസിഡോണിയ");
                optionArray.add("ബോസ്നിയ");
                optionArray.add("സെർബിയ");
                optionArray.add("ബ്രിട്ടൺ");
            }
            else if (questionNumber==300)
            {
                optionArray.add("ഉത്തർ പ്രദേശ്");
                optionArray.add("ജമ്മു കശ്മീർ");
                optionArray.add("ഉത്തരാഖണ്ഡ്");
                optionArray.add("ഹിമാചൽ പ്രദേശ്");
            }
            else if (questionNumber==301)
            {
                optionArray.add("അസം");
                optionArray.add("പഞ്ചാബ്");
                optionArray.add("കർണാടകം");
                optionArray.add("ഗുജറാത്ത്");
            }
            else if (questionNumber==302)
            {
                optionArray.add("പോളണ്ട്");
                optionArray.add("തുർക്കി");
                optionArray.add("റഷ്യ");
                optionArray.add("ബെൽജിയം");
            }
            else if (questionNumber==303)
            {
                optionArray.add("വിറ്റാമിൻ എ");
                optionArray.add("വിറ്റാമിൻ സി");
                optionArray.add("വിറ്റാമിൻ ബി-2");
                optionArray.add("വിറ്റാമിൻ ഡി");
            }
            else if (questionNumber==304)
            {
                optionArray.add("മഗ്നീഷ്യം");
                optionArray.add("ഗന്ധകം");
                optionArray.add("ഇരുമ്പ്");
                optionArray.add("ചെമ്പ്");
            }
            else if (questionNumber==305)
            {
                optionArray.add("സിനിമ");
                optionArray.add("സാഹിത്യം");
                optionArray.add("സംഗീതം");
                optionArray.add("സ്പോർട്സ്");
            }
            else if (questionNumber==306)
            {
                optionArray.add("ബിന്ദുസാരൻ");
                optionArray.add("അജാതശൈതു");
                optionArray.add("സമുദ്രഗുപ്തൻ");
                optionArray.add("ബിംബിസാരൻ");
            }
            else if (questionNumber==307)
            {
                optionArray.add("ആറ്");
                optionArray.add("മൂന്ന്");
                optionArray.add("രണ്ട്");
                optionArray.add("നാല് എ");
            }
            else if (questionNumber==308)
            {
                optionArray.add("ചിക്കൻ ഗുനിയ");
                optionArray.add("അൽഷിമേഴ്സ്");
                optionArray.add("ഭാന്തിപ്പശു രോഗം");
                optionArray.add("ഡെങ്കിപ്പനി");
            }
            else if (questionNumber==309)
            {
                optionArray.add("സ്ട്രാറ്റോസ്ഫിയർ");
                optionArray.add("ട്രോപ്പോസ്ഫിയർ");
                optionArray.add("എക്സോസ്ഫിയർ");
                optionArray.add("തെർമോസ്ഫിയർ");
            }
            else if (questionNumber==310)
            {
                optionArray.add("കണ്ണൂർ");
                optionArray.add("കാസർകോട്");
                optionArray.add("കോട്ടയം");
                optionArray.add("കൊല്ലം");
            }
            else if (questionNumber==311)
            {
                optionArray.add("നെല്ല്");
                optionArray.add("മുള");
                optionArray.add("രാമച്ചം");
                optionArray.add("കറുക");
            }
            else if (questionNumber==312)
            {
                optionArray.add("ക്ഷാരമണ്ണ്");
                optionArray.add("ലാറ്ററൈറ്റ്");
                optionArray.add("എക്കൽമണ്ണ്");
                optionArray.add("കറുത്തമണ്ണ്");
            }
            else if (questionNumber==313)
            {
                optionArray.add("1966");
                optionArray.add("1964");
                optionArray.add("1963");
                optionArray.add("1967");
            }
            else if (questionNumber==314)
            {
                optionArray.add("കാശി");
                optionArray.add("കോസലം");
                optionArray.add("കുരു");
                optionArray.add("മഗധം");
            }
            else if (questionNumber==315)
            {
                optionArray.add("റോബർട്ട് ക്ലൈവ്");
                optionArray.add("വാറൻ ഹേസ്റ്റിങ്സ്");
                optionArray.add("വില്യം ബെന്റിക്");
                optionArray.add("ഡൽഹൗസി പ്രഭു");
            }
            else if (questionNumber==316)
            {
                optionArray.add("നാമദേവ്");
                optionArray.add("രാമാനന്ദൻ");
                optionArray.add("ചൈതന്യ");
                optionArray.add("കബീർ");
            }
            else if (questionNumber==317)
            {
                optionArray.add("നെല്ല്");
                optionArray.add("കുരുമുളക്");
                optionArray.add("ഏലം");
                optionArray.add("തെങ്ങ്");
            }
            else if (questionNumber==318)
            {
                optionArray.add("ടി.എൻ.ജയചന്ദ്രൻ");
                optionArray.add("പാഫ. എം.എം.ഗനി");
                optionArray.add("ഡോ.ജോൺ മത്തായി");
                optionArray.add("ഡോ.എം.വി.പൈലി");
            }
            else if (questionNumber==319)
            {
                optionArray.add("പുനലൂർ");
                optionArray.add("കോട്ടയം");
                optionArray.add("തൃശ്ശൂർ");
                optionArray.add("അങ്കമാലി");
            }
            else if (questionNumber==320)
            {
                optionArray.add("ലതാ മങ്കേഷ്കർ");
                optionArray.add("നൗഷാദ്");
                optionArray.add("സ്വാമി രംഗനാഥാനന്ദ");
                optionArray.add("വിശ്വനാഥൻ ആനന്ദ്");
            }
            else if (questionNumber==321)
            {
                optionArray.add("1947");
                optionArray.add("1950");
                optionArray.add("1951");
                optionArray.add("1955");
            }
            else if (questionNumber==322)
            {
                optionArray.add("ശ്രവണശേഷി");
                optionArray.add("രക്തസമ്മർദ്ദം");
                optionArray.add("കാഴ്ചശക്തി");
                optionArray.add("ഹൃദയമിടിപ്പ്");
            }
            else if (questionNumber==323)
            {
                optionArray.add("ക്വാവറണ്ടാ");
                optionArray.add("ഹേബിയസ് കോർപ്പസ്");
                optionArray.add("അലിബി");
                optionArray.add("സുവോമോട്ടോ");
            }
            else if (questionNumber==324)
            {
                optionArray.add("റഫറണ്ടം");
                optionArray.add("ഇംപീച്ച്മെന്റ്");
                optionArray.add("അമെന്റ് മെന്റ്");
                optionArray.add("കോർട്ട് മാർഷൽ");
            }
            else if (questionNumber==325)
            {
                optionArray.add("1993");
                optionArray.add("1995");
                optionArray.add("1994");
                optionArray.add("1992 - 26");
            }
            else if (questionNumber==326)
            {
                optionArray.add("തമിഴ്നാട്");
                optionArray.add("കേരളം");
                optionArray.add("ഹരിയാന");
                optionArray.add("ഉത്തർപ്രദേശ്");
            }
            else if (questionNumber==327)
            {
                optionArray.add("പ്ലാറ്റിനം");
                optionArray.add("ചെമ്പ്");
                optionArray.add("ലെഡ്");
                optionArray.add("സിങ്ക്");
            }
            else if (questionNumber==328)
            {
                optionArray.add("21");
                optionArray.add("23");
                optionArray.add("19");
                optionArray.add("17");
            }
            else if (questionNumber==329)
            {
                optionArray.add("ഓക്സിഡേഷൻ");
                optionArray.add("സബ്ലിമേഷൻ");
                optionArray.add("ലീച്ചിങ്");
                optionArray.add("ലികേഷൻ");
            }
            else if (questionNumber==330)
            {
                optionArray.add("കിഴങ്ങ്");
                optionArray.add("ഇല");
                optionArray.add("വിത്ത്");
                optionArray.add("പൂവ്");
            }
            else if (questionNumber==331)
            {
                optionArray.add("മിൽക്കി വേ");
                optionArray.add("പ്രോക്സിമ");
                optionArray.add("ആൽഫ");
                optionArray.add("ഹീലിയോസ്");
            }
            else if (questionNumber==332)
            {
                optionArray.add("മാക്സില്ല");
                optionArray.add("കീഴ്ത്താടിയെല്ല്");
                optionArray.add("ടെമ്പറൽ");
                optionArray.add("ഫാന്റൽ");
            }
            else if (questionNumber==333)
            {
                optionArray.add("പള്ളിപ്പുറം");
                optionArray.add("ബെയ്ക്കൽ");
                optionArray.add("അഞ്ചുതെങ്ങ്");
                optionArray.add("കണ്ണൂർ");
            }
            else if (questionNumber==334)
            {
                optionArray.add("1512");
                optionArray.add("1815");
                optionArray.add("1152");
                optionArray.add("1215");
            }
            else if (questionNumber==335)
            {
                optionArray.add("വൈദ്യശാസ്ത്രം");
                optionArray.add("ശാസ്ത്രം");
                optionArray.add("സാമൂഹിക സേവനം");
                optionArray.add("പത്രപ്രവർത്തനം");
            }
            else if (questionNumber==336)
            {
                optionArray.add("സർദാർ കെ.എം.പണിക്കർ");
                optionArray.add("എസ്.കെ.പൊറ്റക്കാട്ട്");
                optionArray.add("പി.എൻ.പണിക്കർ");
                optionArray.add("എ.ആർ.രാജരാജവർമ");
            }
            else if (questionNumber==337)
            {
                optionArray.add("നന്ദാദേവി");
                optionArray.add("കാരക്കോറം-2");
                optionArray.add("എവറസ്റ്റ്");
                optionArray.add("കാഞ്ചൻജംഗ");
            }
            else if (questionNumber==338)
            {
                optionArray.add("സക്കീർ ഹുസൈൻ");
                optionArray.add("ഡോ.രാജേന്ദ്രപ്രസാദ്");
                optionArray.add("എസ്. രാധാകൃഷ്ണൻ");
                optionArray.add("സഞ്ജീവ റെഡ്ഡി");
            }
            else if (questionNumber==339)
            {
                optionArray.add("വാഷിങ്ടൺ ഡി.സി");
                optionArray.add("ന്യൂയോർക്ക്");
                optionArray.add("ടോക്കിയോ");
                optionArray.add("ലണ്ടൻ");
            }
            else if (questionNumber==340)
            {
                optionArray.add("ജവാഹർലാൽ നെഹ്രു");
                optionArray.add("വിനോബാ ഭാവെ");
                optionArray.add("ഗാന്ധിജി");
                optionArray.add("സി.രാജഗോപാലാചാരി");
            }
            else if (questionNumber==341)
            {
                optionArray.add("തക്ഷശില");
                optionArray.add("സാരനാഥ്");
                optionArray.add("നളന്ദ");
                optionArray.add("ബനാറസ്");
            }
            else if (questionNumber==342)
            {
                optionArray.add("രംഗനാഥ് മിശ");
                optionArray.add("വെങ്കടചെല്ലയ്യ");
                optionArray.add("ജീവൻ റെഡ്ഡി");
                optionArray.add("ബി.പി.മണ്ഡൽ");
            }
            else if (questionNumber==343)
            {
                optionArray.add("ഫ്ളമിങ്");
                optionArray.add("പോൾ എർലിക്");
                optionArray.add("മില്ലാർഡെറ്റ്");
                optionArray.add("ആൽഫ്രഡ് വൂളർ");
            }
            else if (questionNumber==344)
            {
                optionArray.add("മാവ്");
                optionArray.add("തെങ്ങ്");
                optionArray.add("പ്ളാവ്");
                optionArray.add("റബ്ബർ");
            }
            else if (questionNumber==345)
            {
                optionArray.add("0.42");
                optionArray.add("0.75");
                optionArray.add("0.57");
                optionArray.add("0.32");
            }
            else if (questionNumber==346)
            {
                optionArray.add("0.8 സെക്കന്റ്");
                optionArray.add("0.5 സെക്കന്റ്");
                optionArray.add("1.2 സെക്കന്റ്");
                optionArray.add("0.4 സെക്കന്റ്");
            }
            else if (questionNumber==347)
            {
                optionArray.add("ഗേറ്റ് വേ ഓഫ് ഇന്ത്യ");
                optionArray.add("ലാഹോർ ഗേറ്റ്");
                optionArray.add("ഇന്ത്യാഗേറ്റ്");
                optionArray.add("റെഡ് ഫോർട്ട്");
            }
            else if (questionNumber==348)
            {
                optionArray.add("മൗര്യവംശം");
                optionArray.add("ഗുപ്തവംശം");
                optionArray.add("കുശാന വംശം");
                optionArray.add("ശകവംശം");
            }
            else if (questionNumber==349)
            {
                optionArray.add("കുറ്റിക് ഓക്സൈഡ്");
                optionArray.add("കോബാൾട്ട് ഓക്സൈഡ്");
                optionArray.add("ഫെറസ് ഓക്സൈഡ്");
                optionArray.add("നിക്കൽ ഓക്സൈഡ്");
            }
            else if (questionNumber==350)
            {
                optionArray.add("ഒന്നാമത്തെ");
                optionArray.add("രണ്ടാമത്തെ");
                optionArray.add("അഞ്ചാമത്തെ");
                optionArray.add("ഏഴാമത്തെ");
            }
            else if (questionNumber==351)
            {
                optionArray.add("പ്രയാഗ്");
                optionArray.add("ദേവപ്രയാഗ്");
                optionArray.add("വാരണസി");
                optionArray.add("ഡെറാഡൂൺ");
            }
            else if (questionNumber==352)
            {
                optionArray.add("കൽക്കുളം");
                optionArray.add("ദേശിങ്ങനാട്");
                optionArray.add("വിളവൻകോട്");
                optionArray.add("അഗസ്തീശ്വരം");
            }
            else if (questionNumber==353)
            {
                optionArray.add("റോമർ");
                optionArray.add("ആൽഫ്രഡ് വെഗ്നർ");
                optionArray.add("ചാൾസ് എഫ് റിക്ടർ");
                optionArray.add("ലിവിങ്സ്റ്റൺ");
            }
            else if (questionNumber==354)
            {
                optionArray.add("തിരുവനന്തപുരം");
                optionArray.add("എറണാകുളം");
                optionArray.add("കണ്ണൂർ");
                optionArray.add("കോഴിക്കോട്");
            }
            else if (questionNumber==355)
            {
                optionArray.add("സി.അച്യുതമേനോൻ");
                optionArray.add("ഡോ.എ.ആർ.മേനോൻ");
                optionArray.add("ജോസഫ് മുണ്ടശ്ശേരി");
                optionArray.add("വി.ആർ.കൃഷ്ണയ്യർ");
            }
            else if (questionNumber==356)
            {
                optionArray.add("ശ്രീനഗർ");
                optionArray.add("ജമ്മു");
                optionArray.add("ചണ്ഡിഗഢ്");
                optionArray.add("ഡെറാഡൂൺ");
            }
            else if (questionNumber==357)
            {
                optionArray.add("ഡിഫ്തീരിയ");
                optionArray.add("മീസിൽസ്");
                optionArray.add("ന്യൂമോണിയ");
                optionArray.add("ഡയബറ്റിസ്");
            }
            else if (questionNumber==358)
            {
                optionArray.add("ഗ്യാസ്");
                optionArray.add("ടയർ");
                optionArray.add("ബാറ്ററി");
                optionArray.add("പെട്രോൾ");
            }
            else if (questionNumber==359)
            {
                optionArray.add("അഡീനൽ ഗ്രന്ഥി");
                optionArray.add("തൈറോയ്ഡ് ഗ്രന്ഥി");
                optionArray.add("പിറ്റ്യൂറ്ററി ഗ്രന്ഥി");
                optionArray.add("പീനിയൽ ഗ്രന്ഥി");
            }
            else if (questionNumber==360)
            {
                optionArray.add("സി.അച്യുതമേനോൻ");
                optionArray.add("എ.കെ.ആന്റണി");
                optionArray.add("ഇ.കെ.നായനാർ");
                optionArray.add("പ്രസിഡന്റു ഭരണം");
            }
            else if (questionNumber==361)
            {
                optionArray.add("മൺപാത്രം");
                optionArray.add("ലോഹപാത്രം");
                optionArray.add("പ്ളാസ്റ്റിക് പാത്രം");
                optionArray.add("ഗ്ലാസ് പാത്രം");
            }
            else if (questionNumber==362)
            {
                optionArray.add("മഹാരാഷ്ട്ര");
                optionArray.add("ഗുജറാത്ത്");
                optionArray.add("ഗോവ");
                optionArray.add("മധ്യപ്രദേശ്");
            }
            else if (questionNumber==363)
            {
                optionArray.add("മിതവാദി");
                optionArray.add("സമദർശി");
                optionArray.add("ദീപിക");
                optionArray.add("വിവേകോദയം");
            }
            else if (questionNumber==364)
            {
                optionArray.add("മതിലുകൾ");
                optionArray.add("പ്രമലേഖനം");
                optionArray.add("ബാല്യകാലസഖി");
                optionArray.add("പാത്തുമ്മയുടെ ആട്");
            }
            else if (questionNumber==365)
            {
                optionArray.add("കാരക്കോറം");
                optionArray.add("ആരവല്ലി");
                optionArray.add("പളനി മലനിരകൾ");
                optionArray.add("നീലഗിരി");
            }
            else if (questionNumber==366)
            {
                optionArray.add("1951-56");
                optionArray.add("1950-55");
                optionArray.add("1952-57");
                optionArray.add("1947-52");
            }
            else if (questionNumber==367)
            {
                optionArray.add("വണ്ട്");
                optionArray.add("ശലഭം");
                optionArray.add("മൂട്ട");
                optionArray.add("ചീവീട്");
            }
            else if (questionNumber==368)
            {
                optionArray.add("ചാൻസി റാണി");
                optionArray.add("സരോജിനി നായിഡു");
                optionArray.add("ഇന്ദിരാഗാന്ധി");
                optionArray.add("റസിയാ ബീഗം");
            }
            else if (questionNumber==369)
            {
                optionArray.add("അഴകത്ത് രാമക്കുറുപ്പ്");
                optionArray.add("വൈക്കത്ത് പാച്ചുമൂത്തത്");
                optionArray.add("അഴകത്ത് പദ്മനാഭക്കുറുപ്പ്");
                optionArray.add("ചെറുശ്ശേരി");
            }
            else if (questionNumber==370)
            {
                optionArray.add("സിൽവർ നൈട്രേറ്റ്");
                optionArray.add("സിൽവർ അയഡൈഡ്");
                optionArray.add("സോഡിയം ക്ലോറൈഡ്");
                optionArray.add("സോഡിയം അയഡൈഡ്");
            }
            else if (questionNumber==371)
            {
                optionArray.add("വിബ്രിയോ");
                optionArray.add("ട്രെപ്റ്റോകോക്കസ്");
                optionArray.add("ലാക്ടോബാസില്ലസ്");
                optionArray.add("ഇതൊന്നുമല്ല");
            }
            else if (questionNumber==372)
            {
                optionArray.add("കൊതുക്");
                optionArray.add("എലി");
                optionArray.add("എലിച്ചെള്ള്");
                optionArray.add("മൂട്ട");
            }
            else if (questionNumber==373)
            {
                optionArray.add("430");
                optionArray.add("630");
                optionArray.add("230");
                optionArray.add("130");
            }
            else if (questionNumber==374)
            {
                optionArray.add("സാഹിത്യം");
                optionArray.add("സിനിമ");
                optionArray.add("സംഗീതം");
                optionArray.add("ചിത്രകല");
            }
            else if (questionNumber==375)
            {
                optionArray.add("ലെ കർബൂസിയർ");
                optionArray.add("വില്യം എമേഴ്സൺ");
                optionArray.add("ഹെർബെർട്ട് ബേക്കർ");
                optionArray.add("എഡ്വിൻ ലുട്യൻസ്");
            }
            else if (questionNumber==376)
            {
                optionArray.add("വി.കെ.വേലായുധൻ");
                optionArray.add("വി.കെ.രാജൻ");
                optionArray.add("പി.ടി.ചാക്കോ");
                optionArray.add("വി.കെ.വേലപ്പൻ");
            }
            else if (questionNumber==377)
            {
                optionArray.add("ഷാജഹാൻ");
                optionArray.add("ഉസ്താദ് ഇസ");
                optionArray.add("രബീന്ദ്രനാഥ് ടാഗോർ");
                optionArray.add("മുഹമ്മദ് ഇക്ബാൽ");
            }
            else if (questionNumber==378)
            {
                optionArray.add("ചണ്ഡിഗഢ്");
                optionArray.add("ഡൽഹി");
                optionArray.add("ലക്ഷദ്വീപ്");
                optionArray.add("പോണ്ടിച്ചേരി");
            }
            else if (questionNumber==379)
            {
                optionArray.add("ചീഫ് ഇലക്ഷൻ കമ്മീഷണർ");
                optionArray.add("സ്പീക്കർ");
                optionArray.add("ഗവർണർ");
                optionArray.add("ആസൂത്രണകമ്മീഷൻ ഉപാധ്യക്ഷൻ");
            }
            else if (questionNumber==380)
            {
                optionArray.add("ജപ്പാൻ");
                optionArray.add("കാനഡ");
                optionArray.add("റഷ്യ");
                optionArray.add("സ്പെയിൻ");
            }
            else if (questionNumber==381)
            {
                optionArray.add("വെസ്റ്റ് ഇൻഡീസ്");
                optionArray.add("യു.കെ.");
                optionArray.add("ഇന്ത്യ");
                optionArray.add("പാകിസ്താൻ");
            }
            else if (questionNumber==382)
            {
                optionArray.add("ജി.ഡി.ബിർള");
                optionArray.add("ജെ.ആർ.ഡി. ടാറ്റ");
                optionArray.add("ധിരുഭായി അംബാനി");
                optionArray.add("രത്തൻ ടാറ്റ");
            }
            else if (questionNumber==383)
            {
                optionArray.add("1789");
                optionArray.add("1762");
                optionArray.add("1771");
                optionArray.add("1772");
            }
            else if (questionNumber==384)
            {
                optionArray.add("ബാക്ടീരിയ");
                optionArray.add("വൈറസ്");
                optionArray.add("ഫംഗസ്");
                optionArray.add("പ്രോട്ടോസോവ");
            }
            else if (questionNumber==385)
            {
                optionArray.add("കേരളം");
                optionArray.add("മഹാരാഷ");
                optionArray.add("തമിഴ്നാട്");
                optionArray.add("പശ്ചിമ ബംഗാൾ");
            }
            else if (questionNumber==386)
            {
                optionArray.add("ലുംബിനി");
                optionArray.add("കുശിനഗരം");
                optionArray.add("ഗയ");
                optionArray.add("സാരനാഥ്");
            }
            else if (questionNumber==387)
            {
                optionArray.add("തമിഴ്നാട്");
                optionArray.add("മധ്യപ്രദേശ്");
                optionArray.add("കർണാടകം");
                optionArray.add("ബീഹാർ");
            }
            else if (questionNumber==388)
            {
                optionArray.add("1957");
                optionArray.add("1964");
                optionArray.add("1956");
                optionArray.add("1967");
            }
            else if (questionNumber==389)
            {
                optionArray.add("ഓസ്ലോ");
                optionArray.add("അങ്കാറ");
                optionArray.add("ടോക്കിയോ");
                optionArray.add("ഇസ്താൻബുൾ");
            }
            else if (questionNumber==390)
            {
                optionArray.add("ചൈന");
                optionArray.add("തായ്ലൻഡ്");
                optionArray.add("ജപ്പാൻ");
                optionArray.add("മ്യാൻമർ");
            }
            else if (questionNumber==391)
            {
                optionArray.add("മധ്യപ്രദേശ്");
                optionArray.add("ബീഹാർ");
                optionArray.add("ഉത്തർ പ്രദേശ്");
                optionArray.add("ഒറീസ്സ");
            }
            else if (questionNumber==392)
            {
                optionArray.add("1906");
                optionArray.add("1907");
                optionArray.add("1885");
                optionArray.add("1916");
            }
            else if (questionNumber==393)
            {
                optionArray.add("വക്കം പുരുഷോത്തമൻ");
                optionArray.add("വി.എം.സുധീരൻ");
                optionArray.add("എ.സി.ജോസ്");
                optionArray.add("എം.വിജയകുമാർ");
            }
            else if (questionNumber==394)
            {
                optionArray.add("മഹാത്മാഗാന്ധി");
                optionArray.add("മുഹമ്മദലി ജിന്ന");
                optionArray.add("ജവാഹർലാൽ നെഹ്റു");
                optionArray.add("മൗലാനാ ആസാദ്");
            }
            else if (questionNumber==395)
            {
                optionArray.add("ഇൽത്തുമിഷ്");
                optionArray.add("കുത്തബ്ദ്ദീൻ ഐബക്");
                optionArray.add("റസിയാ ബീഗം");
                optionArray.add("ബാൽബൻ");
            }
            else if (questionNumber==396)
            {
                optionArray.add("വിനോബാഭാവെ");
                optionArray.add("ജയപ്രകാശ് നാരായൺ");
                optionArray.add("ബാബാ ആംതെ");
                optionArray.add("മദർ തെരേസ");
            }
            else if (questionNumber==397)
            {
                optionArray.add("രാജസ്ഥാൻ");
                optionArray.add("ഗുജറാത്ത്");
                optionArray.add("കേരളം");
                optionArray.add("കർണാടകം");
            }
            else if (questionNumber==398)
            {
                optionArray.add("പൂന്താനം");
                optionArray.add("ചെറുശ്ശേരി");
                optionArray.add("കുഞ്ചൻ നമ്പ്യാർ");
                optionArray.add("മേൽപ്പുത്തൂർ");
            }
            else if (questionNumber==399)
            {
                optionArray.add("കാനിങ് പ്രഭു");
                optionArray.add("ഡൽഹൗസി പ്രഭു");
                optionArray.add("വില്യം ബെന്റിക് പ്രഭു");
                optionArray.add("വാറൻ ഹേസ്റ്റിംഗ്സ് പ്രഭു");
            }
            else if (questionNumber==400)
            {
                optionArray.add("ഇറാക്ക്");
                optionArray.add("ഇറാൻ");
                optionArray.add("ചൈന");
                optionArray.add("ഈജിപ്ത്");
            }

        }

        public List<String> getOptionArray() {
            return optionArray;
        }
    }
}