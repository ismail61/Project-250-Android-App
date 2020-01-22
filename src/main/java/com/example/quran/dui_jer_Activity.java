package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class dui_jer_Activity extends AppCompatActivity {

    private GridView gridView;
    int[] dui_jer={R.drawable.c,R.drawable.b,R.drawable.a
            ,R.drawable.f,R.drawable.e,R.drawable.d,
            R.drawable.i,R.drawable.h,R.drawable.g,
            R.drawable.l,R.drawable.k,R.drawable.j,
            R.drawable.o,R.drawable.n,R.drawable.m,
            R.drawable.r,R.drawable.q,R.drawable.p,
            R.drawable.u,R.drawable.t,R.drawable.s,
            R.drawable.x,R.drawable.w,R.drawable.v,
            R.drawable.z1,R.drawable.z,R.drawable.y,
            R.drawable.wt,R.drawable.z3,R.drawable.z2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dui_jer_);
        gridView = findViewById(R.id.dui_jer_gried_viewId);

        CustomAdapter adapter = new CustomAdapter(this, dui_jer);
        gridView.setAdapter(adapter);
    }
}
