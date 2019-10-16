package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button loginButton;
    private TextView loginregister_page_Text;
    private EditText loginusernameEditText,loginpasswordEditText;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = (Button)findViewById(R.id.loginId);
        loginusernameEditText = (EditText)findViewById(R.id.loginusernameId);
        loginpasswordEditText = (EditText)findViewById(R.id.loginpasswordId);
        loginregister_page_Text = (TextView)findViewById(R.id.login_register_pageId);

        ///DATABASE
        databaseHelper = new DatabaseHelper(this);
        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

        loginregister_page_Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginusernameEditText.setText("");
                loginpasswordEditText.setText("");
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
                //Toast.makeText(getApplicationContext(),"Register page",Toast.LENGTH_SHORT).show();
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = loginusernameEditText.getText().toString();
                String password = loginpasswordEditText.getText().toString();
                if(username.equals("") || password.equals("")){
                    if(username.equals("") && password.equals("")) {
                        Toast.makeText(getApplicationContext(), "Please Enter your username and password",Toast.LENGTH_LONG).show();
                    }
                    else if(password.equals("")) {
                        errormessage(loginpasswordEditText,"password");
                    }
                    else if(username.equals("")) {
                        errormessage(loginusernameEditText,"username");
                    }
                }
                else {
                    Boolean result = databaseHelper.finduser(username, password);
                    if (result == true) {
                        startActivity(new Intent(LoginActivity.this, MyaccountActivity.class));
                    } else {
                        Toast.makeText(getApplicationContext(), "UserName and Password didn't Match!\nPlease Enter correct UserName and Password", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
    void errormessage(EditText editText,String string){
        editText.setError("Please Enter your "+string);
        editText.requestFocus();
        return;
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(LoginActivity.this,MainActivity.class));
    }
}
