package com.example.nith;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class eee_activity extends MainActivity {
	GridView grid;
	
	String web[]={
			"Shubham Garg","Mohit Sharma","Suprama Tiwari","Mandeep Kotti","Uttkarsh Srivastav","Abhimanyu Gurung","Vishaka Jalaik","Kritika Negi",
			"Jyoti Bhatia","Pradeep Kumar","Vanshaj Saini","Amit Kumar","Parkarsh Raut","Sameer Kumawat","Rajat Thakur","Radhika Rani","Nikhil Chandel",
			"Parikshit Pal","Meraj Ahmed","Gaurav Chauhan","Annepu Bala Krishna","Rakesh Kumar","Niddana Sai Prasad","Vipul Kumar","Meena Serawat",
			"Bala Ram Serawat","Rishabh Singh","Rabindra Kumar","Akash Prusty","Vishal Aggarawal","Anand Kumar","Sanjay Kashyap","Parijat Kumar",
			"Itie Goswami","Darshan Kumar","Shivangini Singh","Saurabh Mathur","Yatin Sharma","Roop Singh Meena","Veshali Gurung","Harshad Sharma",
			"Hemant Kumar Dhaker","Shipra Chansoriya","Deeksha Sharma","Sunil Kumar Verma","Rahul Roy Baswal","Chandan Kumar","Vaga Ram","Rohit Kumar",
			"Udaat Kalia","Abhinav Singh Chauhan","Mayank Kaundal","Reksumith Pal","Pratibha Kumari","Umesh Kumar Garg","Arpit Purohit","Rohit Thakur",
			"Saurav Singh","Kuldeep Meena","Akash Kumar Yadav",  "Sachin Kumar Singh","Dola Ram","Harmanjeet Singh","Ankur Choudhary","Apurva Sharma",
			"Ashish Kumar","Salil Soni","Siddharth Sood","Shubham Thakur","Rahul Nag","Kaushal Negi","Sauhard Jaggi","Naveen Kumar","Akhil Surya",
			"Sarthak Tomar","Arpan Bhardwaj","Shubham Dhiman","Gaurav Kumar Meena","Arun Murleedharan","Manish Kumar Mehra","Vijay Bhati",
			"Ramakant Sharma","Kanishk Dhyani","Shivendra Singh","Navjot Singh","Siddhartha Suyal","Rishab","Rahul Mahla","Medhavi Gupta",
			"Priyanka Saroj","Ajay Yadav","Prashant Palyal","Rajnish Kumar","Neeraj Kumar","Anand Kumar Meena","Sakshi Thapa","Shubham Dogra",
			"Priya Bhatti","Rohit Dhanotiya","Rajeev Kumar","Ravinder Singh"
	};
	int imageid[]={
			R.drawable.eee1, R.drawable.eee2, R.drawable.taylor, R.drawable.eee4, R.drawable.eee5, R.drawable.eee6, R.drawable.eee7, R.drawable.taylor,
			R.drawable.taylor, R.drawable.eee10, R.drawable.eee11, R.drawable.eee12, R.drawable.eee13, R.drawable.eee14, R.drawable.eee15, R.drawable.taylor,
			R.drawable.eee17, R.drawable.taylor, R.drawable.eee19, R.drawable.eee20, R.drawable.taylor, R.drawable.eee22, R.drawable.taylor, R.drawable.eee24, 
			R.drawable.taylor, R.drawable.taylor, R.drawable.taylor, R.drawable.taylor, R.drawable.eee29, R.drawable.eee30, R.drawable.eee31, R.drawable.eee32,
			R.drawable.taylor, R.drawable.eee34, R.drawable.eee35, R.drawable.eee36, R.drawable.eee37, R.drawable.eee38, R.drawable.eee39, R.drawable.eee40,
			R.drawable.eee41, R.drawable.eee42, R.drawable.eee43, R.drawable.eee44, R.drawable.taylor, R.drawable.eee46, R.drawable.eee47, R.drawable.taylor,
			R.drawable.taylor, R.drawable.eee51, R.drawable.taylor, R.drawable.eee53, R.drawable.taylor, R.drawable.eee55, R.drawable.eee56, R.drawable.eee57,
			R.drawable.eee58, R.drawable.eee59, R.drawable.eee60, R.drawable.taylor, R.drawable.eee62, R.drawable.eee63, R.drawable.eee64, R.drawable.eee65, 
			R.drawable.eee66, R.drawable.taylor, R.drawable.eee69, R.drawable.eee70, R.drawable.eee71, R.drawable.eee72, R.drawable.eee73, R.drawable.taylor,
			R.drawable.eee75, R.drawable.taylor, R.drawable.eee77, R.drawable.eee78, R.drawable.eee79, R.drawable.eee80, R.drawable.eee81, R.drawable.taylor,
			R.drawable.taylor,R.drawable.eee84, R.drawable.taylor, R.drawable.eee86, R.drawable.eee87, R.drawable.eee88, R.drawable.eee89, R.drawable.eee90,R.drawable.taylor,
			R.drawable.taylor, R.drawable.taylor, R.drawable.taylor, R.drawable.taylor, R.drawable.eee11254, R.drawable.eee11263, R.drawable.eee11269,
			R.drawable.eee11282, R.drawable.eee11289, R.drawable.eee11290, R.drawable.taylor, R.drawable.taylor 
	};
	int roll[]={
			1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,49,
			50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,92,11204,11242,
			11248,11249,11254,11263,11269,11282,11289,11290,10291,10266
	};
	String fb[]={

			"100001669104144","mohitsharma.snr"," ","mandeep.kotti","utkarsh.annie","abhiMONEYu","vishakha.jalaik"," "," ","pardeep.yadav.31521",
			"sainivanshaj","amit.kumar.9862","prakarsh.raut.9","sameer.kumawat.7967","rajatThakur011","radhika.sundan","nikhil.chandel.142",
			"parikshit.pal.710","meraj.ahmed.102","gauravchauhan93"," ","1636726155"," ","vipul.kumar.144","meena.serawat"," ","rishabh.singh.319247",
			" ","mailmeakashprusty","vishal.agarwal.98284","100004024817930","sanjay.kashyap.739326","parimishra98","itie.goswami",
			"darshan.kumar.355744","shivangini.singh.14","saurabhmathur21","yatin.sharma.3910","roopsingh.meena.528","vaishali.gurung.908",
			"harshadsharma11","hemantkumar.dhaker.9","100001253788131","deekshasharma8","100003818809078","rahulroybaswal","100005629620146"," "," ",
			"udaat.kalia"," ","i1sas","rekhsumit.paul","suryavanshipratibha","umesh.garg.1614","arpit.purohit.1","100004056979213","saurav.s.srv",
			"kuldeep.meena.1291","akashyadavvv","sachinkumar.jadaun","dola.ram.336","harmanjit.singh.963","ankur.choudhary.16","apurva.sharma.31586",
			" ","salil.soni.35","sidsood05","shubham.thakur.75470316","rahul.nag.33","kushal.negi.5"," ","nk786393","AkhilSuryaNITH",
			"sarthak.tomar.376","arpan.bhardwaj.14","shubham.dhiman.1422","gaurav.kawat","Arun.Kroeger","manishkumar.singh.92798","100005452037929",
			"rajauriya.nith.1994","kanishk.dhyani.1","y.shivendra","100004251670554","siddhartha.suyal","rishab.sangwan","rahul.mahla.50"," "," "," ",
			" ","rajnish.kumar.56027281","me.neerajrawat","anandraj.meena","sakshi.thapa.397","shubham.dogra.104","priya.bhatti.9699","dhanotia1",
			"rajeevkumarnith"," "
	};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
				super.onCreate(savedInstanceState);
				setContentView(R.layout.grid_view);
				
				getActionBar().setHomeButtonEnabled(true);
				getActionBar().setDisplayHomeAsUpEnabled(true);
				
				customGrid adapter = new customGrid(eee_activity.this, web, imageid);
				grid = (GridView) findViewById(R.id.grid);
				grid.setAdapter(adapter);
				Log.d("MainActivity", "Main is working");
				grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){

					@Override
					public void onItemClick(AdapterView<?> parent, View view, int position,
							long id) {
						Intent intent = new Intent(eee_activity.this, show_info_eee.class);
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
