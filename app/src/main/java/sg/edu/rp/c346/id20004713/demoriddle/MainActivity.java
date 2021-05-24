package sg.edu.rp.c346.id20004713.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvQuestion1;
    Button btnQuestion1;
    Button btnQuestion2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate() called.");

        tvQuestion1 = findViewById(R.id.tvQ1);
        btnQuestion1 = findViewById(R.id.btnq1);
        btnQuestion2 = findViewById(R.id.btnq2);

        btnQuestion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainAnswer.class);
                intent.putExtra("Question", "Q1");
                intent.putExtra("Answer", "Queue");
                startActivity(intent);
            }
        });

        btnQuestion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainAnswer.class);
                intent.putExtra("Question", "Q2");
                intent.putExtra("Answer", "Gone");
                startActivity(intent);
            }
        });
    }
    protected void onStart() {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();
    }

}