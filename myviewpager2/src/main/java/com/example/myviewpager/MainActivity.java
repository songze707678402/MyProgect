package com.example.myviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import adapter.MyPagerAdapter;
import bean.Bean;

public class MainActivity extends AppCompatActivity {
    ArrayList<Bean> beanlist=new ArrayList<Bean>();
    private ViewPager main_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_view=(ViewPager)  findViewById(R.id.main_view);
        //初始化数据
        initData();

        main_view.setAdapter(new MyPagerAdapter(beanlist,this));

    }

    private void initData() {
        beanlist.add(new Bean("宋泽港1",R.mipmap.guide_ima1));
        beanlist.add(new Bean("宋泽港2",R.mipmap.guide_ima2));

        beanlist.add(new Bean("宋泽港3",R.mipmap.guide_ima3));;
    }
}
