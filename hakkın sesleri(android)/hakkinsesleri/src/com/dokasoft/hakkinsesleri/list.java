package com.dokasoft.hakkinsesleri;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

public class list extends ListActivity{
    String stringarray[]={"�lahi, Emrinin Avare Bir Mahkumudur Alem","Ge�enler Varsa �slam'�n �u �i�nenmi� Diyar�ndan","�� Beyinsiz Kafan�n Derdine �� Milyon Halk","Atiyi Karanl�k G�rerek Azmi B�rakmak","Ya Rab! Bu U�ursuz Gecenin Yok Mu Sabah�","Olma ya...Tabi...Biri �nsan Biri Hayvan","Bir Zamanlar Bizde Millet Hem de Ne Milletmi�iz","Bir Y���n Kundak��dan Yang�n G�renler Milleti","��k da Bir Seyret Bahar�n Cu�-i Renga-Rengini","Pek Hazin Bir Mevlid Gecesi"};
	@Override
	protected void onListItemClick(android.widget.ListView l, View v,
			int position, long id) {
		if (position == 0)
		{
			startActivity(new Intent("com.dokasoft.hakkinsesleri.KITAPBIR"));	
			
		}
		else if(position == 1)
		{
			
			startActivity(new Intent("com.dokasoft.hakkinsesleri.KITAPIKI"));		
		}	
		else if(position == 2)
		{
			
			startActivity(new Intent("com.dokasoft.hakkinsesleri.KITAPUC"));		
		}	
		else if(position == 3)
		{
			
			startActivity(new Intent("com.dokasoft.hakkinsesleri.KITAPDORT"));		
		}	
		else if(position == 4)
		{
			
			startActivity(new Intent("com.dokasoft.hakkinsesleri.KITAPBES"));		
		}	
		else if(position == 5)
		{
			
			startActivity(new Intent("com.dokasoft.hakkinsesleri.KITAPALTI"));		
		}	
		else if(position == 6)
		{
			
			startActivity(new Intent("com.dokasoft.hakkinsesleri.KITAPYEDI"));		
		}	
		else if(position == 7)
		{
			
			startActivity(new Intent("com.dokasoft.hakkinsesleri.KITAPSEKIZ"));		
		}	
		else if(position == 8)
		{
			
			startActivity(new Intent("com.dokasoft.hakkinsesleri.KITAPDOKUZ"));		
		}	
		else if(position == 9)
		{
			
			startActivity(new Intent("com.dokasoft.hakkinsesleri.KITAPON"));		
		}	
		
	
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stringarray));
	}

}
