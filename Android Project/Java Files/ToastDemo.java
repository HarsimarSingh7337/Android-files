package com.example.practise;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastDemo extends Activity{

	Button btn;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_toast_demo);
        
		
		btn=(Button)findViewById(R.id.toast);	
	    btn.setOnClickListener(new View.OnClickListener() {
		
		
		public void onClick(View v) {
		
		Toast t= Toast.makeText(getApplicationContext(),"Hello!!!  I am a Toast ",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);	
        t.show();
			
		}
	});
	}

	}
