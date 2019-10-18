package sanaebadi.info.batch;

import android.app.Application;

import com.batch.android.Batch;
import com.batch.android.BatchActivityLifecycleHelper;
import com.batch.android.Config;

public class App extends Application {
  @Override
  public void onCreate() {
    super.onCreate();


    //live is for last release not test but we use it :)

     Batch.setConfig(new Config("5DA9D77DCB3B55B4CD0E44CD80661B")); // live
//    Batch.setConfig(new Config("DEV5DA9D77DCB5A1AE02F4C809E34C")); // development
    registerActivityLifecycleCallbacks(new BatchActivityLifecycleHelper());
    // You should configure your notification's customization options here.
    // Not setting up a small icon could cause a crash in applications created with Android Studio 3.0 or higher.
    // More info in our "Customizing Notifications" documentation
     Batch.Push.setSmallIconResourceId(R.mipmap.ic_launcher);
  }
}
