package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class Jojom_Activity extends AppCompatActivity {

    private GridView gridView;
    int[] jojom_={R.drawable.j3,R.drawable.j2,R.drawable.j1
            ,R.drawable.j6,R.drawable.j5,R.drawable.j4,
            R.drawable.j9,R.drawable.j8,R.drawable.j7,
            R.drawable.j12,R.drawable.j11,R.drawable.j10,
            R.drawable.j15,R.drawable.j14,R.drawable.j13,
            R.drawable.j18,R.drawable.j17,R.drawable.j16,
            R.drawable.j21,R.drawable.j20,R.drawable.j19,
            R.drawable.j24,R.drawable.j23,R.drawable.j22,
            R.drawable.j27,R.drawable.j26,R.drawable.j25,
            R.drawable.wt,R.drawable.j29,R.drawable.j28};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jojom);
        gridView = findViewById(R.id.jojom_gried_viewId);

        CustomAdapter adapter = new CustomAdapter(this,jojom_);
        gridView.setAdapter(adapter);
    }
}
