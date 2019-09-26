package com.example.company;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
   Context context;
    int res;
    ArrayList<Companies>Al;

    public MyAdapter(Context context, int res, ArrayList<Companies> al) {
        this.context = context;
        this.res = res;
        Al = al;
    }



    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(res,viewGroup,false);
        MyHolder myHolder=new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        Companies companies=Al.get(i);
        myHolder.nem.setText(companies.getName());
    myHolder.id.setText(String.valueOf(companies.getCode()));
        myHolder.ad.setText(companies.getAdd());

    }

    @Override
    public int getItemCount() {
        return Al.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView nem;
        TextView ad;
        TextView id;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            nem=itemView.findViewById(R.id.com);
            ad=itemView.findViewById(R.id.add);
            id=itemView.findViewById(R.id.code);

        }
    }
}
