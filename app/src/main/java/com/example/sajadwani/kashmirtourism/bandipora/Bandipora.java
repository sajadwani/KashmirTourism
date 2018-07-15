package com.example.sajadwani.kashmirtourism.bandipora;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.sajadwani.kashmirtourism.R;

/**
 * Created by SAJAD WANI on 4/23/2017.
 */

public class Bandipora extends Activity {
    Button showmap;
    int request_Code = 1;
    ViewPager viewPager;
    BandiAdapter bandiAdapter;
    Animation Fade_in, Fade_out;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bandipora);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        bandiAdapter = new BandiAdapter(this);
        viewPager.setAdapter(bandiAdapter);


        listView = (ListView) findViewById(R.id.bandiporalist);
        String[] value = new String[]{"1.BABA SHAKOOR DIN SHRINE", "2.WATLAB", "3.WULAR LAKE",};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, value);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), BabaShakoorDinShrine.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Watlab.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), WularLake.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });



    }
}


