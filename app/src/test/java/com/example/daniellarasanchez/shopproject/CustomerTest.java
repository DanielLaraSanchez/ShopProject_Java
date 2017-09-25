package com.example.daniellarasanchez.shopproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class CustomerTest {
    Customer customer;
    Customer customer1;
    Sale sale1;
    Shop shop;



    @Before
    public void before(){
        customer = new Customer("Daniel", 100, PaymentMethod.CASH);
        customer1 = new Customer("Dan", 200, PaymentMethod.CREDITCARD);
        sale1 = new Sale(100);
        shop = new Shop();


    }

    @Test
    public void canGetFunds(){
        assertEquals(100, customer.getFunds());

    }

    @Test
    public void canPayOffDebt(){
        shop.canAddSale(sale1, customer1);
        customer1.payOffDebt(PaymentMethod.CREDITCARD);
        assertEquals(100, customer1.getFunds());
    }
}
