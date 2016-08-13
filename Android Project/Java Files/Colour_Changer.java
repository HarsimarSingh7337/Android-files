package com.example.practise;



import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Colour_Changer extends Activity {

	Button red,green,mazenta,white,blue,black,cyan,yellow;
	View rl1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_colour__changer);

		rl1=(View)findViewById(R.id.rl1);
		red=(Button)findViewById(R.id.red);
		blue=(Button)findViewById(R.id.blue);
		green=(Button)findViewById(R.id.green);
		yellow=(Button)findViewById(R.id.yellow);
		white=(Button)findViewById(R.id.white);
		mazenta=(Button)findViewById(R.id.magenta);
		cyan=(Button)findViewById(R.id.cyan);
		black=(Button)findViewById(R.id.black);
	
		red.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				rl1.setBackgroundColor(Color.RED);
			}
		});
	
		blue.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				rl1.setBackgroundColor(Color.BLUE);
				
			}
		});
	    
	    green.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				rl1.setBackgroundColor(Color.GREEN);
			}
		});
	
	    yellow.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
	           rl1.setBackgroundColor(Color.YELLOW);
				
			}
		});
	
	   mazenta.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			rl1.setBackgroundColor(Color.MAGENTA);
			
		}
	});
	
	   cyan.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			rl1.setBackgroundColor(Color.CYAN);
			
		}
	});
	
	   white.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			rl1.setBackgroundColor(Color.WHITE);
			
		}
	});
	
      black.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			rl1.setBackgroundColor(Color.BLACK);
			
		}
	});	
	}
	}
