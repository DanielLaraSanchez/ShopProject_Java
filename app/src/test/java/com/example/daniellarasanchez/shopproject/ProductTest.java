package com.example.daniellarasanchez.shopproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by daniellarasanchez on 27/09/2017.
 */

public class ProductTest {
    Product product;

    @Before
    public void before(){
        product = new Product("Milk", 2);
    }

    @Test
    public void getTitle(){
        assertEquals("Milk", product.getTitle());
    }

    @Test
    public void getPrice(){
        assertEquals(2, product.getPrice());
    }
}
