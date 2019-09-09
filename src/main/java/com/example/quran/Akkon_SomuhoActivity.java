package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Akkon_SomuhoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akkon__somuho);
    }

    public void alifActivity(View view) {
        Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
        ///intent.putExtra("path", R.raw.alif);
        startActivity(intent);
    }
}
