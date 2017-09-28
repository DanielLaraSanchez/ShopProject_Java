package com.example.daniellarasanchez.shopproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class SaleTest {
    Sale sale;
    Product product;

    @Before
    public void before() {
        sale = new Sale(250, product, 5 );
        product = new Product("Rice", 2);

    }

    @Test
    public void canGetAmount() {
        assertEquals(250, sale.getAmount());

    }
}
