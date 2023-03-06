package com.example.androidbasics.receiverPart

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        //intent broadcast hakkında bilgi içerir.
        val isAirplaneModeEnabled = intent?.getBooleanExtra("state", false) ?: return

        if (isAirplaneModeEnabled)
            Toast.makeText(context, "Uçak modu açıldı!", Toast.LENGTH_LONG).show()
        else
            Toast.makeText(context, "Uçak modu kapandı!", Toast.LENGTH_LONG).show()
    }
}