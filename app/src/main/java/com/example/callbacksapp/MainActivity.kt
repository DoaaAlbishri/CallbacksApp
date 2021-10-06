package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","onCreate()")
        Toast.makeText(applicationContext, "onCreate()", Toast.LENGTH_LONG).show()
        button=findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","onStart()")
        Toast.makeText(applicationContext, "onStart() Activity 1", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","onResume()")
        Toast.makeText(applicationContext, "onResume() Activity 1", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","onRestart()")
        Toast.makeText(applicationContext, "onRestart() Activity 1", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","onPause()")
        Toast.makeText(applicationContext, "onPause() Activity 1", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","onStop()")
        Toast.makeText(applicationContext, "onStop() Activity 1", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","onDestroy()")
        Toast.makeText(applicationContext, "onDestroy() Activity 1", Toast.LENGTH_LONG).show()
    }
}