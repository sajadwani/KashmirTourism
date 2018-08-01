package com.example.sajadwani.kashmirtourism.srinagar;

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

public class Srinagar extends Activity {
    ImageButton bu;
    Button showmap;
    int request_Code = 1;
    ViewPager viewPager;
    Animation Fade_in, Fade_out;
    SriAdapter sriAdapter;
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
                String url="https://www.google.com/maps?daddr=srinagar";
                Intent loc =new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(loc);

            }
        });


       // viewPager = (ViewPager) findViewById(R.id.viewpager);
       // sriAdapter = new SriAdapter(this);
        //viewPager.setAdapter(sriAdapter);


        listView = (ListView) findViewById(R.id.anantnaglist);
        String[] value = new String[]{"1.BADAMWARI PARK", "2.CHASHME SHAHI", "3.CHATTI PADSHAHI", "4.DAL LAKE", "5.DASTAGIR SAHAB", "6.HARI PARBAT", "7.HAZRATBAL SHRINE", "8.JAMIA MASJID", "9.KHANQAH SHAH HAMDAN", "10.MUKHDOOM SAHAB", "11.NIGEEN LAKE", "12.NISHAT GARDEN", "13.PARI MAHAL", "14.PATHAR MASJID", "15.SHALIMAR GARDEN", "16.SHANKAR ACHARAYA TEMPLE"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, value);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Badamwari.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Chashme.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Chatti.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), Dallake.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Dastagir.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), HariParbat.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), Hazratbal.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), Jamia.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), Khanqah.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), Mukhdoom.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), Nigeen.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), Nishat.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), Pari.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), Pathar.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), Shalimar.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), Shankar.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });

        viewFlipper();


    }

    private void viewFlipper(){
        ViewFlipper  simple =(ViewFlipper) findViewById(R.id.flip1);
        simple.setAutoStart(true);
        simple.setFlipInterval(1500);
    }

}


