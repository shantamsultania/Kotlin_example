package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // This is a basic kotlin application with intents and other functions
        //toast in kotlin, intents and many more.
        //there are two types of intents explicit and implicit
        //lets try the, both out
        //in explicit intent the destination is known to us where as implicit intent the destination is not known to us.
    implicit_btn.setOnClickListener {

        val message : String = typed_text.text.toString()
        val intent =Intent(this,second_activity::class.java)
        intent.putExtra("key",message)
        startActivity(intent)
        Toast.makeText(this,"You choose implicit intent",Toast.LENGTH_LONG).show()
    }

        explicit_btn.setOnClickListener {

            val message : String = typed_text.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            startActivity(Intent.createChooser(intent,"this is an example of explicit intent"))
            Toast.makeText(this,"You choose Explicit intent",Toast.LENGTH_LONG).show()
        }


    }
}
