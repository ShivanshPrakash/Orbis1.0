package shivansh.orbis10;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import shivansh.orbis10.CalendarDates.*;

public class Calendar extends AppCompatActivity {
    TextView textView1;
    String Month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        //Sharedpreference stuff...
        SharedPreferences sharedmonth = getSharedPreferences("FileName",MODE_PRIVATE);
        Month = sharedmonth.getString(getString(R.string.Month_info),"Month set karke Restart kar lena..");
        //Display Month....
        textView1 = (TextView)findViewById(R.id.displayData);
        textView1.setText(Month);
        //Goto settings.....
        ImageButton set = (ImageButton) findViewById(R.id.settingsButton);
        set.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent settings = new Intent(Calendar.this,CalendarSettings.class);
                startActivity(settings);
            }
        });


        //All date buttons from here........
        ImageButton button = (ImageButton) findViewById(R.id.Button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent myIntent = new Intent(Calendar.this,Activity1.class);
                startActivity(myIntent);
            }
        });

        //For date 16.....
        ImageButton button3 = (ImageButton) findViewById(R.id.Button2);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent myIntent = new Intent(Calendar.this,Activity2.class);
                startActivity(myIntent);
            }
        });

        //For date 17....
        ImageButton button4 = (ImageButton) findViewById(R.id.Button3);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent myIntent = new Intent(Calendar.this,Activity3.class);
                startActivity(myIntent);
            }
        });

        //For date 18.....
        ImageButton button5 = (ImageButton) findViewById(R.id.Button4);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent myIntent = new Intent(Calendar.this,Activity4.class);
                startActivity(myIntent);
            }
        });

        //For date 19.....
        ImageButton button6 = (ImageButton) findViewById(R.id.Button5);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent myIntent = new Intent(Calendar.this,Activity5.class);
                startActivity(myIntent);
            }
        });

        //For date 20....
        ImageButton button7 = (ImageButton) findViewById(R.id.Button6);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent myIntent = new Intent(Calendar.this,Activity6.class);
                startActivity(myIntent);
            }
        });

        //For date 21....
        ImageButton button8 = (ImageButton) findViewById(R.id.Button7);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent myIntent = new Intent(Calendar.this,Activity7.class);
                startActivity(myIntent);
            }
        });

        //For date 22....
        ImageButton button9 = (ImageButton) findViewById(R.id.Button8);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent myIntent = new Intent(Calendar.this,Activity8.class);
                startActivity(myIntent);
            }
        });

        //For date 23....
        ImageButton button10 = (ImageButton) findViewById(R.id.Button9);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent myIntent = new Intent(Calendar.this,Activity9.class);
                startActivity(myIntent);
            }
        });

        //For date 24....
        ImageButton button11 = (ImageButton) findViewById(R.id.Button10);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent myIntent = new Intent(Calendar.this,Activity10.class);
                startActivity(myIntent);
            }
        });
    }

    @Override
    public void onResume(){
        super.onResume();
        SharedPreferences sharedmonth = getSharedPreferences("FileName",MODE_PRIVATE);
        Month = sharedmonth.getString(getString(R.string.Month_info),"Month set karke Restart kar lena..");
        textView1 = (TextView)findViewById(R.id.displayData);
        textView1.setText(Month);
    }
}
