package com.example.sajadwani.kashmirtourism.kulgam;

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
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.example.sajadwani.kashmirtourism.R;

/**
 * Created by SAJAD WANI on 4/23/2017.
 */

public class Kulgam extends Activity {
    ImageButton bu;
    Button showmap;
    int request_Code = 1;
    ViewPager viewPager;
    Animation Fade_in, Fade_out;
    KulAdapter kulAdapter;
    ListView listView;
    ViewFlipper viewFlipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anantnag);

        bu=(ImageButton)findViewById(R.id.map1);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com/maps?daddr=kulgam";
                Intent loc =new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(loc);

            }
        });


        //viewPager = (ViewPager) findViewById(R.id.viewpager);
        //kulAdapter = new KulAdapter(this);
        //viewPager.setAdapter(kulAdapter);


        listView = (ListView) findViewById(R.id.anantnaglist);
        String[] value = new String[]{"1.AHARBAL"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, value);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Aharbal.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });


        viewFlipper();


    }

    private void viewFlipper(){
        ViewFlipper simple =(ViewFlipper) findViewById(R.id.flip1);
        simple.setAutoStart(true);
        simple.setFlipInterval(1500);
    }

}
