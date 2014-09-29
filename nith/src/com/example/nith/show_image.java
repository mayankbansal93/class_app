package com.example.nith;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class show_image extends MainActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show_image_layout);
		
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		Intent in = getIntent();
		String[] url = in.getStringArrayExtra("imageurl");
		
		WebView wv = (WebView) findViewById(R.id.web_view);
		wv.getSettings().setBuiltInZoomControls(true);
		wv.loadUrl(url[0]);
	}
}
