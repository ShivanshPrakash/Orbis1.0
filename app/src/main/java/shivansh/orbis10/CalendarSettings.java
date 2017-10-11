package shivansh.orbis10;

import android.content.SharedPreferences;
import android.preference.PreferenceScreen;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalendarSettings extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_settings);


        final EditText MONTH = (EditText) findViewById(R.id.enterMonth);
        // String string = MONTH.getText().toString();

        Button btnGo = (Button) findViewById(R.id.buttonSET);
        btnGo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SharedPreferences sharedmonth = CalendarSettings.this.getSharedPreferences(getString(R.string.File_Name),MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedmonth.edit();
                editor.putString(getString(R.string.Month_info),MONTH.getText().toString());
                editor.commit();
                finish();
            }
        });

        //check......
        final EditText Title = (EditText) findViewById(R.id.titlE);
        final EditText Summary = (EditText) findViewById(R.id.summarY);
        Button setTitle = (Button) findViewById(R.id.setTit);
        setTitle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SharedPreferences sharedmonth = CalendarSettings.this.getSharedPreferences(getString(R.string.File_Name),MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedmonth.edit();
                editor.putString(getString(R.string.Title_info),Title.getText().toString());
                editor.putString("Summary",Summary.getText().toString());
                editor.commit();
                finish();
            }
        });
    }
}
