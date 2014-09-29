package com.example.nith;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class show_info_eee extends ced_activity {
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
		textView2.setText("Roll No: 122" + roll);
		
		
		if(no<10){
			textView2.setText("Roll No: 1220"+no);
		} else if(no==11204 || no==11242 || no==11248 || no==11249 || no==11254 || no==11263 || no==11269 || no==11282 || no==11290 || no==10291 || no==10266){
			textView2.setText("Roll No: " + no);
		} else{
			textView2.setText("Roll No: 122"+no);
		}

		ImageView imageView = (ImageView) findViewById(R.id.imageView1);
		imageView.setImageResource(id);

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
