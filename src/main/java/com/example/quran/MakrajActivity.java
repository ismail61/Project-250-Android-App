package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MakrajActivity extends AppCompatActivity {

    private ListView listView;
    private Button makrajButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makraj);
        listView = (ListView) findViewById(R.id.ListViewId);
        makrajButton = (Button)findViewById(R.id.makhrajFirst);
        makrajButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MakrajActivity.this, AlifActivity.class);
                intent1.putExtra("audio", R.raw.makhraj);//This Is An Audio
                startActivity(intent1);
            }
        });
        final String[] makhraj_serial = getResources().getStringArray(R.array.makhraj);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MakrajActivity.this, R.layout.sample_list_view_makhraj_serial, R.id.sample_view_makhrajID, makhraj_serial);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //String value = makhraj_serial[position];
                //Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        Intent intent1 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent1.putExtra("audio", R.raw.makhraj1);//This Is An Audio
                        //intent.putExtra("image",R.drawable.alif1);//This Is A Image
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent2.putExtra("audio", R.raw.makhraj2);//This Is An Audio
                        //intent.putExtra("image",R.drawable.alif1);//This Is A Image
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent3.putExtra("audio", R.raw.makhraj3);//This Is An Audio
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent4.putExtra("audio", R.raw.makhraj4);//This Is An Audio
                        startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent5.putExtra("audio", R.raw.makhraj5);//This Is An Audio
                        startActivity(intent5);
                        break;
                    case 5:
                        Intent intent6 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent6.putExtra("audio", R.raw.makhraj6);//This Is An Audio
                        startActivity(intent6);
                        break;
                    case 6:
                        Intent intent7 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent7.putExtra("audio", R.raw.makhraj7);//This Is An Audio
                        startActivity(intent7);
                        break;
                    case 7:
                        Intent intent8 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent8.putExtra("audio", R.raw.makhraj8);//This Is An Audio
                        startActivity(intent8);
                        break;
                    case 8:
                        Intent intent9 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent9.putExtra("audio", R.raw.makhraj9);//This Is An Audio
                        startActivity(intent9);
                        break;
                    case 9:
                        Intent intent10 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent10.putExtra("audio", R.raw.makhraj10);//This Is An Audio
                        startActivity(intent10);
                        break;
                    case 10:
                        Intent intent11 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent11.putExtra("audio", R.raw.makhraj11);//This Is An Audio
                        startActivity(intent11);
                        break;
                    case 11:
                        Intent intent12 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent12.putExtra("audio", R.raw.makhraj12);//This Is An Audio
                        startActivity(intent12);
                        break;
                    case 12:
                        Intent intent13 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent13.putExtra("audio", R.raw.makhraj13);//This Is An Audio
                        startActivity(intent13);
                        break;
                    case 13:
                        Intent intent14 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent14.putExtra("audio", R.raw.makhraj14);//This Is An Audio
                        startActivity(intent14);
                        break;
                    case 14:
                        Intent intent15 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent15.putExtra("audio", R.raw.makhraj15);//This Is An Audio
                        startActivity(intent15);
                        break;
                    case 15:
                        Intent intent16 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent16.putExtra("audio", R.raw.makhraj16);//This Is An Audio
                        startActivity(intent16);
                        break;
                    case 16:
                        Intent intent17 = new Intent(MakrajActivity.this, AlifActivity.class);
                        intent17.putExtra("audio", R.raw.makhraj17);//This Is An Audio
                        startActivity(intent17);
                        break;
                }

            }
        });
    }
}
