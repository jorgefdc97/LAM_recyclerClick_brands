package com.example.lam_car_brands;

public class Brand {
    private String name;
    private int logo;

    public Brand(String name, int logo){
        this.name = name;
        this.logo = logo;
    }

    public String getName(){
        return this.name;
    }

    public int getLogo(){
        return this.logo;
    }
}
