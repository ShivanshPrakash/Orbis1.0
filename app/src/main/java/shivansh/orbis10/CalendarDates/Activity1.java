package shivansh.orbis10.CalendarDates;

import android.content.SharedPreferences;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import shivansh.orbis10.R;

public class Activity1 extends PreferenceActivity {
    String Title,summary;
    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //..............
        SharedPreferences sharedmonth = getSharedPreferences("FileName",MODE_PRIVATE);
        PreferenceScreen screen = getPreferenceManager().createPreferenceScreen(this);
        Title = sharedmonth.getString(getString(R.string.Title_info),"");
        summary=sharedmonth.getString(getString(R.string.summ_info),"");
        if(Title!="" && summary!="") {
            CheckBoxPreference checkBox = new CheckBoxPreference(this);
            checkBox.setTitle(Title);
            checkBox.setSummary(summary);
            screen.addPreference(checkBox);
            setPreferenceScreen(screen);
        }
        addPreferencesFromResource(R.xml.pref1);
    }
}
