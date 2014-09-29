package com.example.nith;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends Activity {
	GridView grid;
	String web[]={
			"CED", "EEE", "MED", "ECE", "CSE"
	};
	int imageid[]={
			R.drawable.ced, R.drawable.eee, R.drawable.med, R.drawable.ece, R.drawable.cse	
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_view);
		
		
		customGrid adapter = new customGrid(MainActivity.this, web, imageid);
		grid = (GridView) findViewById(R.id.grid);
		grid.setAdapter(adapter);
		Log.d("MainActivity", "Main is working");
		grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				
				if(position==0){
					Intent in = new Intent(MainActivity.this, ced_activity.class);
					startActivity(in);
				} else if(position==1){
					Intent in = new Intent(MainActivity.this, eee_activity.class);
					startActivity(in);
				} else if(position==2){
					Intent in = new Intent(MainActivity.this, med_activity.class);
					startActivity(in);
				} else if(position==3){
					Intent in = new Intent(MainActivity.this, ece_activity.class);
					startActivity(in);
				} else{
					Intent in = new Intent(MainActivity.this, cse_activity.class);
					startActivity(in);
				}
				
				Log.d("button", "intent is working");
				
			}
		});
		
		
		
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		switch(item.getItemId()){
		case R.id.action_cont:
			Intent in = new Intent(MainActivity.this, cont_activity.class);
			startActivity(in);
			return true;
		case R.id.action_feed:
			Intent sendIntent = new Intent(Intent.ACTION_VIEW);
			sendIntent.setType("plain/text");
			sendIntent.setData(Uri.parse("shubhamchaudhary376@gmail.com"));
			sendIntent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
			sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { "mayankbansal933@gmail.com" });
			sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
			sendIntent.putExtra(Intent.EXTRA_TEXT, "If you have any suggestions, please do mail us. :-)");
			startActivity(sendIntent);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}
