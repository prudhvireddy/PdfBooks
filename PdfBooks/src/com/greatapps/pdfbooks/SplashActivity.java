package com.greatapps.pdfbooks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

	boolean backPressed = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Handler mHandler = new Handler();
		mHandler.postDelayed(new Runnable() {

			@Override
			public void run() {
				if (backPressed == false) {
					Intent in = new Intent(SplashActivity.this,
							MainActivity.class);
					startActivity(in);
					finish();
				}

			}
		}, 3000);

	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		backPressed = true;
	}

}
