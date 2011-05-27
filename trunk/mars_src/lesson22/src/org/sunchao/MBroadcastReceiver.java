package org.sunchao;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MBroadcastReceiver extends BroadcastReceiver {
	public MBroadcastReceiver() {
		Log.d("test", "construction");
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d("test", "onReceive()");
	}

}
