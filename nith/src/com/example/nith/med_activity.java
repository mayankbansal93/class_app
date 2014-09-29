package com.example.nith;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class med_activity extends MainActivity {
	GridView grid;
	
	String web[]={
			"HIMANSHU KASHYAP","YOGESH KUMAR  NIZZER","MANDEEP SAINI","PULKIT DHAUNDYAL","AMAN SAINI","MANISH  DHIMAN","SIDDHARTH  KAPOOR",
			"TAVISH  UPADHAYAY","VINAY  KUMAR","AMULYA BHURIA","ATISH  KUMAR","PRAHLAD  BHATTI","ADITYA MITTAL","KAMLESH  SHARMA","ROHIT  PATIAL",
			"MAHENDER  SINGH","ANIL  KUMAR","ROHIT  DHIMAN","MANDEEP  SYAL","SHUBHAM  AGGARWAL","PANKAJ  THAKUR","SAHIL  KHANDELWAL","HARPREET  SINGH",
			"ASHISH  KUMAR","YOGESH  DAROCH","KULDEEP  KUSHWAHA","SUMIT  KUMAR","RAJAT  CHAUHAN","PUSHAP  RAJ  THAKUR","ARPAN  GUPTA",
			"ABHISHEK  KAUNDAL","HARSHIT  YADAV","MOHD.  FURQAN","RISHABH  KUMAR","SHUBHAM  DHIMAN","UMESH  KUMAR  MEENA ","NITIN  KUMAR",
			"SANGRAM  SINGH","PANKAJ  DAVIAL","DIGVIJAY  KATOCH","YATIN  MAHINDROO","VIJAY  KUMAR","TUSHAR  SHARMA","ANKIT  DHIMAN","ANIRUDH  BAGDE",
			"VIMLESH  KUMAR ","DIGVIJAY  SINGH","MILAN  CHOUDHARY","SUNIL  KUMAR","NEERAJ  BHUYAN","GOVIND  KUMAR  KAJI","ROHIT  KRISHNA  AWASTHI",
			"ASHISH  MALVIYA","VIJAY  PRASAD","MOHIT RANA","KARUN  SAINI","PRAVEEN  RAWAT","RIKKIN  SHARMA","MANISH  SINGH","ADITYA  DUGAR",
			"VISHAV  SHARMA","VIKAS  KUMAR  KUSHWAHA","SURYA  CHANDAN  BHASKAR","ABHISHEK  SHARMA","AKHIL  MAHAJAN","RAVI  SAUKTA","INTETI  VINEETH",
			"AYUSH  CHAND","NEERAJ  KUMAR","SHWETA  KUMARI  SAROJ","PIYUSH  PANTHARI","RAHUL  BHARDWAJ","RAJAT  PRAKASH  MISHRA","AKSHAY  JOSHI",
			"DEVENDRA  SINGH  BHAKUNI","SHIVAM RATHORE","ASHUTOSH  SHARMA","ANKIT  NEGI","AGNIDIPTO  GIRI","RAVI  PRAKASH  SINGH","AMAN  SHARMA",
			"ROSHAN  SINGH","TUSHAR  KANSAL","SATYAM  GOEL","ROHIT  THAKUR","AMIT  CHOUDHARY","ARVIND KUMAR","ANKIT PANDEY","ANSHUMAN  CHOUDHARY"
	};
	int imageid[]={
			R.drawable.med1, R.drawable.med2, R.drawable.med3, R.drawable.med4, R.drawable.med5, R.drawable.med6, R.drawable.med7, R.drawable.med8,
			R.drawable.med9, R.drawable.med10, R.drawable.med11, R.drawable.med12, R.drawable.med13, R.drawable.med14, R.drawable.med15, R.drawable.med16,
			R.drawable.med17, R.drawable.med18, R.drawable.med20, R.drawable.med21, R.drawable.med22, R.drawable.med23, R.drawable.med24,
			R.drawable.taylor, R.drawable.med27, R.drawable.med28, R.drawable.med29, R.drawable.med30, R.drawable.taylor, R.drawable.med32, R.drawable.taylor,
			R.drawable.med34, R.drawable.med35, R.drawable.med36, R.drawable.taylor, R.drawable.med38, R.drawable.med39, R.drawable.med40, R.drawable.taylor,
			R.drawable.med42, R.drawable.med44, R.drawable.med45, R.drawable.med46, R.drawable.taylor, R.drawable.med48, R.drawable.taylor, R.drawable.med50,
			R.drawable.med51, R.drawable.med52, R.drawable.taylor, R.drawable.med54, R.drawable.med55, R.drawable.med56, R.drawable.med57, R.drawable.med58,
			R.drawable.med59, R.drawable.taylor, R.drawable.med61, R.drawable.med62, R.drawable.med63, R.drawable.taylor, R.drawable.med65, R.drawable.med66,
			R.drawable.med69, R.drawable.med70, R.drawable.taylor, R.drawable.med72, R.drawable.med73, R.drawable.taylor, R.drawable.med75, R.drawable.med76,
			R.drawable.med77, R.drawable.med78, R.drawable.med79, R.drawable.med80, R.drawable.med81, R.drawable.med82, R.drawable.med83, R.drawable.med85,
			R.drawable.taylor, R.drawable.med87, R.drawable.med88,R.drawable.med92, R.drawable.med93, R.drawable.med11380, R.drawable.med11385, R.drawable.med11306, R.drawable.med11346, R.drawable.med11305
	};
	int roll[]={
			1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20,21,22,23,24,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,44,45,46,47,48,49,50,51,52,
			53,54,55,56,57,58,59,60,61,62,63,64,65,66,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,85,86,87,88,92,93,11380,11385,11306,11346,11305
	};
	String fb[]={
			"himanshu.kashyap.568","yash.nizzer","mandeep.saini.3975","pulkit.dhaundyal","100002175835603","Manishd94","sidharth.kapoor.792",
			"tavish.upadhyay","100006349111967","amulya.bhuria","atish.kumar.330","prahladbhatti.bhatti","aditya.mittal.5667","kamlesh.sharma.946517",
			"rohitpatial89","100001653685966","100002542844734","rohit.dhiman.9279","syalmandeep","shubham.aggarwal.3139241","Pankaj.thakur.raftaar",
			"sahil.khandelwal.33","100005506713702","","yogesh.daroch","kuldeep.kushwaha3","100003156257623","rajat.chauhan.79","","arpan.gupta947",
			" ","harshit.yadav.547389","mohd.furqan.16568","rishi.borne","shubham.dhiman.3975","umesh.meena.7737","nitinkumarsal748","sheoran.sangram",
			"100003996546978","digvijay.katoch.7","yatin.mahindroo","vijaydinvincible","tusharguitar","ankit.dhiman.16547008","anirudh.bagde.3"," ",
			"digvijayghotra17","milan.chaudhary.319","100002570922597","neeraj.bhuyan","govind.kaji.5","rohit.awasthi.5492","ashish.malviya.1806",
			"vijay.prasad.14","mohit.rana.509","karun.saini.982","","rikkin.sharma","manishsingh.manishsingh.792","coolmagician"," ",
			"vikas.kushwaha.940","suryachandan.bhashkar","100004247015557","akhil.mahajan.750","ravisaukta","inteti.vineeth","ayush.chand.90"," ",
			"shwetakumarisaroj","piyush.panthari","rahul.bhardwaj.1650","rajat.p.mishra","akshayjoshi567","devendra.singhbhakuni","shivam.rathore.5",
			"ashuapache3","ankit.negi.5437","agnidipto.giri","","amank.sharma95","roshanrathore.415","tushar.bsr","satyam.goel.12","rohit380",
			"amit11385","arvind1024","nanuankit","anshumanc1"
	};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
				super.onCreate(savedInstanceState);
				setContentView(R.layout.grid_view);
				
				getActionBar().setHomeButtonEnabled(true);
				getActionBar().setDisplayHomeAsUpEnabled(true);
				
				customGrid adapter = new customGrid(med_activity.this, web, imageid);
				grid = (GridView) findViewById(R.id.grid);
				grid.setAdapter(adapter);
				Log.d("MainActivity", "Main is working");
				grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){

					@Override
					public void onItemClick(AdapterView<?> parent, View view, int position,
							long id) {
						Intent intent = new Intent(med_activity.this, show_info_med.class);
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
