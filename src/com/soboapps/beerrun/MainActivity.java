package com.soboapps.beerrun;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Bacardi Breezer Button
		Button btnBacardib = (Button) findViewById(R.id.bBacardib);
		btnBacardib.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.BACARDIBMAIN"));
			}
		});
		
		// Bartles and Jaymes Button
		Button btnBj = (Button) findViewById(R.id.bBj);
		btnBj.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.BJMAIN"));
			}
		});
		
		// Budweiser Button
		Button btnBudweiser = (Button) findViewById(R.id.bBud);
		btnBudweiser.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.BUDMAIN"));
			}
		});
		
		// Bud Light Button
		Button btnBudlight = (Button) findViewById(R.id.bBudlight);
		btnBudlight.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.BUDLIGHTMAIN"));
			}
		});
		
		// Bud Light Lime Button
		Button btnBudlightlime = (Button) findViewById(R.id.bBudlightlime);
		btnBudlightlime.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.BUDLIGHTLIMEMAIN"));
			}
		});
		
		// Bud Light Platinum Button
		Button btnBudlightplat = (Button) findViewById(R.id.bBudlightplat);
		btnBudlightplat.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.BUDLIGHTPLATMAIN"));
			}
		});
		
		// Colt 45 Button
		Button btnColt45 = (Button) findViewById(R.id.bColt45);
		btnColt45.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.COLT45MAIN"));
			}
		});
		
		// Coors Light Button
		Button btnCoorslight = (Button) findViewById(R.id.bCoorslight);
		btnCoorslight.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.COORSLIGHTMAIN"));
			}
		});
		
		
		// Corona Extra Button
		Button btnCoronaextra = (Button) findViewById(R.id.bCoronaextra);
		btnCoronaextra.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.CORONAEXTRAMAIN"));
			}
		});
		
		
		// Dos Esquis Button
		Button btnDosequis = (Button) findViewById(R.id.bDosequis);
		btnDosequis.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.DOSEQUISMAIN"));
			}
		});
		
		// Guinness Button
		Button btnGuinness = (Button) findViewById(R.id.bGuinness);
		btnGuinness.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.GUINNESSMAIN"));
			}
		});
		
		// Heineken Button
		Button btnHeineken = (Button) findViewById(R.id.bHeineken);
		btnHeineken.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.HEINEKENMAIN"));
			}
		});
		
		// MGD Button
		Button btnMgd = (Button) findViewById(R.id.bMgd);
		btnMgd.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.MGDMAIN"));
			}
		});
		
		// Mike's Hard Lemonade Button
		Button btnMikeshard = (Button) findViewById(R.id.bMikeshard);
		btnMikeshard.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.MIKESHARDMAIN"));
			}
		});
		
		// Miller Lite Button
		Button btnMillerlite = (Button) findViewById(R.id.bMillerlite);
		btnMillerlite.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.MILLERLITEMAIN"));
			}
		});
		
		// Rolling Rock Button
		Button btnRollingrock = (Button) findViewById(R.id.bRollingrock);
		btnRollingrock.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.ROLLINGROCKMAIN"));
			}
		});
		
		// Samuel Adams Button
		Button btnSamadams = (Button) findViewById(R.id.bSamadams);
		btnSamadams.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.SAMADAMSMAIN"));
			}
		});
		
		// Smirnoff Ice Button
		Button btnSmirnoffice = (Button) findViewById(R.id.bSmirnoffice);
		btnSmirnoffice.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.SMIRNOFFICEMAIN"));
			}
		});
		
		// Yuengling Button
		Button btnYuengling = (Button) findViewById(R.id.bYuengling);
		btnYuengling.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {				
               startActivity(new Intent("com.soboapps.beerrun.YUENGLINGMAIN"));
			}
		});
		
		
	}
		public boolean onCreateOptionsMenu(Menu menu){
			super.onCreateOptionsMenu(menu);
			MenuInflater aboutnc = getMenuInflater();
			aboutnc.inflate(R.menu.main_menu, menu);
			return true;
		}
		
		public boolean onOptionsItemSelected(MenuItem item){
			switch(item.getItemId()){
			case R.id.menuAbout:
				startActivity(new Intent("com.soboapps.beerrun.ABOUT"));
				return true;
			case R.id.menuDonate:
				startActivity(new Intent("com.soboapps.beerrun.DONATE"));
				return true;			
			}
			return false;
		}
}