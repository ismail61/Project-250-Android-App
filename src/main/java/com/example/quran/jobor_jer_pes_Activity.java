package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;
import static android.content.ContentValues.TAG;

public class jobor_jer_pes_Activity extends AppCompatActivity {

    private GridView gridView;
    int[] jobor_jer_pes={R.drawable.ba_jobor_jer_pes,R.drawable.alif_jobor_jer_pes,
            R.drawable.sha_jobor_jer_pes,R.drawable.ta_jobor_jer_pes,
            R.drawable.boroha_jobor_jer_pes,R.drawable.jim_jobor_jer_pes
            ,R.drawable.dal_jobor_jer_pes,R.drawable.kha_jobor_jer_pes
            ,R.drawable.ra_jobor_jer_pes,R.drawable.jal_jobor_jer_pes,
            R.drawable.seen_jobor_jer_pes,R.drawable.ja_jobor_jer_pes,
            R.drawable.swad_jobor_jer_pes,R.drawable.sheen_jobor_jer_pes
            ,R.drawable.twa_jobor_jer_pes,R.drawable.dwad_jobor_jer_pes,
            R.drawable.ayin_jobor_jer_pes,R.drawable.jwa_jobor_jer_pes
            ,R.drawable.fa_jobor_jer_pes,R.drawable.gyin_jobor_jer_pes
            ,R.drawable.kaf_jobor_jer_pes,R.drawable.quf_jobor_jer_pes,
            R.drawable.mim_jobor_jer_pes,R.drawable.lam_jobor_jer_pes
            ,R.drawable.owaw_jobor_jer_pes,R.drawable.nun_jobor_jer_pes
            ,R.drawable.alif_jobor_jer_pes,R.drawable.haa_jobor_jer_pes,
            R.drawable.wt,R.drawable.yaa_jobor_jer_pes};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobor_jer_pes_);

        gridView = findViewById(R.id.jobor_jer_pes_gried_viewId);

        CustomAdapter adapter = new CustomAdapter(this,jobor_jer_pes);
        gridView.setAdapter(adapter);
    }
}
