package com.example.daniellarasanchez.shopproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class RefundTest {
    Refund refund;


    @Before
    public void before() {
        refund = new Refund(100);
    }

    @Test
    public void canGetAmount(){
        assertEquals(100, refund.getAmount());
    }



}
