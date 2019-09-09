package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Button StartMusic,StopMusic;
    MediaPlayer Music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Music = MediaPlayer.create(this,R.raw.song);
    }

    public void gotoNewActivity(View view) {
        Toast.makeText(MainActivity.this,"This is button",Toast.LENGTH_LONG).show();
        Intent gotoActivity = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(gotoActivity);
    }

    /*public void convertNow(View view) {
        EditText editText = findViewById(R.id.EnterNumber);
        TextView displayText = findViewById(R.id.getText);
        String number = editText.getText().toString();
        Double tk = Double.parseDouble(number);
        Double dollar = 0.012*tk;
        String dollartk = String.valueOf(dollar);
        displayText.setText(dollartk);

    }*/

    public void StartAudio(View view) {
        Music.start();
    }

    public void StopAudio(View view) {
        Music.stop();
    }

    public void nextActivity(View view) {
        Intent nextactivity = new Intent(MainActivity.this,suchonaActivity.class);
        startActivity(nextactivity);
    }

    public void makrajActivity(View view) {
        Intent makraj = new Intent(MainActivity.this,MakrajActivity.class);
        startActivity(makraj);
    }

    public void AkkonSomuhoActivity(View view) {
        startActivity(new Intent(MainActivity.this,Akkon_SomuhoActivity.class));
    }

    public void joborActivity(View view) {
        startActivity(new Intent(MainActivity.this,jobor_Activity.class));
    }
}
