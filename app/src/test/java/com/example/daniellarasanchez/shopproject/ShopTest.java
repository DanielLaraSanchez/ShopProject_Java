package com.example.daniellarasanchez.shopproject;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class ShopTest {
     Sale sale1;
     Refund refund1;
     ArrayList<Sale> sales;
     ArrayList<Refund> refunds;
     Shop shop;
     Customer customer;


    @Before
    public void before(){
        sale1 = new Sale(200);
        refund1 = new Refund(100);
        sales = new ArrayList<Sale>();
        refunds = new ArrayList<>();
        shop = new Shop();
        customer = new Customer("Daniel", 1000);
    }


    @Test
    public void salesArrayStartsEmpty(){
        assertEquals(0, shop.sales.size());
    }
    @Test
    public void canAddSale() {
        shop.canAddSale(sale1, customer);
        assertEquals(sale1, shop.sales.get(0));
    }
    @Test
    public void canDecreaseFundsOfCustomerAfterSale(){
        shop.chargeCustomer(120, customer);
        assertEquals(880, customer.getFunds());
    }





    @Test
    public void refundsArrayStartsEmpty(){
        assertEquals(0, shop.refunds.size());
    }
    @Test
    public void canAddRefund(){
        shop.canAddRefund(refund1, customer);
        assertEquals(refund1, shop.refunds.get(0));
    }
    @Test
    public void canIncreaseFundsOfCustomerAfterRefund(){
        shop.refundCustomer(120, customer);
        assertEquals(1120, customer.getFunds());
    }












}
