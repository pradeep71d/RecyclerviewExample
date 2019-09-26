package com.example.company;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Companies> arrayList = new ArrayList<>();
        recyclerView = findViewById(R.id.rv);
        arrayList.add(new Companies("Samsung", "Gurgaon", 01));
        arrayList.add(new Companies("Maruti", "bhiwadi", 02));
        arrayList.add(new Companies("Nokia", "noida", 03));
        arrayList.add(new Companies("Oppo", "Gurgaon", 04));
        arrayList.add(new Companies("RedMe", "dehi", 05));
        MyAdapter myAdapter=new MyAdapter(this,R.layout.items,arrayList);
        recyclerView.setAdapter(myAdapter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

    }
}
