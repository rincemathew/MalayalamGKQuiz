package com.melisa.rincemathew.malayalamgkquiz;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by RinceMathew on 22-03-2018.
 */

public class FcmIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("Fcm Token", "Refreshed token: " + refreshedToken);
    }
}
