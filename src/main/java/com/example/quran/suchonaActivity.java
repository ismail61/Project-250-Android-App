package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class suchonaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suchona);
    }

    public void suchona1Activity(View view) {
        Intent suchonaActivity = new Intent(com.example.quran.suchonaActivity.this,Suchona1Activity.class);
        startActivity(suchonaActivity);
    }

    public void suchona2Activity(View view) {
        Intent suchona1Activity = new Intent(com.example.quran.suchonaActivity.this,Suchona2Activity.class);
        startActivity(suchona1Activity);
    }
}
