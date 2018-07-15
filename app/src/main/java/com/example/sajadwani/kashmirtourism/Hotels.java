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

public class Hotels extends Activity {
    Button one,to,three,four,five,six,seven,eight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotels);

        one=(Button)findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://homestays.makemytrip.com/search-170-srinagar?gclid=Cj0KEQjw2-bHBRDEh6qk5b6yqKIBEiQAFUz29tFbnLcO5pCs6kcTKbUqToK96cTdRNGSDqF5Nzes4O0aAiNq8P8HAQ&cmp=SEM%7CD%7CHS%7CG%7CHtl_Srinagar_BMM%7CHtl_Srinagar_Hotel_BMM%7CRegular%7C&ef_id=WPOM6AAAAK_Z8iTV%3A20170421124506%3As"));
                startActivity(i);
            }
        });

            to = (Button) findViewById(R.id.two);
            to.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://www.hotelscombined.in/Place/Anantnag.htm"));
                    startActivity(i);
                }
            });

            three = (Button) findViewById(R.id.three);
            three.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://heyhotel.in/Bandipora_Jammu_And_Kashmir/"));
                    startActivity(i);
                }
            });
            four = (Button) findViewById(R.id.four);
            four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://www.tripadvisor.in/SmartDeals-g317095-Gulmarg_Baramulla_District_Kashmir_Jammu_and_Kashmir-Hotel-Deals.html"));
                    startActivity(i);
                }
            });
            five = (Button) findViewById(R.id.five);
            five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://www.tripadvisor.in/ShowUserReviews-g297623-d6542525-r230100012-Mayfair_Hotel-Srinagar_Srinagar_District_Kashmir_Jammu_and_Kashmir.html"));
                    startActivity(i);
                }
            });
            six = (Button) findViewById(R.id.six);
            six.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://www.hotelscombined.in/Place/Ganderbal.htm"));
                    startActivity(i);
                }
            });
            seven = (Button) findViewById(R.id.seven);
            seven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://www.tripadvisor.in/SmartDeals-g12375096-Kulgam_District_Kashmir_Jammu_and_Kashmir-Hotel-Deals.html"));
                    startActivity(i);
                }
            });
            eight = (Button) findViewById(R.id.eight);
            eight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://www.tripadvisor.in/HotelsNear-g2282645-d4092591-Jama_Masjid_Shopian-Pulwama_Pulwama_District_Kashmir_Jammu_and_Kashmir.html"));
                    startActivity(i);
                }
            });
        }
    }
