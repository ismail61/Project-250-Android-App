package com.example.quran;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button online_class;
    Button jer_activity,pes_activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        online_class = (Button)findViewById(R.id.online_class);
        online_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Log In Page",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
            }
        });
        jer_activity = (Button)findViewById(R.id.jerActivityId);
        jer_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,jer_Activity.class));
            }
        });
        pes_activity = (Button) findViewById(R.id.pesActivityId);
        pes_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,pes_Activity.class));
            }
        });
    }
    public void nextActivity(View view) {
        Intent nextactivity = new Intent(MainActivity.this,Suchona1Activity.class);
        startActivity(nextactivity);
    }

    public void makrajActivity(View view) {
        Intent makraj = new Intent(MainActivity.this,MakrajActivity.class);
        startActivity(makraj);
    }

    public void AkkonSomuhoActivity(View view) {
        startActivity(new Intent(MainActivity.this,Akkon_SomuhoActivity.class));
    }

    public void joborActivity(View view) {
        startActivity(new Intent(MainActivity.this,jobor_Activity.class));
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(MainActivity.this);
        alertdialogbuilder.setIcon(R.drawable.question_mark_icon);
        alertdialogbuilder.setTitle("  Title");
        alertdialogbuilder.setMessage("Do You Want To Exit? ");
        alertdialogbuilder.setCancelable(false);
        alertdialogbuilder.setPositiveButton("Yes.Exit!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertdialogbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = alertdialogbuilder.create();
        alertDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);

        MenuItem menuItem = menu.findItem(R.id.settingId);
        menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Toast.makeText(getApplicationContext(),"Setting is Selected",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        /*if(item.getItemId()==R.id.settingId)
        {
            Toast.makeText(getApplicationContext(),"Setting is Selected",Toast.LENGTH_SHORT).show();
            return true;
        }*/
        if(item.getItemId()==R.id.shareId)
        {
            Toast.makeText(getApplicationContext(),"Share is Selected",Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId()==R.id.ratingId)
        {
            Toast.makeText(getApplicationContext(),"Rating is Selected",Toast.LENGTH_SHORT).show();
            return  true;
        }
        else if(item.getItemId()==R.id.aboutusId)
        {
            //Toast.makeText(getApplicationContext(),"About Us is Selected",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),AboutUsActivity.class);
            startActivity(intent);

        }
        return super.onOptionsItemSelected(item);
    }
}
