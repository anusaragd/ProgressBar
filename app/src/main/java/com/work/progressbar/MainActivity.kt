package com.work.progressbar

import android.animation.ObjectAnimator
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.ProgressBar
import androidx.annotation.ColorInt
import androidx.appcompat.app.AppCompatActivity
import com.work.progressbar.databinding.ActivityMainBinding


lateinit var progressBar : ProgressBar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)


        setprogressBar()
        setprogressBarcircle()


        Handler().postDelayed({
            // on below line we are
            // creating a new intent
            val i = Intent(
                this@MainActivity,
                MainActivity2::class.java
            )
            // on below line we are
            // starting a new activity.
            startActivity(i)

            // on the below line we are finishing
            // our current activity.
            finish()
        }, 2000)
//        handler.



//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        progressBar = findViewById(R.id.progressBar)
//        binding.progressBar.max = 1000
//
//        val currentProgress = 1000
//
//        ObjectAnimator.ofInt(progressBar,"progress",currentProgress)
//            .setDuration(2000)
//            .start()
    }

    private fun setprogressBar(){
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        progressBar = findViewById(R.id.progressBar)
        binding.progressBar.max = 1000

        @ColorInt val color = Color.parseColor("#3AC267")
        progressBar.progressTintList = ColorStateList.valueOf(color)

        val currentProgress = 1000

        ObjectAnimator.ofInt(progressBar,"progress",currentProgress)
            .setDuration(2000)
            .start()


//        mainLooper.queue.removeIdleHandler { display. }




//                    val intent = Intent(this, MainActivity2::class.java)
//                    startActivity(intent)

    }
    private fun setprogressBarcircle()
    {

//        val intent = Intent(this, MainActivity2::class.java)
//        startActivity(intent)




    }




}