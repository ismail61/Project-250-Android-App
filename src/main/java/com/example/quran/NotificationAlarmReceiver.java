package com.example.quran;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

import static android.content.ContentValues.TAG;

public class NotificationAlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        MediaPlayer mediaPlayer = MediaPlayer.create(context, RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM));
        mediaPlayer.start();


        //Get id & text from intent in memoactivity
        int notificationId = intent.getIntExtra("notificatinId",0);
        String message = intent.getStringExtra("text");
        int count = intent.getIntExtra("count",0);
        //Toast.makeText(context,notificationId+"& "+message,Toast.LENGTH_LONG).show();

        String channel_id = "my_channel_01";
        //When notification is tapped ,call Memo Activity
        Intent memointent = new Intent(context,MemoActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(
                context,0,memointent,PendingIntent.FLAG_UPDATE_CURRENT);

        //Log.d(TAG, "pending work");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(
                Context.NOTIFICATION_SERVICE);
        //Log.d(TAG, "Notification work");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            /* Create or update. */
            NotificationChannel channel = new NotificationChannel(channel_id,
                    "Channel Name",
                    NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(channel);
        }
        //prepare Notification
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Time to Task!")
                .setContentText(message)
                .setWhen(System.currentTimeMillis())
                .setChannelId(channel_id)
                .setAutoCancel(true).setContentInfo("Info")
                .setContentIntent(contentIntent)
                .setDefaults(Notification.DEFAULT_ALL)
                .setTicker("Ismail")
                .setNumber(++count)
                ;

       NotificationCompat.BigTextStyle bigText = new NotificationCompat.BigTextStyle();
        bigText.bigText(message);
        bigText.setBigContentTitle("Time to Task");
        bigText.setSummaryText("Info");
        builder.setStyle(bigText);
        builder.setPriority(NotificationCompat.PRIORITY_MAX);
        builder.setChannelId(channel_id);
        //Log.d(TAG, "NotificationBuilder work");
        //Notify
        notificationManager.notify(notificationId,builder.build());
        //Log.d(TAG, "Notification notify work");

    }
}
