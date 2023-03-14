package com.work.progressbar

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import com.chaos.view.PinView

class CreatePassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_password)


        (findViewById<View>(R.id.createpassword) as PinView).setAnimationEnable(true)
        (findViewById<View>(R.id.cfpassword) as PinView).setAnimationEnable(true)



    }

}