package com.example.sajadwani.kashmirtourism;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by SAJAD WANI on 4/23/2017.
 */

public class Second extends Activity {
    Button cate,all;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        cate=(Button)findViewById(R.id.cat);
        cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent k = new Intent(Second.this, Sort.class);
                startActivity(k);


            }
        });

        all=(Button)findViewById(R.id.all);
        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent lst =new Intent(Second.this,ListV.class);
                startActivity(lst);
            }
        });



    }
}
