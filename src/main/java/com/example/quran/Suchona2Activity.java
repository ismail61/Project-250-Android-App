package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Suchona2Activity extends AppCompatActivity {
    MediaPlayer alif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suchona2);
        alif = MediaPlayer.create(this,R.raw.alif);
    }

    public void StartAudio(View view) {
        alif.start();
    }

    public void StopAudio(View view) {
        alif.stop();
    }
}
