package com.example.daniellarasanchez.shopproject;

import java.util.ArrayList;

/**
 * Created by daniellarasanchez on 25/09/2017.
 */

public class DebtCollector {
    private ArrayList<Customer> customers;

    public DebtCollector() {
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomer(){
        return this.customers;
    }



//    public void setDebtToZero(Customer customer, PaymentType newDebt) {
//        if (customer.getFunds() >= PaymentType.CREDITCARD.getDebt()) {
//           customer.payOffDebt(PaymentType.CREDITCARD);
//            setNewDebt(0);
//        }
//    }
}
