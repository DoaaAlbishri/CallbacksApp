package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

            Log.d("MainActivity3","onCreate()")
            Toast.makeText(applicationContext, "onCreate() Activity 3", Toast.LENGTH_LONG).show()
        }
        override fun onStart() {
            super.onStart()
            Log.d("MainActivity3","onStart()")
            Toast.makeText(applicationContext, "onStart() Activity 3", Toast.LENGTH_LONG).show()
        }

        override fun onResume() {
            super.onResume()
            Log.d("MainActivity3","onResume()")
            Toast.makeText(applicationContext, "onResume() Activity 3", Toast.LENGTH_LONG).show()
        }

        override fun onRestart() {
            super.onRestart()
            Log.d("MainActivity3","onRestart()")
            Toast.makeText(applicationContext, "onRestart() Activity 3", Toast.LENGTH_LONG).show()
        }

        override fun onPause() {
            super.onPause()
            Log.d("MainActivity3","onPause()")
            Toast.makeText(applicationContext, "onPause() Activity 3", Toast.LENGTH_LONG).show()
        }

        override fun onStop() {
            super.onStop()
            Log.d("MainActivity3","onStop()")
            Toast.makeText(applicationContext, "onStop() Activity 3", Toast.LENGTH_LONG).show()
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d("MainActivity3","onDestroy()")
            Toast.makeText(applicationContext, "onDestroy() Activity 3", Toast.LENGTH_LONG).show()
        }
    }