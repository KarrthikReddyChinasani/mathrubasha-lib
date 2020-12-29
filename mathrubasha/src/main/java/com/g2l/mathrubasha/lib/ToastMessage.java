package com.g2l.mathrubasha.lib;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
    public static  void s(Context c,String str) {
        Toast.makeText(c, str, Toast.LENGTH_LONG).show();
    }
}
