package com.example.practise;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DialogueDemo extends Activity {

	Button btn1;
	TextView t2;
	String b=".";
	    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dialogue_demo);
	
		btn1=(Button)findViewById(R.id.a1);
	    t2=(TextView)findViewById(R.id.alerttext);
	    btn1.setOnClickListener(new View.OnClickListener() {
		
		
		public void onClick(View v) {
		
	 AlertDialog.Builder ab=new AlertDialog.Builder(DialogueDemo.this);
     ab.setTitle("Attention Please");
	  ab.setMessage("do you want to proceed");
	 ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
	                  
		  t2.setText("Process Cancelled");
			    	
			}
		});
		  
		  ab.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			
			
			public void onClick(DialogInterface dialog, int which) {
				
				t2.setText("Processing");
				
		  
			}
		});
 
			ab.show();  	 
			
		}
	});
	
	
		
	}
}
