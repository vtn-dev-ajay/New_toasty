package com.example.newtoasty

import android.content.Context
import android.widget.Toast

object ToastGenerator {
    fun toastGenerator(context: Context,message: String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }
}