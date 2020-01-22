package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tanbin_Activity extends AppCompatActivity {

    Button dui_jobor,dui_jer,dui_pes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanbin_);
        dui_jobor = (Button)findViewById(R.id.dui_jobor_activity);
        dui_jer = (Button)findViewById(R.id.dui_jer_activity);
        dui_pes = (Button)findViewById(R.id.dui_pes_activity);
        dui_jobor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tanbin_Activity.this,dui_jobor_Activity.class));
            }
        });
        dui_jer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tanbin_Activity.this,dui_jer_Activity.class));
            }
        });
        dui_pes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tanbin_Activity.this,dui_pes_Activity.class));
            }
        });
    }
}
