package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class jer_Activity extends AppCompatActivity {

    private GridView gridView;
    int[] jer={R.drawable.taa_jer,R.drawable.ba_jer,R.drawable.alif_jer
            ,R.drawable.boroha_jer,R.drawable.jim_jer,R.drawable.sha_jer,
            R.drawable.jal_jer,R.drawable.dal_jer,R.drawable.kho_jer,
            R.drawable.seen_jer,R.drawable.ja_jer,R.drawable.ra_jer,
            R.drawable.dwad_jer,R.drawable.swad_jer,R.drawable.sheen_jer,
            R.drawable.ayin_jer,R.drawable.jwa_jerpng,R.drawable.twa_jer,
            R.drawable.quf_jer,R.drawable.fa_jer,R.drawable.gyin_jer,
            R.drawable.mim_jer,R.drawable.lam_jer,R.drawable.kaf_jer,
            R.drawable.haa_jer,R.drawable.owaw_jer,R.drawable.nun_jer,
            R.drawable.whitebg,R.drawable.yaa_jer,R.drawable.alif_jer};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jer_);
        gridView = findViewById(R.id.jer_gried_viewId);

        CustomAdapter adapter = new CustomAdapter(this,jer);
        gridView.setAdapter(adapter);
    }
}
