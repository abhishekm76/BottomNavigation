package com.kjfmbktgl4.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//TODO add navigation and click listener
		BottomNavigationView btmNav = findViewById(R.id.bottom_navigation);
		btmNav.setOnNavigationItemSelectedListener(navListener);
		// TODO this controls the first view to home
		getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new HomeFragment()).commit();

	}
	private BottomNavigationView.OnNavigationItemSelectedListener navListener =
			new BottomNavigationView.OnNavigationItemSelectedListener() {
				@Override
				public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
					Fragment selectedFragment = null;
					switch (menuItem.getItemId()){
						case R.id.menu:
							selectedFragment = new HomeFragment();
							break; //TODO can add other fragments here once created
						case R.id.add:
							selectedFragment = new HomeFragment();
							break;
						case R.id.home:
							selectedFragment = new HomeFragment();
							break;

					}
					getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,selectedFragment).commit();

					// TODO return to show that the menu icon for the item is selected
					return true;
				}
			};
}
