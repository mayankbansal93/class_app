package com.example.nith;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customGrid extends BaseAdapter {
	
	private Context mcontext;
	private final String[] web;
	private final int[] imageid;
	
	public customGrid(Context c, String[] web, int[] imageid){
		mcontext = c;
		this.imageid = imageid;
		this.web = web;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return web.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View grid;
		LayoutInflater inflator = (LayoutInflater) mcontext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if(convertView == null){
			grid = new View(mcontext);
			grid = inflator.inflate(R.layout.grid_single, null);		
		} else{
			grid = (View) convertView;
		}
		TextView textView = (TextView) grid.findViewById(R.id.grid_text);
		ImageView imageView = (ImageView) grid.findViewById(R.id.grid_image);
		textView.setText(web[position]);
		imageView.setImageResource(imageid[position]);
		Log.d("CustomGrid", "grid is created");
		return grid;
	}

}
