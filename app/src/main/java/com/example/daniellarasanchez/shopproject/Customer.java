package com.example.daniellarasanchez.shopproject;

import java.util.ArrayList;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class Customer  {
    private int funds;
    private String name;
    private int debt;


    public Customer(String name, int funds){
        this.name = name;
        this.funds = funds;
        this.debt = 0;
    }



    public String getName(){
        return this.name;
    }

    public int getFunds(){
        return this.funds;
    }

    public int getDebt() {return this.debt;}

    public  void setDebt(int newDebt){
        this.debt = newDebt;
    }


    public void payOffDebt() {
        if (this.funds >= this.debt) {
            this.funds -= this.debt;
            this.setDebt(0);
        }
    }


    public void charge(int amount){
        this.funds -= amount;
    }

    public void charge(int amount, PaymentType paymentType){
        if(paymentType == paymentType.CREDITCARD){
            this.debt += amount;
        }else{
            this.charge(amount);
        }
    }

    public void recieveRefund(int amount){
        this.funds += amount;
    }




}
