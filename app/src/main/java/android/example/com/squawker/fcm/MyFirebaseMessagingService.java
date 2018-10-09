package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String FIREBASE_SERVICE_TAG = MyFirebaseMessagingService.class.getSimpleName();

    @Override
    public void onNewToken(String s) {
        Log.d(FIREBASE_SERVICE_TAG, "Refreshed token: " + s);
    }
}
