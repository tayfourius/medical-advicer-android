package com.example.medical_req;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.R.integer;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class diseases extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.diseases);
		final String D_ID = getIntent().getExtras().getString("D_id");
		DataHolder holder;
		
		holder = new DataHolder(getBaseContext());
		holder.open();
		Cursor c =  holder.returnData(D_ID);
		
		c.moveToFirst();
	    ArrayList<String> names = new ArrayList<String>();
	    final int[] values1 = new int[c.getCount()];
	    final String[] valuesDescRs = new String[c.getCount()];
	    int icount =0;
	    while(!c.isAfterLast()) {
	        names.add(c.getString(2));//(c.getColumnIndex("Desc")));
	        values1[icount] = Integer.parseInt(c.getString(0)) ;
	        valuesDescRs[icount] = c.getString(3);
	        icount++;
	        c.moveToNext();
	    }
	    c.close();
	     
		
		
		holder.close();
	
		
		 final ListView listview = (ListView) findViewById(R.id.listViewDiseases);
		   // String[] values = (String[]) names.toArray();
		    
		    		/*new String[] { "Android", "iPhone", "WindowsMobile",
		        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
		        "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
		        "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
		        "Android", "iPhone", "WindowsMobile" };
		    */
		    /*
		    final ArrayList<String> list = new ArrayList<String>();
		    for (int i = 0; i < values.length; ++i) {
		      list.add(values[i]);
		    }
*/
		    final StableArrayAdapter adapter = new StableArrayAdapter(this,
		            android.R.layout.simple_list_item_1, names);
		        listview.setAdapter(adapter);
		        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, final View view,
		                int position, long id) {
		              final String item = (String) parent.getItemAtPosition(position);
		              int o = parent.getId();
		              int oo = values1[position];
		              /*
		              view.animate().setDuration(2000).alpha(0)
		                  .withEndAction(new Runnable() {
		                    @Override
		                    public void run() {
		                      list.remove(item);
		                      adapter.notifyDataSetChanged();
		                      view.setAlpha(1);
		                    }
		                  });
		                  */
		              
		              Toast.makeText(getBaseContext(), "Data "+ item+" "+" f0=  "+ o + "f00=  "+ oo, Toast.LENGTH_LONG).show();
		              
		              Intent ii = new Intent(view.getContext(),View_Diseases.class );
		              String ee= String.valueOf(oo);
		              ii.putExtra("R_id", ee);
		              ii.putExtra("R_Desc", valuesDescRs[oo]);
		  			  startActivity(ii);

		              
		            }
		            

		          });
		        
		        
	}

	
		        
	
	
	
	private class StableArrayAdapter extends ArrayAdapter<String> {
		HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

	    public StableArrayAdapter(Context context, int textViewResourceId,
	        List<String> objects) {
	      super(context, textViewResourceId, objects);
	      for (int i = 0; i < objects.size(); ++i) {
	        mIdMap.put(objects.get(i), i);
	      }
	    }
	    
	    @Override
	    public long getItemId(int position) {
	      String item = getItem(position);
	      return mIdMap.get(item);
	    }

	    @Override
	    public boolean hasStableIds() {
	      return true;
	    }
	    
	}
}

