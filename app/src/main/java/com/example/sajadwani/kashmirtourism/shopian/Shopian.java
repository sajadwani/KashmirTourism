package com.example.sajadwani.kashmirtourism.shopian;

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

public class Shopian extends Activity {
    Button showmap;
    int request_Code = 1;
    ViewPager viewPager;
    Animation Fade_in, Fade_out;
    ShoAdapter shoAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anantnag);


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        shoAdapter = new ShoAdapter(this);
        viewPager.setAdapter(shoAdapter);


        listView = (ListView) findViewById(R.id.anantnaglist);
        String[] value = new String[]{"1.PEER KI GALI", "2.KOUSARNAG", "3.HERPORA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, value);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Peerkigali.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Kousarnag.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Herpora.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });


    }

}

