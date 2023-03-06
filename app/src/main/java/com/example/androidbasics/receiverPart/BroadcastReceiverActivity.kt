package com.example.androidbasics.receiverPart

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidbasics.R

class BroadcastReceiverActivity : AppCompatActivity() {

    private lateinit var receiver: AirplaneModeChangeReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast_receiver)

        receiver = AirplaneModeChangeReceiver()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver, it) // alıcı kaydediliyor, meydana gelince dinleyecek
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}