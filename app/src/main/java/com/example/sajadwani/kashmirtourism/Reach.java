package com.example.sajadwani.kashmirtourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by SAJAD WANI on 4/23/2017.
 */

public class Reach extends Activity {
    Button air,train,bus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reach);

        air=(Button)findViewById(R.id.airb);
        air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.makemytrip.com/flight"));
                startActivity(i);
            }
        });

        train=(Button)findViewById(R.id.train);
        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.makemytrip.com/railways/"));
                startActivity(i);
            }
        });

        bus=(Button)findViewById(R.id.road);
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.makemytrip.com/bus-tickets"));
                startActivity(i);
            }
        });
    }
}
