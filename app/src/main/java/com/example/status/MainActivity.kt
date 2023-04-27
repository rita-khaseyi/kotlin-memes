package com.example.status

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnNxt: Button = findViewById(R.id.btnNxt)
        btnNxt.setOnClickListener { val intent= Intent(this,MainActivity2::class.java);
            startActivity(intent)}
    }
}