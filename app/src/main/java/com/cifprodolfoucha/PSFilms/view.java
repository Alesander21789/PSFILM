package com.cifprodolfoucha.PSFilms;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cifprodolfoucha.PSFilms.clasesAdaptadoras.MiFragmentPagerAdapter;

public class view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        ViewPager viewPager =  findViewById(R.id.viewpager2);
        viewPager.setAdapter(new MiFragmentPagerAdapter(
                getSupportFragmentManager()));



        TabLayout tabLayout = (TabLayout) findViewById(R.id.appbartabs2);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        tabLayout.setupWithViewPager(viewPager);

    }
}
