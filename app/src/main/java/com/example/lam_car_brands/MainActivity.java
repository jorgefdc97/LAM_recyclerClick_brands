package com.example.lam_car_brands;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Brand> carList;
    MyAdapter myadapter;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertBrands();

        myadapter = new MyAdapter(carList);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(myadapter);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void insertBrands() {
        carList = new ArrayList<>();
        carList.add(new Brand("Audi", R.drawable.audi));
        carList.add( new Brand("Bentley", R.drawable.bentley));
        carList.add( new Brand("BMW", R.drawable.bmw));
        carList.add( new Brand("Citroen", R.drawable.citroen));
        carList.add(new Brand("Jaguar", R.drawable.jaguar));
        carList.add(new Brand("Jeep", R.drawable.jeep));
        carList.add(new Brand("Mercedes", R.drawable.mercedes));
        carList.add(new Brand("Mini", R.drawable.mini));
        carList.add(new Brand("Opel", R.drawable.opel));
        carList.add(new Brand("Porshe", R.drawable.porsche));
        carList.add(new Brand("Toyota", R.drawable.toyota));
        carList.add(new Brand("VolksWagen", R.drawable.volkswagen));
        carList.add(new Brand("Betoneira", R.drawable.betoneira));
    }
}