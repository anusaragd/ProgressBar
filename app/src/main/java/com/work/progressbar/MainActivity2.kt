package com.work.progressbar

import android.animation.Animator
import android.animation.ObjectAnimator
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.ViewAnimationUtils
import android.view.WindowManager
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.core.os.HandlerCompat.postDelayed

class MainActivity2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main2)



        Handler().postDelayed({
            // on below line we are
            // creating a new intent
            val i = Intent(
                this@MainActivity2,
                CreatePassword::class.java
//            val i = Intent(
//                this@MainActivity2,
//                PasswordLogin::class.java

            )
            // on below line we are
            // starting a new activity.
            startActivity(i)

            // on the below line we are finishing
            // our current activity.
            finish()
        }, 2000)


    }


}