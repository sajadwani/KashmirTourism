package com.example.sajadwani.kashmirtourism;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.sajadwani.kashmirtourism.anantnag.Achabal;
import com.example.sajadwani.kashmirtourism.anantnag.Anantnag;
import com.example.sajadwani.kashmirtourism.anantnag.Kokarnag;
import com.example.sajadwani.kashmirtourism.anantnag.Pahalgam;
import com.example.sajadwani.kashmirtourism.bandipora.Bandipora;
import com.example.sajadwani.kashmirtourism.baramulla.Baramulla;
import com.example.sajadwani.kashmirtourism.baramulla.Gulmarg;
import com.example.sajadwani.kashmirtourism.budgam.Budgam;
import com.example.sajadwani.kashmirtourism.budgam.DoodhPathri;
import com.example.sajadwani.kashmirtourism.budgam.Yusmarg;
import com.example.sajadwani.kashmirtourism.ganderbal.Ganderbal;
import com.example.sajadwani.kashmirtourism.ganderbal.Sonamarg;
import com.example.sajadwani.kashmirtourism.kulgam.Kulgam;
import com.example.sajadwani.kashmirtourism.kupwara.Kupwara;
import com.example.sajadwani.kashmirtourism.shopian.Shopian;
import com.example.sajadwani.kashmirtourism.srinagar.Srinagar;

/**
 * Created by SAJAD WANI on 4/23/2017.
 */

public class Sort extends Activity {
    ImageButton adv, most, budget;
    Button hist;
    ListView listView;

    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.sort);
        adv = (ImageButton) findViewById(R.id.imbt);
        adv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.tripsavvy.com/kashmir-places-to-visit-srinagar-side-trips-1539462"));
                startActivity(i);
            }
        });

        hist = (Button) findViewById(R.id.imbt2);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://koausa.org/Monuments/Chapter4.html"));
                startActivity(i);
            }
        });
        most = (ImageButton) findViewById(R.id.imbt3);
        most.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.tripadvisor.in/Attractions-g297619-Activities-c57-t58-Jammu_and_Kashmir.html"));
                startActivity(i);
            }
        });
        budget = (ImageButton) findViewById(R.id.imbt4);
        budget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.royalsaffari.com/kashmir-info/lakes-in-kashmir.html"));
                startActivity(i);
            }
        });

    }
}
