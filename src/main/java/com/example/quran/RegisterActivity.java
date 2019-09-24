package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private Button registerButton;
    private EditText nameEditText,signupusernameEditText,emailEditText,signuppasswordEditText,confirmpasswordEditText;
    private TextView signuploginText;
    UserDetails_Getter_Setter_method userDetails;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nameEditText = findViewById(R.id.nameId);
        signupusernameEditText = findViewById(R.id.registerUsernameId);
        emailEditText = findViewById(R.id.emailId);
        signuppasswordEditText = findViewById(R.id.registerpasswordId);
        confirmpasswordEditText = findViewById(R.id.registerConfirmpasswordId);
        signuploginText = findViewById(R.id.login_page_registerId);
        registerButton = findViewById(R.id.registerId);

        databaseHelper = new DatabaseHelper(this);
        userDetails = new UserDetails_Getter_Setter_method();

        signuploginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditText.getText().toString();
                String signup_username = signupusernameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String signup_password = signuppasswordEditText.getText().toString();
                String confirm_password = confirmpasswordEditText.getText().toString();

                if(!signup_password.equals(confirm_password))
                {
                    Toast.makeText(getApplicationContext(),"Password Didn't Match",Toast.LENGTH_LONG).show();
                }
                else {
                    userDetails.setName(name);
                    userDetails.setSignup_username(signup_username);
                    userDetails.setSignup_password(signup_password);
                    userDetails.setEmail(email);
                    userDetails.setConfirm_password(confirm_password);

                    long rowId = databaseHelper.insertData(userDetails);
                    Toast.makeText(getApplicationContext(), "rowId Is : " + rowId, Toast.LENGTH_LONG).show();

                    if (rowId == -1) {
                        Toast.makeText(getApplicationContext(), "Unsuccessful Inserted", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Row " + rowId + "is successful Inserted", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
