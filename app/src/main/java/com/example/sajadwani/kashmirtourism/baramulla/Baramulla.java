package com.example.sajadwani.kashmirtourism.baramulla;

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

public class Baramulla extends Activity {
    Button showmap;
    int request_Code = 1;
    ViewPager viewPager;
    BaraAdapter baraAdapter;
    Animation Fade_in, Fade_out;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baramulla);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        baraAdapter = new BaraAdapter(this);
        viewPager.setAdapter(baraAdapter);

        listView = (ListView) findViewById(R.id.baramullalist);
        String[] value = new String[]{"1.BABA RESHI SHRINE", "2.ECO PARK", "3.GULMARG", "4.MAHARANI TEMPLE", "5.TANGMARG"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, value);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Babareshishrine.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), EcoPark.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Gulmarg.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), MaharaniTemple.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Tangmarg.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });



    }
}