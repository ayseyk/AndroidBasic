package com.example.androidbasics

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        const val SHARED_PREF_KEY = "isFirstLaunch"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate() çalıştı.")

        /*val sharedPref = getPreferences(Context.MODE_PRIVATE)
        //val sharedPref = getSharedPreferences("atmoswareApp", Context.MODE_PRIVATE) --> Farklı activitylerden erişim.

        if (sharedPref.getBoolean(SHARED_PREF_KEY, true))
            findViewById<TextView>(R.id.first_launch_text).visibility = View.VISIBLE

        val editor = sharedPref.edit()
        editor.putBoolean(SHARED_PREF_KEY, false)
        editor.apply() //Kayıt*/
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart() çalıştı.")
    }

    override fun onStart() {
        super.onStart()
        println("onStart() çalıştı.")
    }

    override fun onResume() {
        super.onResume()
        println("onResume() çalıştı.")
    }

    override fun onPause() {
        super.onPause()
        println("onPause() çalıştı.")
    }

    override fun onStop() {
        super.onStop()
        println("onStop() çalıştı.")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy() çalıştı.")
    }
}