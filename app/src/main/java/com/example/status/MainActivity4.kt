package com.example.status

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var btnnxt6: Button = findViewById(R.id.btnnxt6)
        btnnxt6.setOnClickListener { val intent= Intent(this,MainActivity5::class.java);
            startActivity(intent)}

        var btnprev4: Button = findViewById(R.id.btnprev4)
        btnprev4.setOnClickListener { val intent= Intent(this,MainActivity3::class.java);
            startActivity(intent)}
    }
}