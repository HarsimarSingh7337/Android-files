
package com.example.practise;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayBill extends Activity {

	
	EditText ett1;
	TextView tv1,tv2,tv3,tv4;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_bill);
		
		ett1=(EditText)findViewById(R.id.edit1);
		tv1=(TextView)findViewById(R.id.pname);
		tv2=(TextView)findViewById(R.id.pprice);
		tv3=(TextView)findViewById(R.id.pqty);
		tv4=(TextView)findViewById(R.id.pdiscount);
		
	   Bundle bdd=getIntent().getExtras();
	   
	   ett1.setText(bdd.getCharSequence("tamount"));
	   tv1.setText(bdd.getCharSequence("pname"));
	   tv2.setText(bdd.getCharSequence("pprice"));
	   tv3.setText(bdd.getCharSequence("pqty"));
	   tv4.setText(bdd.getCharSequence("pdis"));
	
	}

	}
