package com.example.sajadwani.kashmirtourism.kupwara;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
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
import com.example.sajadwani.kashmirtourism.shopian.Herpora;
import com.example.sajadwani.kashmirtourism.shopian.Kousarnag;
import com.example.sajadwani.kashmirtourism.shopian.Peerkigali;
import com.example.sajadwani.kashmirtourism.shopian.ShoAdapter;
import com.example.sajadwani.kashmirtourism.shopian.Shopian;

/**
 * Created by SAJAD WANI on 5/6/2017.
 */

public class Kupwara extends Activity {
    Button showmap;
    int request_Code = 1;
    ViewPager viewPager;
    Animation Fade_in, Fade_out;
    KupAdapter kupAdapter;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anantnag);


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        kupAdapter = new KupAdapter(this);
        viewPager.setAdapter(kupAdapter);


        listView = (ListView) findViewById(R.id.anantnaglist);
        String[] value = new String[]{"1.LOLAB VALLEY", "2.BANGUS VALLEY"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, value);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Lolab.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Bangus.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });


    }

}

