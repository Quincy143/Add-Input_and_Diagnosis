package com.example.addtionalform_diagnosisresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        buttonsResultAcitivity();
    }

    public void buttonsResultAcitivity(){
        findViewById(R.id.btnBackToAddInput).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnConfirmDiagnosis).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btnBackToAddInput:
                    startActivity(new Intent(ResultActivity.this, MainActivity.class));
                    break;
                case R.id.btnConfirmDiagnosis:
                    startActivity(new Intent(ResultActivity.this, MainActivity.class));
                    break;
            }
        }
    };
}