package sanaebadi.info.batch.pushFcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import androidx.core.app.NotificationCompat;
import sanaebadi.info.batch.MainActivity;
import sanaebadi.info.batch.R;


public class MyFirebaseMessagingService extends FirebaseMessagingService {

  private static final String TAG = "MyFirebaseMessagingServ";

  @Override
  public void onNewToken(String s) {
    super.onNewToken(s);

  }

  @Override
  public void onMessageReceived(RemoteMessage remoteMessage) {
    super.onMessageReceived(remoteMessage);


//Check If The Message Contains Data

    if (remoteMessage.getData().size() > 0) {
      Log.d(TAG, "onMessageData: " + remoteMessage.getData());
    }

    //Check If The Message Contains Notification
    if (remoteMessage.getNotification() != null) {
      Log.d(TAG, "onMessageNotification: " + remoteMessage.getNotification().getBody());

      sendNotification(remoteMessage.getNotification().getBody());
    }

  }

  /**
   * Display The Notification
   *
   * @param body
   */
  private void sendNotification(String body) {

    Intent intent = new Intent(this, MainActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

    PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent,
      PendingIntent.FLAG_ONE_SHOT);

    //Set Sound Of Notification

    Uri notificationSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

    NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
      .setSmallIcon(R.mipmap.ic_launcher)
      .setContentTitle("")
      .setContentText(body)
      .setSound(notificationSound)
      .setContentIntent(pendingIntent);


    NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    assert notificationManager != null;
    notificationManager.notify(0, builder.build());
  }
}

