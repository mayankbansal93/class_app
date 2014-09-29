package com.example.nith;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class show_info_ced extends ced_activity {
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
		textView2.setText("Roll No: 121" + roll);
		if(no<10){
			textView2.setText("Roll No: 1210"+no);
		} else if(no==11106 || no==11117 || no==11121 || no==11132 || no==11136 || no==11149 || no==11174 || no==10126){ 
			textView2.setText("Roll No: " + no);
		} else{
			textView2.setText("Roll No: 121"+no);
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
