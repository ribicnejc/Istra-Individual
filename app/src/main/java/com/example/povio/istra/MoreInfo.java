package com.example.povio.istra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoreInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);
        Button button_1 = (Button) findViewById(R.id.button1);
        button_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
    }
}
