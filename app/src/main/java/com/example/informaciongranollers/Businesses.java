package com.example.informaciongranollers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.informaciongranollers.controlador.PagerController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Businesses extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager view_Pager;
    TabItem tab1,tab2,tab3;

    PagerController pager_Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaruants_activities);

        tabLayout=findViewById(R.id.tab_layout);
        view_Pager=findViewById(R.id.view_pager);
        tab1=findViewById(R.id.tabAutoescola);
        tab2=findViewById(R.id.tabPeluqueria);
        tab3=findViewById(R.id.tabGYM);


        pager_Adapter = new PagerController(getSupportFragmentManager(), tabLayout.getTabCount());
        view_Pager.setAdapter(pager_Adapter);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                view_Pager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0)
                {
                    pager_Adapter.notifyDataSetChanged();
                }
                if(tab.getPosition()==1)
                {
                    pager_Adapter.notifyDataSetChanged();
                }
                if(tab.getPosition()==2)
                {
                    pager_Adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        view_Pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}