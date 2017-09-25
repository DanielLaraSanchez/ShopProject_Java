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
    PaymentMethod cashPaymentMethod;


    @Before
    public void before(){
        customer = new Customer("Daniel", 100);
        customer1 = new Customer("Dan", 200);
        sale1 = new Sale(100);
        shop = new Shop();
        cashPaymentMethod = new PaymentMethod(122322, PaymentType.CASH);

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
    public void canAddPaymentMethod(){
        customer.addPaymentMethods(cashPaymentMethod);
        assertEquals(1, customer.getPaymentMethods().size());
    }
    @Test
    public void canPayOffDebt(){
        shop.canAddSale(sale1, customer1, PaymentType.CREDITCARD);
        customer1.payOffDebt();
        assertEquals(100, customer1.getFunds());
        assertEquals(0, customer1.getDebt());
    }


}
