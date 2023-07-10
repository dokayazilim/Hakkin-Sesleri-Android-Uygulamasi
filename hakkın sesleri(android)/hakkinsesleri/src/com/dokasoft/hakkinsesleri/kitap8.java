package com.dokasoft.hakkinsesleri;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class kitap8 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.kitap8);
		 
		 LinearLayout layout = (LinearLayout) findViewById(R.id.reklam);
		 AdView adView = new AdView(this, AdSize.SMART_BANNER, "a150621108593fb");
		 layout.addView(adView);
		 AdRequest request = new AdRequest();
		 // request.setTesting(true);
		 adView.loadAd(request);

		 
		 
	}

}
