package com.dokasoft.hakkinsesleri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class acilis extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.acilis2);
		 
		 Thread acilisekrani = new Thread(){
			public void run(){
			try {
				
				sleep(7000);
				startActivity(new Intent("com.dokasoft.hakkinsesleri.ACILISIKI"));
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
