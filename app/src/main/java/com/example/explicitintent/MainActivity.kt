package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonintent=findViewById<Button>(R.id.btnintent)

        buttonintent.setOnClickListener {
            //open a new activity
            intent= Intent(applicationContext,emptyActivity2::class.java)
            startActivity(intent)
        }
    }

}