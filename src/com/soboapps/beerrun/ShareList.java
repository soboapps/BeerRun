package com.soboapps.beerrun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShareList extends Activity{
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selecteditems);

        
		// Share Selected Items Button
		Button btnShareItems = (Button) findViewById(R.id.shareMyList);
		btnShareItems.setOnClickListener(new View.OnClickListener() {
	    		
	    		@Override
	    		public void onClick(View v) {
	    			Intent sendIntent = new Intent(Intent.ACTION_VIEW);
					sendIntent.putExtra("sms_body", true); 
	                sendIntent.setType("vnd.android-dir/mms-sms");
	                startActivity(sendIntent);
	    		}
    		});
    }
}