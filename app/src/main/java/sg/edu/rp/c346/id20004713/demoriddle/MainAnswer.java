package sg.edu.rp.c346.id20004713.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainAnswer extends AppCompatActivity {
    TextView tvOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_answer);

        Log.d("AnswerActivity1", "onCreate() called.");

        tvOutput = findViewById(R.id.tvMainAnswer);
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");
        String answer = intentReceived.getStringExtra("Answer");
        tvOutput.setText(questionSelected + " Answer is: " + answer);
    }

    @Override
    protected void onStart() {
        Log.d("AnswerActivity1", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("AnswerActivity1", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("AnswerActivity1", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("AnswerActivity1", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity1", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("AnswerActivity1", "onRestart() called.");
        super.onRestart();
    }

}