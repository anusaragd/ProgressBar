package com.work.progressbar

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.chaos.view.PinView
import com.work.progressbar.databinding.ActivityCreatePasswordBinding
import com.work.progressbar.databinding.ActivityMainBinding


class CreatePassword : AppCompatActivity() {

    private lateinit var binding: ActivityCreatePasswordBinding
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



        (findViewById<View>(R.id.createpassword) as PinView).setAnimationEnable(true)
        (findViewById<View>(R.id.cfpassword) as PinView).setAnimationEnable(true)


//        et_username = (EditText)findViewById(R.id.et_username);
//        et_password = (EditText)findViewById(R.id.et_password);

//        btn_login.setOnClickListener(View.OnClickListener {
//            if (et_username.getText().toString().equals("admin") && et_password.getText().toString()
//                    .equals("admin")
//            ) {
                Toast.makeText(this@CreatePassword, "Username and Password is correct", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this@CreatePassword, AddressActivity::class.java)
                startActivity(intent)
//            } else {
//                Toast.makeText(this@CreatePassword, "Username or Password is incorrect", Toast.LENGTH_SHORT)
//                    .show()
//            }
//        })
    }


}