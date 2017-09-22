package com.example.daniellarasanchez.shopproject;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class Customer  {
    private int funds;
    private String name;


    public Customer(String name, int funds){
        this.name = name;
        this.funds = funds;
    }

    public String getName(){
        return this.name;
    }

    public int getFunds(){
        return this.funds;
    }


    public void charge(int amount){
        this.funds -= amount;
    }

    public void recieveRefund(int amount){
        this.funds += amount;
    }


}
