package com.example.k;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.k.adapters.viewPagerAdapter;
import com.example.k.fragment.callFragment;
import com.example.k.fragment.emailFragment;
import com.example.k.fragment.messageFragment;
import com.google.android.material.tabs.TabLayout;

public class customerActivity extends AppCompatActivity {
    private viewPagerAdapter viewPageAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getString(R.string.app_name));
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        //Tabbed Activity
        tabLayout = findViewById(R.id.myTablayout);
        viewPager= findViewById(R.id.viewPager);
        viewPageAdapter = new viewPagerAdapter(getSupportFragmentManager());
        //viewPagerAdapter
        viewPageAdapter.addFragment(new callFragment(),"CALL");
        viewPageAdapter.addFragment(new messageFragment(),"MESSAGE");
        viewPageAdapter.addFragment(new emailFragment(),"EMAIL");
        viewPager.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.person);
        tabLayout.getTabAt(1).setIcon(R.drawable.cart);
        tabLayout.getTabAt(2).setIcon(R.drawable.home_delivery);


    }





}