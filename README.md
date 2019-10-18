
## Just Few Steps:

1.Go to https://batch.com/

2.Create Project on firebase and set Server key + Sender ID

3.add Batch + firebase dependencies 

    implementation "com.google.firebase:firebase-core:$rootProject.firebaseVersion"
    implementation "com.google.firebase:firebase-analytics:$rootProject.analyticsVersion"
    implementation "com.google.firebase:firebase-messaging:$rootProject.messageingVersion"

    //Batch
    implementation "com.batch.android:batch-sdk:$rootProject.batchVersion"
    implementation "com.google.android.gms:play-services-ads-identifier:$rootProject.identifierVersion"
    
    
    ext {
    firebaseVersion = '17.2.0'
    analyticsVersion = '17.2.0'
    messageingVersion = '20.0.0'
    batchVersion = '1.14.2'
    identifierVersion = '17.0.0'
    }

4.add Internet permission in Manifest.xml

5.Create Application Class call App and define in in Manifest.xml


6.write batch code in onCreate()


    //live is for last release not test but we use it :)

     Batch.setConfig(new Config("5DA9D77DCB3B55B4CD0E44CD80661B")); // live
    //Batch.setConfig(new Config("DEV5DA9D77DCB5A1AE02F4C809E34C")); // development
    registerActivityLifecycleCallbacks(new BatchActivityLifecycleHelper());
    // You should configure your notification's customization options here.
    // Not setting up a small icon could cause a crash in applications created with Android Studio 3.0 or higher.
    // More info in our "Customizing Notifications" documentation
     Batch.Push.setSmallIconResourceId(R.mipmap.ic_launcher);

7.use live key 

8.run app and in userbase tab you can see all users ..

9.send Push from Push tab

10.enjoy it :)
