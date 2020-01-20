package com.regadeveloper.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
    private final int SPLASH_DELAYED = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent moveMain = new Intent(SplashActivity.this, CalcActivity.class);
                startActivity(moveMain);
                finish();
            }
        },SPLASH_DELAYED);
    }
}
