package com.dokasoft.hakkinsesleri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class acilis3 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.activity_hak);
	Button button1=(Button)findViewById(R.id.button1);
	Button button2=(Button)findViewById(R.id.button2);
	Button button3=(Button)findViewById(R.id.button3);

button3.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
		startActivity(new Intent("com.dokasoft.hakkinsesleri.LIST"));
			
		}
	});

	
	
	
	button2.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
		startActivity(new Intent("com.dokasoft.hakkinsesleri.HAYATI"));
			
		}
	});
	
	
	
	
	button1.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
		startActivity(new Intent("com.dokasoft.hakkinsesleri.ISTIKLAL"));
			
		}
	});
	}

}
