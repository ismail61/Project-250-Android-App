package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView name,email;
    Button logoutbn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        name = (TextView)findViewById(R.id.hm_name);
        email = (TextView)findViewById(R.id.hm_email);
        logoutbn =(Button)findViewById(R.id.btn_logout);

        Intent intent = getIntent();
        String extraName = intent.getStringExtra("name");
        String extraEmail = intent.getStringExtra("email");
        name.setText(extraName);
        email.setText(extraEmail);
        logoutbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, Login_Acivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
            }
        });

    }
}
