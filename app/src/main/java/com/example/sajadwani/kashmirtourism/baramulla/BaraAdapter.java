package com.example.sajadwani.kashmirtourism.baramulla;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.sajadwani.kashmirtourism.R;

/**
 * Created by SAJAD WANI on 5/5/2017.
 */

public class BaraAdapter extends PagerAdapter {
    private int[] img={R.drawable.gul,R.drawable.gulm,R.drawable.eco,R.drawable.tang,R.drawable.maha};
    private LayoutInflater inf;
    private Context ctx;

    public BaraAdapter (Context ctx){
        this.ctx=ctx;
    }
    public int getCount() {
        return img.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inf=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v=inf.inflate(R.layout.swipe,container,false);
        ImageView im=(ImageView)v.findViewById(R.id.imageview);
        // TextView tv=(TextView)v.findViewById(R.id.textView);
        im.setImageResource(img[position]);
        // tv.setText("Image"+position);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }
}

