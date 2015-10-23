package com.uhs.datawedge.edit;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
//import com.motorolasolutions.emdk.datawedge;

public class MainActivity extends Activity{
	

		private static final String TAG = null;
		
		
		Intent intent;
		
		
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			
			PackageManager pm = getPackageManager();
			
			pm.setComponentEnabledSetting(
					new ComponentName(this, "com.motorolasolutions.emdk.datawedge.dwSettings"),

					PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
			
		    
	//finish();
		
		}
	}



