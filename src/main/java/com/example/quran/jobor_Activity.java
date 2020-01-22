package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class jobor_Activity extends AppCompatActivity {

    int[] jobor = {R.drawable.taa_jobor,R.drawable.ba_jobor,R.drawable.alif_jobor
            ,R.drawable.boroha_jobor,R.drawable.jim_jobor,R.drawable.sha_jobor,
            R.drawable.jal_jobor,R.drawable.dal_jobor,R.drawable.kho_jobor,
            R.drawable.seen_jobor,R.drawable.ja_jobor,R.drawable.ra_jobor,
            R.drawable.dwad_jobor,R.drawable.swad_jobor,R.drawable.sheen_jobor,
            R.drawable.ayin_jobor,R.drawable.jwa_jobor,R.drawable.twa_jobor,
            R.drawable.quf_jobor,R.drawable.fa_jobor,R.drawable.gyin_jobor,
            R.drawable.mim_jobor,R.drawable.lam_jobor,R.drawable.kaf_jobor,
            R.drawable.haa_jobor,R.drawable.owaw_jobor,R.drawable.nun_jobor,
            R.drawable.wt,R.drawable.yaa_jobor,R.drawable.alif_jobor};
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobor_);
        gridView = (GridView) findViewById(R.id.gridViewId);
        CustomAdapter adapter = new CustomAdapter(this,jobor);
        gridView.setAdapter(adapter);
    }
}
