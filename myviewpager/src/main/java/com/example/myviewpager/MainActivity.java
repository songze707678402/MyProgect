package com.example.myviewpager;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private Button tiyan;

    ArrayList<View> viewlist = new ArrayList<View>();
    private View view3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.main_vp);
        initView();
        initadapter();


    }


    private void initadapter() {
        viewPager.setAdapter(new MyPagerAdapter(viewlist,MainActivity.this));

        tiyan = (Button) view3.findViewById(R.id.tiyan);
        tiyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }

    private void initView() {
        View view1 = View.inflate(this, R.layout.pager1, null);
        View view2 = View.inflate(this, R.layout.pager2, null);
         view3 =  View.inflate(this, R.layout.pager3, null);
        viewlist.add(view1);
        viewlist.add(view2);
        viewlist.add(view3);


    }


}
