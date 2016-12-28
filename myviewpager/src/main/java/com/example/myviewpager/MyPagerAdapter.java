package com.example.myviewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;

/**
 * Created by 宋泽港 on 2016/12/28.
 */

public class MyPagerAdapter extends PagerAdapter {
    ArrayList<View> viewlist;
    Context context;
    public MyPagerAdapter(ArrayList<View> viewlist,Context context){
        this.viewlist=viewlist;
        this.context=context;
    }

    @Override
    public int getCount() {
        return viewlist.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    /**
     *实例化view，并添加到容器中
     *
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        container.addView(viewlist.get(position));
//        View view = viewlist.get(position);
//        container.addView(view);
        return viewlist.get(position);


    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
        container.removeView(viewlist.get(position));
    }
}
