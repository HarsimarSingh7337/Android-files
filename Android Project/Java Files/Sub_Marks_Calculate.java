package com.example.First;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Sub_Marks_Calculate extends Activity implements OnClickListener {

	EditText ett1,ett2,ett3,ett4,ett5,ett6,ett7,ett8;
	Button btn1;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub__marks__calculate);
		ett1=(EditText)findViewById(R.id.et1);
		ett2=(EditText)findViewById(R.id.et2);
		ett3=(EditText)findViewById(R.id.et3);
		ett4=(EditText)findViewById(R.id.et4);
		ett5=(EditText)findViewById(R.id.et5);
		ett6=(EditText)findViewById(R.id.et6);
		ett7=(EditText)findViewById(R.id.et7);
		ett8=(EditText)findViewById(R.id.et8);
	    btn1=(Button)findViewById(R.id.btn);
		btn1.setOnClickListener(this);
	
		}
	

	@Override
	public void onClick(View v) {

		int sum,av;
		int no1=Integer.parseInt(ett1.getText().toString());
		int no2=Integer.parseInt(ett2.getText().toString());
		int no3=Integer.parseInt(ett3.getText().toString());
		int no4=Integer.parseInt(ett4.getText().toString());
		int no5=Integer.parseInt(ett5.getText().toString());
     	
		sum=no1+no2+no3+no4+no5;
		ett6.setText(String.valueOf(sum));
	
		av=sum/5;
		ett7.setText(String.valueOf(av));
	
		if(av >=90){
			ett8.setText("Exellent");
		}
		
		else if(av >=80 && av <90){
			ett8.setText("Very Good");
		}
		
		else if(av>=60 && av<80){
			ett8.setText("Good");
		}
		else if(av>=50 && av<60){
			ett8.setText("Fair");
		}
		
		else{
			ett8.setText("Participant");
		}
		
		
	}
	}

	
	
	
