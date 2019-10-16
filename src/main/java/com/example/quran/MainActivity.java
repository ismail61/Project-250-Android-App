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

import static android.provider.ContactsContract.Intents.Insert.ACTION;


public class MainActivity extends AppCompatActivity {
    Button online_class;
    Button jer_activity,pes_activity,jobor_jer_pes_activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        online_class = (Button)findViewById(R.id.online_class);
        online_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Log In Page",Toast.LENGTH_SHORT).show();
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
        jobor_jer_pes_activity = findViewById(R.id.jobor_jer_pesActivityId);
        jobor_jer_pes_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,jobor_jer_pes_Activity.class));
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
        alertdialogbuilder.setCancelable(true);
        alertdialogbuilder.setTitle("  Title");
        alertdialogbuilder.setMessage("Do You Want To Exit? ");
        alertdialogbuilder.setCancelable(false);
        alertdialogbuilder.setPositiveButton("Yes.Exit!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent);
                finishAffinity();
                //finish();
                System.exit(0);
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
            //Toast.makeText(getApplicationContext(),"Share is Selected",Toast.LENGTH_SHORT).show();
            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            share.putExtra(Intent.EXTRA_TEXT,"Your Body Here");
            share.putExtra(Intent.EXTRA_SUBJECT,"Your Subject Here");
            startActivity(Intent.createChooser(share,"Share Using"));
            return true;
        }
        else if(item.getItemId()==R.id.ratingId)
        {
            //Toast.makeText(getApplicationContext(),"Rating is Selected",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this,RatingActivity.class));
            return  true;
        }
        else if(item.getItemId()==R.id.aboutusId)
        {
            //Toast.makeText(getApplicationContext(),"About Us is Selected",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),AboutUsActivity.class);
            startActivity(intent);

        }
        else if(item.getItemId()==R.id.memoNotificationId){
            startActivity(new Intent(MainActivity.this,MemoActivity.class));
            //Toast.makeText(getApplicationContext(),"Memo is selected ",Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.feedbackId){
            startActivity(new Intent(MainActivity.this,feedBackActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
