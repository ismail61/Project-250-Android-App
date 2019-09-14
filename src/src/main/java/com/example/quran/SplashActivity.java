package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    private final int time = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gotoMainActivity = new Intent(SplashActivity.this,MainActivity.class);
                SplashActivity.this.startActivity(gotoMainActivity);
                SplashActivity.this.finish();
            }
        },time);
    }
}
