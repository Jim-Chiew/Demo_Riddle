package sg.edu.rp.c346.id20004713.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainAnswer extends AppCompatActivity {
    TextView tvOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_answer);

        tvOutput = findViewById(R.id.tvMainAnswer);
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");
        String answer = intentReceived.getStringExtra("Answer");
        tvOutput.setText(questionSelected + " Answer is: " + answer);
    }
}