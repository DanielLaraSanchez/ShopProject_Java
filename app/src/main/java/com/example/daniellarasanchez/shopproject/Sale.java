package com.example.daniellarasanchez.shopproject;

import android.icu.text.DateTimePatternGenerator;

import java.sql.Time;

import java.util.Date;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class Sale {
    private int amount;


    public Sale(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return this.amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }


}
