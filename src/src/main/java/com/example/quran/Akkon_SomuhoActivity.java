package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Akkon_SomuhoActivity extends AppCompatActivity {

    Button baa,taa,saa,jim,ha,kha,dal,zal,rwa,zha,seen,sheen,swad,dwad,twa,zwa,ayin,gyhin,fa,quf,kaf,lam,meem,noon,waw,haa,hamza,yaa;
    TextView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akkon__somuho);
        baa = (Button)findViewById(R.id.baa);
        baa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.baa);//This Is An Audio
                intent.putExtra("image",R.drawable.baa);//This Is A Image
                startActivity(intent);
            }
        });
        taa = (Button)findViewById(R.id.taa);
        taa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.taa);//This Is An Audio
                intent.putExtra("image",R.drawable.taa);//This Is A Image
                startActivity(intent);
            }
        });
        saa = (Button)findViewById(R.id.saa);
        saa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.saa);//This Is An Audio
                intent.putExtra("image",R.drawable.thaa);//This Is A Image
                startActivity(intent);
            }
        });
        jim = (Button)findViewById(R.id.jim);
        jim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.jim);//This Is An Audio
                intent.putExtra("image",R.drawable.jiim);//This Is A Image
                startActivity(intent);
            }
        });
        ha = (Button)findViewById(R.id.ha);
        ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.haa);//This Is An Audio
                intent.putExtra("image",R.drawable.boro_ha);//This Is A Image
                startActivity(intent);
            }
        });
        kha = (Button)findViewById(R.id.kha);
        kha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.kha);//This Is An Audio
                intent.putExtra("image",R.drawable.kha);//This Is A Image
                startActivity(intent);
            }
        });
        dal = (Button)findViewById(R.id.dal);
        dal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.dal);//This Is An Audio
                intent.putExtra("image",R.drawable.daal);//This Is A Image
                startActivity(intent);
            }
        });
        zal = (Button)findViewById(R.id.thaal);
        zal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.zal);//This Is An Audio
                intent.putExtra("image",R.drawable.thaal);//This Is A Image
                startActivity(intent);
            }
        });
        rwa = (Button)findViewById(R.id.rwa);
        rwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.rwa);//This Is An Audio
                intent.putExtra("image",R.drawable.raa);//This Is A Image
                startActivity(intent);
            }
        });
        zha = (Button)findViewById(R.id.zha);
        zha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.zha);//This Is An Audio
                intent.putExtra("image",R.drawable.zaay);//This Is A Image
                startActivity(intent);
            }
        });
        seen = (Button)findViewById(R.id.seen);
        seen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.seen);//This Is An Audio
                intent.putExtra("image",R.drawable.siin);//This Is A Image
                startActivity(intent);
            }
        });
        sheen = (Button)findViewById(R.id.sheen);
        sheen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.sheen);//This Is An Audio
                intent.putExtra("image",R.drawable.shiin);//This Is A Image
                startActivity(intent);
            }
        });
        swad = (Button)findViewById(R.id.swad);
        swad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.swad);//This Is An Audio
                intent.putExtra("image",R.drawable.soyod);//This Is A Image
                startActivity(intent);
            }
        });
        dwad = (Button)findViewById(R.id.dwad);
        dwad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.dwad);//This Is An Audio
                intent.putExtra("image",R.drawable.doyod);//This Is A Image
                startActivity(intent);
            }
        });
        twa = (Button)findViewById(R.id.twa);
        twa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.twa);//This Is An Audio
                intent.putExtra("image",R.drawable.to);//This Is A Image
                startActivity(intent);
            }
        });
         zwa = (Button)findViewById(R.id.zwa);
        zwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.zwa);//This Is An Audio
                intent.putExtra("image",R.drawable.jo);//This Is A Image
                startActivity(intent);
            }
        });
        ayin = (Button)findViewById(R.id.ayin);
        ayin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.ayin);//This Is An Audio
                intent.putExtra("image",R.drawable.ayin);//This Is A Image
                startActivity(intent);
            }
        });
        gyhin = (Button)findViewById(R.id.gyhin);
        gyhin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.gyhin);//This Is An Audio
                intent.putExtra("image",R.drawable.goyin);//This Is A Image
                startActivity(intent);
            }
        });
        fa = (Button)findViewById(R.id.fa);
        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.fa);//This Is An Audio
                intent.putExtra("image",R.drawable.fa);//This Is A Image
                startActivity(intent);
            }
        });
        quf = (Button)findViewById(R.id.quf);
        quf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.quf);//This Is An Audio
                intent.putExtra("image",R.drawable.kof);//This Is A Image
                startActivity(intent);
            }
        });
        kaf = (Button)findViewById(R.id.kaf);
        kaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.kaf);//This Is An Audio
                intent.putExtra("image",R.drawable.kaaf);//This Is A Image
                startActivity(intent);
            }
        });
        lam = (Button)findViewById(R.id.lam);
        lam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.lam);//This Is An Audio
                intent.putExtra("image",R.drawable.lam);//This Is A Image
                startActivity(intent);
            }
        });
        meem = (Button)findViewById(R.id.meem);
        meem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.meem);//This Is An Audio
                intent.putExtra("image",R.drawable.mim);//This Is A Image
                startActivity(intent);
            }
        });
        noon = (Button)findViewById(R.id.noon);
        noon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.noon);//This Is An Audio
                intent.putExtra("image",R.drawable.nun);//This Is A Image
                startActivity(intent);
            }
        });
        waw = (Button)findViewById(R.id.waw);
        waw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.waw);//This Is An Audio
                intent.putExtra("image",R.drawable.oao);//This Is A Image
                startActivity(intent);
            }
        });
        haa = (Button)findViewById(R.id.haa);
        haa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.ha);//This Is An Audio
                intent.putExtra("image",R.drawable.haa);//This Is A Image
                startActivity(intent);
            }
        });
        hamza = (Button)findViewById(R.id.hamza);
        hamza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.hamza);//This Is An Audio
                intent.putExtra("image",R.drawable.hamza);//This Is A Image
                startActivity(intent);
            }
        });
        yaa = (Button)findViewById(R.id.yaa);
        yaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
                intent.putExtra("audio", R.raw.yaa);//This Is An Audio
                intent.putExtra("image",R.drawable.ya);//This Is A Image
                startActivity(intent);
            }
        });
        back = (TextView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Akkon_SomuhoActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void alifActivity(View view) {
        Intent intent = new Intent(Akkon_SomuhoActivity.this,AlifActivity.class);
        intent.putExtra("audio", R.raw.alif);//This Is An Audio
        intent.putExtra("image",R.drawable.alif1);//This Is A Image
        startActivity(intent);
    }
}
