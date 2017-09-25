package com.example.daniellarasanchez.shopproject;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class Customer  {
    private int funds;
    private String name;
    private PaymentMethod paymentMethod;



    public Customer(String name, int funds, PaymentMethod paymentMethod){
        this.name = name;
        this.funds = funds;
        this.paymentMethod = paymentMethod;
    }

    public String getName(){
        return this.name;
    }

    public int getFunds(){
        return this.funds;
    }

    public PaymentMethod getPaymentMethod(){
        return this.paymentMethod;
    }



    public void payOffDebt(PaymentMethod creditCard){
        this.funds -= creditCard.debt;
    }


    public void charge(int amount){
        this.funds -= amount;
    }

    public void recieveRefund(int amount){
        this.funds += amount;
    }




}
