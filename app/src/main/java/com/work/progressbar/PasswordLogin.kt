package com.work.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chaos.view.PinView

class PasswordLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_login)


        val pin = findViewById<PinView>(R.id.passwordlogin)
        pin.setText("")





    }
}