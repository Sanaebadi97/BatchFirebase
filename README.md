![Screenshot_2019-10-18_19-35-06](https://user-images.githubusercontent.com/26750131/67109931-7507f400-f1de-11e9-8f77-98b1c17f53df.png)      :heart:      ![Screenshot_2019-10-18_19-38-42](https://user-images.githubusercontent.com/26750131/67110148-e778d400-f1de-11e9-967d-fce2fe6aa811.png)



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
    
    
 4.Add Java8 in android block build.gradle(app)   
 
 
 
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    } 
    
    

5.add Internet permission in Manifest.xml

6.Create Application Class call App and define in in Manifest.xml


7.write batch code in onCreate()


    //live is for last release not test but we use it :)

     Batch.setConfig(new Config("5DA9D77DCB3B55B4CD0E44CD80661B")); // live
    //Batch.setConfig(new Config("DEV5DA9D77DCB5A1AE02F4C809E34C")); // development
    registerActivityLifecycleCallbacks(new BatchActivityLifecycleHelper());
    // You should configure your notification's customization options here.
    // Not setting up a small icon could cause a crash in applications created with Android Studio 3.0 or higher.
    // More info in our "Customizing Notifications" documentation
     Batch.Push.setSmallIconResourceId(R.mipmap.ic_launcher);

8.use live key 

9.run app and in userbase tab you can see all users ..

10.send Push from Push tab

11.enjoy it :smiley::kissing_closed_eyes:
