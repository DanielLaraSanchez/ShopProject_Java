package com.example.daniellarasanchez.shopproject;

/**
 * Created by daniellarasanchez on 24/09/2017.
 */

public class Product {
    private String title;
    private int price;


    public Product(String title, int price){
        this.price = price;
        this.title = title;

    }




    public int getPrice(){
        return this.price;
    }



    public String getTitle(){
        return this.title;
    }
}
