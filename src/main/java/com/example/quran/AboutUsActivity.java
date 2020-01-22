package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class AboutUsActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        imageView = findViewById(R.id.call_imageId);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                Toast.makeText(getApplicationContext(),"Calling...",Toast.LENGTH_SHORT).show();
                callIntent.setData(Uri.parse("tel:01770964628"));
                if (ContextCompat.checkSelfPermission(AboutUsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }
        });
    }
}
