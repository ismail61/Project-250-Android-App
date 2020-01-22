package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class dui_jobor_Activity extends AppCompatActivity {

    private GridView gridView;
    int[] dui_jobor={R.drawable.cc,R.drawable.bb,R.drawable.aa
            ,R.drawable.ff,R.drawable.ee,R.drawable.dd,
            R.drawable.ii,R.drawable.hh,R.drawable.gg,
            R.drawable.ll,R.drawable.kk,R.drawable.jj,
            R.drawable.oo,R.drawable.nn,R.drawable.mm,
            R.drawable.rr,R.drawable.qq,R.drawable.pp,
            R.drawable.uu,R.drawable.tt,R.drawable.ss,
            R.drawable.xx,R.drawable.ww,R.drawable.vv,
            R.drawable.zz1,R.drawable.zz,R.drawable.yy,
            R.drawable.wt,R.drawable.zz3,R.drawable.zz2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dui_jobor_);
        gridView = findViewById(R.id.dui_jobor_gried_viewId);

        CustomAdapter adapter = new CustomAdapter(this, dui_jobor);
        gridView.setAdapter(adapter);
    }
}
