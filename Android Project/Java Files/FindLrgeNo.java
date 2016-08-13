package com.example.second;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
     
public class FindLrgeNo extends Activity  implements OnClickListener{
	int mid=0;
	EditText et1,et2,et3,et4;
	Button btn;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_find_lrge_no);

		et1=(EditText)findViewById(R.id.et1);
		et2=(EditText)findViewById(R.id.et2);
		et3=(EditText)findViewById(R.id.et3);
		et4=(EditText)findViewById(R.id.et4);
		btn=(Button)findViewById(R.id.btn);
	   btn.setOnClickListener(this);
	}
	
	public void onClick(View v) {
	
		int fn=Integer.parseInt(et1.getText().toString());
		int sn=Integer.parseInt(et2.getText().toString());
		int tn=Integer.parseInt(et3.getText().toString());
		
		if(fn > sn && fn > tn){
			 mid=fn;
		 }
		 if(sn > fn && sn > tn){
			 mid=sn;
		 }
		 if(tn > fn && tn > sn){
			 mid=tn;
		 }
		 
		 et4.setText(String.valueOf(mid));
	
		
		
		
	}
}
