package com.example.nith;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;



public class cont_activity extends MainActivity {
	GridView grid;
	String web[] = {
			"Shubham Chaudhary", "Mayank Bansal", "Neetigy Talwar", "Digvijay Singh", "Divjot Singh", "Surya Attri"
	};

	int imageid[]={
			R.drawable.cse41, R.drawable.cse59, R.drawable.cse55, R.drawable.med50, R.drawable.cse46, R.drawable.civ52
	};
	String fp_page[]={
		"shubham.chaudhary.14224", "mayank.bansal3150807", "neetigy.talwar", "digvijayghotra17", "singhdiv14", "surya.attri"	
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_view);
		
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		customGrid adapter = new customGrid(cont_activity.this, web, imageid);
		grid = (GridView) findViewById(R.id.grid);
		grid.setAdapter(adapter);
		Log.d("MainActivity", "Main is working");
		grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				String fb_pages = "http://www.facebook.com/"+fp_page[position];
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(fb_pages));
				
				startActivity(intent);
				
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_cont, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		switch(item.getItemId()){
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
