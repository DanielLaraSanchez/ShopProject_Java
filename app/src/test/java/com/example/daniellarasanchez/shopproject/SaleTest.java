package com.example.daniellarasanchez.shopproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class SaleTest {
    Sale sale;


    @Before
    public void before() {
        sale = new Sale(250);

    }

    @Test
    public void canGetAmount() {
        assertEquals(250, sale.getAmount());

    }
}
