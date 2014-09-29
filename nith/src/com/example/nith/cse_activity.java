package com.example.nith;

import com.example.nith.MainActivity;
import com.example.nith.R;
import com.example.nith.customGrid;
import com.example.nith.show_info;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class cse_activity extends MainActivity {
	GridView grid;
	String web[] = {
			"Ruchir Dhiman", "Piyush Sharma", "Robin SIngh", "Meghna Singhal", "Pritish Vadiya", "Arnav Dhiman", "Akshay Rathi",
			"Neha Raju", "Deepika Dutta", "Prateek Prashar", "Vineet Kumar", "Anmol Dogra", "Hanish Sharma", "Prakhar Vashist", 
			"Vikas Kashtriya", "Abhishek Sharma", "Himanshu Ramol", "Shaweta Chaudhary", "Akshay Sharma", "Om Prakash Sharma", 
			"Arpit Nadda", "Hemanya Tyagi", "Neeraj Yadav", "Praveen Sharma", "Anuj Chaudhary", "Tejinder Negi", "Nikhil Chandla",
			"Parth Gupta", "Mumukah Meghwal", "Prerna Sagar", "Ashish Sharma", "Prikshit Tekta", "Preetika Chandel", "Devesh Rohan",
			"Bhoodev Gangwar", "Rana Gautam", "Sahil Badyal", "Divyanshu Maithani", "Zad Basheer", "Sonal Sood", "Shubham Chaudhary",
			"Amit Sharma", "Himanshu Sharma", "Manish Chandra Gupta", "Varun Kalra", "Divjot Singh", "Anmol Kaur", "Kanwarpreet Singh",
			"Vinay Yadav", "Ringzin Angmo Bodh", "Himangni Sonkhla", "Aniket Verma", "Abhinav Mishra", "Roopesh Yadav", "Neetigy Talwar",
			"Rohit Suman", "Sachin Vardhan", "Hussainy Mir Azam", "Mayank Bansal", "Gaurav Pareek", "Aishwarya Gupta", "Amanpreet Kang",
			"Kriti Aggarwal", "Mritunjay Prasad", "Sushmita Mehta", "Sumit Singhal", "Shashi Dhiman", "Shipra Bartariya", "Sagar Karira",
			"Akshendra Pratap Singh", "Surabhi Anand Awashthi", "Santosh Kumar", "Himanshu Singh", "Akarshit Wal", "Shreya Sharma",
			"Vipul Sharma", "Vivek Sheoran", "Subhash Jyani", "Pardyot", "Indrajeet Jakhar", "Avani Sharma", "Ankit Verma", "Amit Sharma",
			"Vikrant Mirupa", "Takshsila Rawat", "Kishore Kumar", "Lokesh Meena", "Deepila Pandit", "Jyoti Dhiman"
			
	};
	int[] imageid = {
			R.drawable.cse1, R.drawable.cse2, R.drawable.cse3, R.drawable.cse4, R.drawable.cse5, R.drawable.cse6, R.drawable.cse7, R.drawable.cse8,
			R.drawable.cse9, R.drawable.cse10, R.drawable.cse11, R.drawable.cse12, R.drawable.cse13, R.drawable.cse14, R.drawable.cse15, R.drawable.cse16,
			R.drawable.cse17, R.drawable.cse18, R.drawable.cse19, R.drawable.cse20, R.drawable.cse21, R.drawable.cse22, R.drawable.cse23, R.drawable.cse24,
			R.drawable.cse25, R.drawable.cse26, R.drawable.cse27, R.drawable.cse28, R.drawable.cse29, R.drawable.cse30, R.drawable.cse31, R.drawable.cse32,
			R.drawable.cse33, R.drawable.cse34, R.drawable.cse35, R.drawable.cse36, R.drawable.cse37, R.drawable.cse38, R.drawable.taylor, R.drawable.cse40,
			R.drawable.cse41, R.drawable.cse42, R.drawable.cse43, R.drawable.cse44, R.drawable.cse45, R.drawable.cse46, R.drawable.cse47, R.drawable.cse48, 
			R.drawable.cse49, R.drawable.cse50, R.drawable.cse51, R.drawable.cse52, R.drawable.cse53, R.drawable.cse54, R.drawable.cse55, R.drawable.cse56, 
			R.drawable.cse57, R.drawable.cse58, R.drawable.cse59, R.drawable.cse60, R.drawable.cse61, R.drawable.cse62, R.drawable.cse63, R.drawable.cse64,
			R.drawable.cse65, R.drawable.cse66, R.drawable.cse67, R.drawable.cse68, R.drawable.cse69 ,R.drawable.cse70, R.drawable.cse72, R.drawable.cse73, 
			R.drawable.cse74, R.drawable.cse75, R.drawable.cse76, R.drawable.cse77, R.drawable.taylor, R.drawable.cse79, R.drawable.cse80, R.drawable.cse81,
			R.drawable.cse82, R.drawable.taylor, R.drawable.taylor, R.drawable.cse85, R.drawable.cse86, R.drawable.cse87, R.drawable.cse89, R.drawable.cse90,
			R.drawable.cse570
			
	};
	int[] roll = {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38,
			39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 73, 74,
			75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 89, 90, 11570
	};
	String fb[] = {
			"ruchir.dhiman21", "thepsychicguitarist", "robinsingh307", "meghna.singhal.33", "pritish.vaidya", "arnavdh", "akshay.rathi.946",
			"profile.php?id=100004703769927", "deepika.dutta.967", "Prateek1Prasher", "kumar.v.ch", "anmol.dogra05", "honey.k.hanish", "prakhar.vashisht.35",
			"vikas.electrro", "shanky.sharma111 ", "HimanshuRamoul", "shaweta.choudhary", "itsakshaysharma", "Omirocking.128", "arpit.nadda", "hemanya.tyagi.7",
			"neerajyadav12523", "parveen.sharma.1650332", "peelwan", "bittu.negi.5688", "nikhil.chandla", "parth.gupta.549", "mumu.meghwal",
			"prerna.sagar.7", "ashishsharma007", "prikshit.tekta", "preetika.chandel", "devesh.rohan", "profile.php?id=100007965277689", "rana.gautam.3958",
			"sahil.badyal.507", "divyanshu.maithani", " ", "sonal.sood.1806", "shubham.chaudhary.14224", "Amitsharma292", "himanshushnith",
			"ishu.manish", "vrnkalra", "singhdiv14", "anmol.kaur.75", "kanwarkajla", "profile.php?id=100006038014563", "ringzin.bodh", "himangni.sonkhla.7",
			"aniket.verma.9404", "abhinav.mishi", "roopesh.yadav.77", "neetigy.talwar", "rohit.suman.595", "sachin.vardhan.3", "hussainymir.azam",
			"mayank.bansal.3150807", "gaurav.pareek.58", "aishwarya.gupta.75457", "aman.kang.773", "kriti.aggarwal.372", "mritunjay.prasad.503",
			"sushmita.mehta.777", "sumit.singhal.169", "shashi.dhiman.779", "shipra.bartariya", "therealsagar", "akpakshendra", "anand.awasthi.716",
			"profile.php?id=100005524539794", "himanshusingh.singh06", "akarshit.wal", "profile.php?id=100008241035034", "vipulsharma94", "vivek.sheoran.7503", "subhash.jyani.73",
			"pardyot", "indrajeet.jakhar.5", "avani.sharma.96387", " ", "sharma.amit98", "vikrantmirupa", "rawat.takshshila", "kishore.pachori", 
			"mlokeshjpr", "deepali.pandit", "jyoti.dhiman.5492"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_view);
		
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		customGrid adapter = new customGrid(cse_activity.this, web, imageid);
		grid = (GridView) findViewById(R.id.grid);
		grid.setAdapter(adapter);
		Log.d("MainActivity", "Main is working");
		grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				Intent intent = new Intent(cse_activity.this, show_info.class);
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
