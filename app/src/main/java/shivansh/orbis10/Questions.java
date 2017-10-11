package shivansh.orbis10;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class Questions extends AppCompatActivity {
    String quesprev= "NULL";
    CharSequence text = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        Button getAnswer = (Button)findViewById(R.id.getansbutton);
        getAnswer.setOnClickListener(getAnswerListener);
    }
    private View.OnClickListener getAnswerListener = new View.OnClickListener() {
        public void onClick(View v){

            // Generate answer number.
            String TAG = "MyActivity";
            Random toastGen = new Random();
            int toastNum = toastGen.nextInt(25);
            toastNum++;

            //Answering Logic.....
            EditText question = (EditText) findViewById(R.id.enterQues);
            String ques;
            ques=question.getText().toString();
          /* Deprecated...
            int quesLen = ques.length();
            Character last = ques.charAt(quesLen-1);
           */
            // Get answer text.

            Log.d(TAG, "onClick: START POINT...........");
            if (ques.equalsIgnoreCase(quesprev))
            {
                //text = "You just now asked this question. Ask something else";
                Log.d(TAG, "onClick: equal hai.........");
            }
            /* all random questions start from here
             * to add a new one just contain it within an else if
             * the anwers may be taken from "ranswers" from strings.xml
             */
            else if(ques.contains("your name"))
                text = "My name is Orbis.";
            else if(ques.contains("your creator"))
                text= "It's Shivansh who made me";
            else if(ques.contains("looking good") || ques.contains("i hot"))
                text = "Yeah.Everything seems fine";
            else if (ques.contains("wtf") || ques.contains("what the hell"))
                text = "Yeah. Life can be a bitch sometimes";
            else if(ques.contains("who are you") || ques.contains("Who are you"))
                text = "I am Orbis.";
            else if (ques.contains("your gender") || ques.contains("you male or female"))
                text="I am a non-living thing you fool.";
            else if (ques.contains("like game of thrones") || ques.contains("like Game of Thrones"))
                text="I fucking love it.";
            else if (ques.contains("you live"))
                text = "I reside in your smartphone as an app.";
            else if (ques.contains("you gandu") || ques.contains("tu gandu"))
                text="Tum gaand marao bhonsdk.";
            else if (ques.contains("you chutiya") || ques.contains("tu chutiya"))
                text="Tum chutiya.. bhonsdk.";
            else if (ques.contains("Valar Morghulis") || ques.contains("valar morghulis"))
                text="Valar Dohaeris";
            else if (ques.contains("you like")) {
                quesprev=ques;
                switch (toastNum%5){
                    case 0 :
                        text = "I haven't given much thought to it yet.";
                        break;
                    case 1 :
                        text = "Sometimes i do. Sometimes I don't.";
                        break;
                    case 2 :
                        text = "I won't tell you that";
                        break;
                    case 3 :
                        text = "No. I hate it";
                        break;
                    case 4 :
                        text ="It doesn't suits my taste";
                        break;
                }
            }
            else if (ques.contains("a joke") || ques.contains("another joke")) {
                quesprev=ques;
                switch (toastNum%5){
                    case 0 :
                        text = "You are beautiful.";
                        break;
                    case 1 :
                        text = "Why ask me. Aren't you added to IIT-ISM whatsapp group?";
                        break;
                    case 2 :
                        text = "I have a bumper sticker saying, \"Honk if you think I'm sexy\"\n" +
                                "\n" + "Some days I just stand at a green light till I’m feeling good about myself.";
                        break;
                    case 3 :
                        text = "Mom, do you know that most of my friends got the new iPhone already?" +
                                "\n" +
                                "Son, do you know the foster home down by the crossroads?" ;
                        break;
                    case 4 :
                        text ="Dharavath and Hari Om are the best teachers you will ever meet in your life....sarcastically speaking";
                        break;
                }
            }
            else if(ques.contains("fuck you") || ques.contains("Fuck You"))
                text="Fuck You...Ashhole";
            else if (ques.contains("you wondered") || ques.contains("you ever wondered"))
                text="No.These things are beyond my grasp.";
            /*
               Random questions ends here....
               from here on questions with yes or no type will be valid.
             */
            else {
                quesprev=ques;
                Log.d(TAG, quesprev);
                switch (toastNum) {
                    case 1:
                        text = getString(R.string.answer1);
                        break;
                    case 2:
                        text = getString(R.string.answer2);
                        break;
                    case 3:
                        text = getString(R.string.answer3);
                        break;
                    case 4:
                        text = getString(R.string.answer4);
                        break;
                    case 5:
                        text = getString(R.string.answer5);
                        break;
                    case 6:
                        text = getString(R.string.answer6);
                        break;
                    case 7:
                        text = getString(R.string.answer7);
                        break;
                    case 8:
                        text = getString(R.string.answer8);
                        break;
                    case 9:
                        text = getString(R.string.answer9);
                        break;
                    case 10:
                        text = getString(R.string.answer10);
                        break;
                    case 11:
                        text = getString(R.string.answer11);
                        break;
                    case 12:
                        text = getString(R.string.answer12);
                        break;
                    case 13:
                        text = getString(R.string.answer13);
                        break;
                    case 14:
                        text = getString(R.string.answer14);
                        break;
                    case 15:
                        text = getString(R.string.answer15);
                        break;
                    case 16:
                        text = getString(R.string.answer16);
                        break;
                    case 17:
                        text = getString(R.string.answer17);
                        break;
                    case 18:
                        text = getString(R.string.answer18);
                        break;
                    case 19:
                        text = getString(R.string.answer19);
                        break;
                    case 20:
                        text = getString(R.string.answer20);
                        break;
                    case 21:
                        text = getString(R.string.answer21);
                        break;
                    case 22:
                        text = getString(R.string.answer22);
                        break;
                    case 23:
                        text = getString(R.string.answer23);
                        break;
                    case 24:
                        text = getString(R.string.answer24);
                        break;
                    case 25:
                        text = getString(R.string.answer25);
                        break;
                    case 26:
                        text = getString(R.string.answer26);
                        break;
                }
            }
            // Toast answer.
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    };
}
