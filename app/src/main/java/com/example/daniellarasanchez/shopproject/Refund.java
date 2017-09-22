package com.example.daniellarasanchez.shopproject;

import java.util.Date;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class Refund {
    private int amount;



    public Refund(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
