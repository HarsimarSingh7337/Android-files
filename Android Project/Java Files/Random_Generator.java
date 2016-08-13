package com.example.second;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Random_Generator extends Activity implements OnClickListener{

	String hd="Head",tl="Tail";
	EditText et1;
	Button btn;
	ImageView img;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_random__generator);
	    et1=(EditText)findViewById(R.id.et1);
	    img=(ImageView)findViewById(R.id.img1);
	    btn=(Button)findViewById(R.id.btn);
	    btn.setOnClickListener(this);
	    
	
	}

	
	public void onClick(View arg0) {
	
		Random rd=new Random();
		
		int a=rd.nextInt(2);
		if(a==0){
			et1.setText(hd);
		}
		else{
			et1.setText(tl);
		}
      //  Animation anm= new Animation();	
        
	}
	}

