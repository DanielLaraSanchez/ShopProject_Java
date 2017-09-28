package com.example.daniellarasanchez.shopproject;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class CustomerTest {

    Customer customer1;
    Sale sale1;
    Shop shop;
    Product product;
    HashMap<Product, Integer> stock;



    Sale sale2;
    Sale sale3;
    Refund refund1;
    Refund refund2;
    ArrayList<Sale> sales;
    ArrayList<Refund> refunds;

    Customer customer;
    Customer customer2;
    Product product1;


    @Before
    public void before(){
        sales = new ArrayList<>();
        refunds = new ArrayList<>();
        stock = new HashMap<>();
        product = new Product("Flour", 10);
        customer = new Customer("Daniel", 100);
        customer1 = new Customer("Dan", 200);
        sale1 = new Sale(100, product, 10);
        shop = new Shop();

    }


    @Test
    public void canGetFunds(){
        assertEquals(100, customer.getFunds());

    }

    @Test
    public void canChargeCustomer(){
        customer.charge(50);
        assertEquals(50, customer.getFunds());
    }

    @Test
    public void canChargeCustomerCreditCard(){
        customer.charge(50, PaymentType.CREDITCARD);
        assertEquals(100, customer.getFunds());
        assertEquals(50, customer.getDebt());

    }

    @Test
    public void canSetNewDebt(){
        customer.setDebt(800);
        assertEquals(800, customer.getDebt());
    }

    @Test
    public void canPayOffDebt(){
        shop.addStock(product, 10);
        shop.canAddSale(sale1, customer1, PaymentType.CREDITCARD);
        customer1.payOffDebt();
        assertEquals(100, customer1.getFunds());
        assertEquals(0, customer1.getDebt());
    }




}
