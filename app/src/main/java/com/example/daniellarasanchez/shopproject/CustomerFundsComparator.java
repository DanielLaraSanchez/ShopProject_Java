package com.example.daniellarasanchez.shopproject;

import java.util.Comparator;

/**
 * Created by daniellarasanchez on 27/09/2017.
 */

public class CustomerFundsComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer c1, Customer c2){
        if (c1.getFunds() == c2.getFunds()){
            return 0;
        }
        else if (c1.getFunds() > c2.getFunds()){
            return 1;
        } else {
            return -1;
        }


    }


}
