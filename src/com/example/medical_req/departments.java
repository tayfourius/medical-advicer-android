package com.example.medical_req;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class departments extends Activity {

	DataHolder holder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department);
        
        
        ImageButton ibm1=(ImageButton)findViewById(R.id.imageButtonInner);
        ibm1.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View VV) {
    			// TODO Auto-generated method stub
    			Intent ii = new Intent(VV.getContext(),diseases.class );


    			ii.putExtra("D_id", "1");
    			startActivity(ii);
    			
    		}
    	});
        ImageButton ibm0=(ImageButton)findViewById(R.id.imageButtonGene);
        ibm0.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View v) {
    			Intent ni=new Intent(v.getContext(),diseases.class);
    			ni.putExtra("D_id", "0");
    			startActivity(ni);
    			// TODO Auto-generated method stub
    			
    		}
    	});
        ImageButton ibm2=(ImageButton)findViewById(R.id.imageButtonner);
        ibm2.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View v1) {
    			Intent ni=new Intent(v1.getContext(),diseases.class);
    			ni.putExtra("D_id", "2");
    			startActivity(ni);
    			// TODO Auto-generated method stub
    			
    		}
    	});
        
        ImageButton ibm3=(ImageButton)findViewById(R.id.imageButtonhear);
        ibm3.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View v3) {
    			Intent ni=new Intent(v3.getContext(),diseases.class);
    			ni.putExtra("D_id", "3");
    			startActivity(ni);
    			// TODO Auto-generated method stub
    			
    		}
    	});
        
        ImageButton ibm4=(ImageButton)findViewById(R.id.imageButtonmf);
        ibm4.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View v4) {
    			Intent ni=new Intent(v4.getContext(),diseases.class);
    			ni.putExtra("D_id", "4");
    			startActivity(ni);
    			// TODO Auto-generated method stub
    			
    		}
    	});
    		
        ImageButton ibm5=(ImageButton)findViewById(R.id.imageButtonbao);
        ibm5.setOnClickListener(new View.OnClickListener() {
    		
    		@Override
    		public void onClick(View v5) {
    			Intent ni=new Intent(v5.getContext(),diseases.class);
    			ni.putExtra("D_id", "5");
    			startActivity(ni);
    			// TODO Auto-generated method stub
    			
    		}
    	});
    	
        
    }

}
