package com.example.emergency;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class HelpDetails extends Activity {

	String name, phone, adress, matched;
	TextView tname, tphone, tadress, tmatched;	//tmatched is for the offerte that match the requirements of the needer
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help_details);
		
		tphone = (TextView) findViewById(R.id.telephone);
			
//		Call the helper by directly clicking his phone number
//		tphone.setOnClickListener(new View.OnClickListener() {
//			
//	    	@Override
//	    	public void onClick(View arg0) {
//	      		Intent callIntent = new Intent(Intent.ACTION_CALL);
//	    		callIntent.setData(Uri.parse("tel:+"+tphone.getText().toString().trim()));
//	    		startActivity(callIntent);
//		
//	      	} 
//	    });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.help_details, menu);
		return true;
	}

}