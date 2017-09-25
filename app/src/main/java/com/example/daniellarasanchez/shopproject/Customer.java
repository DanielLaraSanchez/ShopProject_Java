package com.example.daniellarasanchez.shopproject;

import java.util.ArrayList;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class Customer  {
    private int funds;
    private String name;
    private ArrayList<PaymentMethod> paymentMethods;


    public Customer(String name, int funds){
        this.name = name;
        this.funds = funds;
        this.paymentMethods = new ArrayList<PaymentMethod>();
    }

    public PaymentType choosePaymentType(){

    }

    public String getName(){
        return this.name;
    }

    public int getFunds(){
        return this.funds;
    }

    public ArrayList<PaymentMethod> getPaymentMethods(){
        return this.paymentMethods;
    }

    public void addPaymentMethods(PaymentMethod paymentMethod){
        this.paymentMethods.add(paymentMethod);
    }

    public void setPaymentMethods(PaymentMethod paymentMethod){
        this.paymentMethods.add(paymentMethod);
    }

    public void setPaymentMethodCash(){
        this.paymentMethods.setPaymentMethods(PaymentType.CASH);
    }

//    public PaymentType getPaymentType(){
//        return this.paymentType;
//    }

//    public void payOffDebt(PaymentType creditCard){
//        this.funds -= creditCard.debt;
//    }


    public void charge(int amount){

        this.funds -= amount;
    }

    public void recieveRefund(int amount){
        this.funds += amount;
    }




}
