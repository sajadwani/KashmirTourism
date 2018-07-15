package com.example.sajadwani.kashmirtourism.ganderbal;

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
import com.example.sajadwani.kashmirtourism.budgam.BudAdapter;
import com.example.sajadwani.kashmirtourism.budgam.CharariSharief;
import com.example.sajadwani.kashmirtourism.budgam.DoodhPathri;
import com.example.sajadwani.kashmirtourism.budgam.Tosamaidan;
import com.example.sajadwani.kashmirtourism.budgam.Yusmarg;

/**
 * Created by SAJAD WANI on 5/18/2017.
 */

public class Ganderbal extends Activity {
    Button showmap;
    int request_Code = 1;
    ViewPager viewPager;
    Animation Fade_in, Fade_out;
    BudAdapter budAdapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.budgam);


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        budAdapter = new BudAdapter(this);
        viewPager.setAdapter(budAdapter);


        listView = (ListView) findViewById(R.id.budgamlist);
        String[] value = new String[]{"1.MANASBAL", "2.GANGABAL", "3.SONAMARG",};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, value);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Manasbal.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Gangabal.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Sonamarg.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });



    }
}
