package com.example.practise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BillCreate extends Activity {

	EditText e1,e2,e3,e0;
	Button btn1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bill_create);
	
		e0=(EditText)findViewById(R.id.et0);
		e1=(EditText)findViewById(R.id.et1);
		e2=(EditText)findViewById(R.id.et2);
		e3=(EditText)findViewById(R.id.et3);
	    btn1=(Button)findViewById(R.id.btn);
	    btn1.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
				
				
				Intent i1=new Intent(BillCreate.this,DisplayBill.class);
				
				
			
				String prdct=e0.getText().toString();
				String prce=e1.getText().toString();
				String qt=e2.getText().toString();
				String dis=e3.getText().toString();
				
				double price=Double.parseDouble(e1.getText().toString());
				int qty=Integer.parseInt(e2.getText().toString());
				Float disc=Float.parseFloat(e3.getText().toString());
				double a =price*qty;
		     	double b =disc*a/100;
		     	double c =a-b;
		     	 Bundle bd=new Bundle();
		     	 bd.putString("tamount",String.valueOf(c));
		     	 bd.putString("pname", prdct);
		     	 bd.putString("pprice",prce);
		     	 bd.putString("pqty", qt);
		     	 bd.putString("pdis",dis);
				i1.putExtras(bd);
				startActivity(i1);
			}
		});
	}

	}
