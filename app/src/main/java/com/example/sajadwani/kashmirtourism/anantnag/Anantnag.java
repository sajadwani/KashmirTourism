package com.example.sajadwani.kashmirtourism.anantnag;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.example.sajadwani.kashmirtourism.MainActivity;
import com.example.sajadwani.kashmirtourism.R;
import com.example.sajadwani.kashmirtourism.Second;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by SAJAD WANI on 4/23/2017.
 */

public class Anantnag extends Activity {

    Button showmap;
    int request_Code = 1;
    ViewPager viewPager;
    Animation Fade_in, Fade_out;
    AnantAdapter anantAdapter;
    ViewFlipper viewFlipper;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anantnag);


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        anantAdapter = new AnantAdapter(this);
        viewPager.setAdapter(anantAdapter);


        listView = (ListView) findViewById(R.id.anantnaglist);
        String[] value = new String[]{"1.ACHABAL", "2.DAKSUM", "3.KOKERNAG", "4.MATAN TEMPLE", "5.PAHALGAM",};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, value);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Achabal.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Daksum.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Kokarnag.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), Mattantemple.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Pahalgam.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });


    }
}