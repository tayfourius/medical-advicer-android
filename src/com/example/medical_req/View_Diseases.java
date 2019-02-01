package com.example.medical_req;

import java.util.ArrayList;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

public class View_Diseases  extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.view_diseas);
		
		final String R_ID = getIntent().getExtras().getString("R_id");
		final String R_Desc = getIntent().getExtras().getString("R_Desc");
		
		
		DataHolder holder;
		
		holder = new DataHolder(getBaseContext());
		holder.open();
		Cursor c =  holder.returnData2(R_ID);
		
		c.moveToFirst();
	    ArrayList<String> names = new ArrayList<String>();
	    String[] Namess = new String[c.getCount()];
	    String[] Descs = new String[c.getCount()];
	    int icount =0;
	    
	    if(c.moveToFirst())
		{
			do{
				   names.add(c.getString(2));//(c.getColumnIndex("Desc")));
			        //  values1[icount] = c.getString(2);
			        Namess[icount] = c.getString(2);
			        Descs[icount] = "يقترح ب :"+'\n' + c.getString(3)+'\n'+ "يثبت ب :" +'\n'+c.getString(4) +'\n' + "التدبير  :" +'\n'+ c.getString(5)+'\n'+'\n';
			        icount++;
			    		
			}while(c.moveToNext());
		}
	    
	    /*
	    while(!c.isAfterLast()) {
	        names.add(c.getString(2));//(c.getColumnIndex("Desc")));
	        //  values1[icount] = c.getString(2);
	        Namess[icount] = c.getString(2);
	        Descs[icount] = "يثبت ب :" + c.getString(3)+'\n'+ c.getString(4) +'\n' + c.getString(5);
	        icount++;
	        c.moveToNext();
	    }
	    c.close();
	     */
		
		
		holder.close();
		
		int i= Namess.length;
		
		TextView tDR = (TextView)findViewById(R.id.textViewDR);
		tDR.setText(R_Desc);
		tDR.setBackground(getResources().getDrawable(R.drawable.b3));
		
		if(i>0)
		{
		
			TextView t1 = (TextView)findViewById(R.id.textView1);
			t1.setText(Descs[0]);
			t1.setBackground(getResources().getDrawable(R.drawable.b1));
			TextView t2 = (TextView)findViewById(R.id.textView2);
			t2.setText(Namess[0]);
			t2.setBackground(getResources().getDrawable(R.drawable.b2));
		}
		if(i>1)
		{
			TextView t3 = (TextView)findViewById(R.id.textView3);
			t3.setText(Descs[1]);
			
			TextView t4 = (TextView)findViewById(R.id.textView4);
			t4.setText(Namess[1]);
			t3.setBackground(getResources().getDrawable(R.drawable.b1));
			t4.setBackground(getResources().getDrawable(R.drawable.b2));
		}
		
		if(i>2)
		{
			TextView t3 = (TextView)findViewById(R.id.textView5);
			t3.setText(Descs[2]);
			
			TextView t4 = (TextView)findViewById(R.id.textView6);
			t4.setText(Namess[2]);
			t3.setBackground(getResources().getDrawable(R.drawable.b1));
			t4.setBackground(getResources().getDrawable(R.drawable.b2));
		}
		if(i>3)
		{
			TextView t3 = (TextView)findViewById(R.id.textView7);
			t3.setText(Descs[3]);
			
			TextView t4 = (TextView)findViewById(R.id.textView8);
			t4.setText(Namess[3]);
			
			t3.setBackground(getResources().getDrawable(R.drawable.b1));
			t4.setBackground(getResources().getDrawable(R.drawable.b2));
		}
		if(i>4)
		{
			TextView t3 = (TextView)findViewById(R.id.textView9);
			t3.setText(Descs[4]);
			
			TextView t4 = (TextView)findViewById(R.id.textView10);
			t4.setText(Namess[4]);
			t3.setBackground(getResources().getDrawable(R.drawable.b1));
			t4.setBackground(getResources().getDrawable(R.drawable.b2));
		}
		if(i>5)
		{
			TextView t3 = (TextView)findViewById(R.id.textView11);
			t3.setText(Descs[5]);
			
			TextView t4 = (TextView)findViewById(R.id.textView12);
			t4.setText(Namess[5]);
			t3.setBackground(getResources().getDrawable(R.drawable.b1));
			t4.setBackground(getResources().getDrawable(R.drawable.b2));
		}
		if(i>6)
		{
			TextView t3 = (TextView)findViewById(R.id.textView13);
			t3.setText(Descs[6]);
			
			TextView t4 = (TextView)findViewById(R.id.textView14);
			t4.setText(Namess[6]);
			t3.setBackground(getResources().getDrawable(R.drawable.b1));
			t4.setBackground(getResources().getDrawable(R.drawable.b2));
		}
		if(i>7)
		{
			TextView t3 = (TextView)findViewById(R.id.textView15);
			t3.setText(Descs[7]);
			
			TextView t4 = (TextView)findViewById(R.id.textView16);
			t4.setText(Namess[7]);
			t3.setBackground(getResources().getDrawable(R.drawable.b1));
			t4.setBackground(getResources().getDrawable(R.drawable.b2));
		}
		if(i>8)
		{
			TextView t3 = (TextView)findViewById(R.id.textView17);
			t3.setText(Descs[8]);
			
			TextView t4 = (TextView)findViewById(R.id.textView18);
			t4.setText(Namess[8]);
			t3.setBackground(getResources().getDrawable(R.drawable.b1));
			t4.setBackground(getResources().getDrawable(R.drawable.b2));
		}
		if(i>9)
		{
			TextView t3 = (TextView)findViewById(R.id.textView19);
			t3.setText(Descs[9]);
			
			TextView t4 = (TextView)findViewById(R.id.textView20);
			t4.setText(Namess[9]);
			t3.setBackground(getResources().getDrawable(R.drawable.b1));
			t4.setBackground(getResources().getDrawable(R.drawable.b2));
		}
		if(i>10)
		{
			TextView t3 = (TextView)findViewById(R.id.textView21);
			t3.setText(Descs[10]);
			
			TextView t4 = (TextView)findViewById(R.id.textView22);
			t4.setText(Namess[10]);
			t3.setBackground(getResources().getDrawable(R.drawable.b1));
			t4.setBackground(getResources().getDrawable(R.drawable.b2));
		}
		if(i>11)
		{
			TextView t3 = (TextView)findViewById(R.id.textView23);
			t3.setText(Descs[11]);
			
			TextView t4 = (TextView)findViewById(R.id.textView24);
			t4.setText(Namess[11]);
			t3.setBackground(getResources().getDrawable(R.drawable.b1));
			t4.setBackground(getResources().getDrawable(R.drawable.b2));
		}
	}

}
