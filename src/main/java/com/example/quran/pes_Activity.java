package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class pes_Activity extends AppCompatActivity {

    private GridView gridView;
    int[] pes ={R.drawable.taa_pes,R.drawable.ba_pes,R.drawable.alif_pes
            ,R.drawable.boroha_pes,R.drawable.jim_pes,R.drawable.sha_pes,
            R.drawable.jal_pes,R.drawable.dal_pes,R.drawable.kho_pes,
            R.drawable.seen_pes,R.drawable.ja_pes,R.drawable.ra_pes,
            R.drawable.dwad_pes,R.drawable.swad_pes,R.drawable.sheen_pes,
            R.drawable.ayin_pes,R.drawable.jwa_pes,R.drawable.twa_pes,
            R.drawable.quf_pes,R.drawable.fa_pes,R.drawable.gyin_pes,
            R.drawable.mim_pes,R.drawable.lam_pes,R.drawable.kaf_pes,
            R.drawable.haa_pes,R.drawable.owaw_pes,R.drawable.nun_pews,
            R.drawable.whitebg,R.drawable.yaa_pes,R.drawable.alif_pes};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pes_);
        gridView = (GridView)findViewById(R.id.pes_grid_activityId);
        CustomAdapter adapter = new CustomAdapter(this,pes);
        gridView.setAdapter(adapter);
    }
}
