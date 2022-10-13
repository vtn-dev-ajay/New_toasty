package com.example.newtoasty;

import android.content.Context;
import android.widget.Toast;

public class ToastGeneratorJava {
    public static void showJavaToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
