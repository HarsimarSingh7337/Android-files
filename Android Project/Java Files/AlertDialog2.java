package com.example.practise;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlertDialog2 extends Activity {

	Button btn;
	TextView t1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alert_dialog2);
	
	    btn=(Button)findViewById(R.id.alert);
	    t1=(TextView)findViewById(R.id.t2);
	    btn.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
			
				AlertDialog.Builder ab=new AlertDialog.Builder(AlertDialog2.this);
				final String[] item=new String[]{"Red","Blue","Green","Yellow","Pink"};
				ab.setTitle("Select Any Color");
				ab.setItems(item, new DialogInterface.OnClickListener() {
					
					
					public void onClick(DialogInterface dialog, int which) {
						
						t1.setText("You Selected "+ item[which] +" Color");
						
					}
				});
				ab.show();
				
			}
		});
	}

	}
