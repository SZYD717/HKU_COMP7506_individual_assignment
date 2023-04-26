package com.example.myapplication;

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
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.menu_home:
                                selectedFragment = new HomeFragment();
                                break;
                            case R.id.menu_connect:
                                selectedFragment = new ConnectFragment();
                                break;
                            case R.id.menu_resume:
                                selectedFragment = new ResumeFragment();
                                break;
                            case R.id.menu_personal:
                                selectedFragment = new PersonalFragment();
                                break;
                        }
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragmentContainerView, selectedFragment).commit();
                        return true;
                    }
                });
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView, new HomeFragment()).commit();
    }
}