package org.slashroots.slashreader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class slashreader extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        startActivity(new Intent( this, feeds.class));
    }
}
