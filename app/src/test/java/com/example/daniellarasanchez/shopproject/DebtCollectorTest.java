package com.example.daniellarasanchez.shopproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by daniellarasanchez on 25/09/2017.
 */

public class DebtCollectorTest {
    PaymentType paymentType;
    Customer customer;
    DebtCollector debtCollector;


    @Before
    public void before(){
        customer = new Customer("Daniel", 1000);
        debtCollector = new DebtCollector();

    }



//    @Test
//    public void canSetDebtToZero(){
//        debtCollector.setNewDebt(0);
//        assertEquals(0, customer.getPaymentType().getDebt());
//    }
//
//    @Test
//    public void canPayOffDebt(){
//        debtCollector.setDebtToZero(customer, PaymentType.CREDITCARD);
//        assertEquals(0, customer.getPaymentType().getDebt());
//    }
}
