package com.example.practise;



import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class NotificationFirst extends Activity {

	Button notify;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification_first);
		
		notify=(Button)findViewById(R.id.notify);
		notify.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
				
				NotificationCompat.Builder nb=new NotificationCompat.Builder(getApplicationContext());
				nb.setContentTitle("First Notification");
				nb.setContentText("Hello Harsimar!!!!!!!! Succesfully created");
				nb.setSmallIcon(R.drawable.rateapp);
				
				NotificationManager nm=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
				nm.notify(0,nb.build());
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.notification_first, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
