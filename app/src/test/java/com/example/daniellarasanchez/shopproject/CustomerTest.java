package com.example.daniellarasanchez.shopproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class CustomerTest {
    Customer customer;


    @Before
    public void before(){
        customer = new Customer(100);
    }

    @Test
    public void canGetFunds(){
        assertEquals(100, customer.getFunds());
    }
}
