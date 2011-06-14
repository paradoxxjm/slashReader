package org.slashroots.slashreader;

import org.example.sudoku.About;
import org.example.sudoku.R;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class feeds extends ListActivity {
	String[] newsfeeds = {
			"Jamaica Gleaner",
			"Jamaica Observer",
			"Slashroots Newsfeed"
	};
	
    @Override  
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.feeds);
 
        setListAdapter(new ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, newsfeeds));
    }    
 
    public void onListItemClick(
    ListView parent, View v,
    int position, long id) 
    {   
    	switch (position) {
    	case 1:
    		Intent i = new Intent(this, timeline.class);
    		startActivity(i);
    		break;
    	case 2:
    		break; 
    	case 3:
    		finish();
    		break;
		//More buttons go here (if any)...
    	}
    	
    	
        Toast.makeText(this, 
            "You have selected " + newsfeeds[position], 
            Toast.LENGTH_SHORT).show();
    }  
			
}
