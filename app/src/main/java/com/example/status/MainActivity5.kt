package com.example.status

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var btn5: Button = findViewById(R.id.btn5)
        btn5.setOnClickListener { val intent= Intent(this,MainActivity4::class.java);
            startActivity(intent)}


    }
}