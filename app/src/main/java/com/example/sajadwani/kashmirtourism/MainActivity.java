package com.example.sajadwani.kashmirtourism;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ViewFlipper;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button b1,enter;
    Animation Fade_in,Fade_out;
    ViewFlipper viewFlipper;
    NavigationView navigationView;
    ImageButton imageButton;
    FragmentTransaction fragmentTransaction;
    private final int SPLASH_DISPLAY_LENGTH = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton=(ImageButton)findViewById(R.id.f1);
        imageButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ListV.class);
                startActivity(i);

            }
        });
       // new Handler().postDelayed(new Runnable() {
          //  @Override
        //    public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
               // Intent i = new Intent(MainActivity.this, ListV.class);
             //   startActivity(i);

                // close this activity
           //     finish();
         //   }
       // }, SPLASH_DISPLAY_LENGTH);
        TextView my=(TextView)findViewById(R.id.t1);
      Animation anim =new AlphaAnimation(0.0f,1.0f);
      anim.setDuration(1000);
      anim.setStartOffset(20);
      anim.setRepeatMode(Animation.REVERSE);
      anim.setRepeatCount(Animation.INFINITE);
      my.startAnimation(anim);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        switch (item.getItemId())
        {

        }
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent cinemaIntent = new Intent(this, Hotels.class);
            startActivity(cinemaIntent);
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            Intent i= new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.tripadvisor.in/ShowTopic-g297623-i10273-k5518965-When_is_the_best_time_to_visit_Kashmir_Aug_or_Oct-Srinagar_Srinagar_District_Kashmir_Jammu.html"));
            startActivity(i);

        } else if (id == R.id.nav_slideshow) {
            Intent cinemaIntent = new Intent(this, Reach.class);
            startActivity(cinemaIntent);

        } else if (id == R.id.nav_manage) {
            Intent i= new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://www.kashmir-handicrafts.com/"));
            startActivity(i);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
