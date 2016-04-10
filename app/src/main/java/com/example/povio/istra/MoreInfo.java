package com.example.povio.istra;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import me.relex.circleindicator.CircleIndicator;

public class MoreInfo extends AppCompatActivity {
    ViewPager viewPager;
    SwipeImageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adapter = new SwipeImageAdapter(this);
        viewPager.setAdapter(adapter);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            TextView textView = (TextView)findViewById(R.id.cityName);
            String name = extras.getString("name");
            textView.setText(name);

            TextView textViewPrice = (TextView)findViewById(R.id.name);
            String price = extras.getString("price");
            textViewPrice.setText(price);

            TextView textViewRooms = (TextView)findViewById(R.id.roomAmount2);
            String rooms = extras.getString("rooms");
            textViewRooms.setText(rooms);

            TextView textViewBeds = (TextView)findViewById(R.id.bedAmount2);
            String beds = extras.getString("beds");
            textViewBeds.setText(beds);

            //Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        }

    }
}
