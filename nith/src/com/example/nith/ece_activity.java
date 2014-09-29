package com.example.nith;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ece_activity extends MainActivity {
	
	GridView grid;
	String web[]={
			"Parul Thakur", "Shikhar Sharma", "Saurabh", "Akshay Panth", "Dhruv Thakur", "Amit Kumar", "Vartika Verma", "Shobit Kanasal", "Vipul Kaushal",
			"Shivani", "Kumar Vishal", "Subhinder Singh", "Aashish Singh", "Ashish Dhiman", "Karan Pathak", "Sachin Patyal", "Kusum Jarial",
			"Ishann Chauhan", "Raghav Sodd", "Swapnil Kashyab", "Naina Dhingra", "Anmol Jain", "Vipan Thakur", "Aditi Negi", "Dinesh Kumar", "Amit Kumar",
			"Vivek Tomar", "Arinav Jain", "Ajay Saini", "Abhay Jamwal", "Nilesh Katoch", "Manish Kandoria", "Anshul Sharma", "Aparna Sharma", "Sandeep Maddheshiya",
			"Prakash Haritwal", "Anshul Sharma", "Samriti Attrey", "Neha Chauhan", "Ankush Sharma", "Gattu Priyanka", "Anamika Heer", "Tarun Hiteshi", 
			"Kumudh Jindal", "Rajeet Kumar", "Ankur Sondhi", "Sakshi Sharma", "Yoyesh Kumar", "Tarun Thakur", "Narendra Sepat", "Vinay Kumar", "Moahammad Imraan",
			"Nikhil Sharma", "Nalla Sahithi", "Raman Kashyab", "Manuj Guleria", "Vivek Kumar", "K Srinath", "Sanjay Kumar", "Azad Pathak", "Vivek Singh",
			"Tanuja Seervi", "Saurabh Agarwal", "Saurabh Gupta", "Manish Vishnoi", "Satyam Kumar", "Amandeep Singh", "Mainsh Kumar", "Priyanka Meena", 
			"Sanu Kumar", "Bhupendra Meena", "Saragadam Kiran", "Deepak Yadav", "Shivansh Awasthi", "Rishavh Sinena", "Vishal Chaudhary", "Mukesh Kumar",
			"Vijay Kumar", "Dinesh Meena", "Aman Bhardawaj", "Akanksha Kalia", "Deepak Gautam", "Shivam Mittal", "Ajay Singh", "Aman Dixit", "Vikas Singh",
			"Sachin Sachdeva", "Bhargav Chaudhary", "Sushain Bhatt", "Kartik Thakur"
	};
	
	int imageid[]={
			R.drawable.ece1, R.drawable.ece2, R.drawable.ece3, R.drawable.ece4, R.drawable.ece5, R.drawable.ece6, R.drawable.ece7, R.drawable.ece8,
			R.drawable.ece9, R.drawable.ece10, R.drawable.ece11, R.drawable.ece12, R.drawable.ece13, R.drawable.ece14, R.drawable.ece15, R.drawable.ece16,
			R.drawable.taylor, R.drawable.ece18, R.drawable.ece19, R.drawable.ece20, R.drawable.ece21, R.drawable.taylor, R.drawable.ece23, R.drawable.ece24,
			R.drawable.ece25, R.drawable.ece26, R.drawable.ece27, R.drawable.ece28, R.drawable.ece29, R.drawable.ece30, R.drawable.ece31, R.drawable.ece32,
			R.drawable.ece33, R.drawable.taylor, R.drawable.ece35, R.drawable.ece36, R.drawable.ece37, R.drawable.ece38, R.drawable.ece39, R.drawable.ece40, 
			R.drawable.taylor, R.drawable.taylor, R.drawable.ece43, R.drawable.ece44, R.drawable.ece45, R.drawable.ece46, R.drawable.ece47, R.drawable.ece48,
			R.drawable.ece49, R.drawable.ece50, R.drawable.ece51, R.drawable.ece52, R.drawable.ece53, R.drawable.taylor, R.drawable.ece55, R.drawable.taylor,
			R.drawable.taylor, R.drawable.ece58, R.drawable.ece59, R.drawable.ece60, R.drawable.ece61, R.drawable.ece62, R.drawable.ece63, R.drawable.ece64,
			R.drawable.ece65, R.drawable.ece66, R.drawable.ece67, R.drawable.ece68, R.drawable.ece69, R.drawable.ece70, R.drawable.ece71, R.drawable.ece72,
			R.drawable.ece73, R.drawable.ece74, R.drawable.ece75, R.drawable.taylor, R.drawable.ece77, R.drawable.ece78, R.drawable.ece79, R.drawable.ece80,
			R.drawable.ece81, R.drawable.ece84, R.drawable.ece85, R.drawable.ece86, R.drawable.ece87, R.drawable.taylor,
			R.drawable.ece89, R.drawable.taylor, R.drawable.ece92, R.drawable.ece93
	};
	
	int roll[]={
		1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,
		54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,84,85,86,87,88,89,91,92,93
	};
	String[] fb={
			"parul.thakur.792" , "shikhar.sharma.7758" , "CoolDefender" , "aksh.addixo" , "metalplusclassicrock" , "av1995" , "vartika.verma.16" , "shobhit.kansal1" ,
			"redbull420" , " " , "vishal.rai.dhiman" , "shubhinderRANA" , "aashish.rana.3760" , "ashish.dhiman.752" , "karan.pathak.7399" , "patialsachin" , " " , "ichauhan" ,
			"raghav.sood.735" , "swapnil.kashyap.948" , "naina.dhingra.7" , "profile.php?id=100006265360346" , "jhon.hmr" , "aditi.negi.142" , " " , "Dadasibanadaun" , "vivek.tomer.507" ,
			"arj28" , "ajay.saini.311493" , "jamwal1994" , "nilesh.katoch" , "shrarti.bcha1" , "anshusharma1994" , "profile.php?id=100004222448949" , "sandeep.maddheshiya.35" ,
			"prakashharitwal436"  , "khaadu" , "samriti.sweet" , "neha.chauhan.9849" , "ankush.sharma.411" , "gattu.priyanka.3" , "anamika.heer.7" , "tarun.hiteshi" ,
			"kumud.jindal.9" , "ranjit.in" , "ankur.sondhi.39" , "100001582575801" , "profile.php?id=100002399454338" , "100005136586498" , "narendra.sepat" , "100002318688156" ,
			"imran.mohammad.184" , "niiks03" , "hithi.chinni" , "raman.kashyap.3133" , "manuj.guleria" , " " , "srinath2603" , "ThakurSnjy" , "azad.pathak.7" ,
			"thenextassassin" , "tanuja.seervi.3" , "saurabhxaviers" , "100004043055566" , "manish.vishnoi2" , "satyam.kumar.735944" , "amandeep593" ,
			"manishkumar.singh.92798" , "priyanka.meena.90813" , "sonukumar.tiwari.31" , "bhupendra.meena.186" , "kirankumar.saragadam" , "deepak.yadav.9465177" ,
			"shivansh.awasthi.96" , "rishabh.sinena" , " " , " " , "vijay.kumar.3152" , "dinsh93" , "abhardwaj93" , "akanksha.kalia.7" ,
			"royaldeepakgautam" , "shivam.mittal.16940" , "100001636094657" , "aman2302" , "vikasashmike" , "sachin.sachdeva.963" , " " , "sushain.bhat.3" ,
			"kartik.thakur.773"	
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_view);
		
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		customGrid adapter = new customGrid(ece_activity.this, web, imageid);
		grid = (GridView) findViewById(R.id.grid);
		grid.setAdapter(adapter);
		Log.d("MainActivity", "Main is working");
		grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				Intent intent = new Intent(ece_activity.this, show_info_ece.class);
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
