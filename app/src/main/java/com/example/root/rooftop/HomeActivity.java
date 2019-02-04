package com.example.root.rooftop;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {


    //widgets
    private TabLayout mTabLayout;
    public ViewPager mViewPager;

    //vars
    public SectionsPagerAdapter mPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mTabLayout = findViewById(R.id.tabs);
        mViewPager = findViewById(R.id.viewpager_container);
        setupViewPager();
    }

    private void setupViewPager(){
        mPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mPagerAdapter.addFragment(new HomeFragment());
        mPagerAdapter.addFragment(new AddFragment());
        mPagerAdapter.addFragment(new SavedFragment());
        mPagerAdapter.addFragment(new ProfileFragment());



        mViewPager.setAdapter(mPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.getTabAt(0).setText(getString(R.string.fragment_home));
        mTabLayout.getTabAt(1).setText(getString(R.string.fragment_Add));
        mTabLayout.getTabAt(2).setText(getString(R.string.fragment_saved));
        mTabLayout.getTabAt(3).setText(getString(R.string.fragment_profile));


    }
}
