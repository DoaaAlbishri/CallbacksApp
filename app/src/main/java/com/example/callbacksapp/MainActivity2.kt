package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button=findViewById(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        Log.d("MainActivity2","onCreate()")
        Toast.makeText(applicationContext, "onCreate() Activity 2", Toast.LENGTH_LONG).show()
    }
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity2","onStart()")
        Toast.makeText(applicationContext, "onStart() Activity 2", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity2","onResume()")
        Toast.makeText(applicationContext, "onResume() Activity 2", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity2","onRestart()")
        Toast.makeText(applicationContext, "onRestart() Activity 2", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity2","onPause()")
        Toast.makeText(applicationContext, "onPause() Activity 2", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity2","onStop()")
        Toast.makeText(applicationContext, "onStop() Activity 2", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity2","onDestroy()")
        Toast.makeText(applicationContext, "onDestroy() Activity 2", Toast.LENGTH_LONG).show()
    }
}