package com.dokasoft.hakkinsesleri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Hak extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.acilis);
		 
		 Thread acilisekrani = new Thread(){
			public void run(){
			try {
				
				sleep(5000);
				startActivity(new Intent("com.dokasoft.hakkinsesleri.ACILIS"));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			finally{
				finish();
				
				
			}	
				
				
			} 
			 
			 
			 
		 };
		acilisekrani.start(); 
		 
		 
	}

}
