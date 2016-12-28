package adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myviewpager.R;

import java.util.ArrayList;

import bean.Bean;

/**
 * Created by 宋泽港 on 2016/12/28.
 */

public class MyPagerAdapter extends PagerAdapter{
    public ArrayList<Bean>list;
    public Context context;

    public MyPagerAdapter(ArrayList<Bean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view=View.inflate(context, R.layout.view_item,null);
        ImageView imageView= (ImageView) view.findViewById(R.id.view_tu);
        TextView textView= (TextView) view.findViewById(R.id.view_text);
        imageView.setImageResource(list.get(position%list.size()).getTupian());
        textView.setText(list.get(position%list.size()).getTitle());
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
        container.removeView((View)object);

    }
}
