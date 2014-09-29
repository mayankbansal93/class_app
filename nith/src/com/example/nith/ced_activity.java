package com.example.nith;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ced_activity extends MainActivity {
	GridView grid;
	
	String web[]={
			"Amandeep Kalra", "Adidya Bindra", "Nishant Gupta", "Ankit Yadav", "Arpit Sood","Puneet Negi", "Manish Chaudhary", "Praveen Bhardawaj",
			"Sakshi Sharma", "Anand Dogra", "Ashwin Goswami", "Abhinav", "Sushil Kumar", "Puyush Sukla", "Mukesh Kumar", "Hemant Kumar", "Rohit Sharma",
			"Rakesh Kumar", "Ajay Kumar", "Gagandeep", "Pawan Verma", "Nikhil Thakur", "Mani Mosam", "Vikas Meena", "Vidur Kumar", "Dheeraj Thakur",
			"Gaurav Verma", "Karnail SIngh", "Vijay Pal Bana", "Akshit Chauhan", "Shashwat Mittal", "Avinash Rawat", "Himesh Rahi", "Aditya Yadav",
			"Vibhour Sharma", "NIshant Chauhan", "Abhishek Singh", "Krisha Kalpnath", "Vijay Kumar", "Banvari Lal Meena", "Amit Meena", "Abhishek Vijay",
			"Imroz Khan", "Nishant Thakur", "Vabhav Dua", "Rajesh Chaudhary", "Shubham Shankla", "Rajarshi Bhar", "Surya Attri", "Jayram Matwa", "Upendra Kumar", "Shubham Sood",
			"Rohan Sharma", "Parth Mawai", "Navin Kumar", "Saumitra Kumar", "Savan Kadyan", "Abhi Joshi", "Kuldeep Gaurav", "Dinesh Saran", "Sahil Ishu",
			"Shristi Sarika", "Ankit Sharma", "Simranjeet Singh", "Ankit Parmar", "Yakul Dogra", "Dushyant Saini", "Saurabh Sharma", "Rohit Sharma",
			"Saurabh Gupta", "Yugant Kapoor", "Sanchit Mahajan", "Vinod Jaswal", "Vishvesh Bisht", "Mayank Jain", "Ashish Saxsena", "Mukul Jain",
			"Rohit Ananad", "Manish Mittal", "Harman Sidhu", "Md. Shahdab Razi", "Vikram Bishnoi", "Vijay Pandey", "Joyti Sheron", "Satyam Panday",
			"Parvatham Reddy", "Arun Chanotri", "Nikhil Chandel", "Ankush Chauhan", "Rajendra Singh","Ashok Bharti", "Chandan Mani", "Prahlad Kumar",
			"Vinay Kumar"
	};
	int imageid[]={
			R.drawable.civ1, R.drawable.civ2, R.drawable.civ3, R.drawable.civ4, R.drawable.civ5, R.drawable.civ6, R.drawable.civ7, R.drawable.taylor,
			R.drawable.civ9,R.drawable.civ10, R.drawable.civ11, R.drawable.civ12, R.drawable.civ13, R.drawable.civ14, R.drawable.civ15, R.drawable.civ16,
			R.drawable.civ17,R.drawable.civ18,R.drawable.taylor, R.drawable.civ20, R.drawable.civ22, R.drawable.civ23, R.drawable.civ24, R.drawable.civ25,
			R.drawable.civ26, R.drawable.civ27, R.drawable.civ28, R.drawable.civ29 ,R.drawable.civ30, R.drawable.civ31, R.drawable.civ32, R.drawable.civ33,
			R.drawable.civ34, R.drawable.civ35, R.drawable.civ36, R.drawable.civ38, R.drawable.civ39, R.drawable.civ40, R.drawable.civ41, R.drawable.civ42,
			R.drawable.civ43, R.drawable.civ44, R.drawable.civ45, R.drawable.civ46, R.drawable.civ47, R.drawable.civ48, R.drawable.civ49, R.drawable.civ50,
			R.drawable.civ52, R.drawable.taylor, R.drawable.taylor, R.drawable.civ55, R.drawable.civ56, R.drawable.taylor, R.drawable.civ58,
			R.drawable.civ59, R.drawable.civ60, R.drawable.civ61, R.drawable.civ62, R.drawable.civ63, R.drawable.civ64, R.drawable.civ65, R.drawable.civ66, 
			R.drawable.civ67, R.drawable.civ68, R.drawable.taylor, R.drawable.taylor, R.drawable.civ71, R.drawable.civ72, R.drawable.taylor, R.drawable.civ74, 
			R.drawable.civ75, R.drawable.civ76, R.drawable.civ77, R.drawable.taylor, R.drawable.civ79, R.drawable.taylor, R.drawable.taylor, R.drawable.civ82,
			R.drawable.civ83, R.drawable.taylor, R.drawable.civ85, R.drawable.taylor, R.drawable.civ87, R.drawable.civ88, R.drawable.taylor,
			R.drawable.taylor, R.drawable.taylor, R.drawable.taylor, R.drawable.taylor, R.drawable.taylor, R.drawable.taylor, R.drawable.taylor,
			R.drawable.taylor
	};
	int roll[]={
			1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,38,39,40,41,42,43,44,45,46,47,48,49,50,52,
			53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,11106,11117,11121,11132,
			11136,11149,11174,10126
	};
	String fb[]={
			"amandeep.kalra.18" , "aditya.bindra.9" , "nishant.gupta.16121" , "Ankit.Yadavansh" , "arpit.sood.92" , "puneet.negi.56" , "manish.choudhary.7771" , " " , "100002388468382" , "anand.dogra.12" ,
			"ashwing3" , "bhatt.abhi" , "sushil.kumar.90834776" , "piyush.shukla.714" , "100004314010444" , "joyHEMANT" , "rohit.sharma.14661261" , "100008371628804" , " " , "Gagandeepnaik7" ,
			"pawanverma.man" , "nikhil.thakur3" , "manimosam" , "meenavivekkumar" , "bidur.kumar.353" , "thakur.dheeraj.9" , "gauravatvkn" , "karnail.singh.1029770" , "001vijaybana" ,
			"akst.chauhan" , "shashwat.mittal.35" , "AvinashRawat1225" , "himesh.rahi" , "aditya.yadav.5" , "viibhour.sharma" , "nishant.chauhan.1675275" , "me.abhi.lucky" , "krisha.kalpnath" ,
			"100003375348087" , " " , "heart.amit.9" , "heart.amit.9" , "heart.amit.9" , "heart.amit.9" , "vaibhavd033" , "rakesh.choudhary.1276" , "shubham.sankhala.92" , "rajarshi.bhar" ,
			"surya.attri" , "jayram.matwa" , " " , "shubham.sood.5205" , "rohan.sharma.374" , " " , "navin.kumar.7169" , "saumitras2" , "sawan.kadyan" ,
			"abhijoshi1994" , "kuldeep.gaurav.71" , "sarandinesh93" , "sahil.evans.5" , "sristi.sarika" , "ankitsharma.kvs" , "simmi.saini.988" , "ankit.thakur.5851127" , "yakul.dogra" , "dushyant.saini.73" ,
			"adhyalia" , "rohit.sharma.14661261" , "saurabh.gupta.125760" , "yugant.kapur" , "sanchit.mahajan.3956" , "vinodkumar.jaiswal.735" , "uchiha.vishvesh" , " " , "ashish.saxena.35325074" , "tinnu2001" ,
			" " , "manish.mittal.180" , "harman.brar.31521" , " " , "vikram.bishnoi.581" , " " , "jyoti.sheoran.503" , "satyam0602" , " ","","","","","","","",""
	};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
				super.onCreate(savedInstanceState);
				setContentView(R.layout.grid_view);
				
				getActionBar().setHomeButtonEnabled(true);
				getActionBar().setDisplayHomeAsUpEnabled(true);
				
				customGrid adapter = new customGrid(ced_activity.this, web, imageid);
				grid = (GridView) findViewById(R.id.grid);
				grid.setAdapter(adapter);
				Log.d("MainActivity", "Main is working");
				grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){

					@Override
					public void onItemClick(AdapterView<?> parent, View view, int position,
							long id) {
						Intent intent = new Intent(ced_activity.this, show_info_ced.class);
						intent.putExtra("name", web[position]);
						intent.putExtra("image", Integer.toString(imageid[position]));
						intent.putExtra("roll", Integer.toString(roll[position]));
						intent.putExtra("fb", fb[position]);
						Log.d("button", "intent is working");
						startActivity(intent);
					}
				});
	}
}
