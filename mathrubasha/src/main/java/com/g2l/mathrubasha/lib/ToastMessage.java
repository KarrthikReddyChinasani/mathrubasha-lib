package com.g2l.mathrubasha.lib;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
    public static void s(Context context,String str, ResponseListener c) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
        c.onReceive("Hi people");
    }
}
