package com.example.povio.istra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class OptionList extends AppCompatActivity {
    public static List<Data> data = new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_list);

        //setup RV
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);

        // setup adapter
        final RVAdapter adapter = new RVAdapter(data, this);
        recyclerView.setAdapter(adapter);
        data.add(new Data(R.drawable.backgroundtest, "99€", "Umag", "2 flat room with 2 beds near beach", "3 Rooms", "2 Beds"));
        data.add(new Data(R.drawable.istra, "145€", "Istra", "5 flat room with 4 beds near beach", "5 Rooms", "4 Beds"));
    }
}
