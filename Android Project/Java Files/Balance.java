package com.example.second;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Balance extends Activity implements OnClickListener{

	
	EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,et10;
	Button btn;
	int res;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_balance);
		et1=(EditText)findViewById(R.id.et1);
		et2=(EditText)findViewById(R.id.et2);
		et3=(EditText)findViewById(R.id.et3);
		et4=(EditText)findViewById(R.id.et4);
		et5=(EditText)findViewById(R.id.et5);
		et6=(EditText)findViewById(R.id.et6);
		et7=(EditText)findViewById(R.id.et7);
		et8=(EditText)findViewById(R.id.et8);
		et9=(EditText)findViewById(R.id.et9);
		et10=(EditText)findViewById(R.id.et10);
	    btn=(Button)findViewById(R.id.btn);
	    btn.setOnClickListener(this);
	    
	}

	
	public void onClick(View v) {
		
		int fn=Integer.parseInt(et1.getText().toString());
		
		 res=fn/1000;
		 fn=fn%1000;
		 et2.setText(String.valueOf(res));
		 
			
			res=fn/500;
			fn=fn%500;
			 et3.setText(String.valueOf(res));
	
		
			res=fn/100;
			fn=fn%100;
			 et4.setText(String.valueOf(res));
			
	
	
		 		res=fn/50;
				fn=fn%50;
				 et5.setText(String.valueOf(res));
				
			
		
				res=fn/20;
				fn=fn%20;
				 et6.setText(String.valueOf(res));
				
				res=fn/10;
				fn=fn%10;
				 et7.setText(String.valueOf(res));
		 
				res=fn/5;
				fn=fn%5;
				 et8.setText(String.valueOf(res));
              
				res=fn/2;
				fn=fn%2;
				 et9.setText(String.valueOf(res));
            
				res=fn/1;
				fn=fn%1;
				 et10.setText(String.valueOf(res));

	}
}
