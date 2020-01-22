package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class feedBackActivity extends AppCompatActivity {

    private EditText tobtn,subjectbtn,messagebtn;
    private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        //tobtn = (EditText)findViewById(R.id.toId);
        subjectbtn = (EditText)findViewById(R.id.subjectId);
        messagebtn = (EditText)findViewById(R.id.messageId);
        send = (Button)findViewById(R.id.feedbacksendId);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String email = tobtn.getText().toString().trim();
                String email = "support@quranbangla.com";
                String subject = subjectbtn.getText().toString().trim();
                String message = messagebtn.getText().toString();
                /*if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    tobtn.setError("Invalid Email");
                    tobtn.requestFocus();
                    return;
                }*/
                if(subject==""){
                    errormessage(subjectbtn,"Subject");
                }
                else{
                    Intent in = new Intent(Intent.ACTION_SEND);
                    in.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
                    in.putExtra(Intent.EXTRA_SUBJECT, subject);
                    in.putExtra(Intent.EXTRA_TEXT, message);
                    in.setType("message/rfc822");
                    startActivity(Intent.createChooser(in, "Choose Mail App"));
                }
            }
        });
    }
    void errormessage(EditText editText,String string){
        editText.setError("Please Enter your "+string);
        editText.requestFocus();
        return;
    }
}
