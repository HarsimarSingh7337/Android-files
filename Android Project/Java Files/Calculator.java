package com.example.First;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends Activity {

	float no1,no2,res;
	EditText et1;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdiv,bmul,bsub,badd,beql,clear;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
	    findAllView();
		
	}
           
		public void findAllView(){
	    	 
	    	et1=(EditText)findViewById(R.id.textbox);
	 		b0=(Button)findViewById(R.id.zero);
	 		b1=(Button)findViewById(R.id.one);
	 		b2=(Button)findViewById(R.id.two);
	 		b3=(Button)findViewById(R.id.three);
	 		b4=(Button)findViewById(R.id.four);
	 		b5=(Button)findViewById(R.id.five);
	 		b6=(Button)findViewById(R.id.six);
	 		b7=(Button)findViewById(R.id.seven);
	 		b8=(Button)findViewById(R.id.eight);
	 		b9=(Button)findViewById(R.id.nine);
	 		bdiv=(Button)findViewById(R.id.divide);
	 		bmul=(Button)findViewById(R.id.multiply);
	 		bsub=(Button)findViewById(R.id.subtract);
	 		badd=(Button)findViewById(R.id.add);
	 		beql=(Button)findViewById(R.id.equal);
	 		clear=(Button)findViewById(R.id.clear);
           	     
	     
	     
	 		b0.setOnClickListener(new View.OnClickListener() {	
		 	   public void onClick(View v) {
	     		 		   
		       et1.setText(et1.getText()+"0");
		  }
	 	});
	 		
	 		b1.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			       et1.setText(et1.getText()+"1");
			  }
		 	});
	 		
	 		b2.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			       et1.setText(et1.getText()+"2");
			  }
		 	});
	 		
	 		b3.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			       et1.setText(et1.getText()+"3");
			  }
		 	});
	 		
	 		b4.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			       et1.setText(et1.getText()+"4");
			  }
		 	});
	 		
	 		b5.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			       et1.setText(et1.getText()+"5");
			  }
		 	});
	 		
	 		b6.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			       et1.setText(et1.getText()+"6");
			  }
		 	});
	 		
	 		b7.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			       et1.setText(et1.getText()+"7");
			  }
		 	});
	 		
	 		b8.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			       et1.setText(et1.getText()+"8");
			  }
		 	});
	 		
	 		b9.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			       et1.setText(et1.getText()+"9");
			  }
		 	});
	 		
	 		badd.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			       no1=Float.parseFloat(et1.getText().toString());
			       et1.setText(null);
			  }
		 	});
	 		
	 		bsub.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			        no1=Float.parseFloat(et1.getText().toString());
			       et1.setText(null);
			  }
		 	});
	 		
	 		bmul.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			        no1=Float.parseFloat(et1.getText().toString());
			        et1.setText(null);
			  }
		 	});
	 		
	 		bdiv.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			        no1=Float.parseFloat(et1.getText().toString());
			       et1.setText(null);
			  }
		 	});
	 		
	 		beql.setOnClickListener(new View.OnClickListener() {	
			 	   public void onClick(View v) {
		     		 		   
			       no2=Integer.parseInt(et1.getText().toString());
			         res=no1+no2;
			         et1.setText(String.valueOf(res));
			    	   
			       
			  }
		 	});
	 		
	 		clear.setOnClickListener(new View.OnClickListener() {
			   public void onClick(View v) {
					
			   et1.setText("");
		}
		});
	


}
}

