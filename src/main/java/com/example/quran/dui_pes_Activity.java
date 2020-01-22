package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class dui_pes_Activity extends AppCompatActivity {

    private GridView gridView;
    int[] dui_pes={R.drawable.c_,R.drawable.b_,R.drawable.a_
            ,R.drawable.f_,R.drawable.e_,R.drawable.d_,

            R.drawable.i_,R.drawable.h_,R.drawable.g_,
            R.drawable.l_,R.drawable.k_,R.drawable.j_,
            R.drawable.o_,R.drawable.n_,R.drawable.m_,
            R.drawable.r_,R.drawable.q_,R.drawable.p_,
            R.drawable.u_,R.drawable.t_,R.drawable.s_,
            R.drawable.x_,R.drawable.w_,R.drawable.v_,
            R.drawable.z1_,R.drawable.z_,R.drawable.y_,
            R.drawable.wt,R.drawable.z3_,R.drawable.z2_};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dui_pes_);
        gridView = findViewById(R.id.dui_pes_gried_viewId);

        CustomAdapter adapter = new CustomAdapter(this, dui_pes);
        gridView.setAdapter(adapter);
    }
}
