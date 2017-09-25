package com.example.daniellarasanchez.shopproject;


import java.util.Date;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class Sale {
    private int amount;
    private Date date;
    private Product product;
    private Integer quantity;



    public Sale(int amount, Product product){
        this.amount = amount;
        this.date = new Date();
        this.product = product;
    }

    public Sale(int amount){
        this.amount = amount;
        this.date = new Date();

    }

    public Sale(int amount, Product product, Integer quantity){
        this.amount = amount;
        this.date = new Date();
        this.product = product;
        this.quantity = quantity;
    }



    public int getAmount(){
        return this.amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public Date getDate(){
        return this.date;
    }

    public Product getProduct(){
        return this.product;
    }

    public Integer getQuantity(){
        return this.quantity;
    }




}
