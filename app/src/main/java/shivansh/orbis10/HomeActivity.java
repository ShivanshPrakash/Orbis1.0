package shivansh.orbis10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton cal = (ImageButton) findViewById(R.id.calendarbutton);
        cal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent calintent = new Intent(HomeActivity.this,Calendar.class);
                startActivity(calintent);
            }
        });

        ImageButton que = (ImageButton) findViewById(R.id.questButt);
        que.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent queintent = new Intent(HomeActivity.this,Questions.class);
                startActivity(queintent);
            }
        });
    }
}
