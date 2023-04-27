package com.example.status

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.status.R.id.btnprev

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btnNxt1: Button = findViewById(R.id.btnNxt1)
        btnNxt1.setOnClickListener { val intent= Intent(this,MainActivity3::class.java);
            startActivity(intent)}

        var btnprev: Button = findViewById(R.id.btnprev)
        btnprev.setOnClickListener { val intent= Intent(this,MainActivity::class.java);
            startActivity(intent)}

    }
}