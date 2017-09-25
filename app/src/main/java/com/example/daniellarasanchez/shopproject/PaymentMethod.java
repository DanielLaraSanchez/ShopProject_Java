package com.example.daniellarasanchez.shopproject;

/**
 * Created by daniellarasanchez on 25/09/2017.
 */

public class PaymentMethod {
    private int accountNumber;
    private int debt;
    private PaymentType paymentType;

    PaymentMethod(int accountNumber, PaymentType paymentType) {
        this.accountNumber = accountNumber;
        this.debt = 0;
        this.paymentType = paymentType ;
    }



    public PaymentType getPaymentType(){
        return this.paymentType;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public int getDebt(){
        return this.debt;
    }

    public void addAmountToDebt(int amount){
        this.debt += amount;
    }

    public void setDebt(int newDebt){
        this.debt = newDebt;
    }

    public void setPaymentType(PaymentType paymentType){
        this.paymentType = paymentType;
    }
}

