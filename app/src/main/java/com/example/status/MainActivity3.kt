package com.example.status

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var btnprev3: Button = findViewById(R.id.btnprev3)
        btnprev3.setOnClickListener { val intent= Intent(this,MainActivity2::class.java);
            startActivity(intent)}

        var btnnxt3: Button = findViewById(R.id.btnnxt3)
        btnnxt3.setOnClickListener { val intent= Intent(this,MainActivity4::class.java);
            startActivity(intent)}
    }
}