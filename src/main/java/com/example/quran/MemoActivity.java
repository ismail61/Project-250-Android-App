package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MemoActivity extends AppCompatActivity implements View.OnClickListener{
    private int notificationId = 1;
    int count = 0 ;
    @Override
    protected void onResume () {
        super .onResume() ;
        count = 0 ;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);
        findViewById(R.id.memosaveId).setOnClickListener(this);
        findViewById(R.id.memoCancelId).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        EditText editText = findViewById(R.id.memoEditTextId);
        TimePicker timePicker = findViewById(R.id.memoTimePickerId);
        //set Notification
        Intent intent = new Intent(getApplicationContext(),NotificationAlarmReceiver.class);
        intent.putExtra("notificatinId",notificationId);
        intent.putExtra("text",editText.getText().toString());
        intent.putExtra("count",count);

        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                getApplicationContext(),0,intent,PendingIntent.FLAG_UPDATE_CURRENT);

        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        switch (view.getId()){
            case R.id.memosaveId:
                int hour = timePicker.getCurrentHour();
                int minute = timePicker.getCurrentMinute();
                //create time
                Calendar startTime = Calendar.getInstance();
                startTime.set(Calendar.YEAR,2019);
                startTime.set(Calendar.HOUR_OF_DAY,hour);
                startTime.set(Calendar.MINUTE,minute);
                startTime.set(Calendar.SECOND,0);
                long notificationStartTime = startTime.getTimeInMillis();
                //set alarm/notification
                //alarmManager.set(AlarmManager.RTC_WAKEUP,notificationStartTime,pendingIntent);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,notificationStartTime,AlarmManager.INTERVAL_DAY,pendingIntent);
                Toast.makeText(this,"Done",Toast.LENGTH_SHORT).show();
                editText.setText("");
                break;
            case R.id.memoCancelId:
                alarmManager.cancel(pendingIntent);
                editText.setText("");
                //Toast.makeText(this,"Canceled..",Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
