package com.example.daniellarasanchez.shopproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by daniellarasanchez on 25/09/2017.
 */

public class DebtCollectorTest {
    PaymentMethod paymentMethod;
    Customer customer;
    DebtCollector debtCollector;


    @Before
    public void before(){
        customer = new Customer("Daniel", 1000, paymentMethod.CREDITCARD);
        debtCollector = new DebtCollector(paymentMethod.CREDITCARD, customer);

    }

    @Test
    public void canSetDebtToZero(){
        debtCollector.setNewDebt(0);
        assertEquals(0, customer.getPaymentMethod().getDebt());
    }

    @Test
    public void canPayOffDebt(){
        debtCollector.setDebtToZero(customer, PaymentMethod.CREDITCARD);
        assertEquals(0, customer.getPaymentMethod().getDebt());
    }
}
