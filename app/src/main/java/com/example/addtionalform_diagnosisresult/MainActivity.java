package com.example.addtionalform_diagnosisresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAnalyze();
    }

    public void buttonAnalyze(){
        findViewById(R.id.btnAnalyze).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btnAnalyze:
                    startActivity(new Intent(MainActivity.this, ResultActivity.class));
                    break;
            }
        }
    };
}