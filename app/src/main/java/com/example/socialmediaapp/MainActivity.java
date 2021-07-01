package com.example.socialmediaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.socialmediaapp.Fragment.AddFragment;
import com.example.socialmediaapp.Fragment.HomeFragment;
import com.example.socialmediaapp.Fragment.NotificationFragment;
import com.example.socialmediaapp.Fragment.ProfileFragment;
import com.example.socialmediaapp.Fragment.SearchFragment;
import com.example.socialmediaapp.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.iammert.library.readablebottombar.ReadableBottomBar;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        MainActivity.this.setTitle("My Profile");

        binding.toolbar.setVisibility(View.GONE);



        binding.bottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        selectedFragment = new HomeFragment();
                        Toast.makeText(MainActivity.this, "Home Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_notif:
                        selectedFragment = new NotificationFragment();
                        Toast.makeText(MainActivity.this, "Notification Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_search:
                        selectedFragment = new SearchFragment();
                        Toast.makeText(MainActivity.this, "Add Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_add:
                        selectedFragment =new AddFragment();
                        Toast.makeText(MainActivity.this, "Search Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_profile:

                        selectedFragment = new ProfileFragment();
                        Toast.makeText(MainActivity.this, "Profile  Selected", Toast.LENGTH_SHORT).show();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        selectedFragment).commit();


                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }


}