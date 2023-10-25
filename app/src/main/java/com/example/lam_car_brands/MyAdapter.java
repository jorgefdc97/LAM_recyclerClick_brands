package com.example.lam_car_brands;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    ArrayList<Brand> carList;
    MyViewHolder myViewHolder;

    public MyAdapter(ArrayList<Brand> carList){
        this.carList = carList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view;

        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_cars_line, parent, false);

        myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){
        myViewHolder.textViewName.setText(carList.get(position).getName());
        myViewHolder.imageViewLogo.setImageResource(carList.get(position).getLogo());
    }

    @Override
    public int getItemCount(){
        return carList.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }
}
