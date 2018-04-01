package com.example.qklahpita.toeicvocab12.backgrounds;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.qklahpita.toeicvocab12.activities.ReviewActivity;

/**
 * Created by qklahpita on 4/1/18.
 */

public class ScreenOnReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        context.startActivity(new Intent(context, ReviewActivity.class));
    }
}
