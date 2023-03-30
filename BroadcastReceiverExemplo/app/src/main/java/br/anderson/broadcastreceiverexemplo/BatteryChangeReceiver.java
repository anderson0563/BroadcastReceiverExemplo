package br.anderson.broadcastreceiverexemplo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class BatteryChangeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
            Toast.makeText(context, "Bateria mudou!", Toast.LENGTH_SHORT).show();
            System.out.println("1");
        }
    }
}