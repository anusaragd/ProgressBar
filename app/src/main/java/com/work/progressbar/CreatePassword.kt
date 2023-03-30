package com.work.progressbar

import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.chaos.view.PinView
import com.work.progressbar.databinding.ActivityCreatePasswordBinding


class CreatePassword : AppCompatActivity() {

    private lateinit var binding: ActivityCreatePasswordBinding

    private val ler: SQLiteDatabase? = null
    private  var escrever:SQLiteDatabase? = null
//    private val helper: SqlHelper? = null

    fun getEscrever(): SQLiteDatabase? {
        return escrever
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_password)


        binding = ActivityCreatePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Login()

//        createpassword





//        (findViewById<View>(R.id.createpassword) as PinView).setAnimationEnable(true)
//        (findViewById<View>(R.id.cfpassword) as PinView).setAnimationEnable(true)



//        Handler().postDelayed({
//            // on below line we are
//            // creating a new intent
//            val i = Intent(
//                this@CreatePassword,
//                PasswordLogin::class.java
////            val i = Intent(
////                this@MainActivity2,
////                PasswordLogin::class.java
//
//            )
//            // on below line we are
//            // starting a new activity.
//            startActivity(i)
//
//            // on the below line we are finishing
//            // our current activity.
//            finish()
//        }, 5000)


    }
    fun Login(){



//        binding.ctpassword = (findViewById<View>(R.id.createpassword) as PinView).setAnimationEnable(true)
//        binding.cfpassword = (findViewById<View>(R.id.cfpassword) as PinView).setAnimationEnable(true)
//
//        binding.createpassword.setText()

        val pinview1 = findViewById<PinView>(R.id.createpassword)
        pinview1.setText("")
        pinview1.setPinViewEventListener(object : PinViewEventListener {

            override fun onDataEntered(pinview: PinView?, fromUser: Boolean) {
                Toast.makeText(this@CreatePassword, pinview!!.value, Toast.LENGTH_SHORT).show()
            }
        })



//        btn_login.setOnClickListener(View.OnClickListener {
//            if (et_username.getText().toString().equals("admin") && et_password.getText().toString()
            if (PinView.getText().toString().equals("admin") && PinView.getText().toString()
                    .equals("admin")
            ) {
                Toast.makeText(
                    this@CreatePassword,
                    "Username and Password is correct",
                    Toast.LENGTH_SHORT
                )
                    .show()
                val intent = Intent(this@CreatePassword, AddressActivity::class.java)
                startActivity(intent)
            }
//            } else {
//                Toast.makeText(this@CreatePassword, "Username or Password is incorrect", Toast.LENGTH_SHORT)
//                    .show()
//            }
//        })
    }


}