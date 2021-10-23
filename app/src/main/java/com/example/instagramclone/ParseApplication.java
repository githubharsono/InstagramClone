package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("CB3mSJQS4yNqCXlJmvhcUlbn2R91Sv1Q50tuJUzp")
                .clientKey("Vr92AkvPSa53N0xmdxdpVxDpLxp5L679ysdVb1Fl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
