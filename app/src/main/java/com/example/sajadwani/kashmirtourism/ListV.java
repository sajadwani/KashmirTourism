package com.example.sajadwani.kashmirtourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sajadwani.kashmirtourism.anantnag.Anantnag;
import com.example.sajadwani.kashmirtourism.bandipora.Bandipora;
import com.example.sajadwani.kashmirtourism.baramulla.Baramulla;
import com.example.sajadwani.kashmirtourism.budgam.Budgam;
import com.example.sajadwani.kashmirtourism.ganderbal.Ganderbal;
import com.example.sajadwani.kashmirtourism.kulgam.Kulgam;
import com.example.sajadwani.kashmirtourism.kupwara.Kupwara;
import com.example.sajadwani.kashmirtourism.shopian.Shopian;
import com.example.sajadwani.kashmirtourism.srinagar.Srinagar;

/**
 * Created by SAJAD WANI on 4/23/2017.
 */

public class ListV extends Activity {

    String[] values = new String[]{"ANANTNAG", "BANDIPORA", "BARAMULA", "BUDGAM", "GANDERBAL", "KULGAM", "KUPWARA", "SHOPIAN", "SRINAGAR"};

    int[] IMAGES = {R.drawable.anantnag, R.drawable.bandipora, R.drawable.baramulla, R.drawable.budgam, R.drawable.ganderbal, R.drawable.kulgam, R.drawable.kupwara, R.drawable.shopian, R.drawable.srinagar};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listv);
        listView = (ListView) findViewById(R.id.lst);

       CustomAdapter customAdapter= new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Anantnag.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Bandipora.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Baramulla.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), Budgam.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), Ganderbal.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), Kulgam.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), Kupwara.class);
                    startActivityForResult(myIntent, 0);
                }


                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), Shopian.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), Srinagar.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });


    }



    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View View , ViewGroup parent) {
            View =getLayoutInflater().inflate(R.layout.customadapter,null);

            ImageView imageView=(ImageView)View.findViewById(R.id.imageview);
            TextView textView=(TextView)View.findViewById(R.id.testview);

            imageView.setImageResource(IMAGES[position]);
            textView.setText(values[position]);
                    return View;
        }
    }
}