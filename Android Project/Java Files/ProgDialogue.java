package com.example.practise;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ProgDialogue extends Activity {

   Button btn;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prog_dialogue);
		
		btn=(Button)findViewById(R.id.progbtn);
		btn.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
			
			 ProgressDialog pd=new ProgressDialog(getApplicationContext());
			 pd.setTitle("Downloads");
			 pd.setMessage("Downloading Harsimar.txt");
			pd.show();
			}
		});
	   
	}
}
