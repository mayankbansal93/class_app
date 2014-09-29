package com.example.nith;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class show_info extends MainActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_info);
		
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		Intent in = getIntent();
		String name = in.getStringExtra("name");
		String roll = in.getStringExtra("roll");
		String image = in.getStringExtra("image");
		String temp = in.getStringExtra("fb");
		
		final String fb = "http://www.facebook.com/"+temp;
		
		int id = Integer.parseInt(image);
		int no = Integer.parseInt(roll);
		
		TextView textview = (TextView)findViewById(R.id.textView1);
		textview.setText("Name: " + name);
		
		TextView textView2 = (TextView) findViewById(R.id.textView2);
		textView2.setText("Roll No: 125" + roll);
		if(no<10){
			textView2.setText("Roll No: 1250"+no);
		} else if(no==11570){ 
			textView2.setText("Roll No: 11570");
		} else{
			textView2.setText("Roll No: 125"+no);
		}
		
		ImageView imageView = (ImageView) findViewById(R.id.imageView1);
		imageView.setImageResource(id);
		
		
		if(no==50){
			imageView.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String imageUrl = "https://www.facebook.com/photo.php?fbid=4597871186346&set=t.100003417235355&type=3&theater";
					Intent in = new Intent(show_info.this, show_image.class);
					in.putExtra("imageurl", imageUrl);
					
				}
			});
		}
		
		ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton1);
		imageButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ft = new Intent(Intent.ACTION_VIEW, Uri.parse(fb));
				startActivity(ft);
				
			}
		});
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
	}
}
