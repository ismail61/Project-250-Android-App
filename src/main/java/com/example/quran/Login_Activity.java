package com.example.quran;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Activity extends AppCompatActivity {
    private EditText usernameEditText, passwordEditText;
    private Button loginButon;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        usernameEditText = (EditText) findViewById(R.id.usernameID);
        passwordEditText = (EditText) findViewById(R.id.passwordID);
        loginButon = (Button) findViewById(R.id.loginbuttonID);
        textView = (TextView) findViewById(R.id.textViewID);


        loginButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if(username.equals("abdullah") && password.equals("1234")) {
                    Intent intent = new Intent(Login_Activity.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    textView.setText("You have entered a wrong username or password!\n Please try again.");
                }
            }
        });
    }
}
