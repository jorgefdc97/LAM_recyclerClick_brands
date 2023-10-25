package com.example.lam_car_brands;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView textViewName;

    ImageView imageViewLogo;

    public MyViewHolder(@NonNull View itemView){
        super(itemView);
        textViewName = itemView.findViewById(R.id.textViewName);
        imageViewLogo = itemView.findViewById(R.id.imageViewLogo);
    }
}
