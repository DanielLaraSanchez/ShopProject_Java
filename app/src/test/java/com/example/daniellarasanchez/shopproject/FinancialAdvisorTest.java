package com.example.daniellarasanchez.shopproject;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by daniellarasanchez on 25/09/2017.
 */

public class FinancialAdvisorTest {
    ArrayList<Customer> customers;
    Customer customer;
    Customer customer1;
    Customer customer2;


    FinancialAdvisor financialAdvisor;


    @Before
    public void before() {
        customers = new ArrayList<>();
        customer = new Customer("Daniel", 1000);
        customer1 = new Customer("Dan", 2000);
        customer2 = new Customer("Danielo", 1500);
        financialAdvisor = new FinancialAdvisor();


    }

    @Test
    public void canAddCustomerToArrayList() {
        financialAdvisor.addCustomer(customer);
        financialAdvisor.addCustomer(customer1);
        assertEquals(1, financialAdvisor.getCustomer().indexOf(customer1));
        assertEquals(0, financialAdvisor.getCustomer().indexOf(customer));
    }

    @Test
    public void canRemoveCustomerFromArrayList() {
        financialAdvisor.addCustomer(customer);
        financialAdvisor.removeCustomer(customer);
        assertEquals(0, financialAdvisor.getCustomer().size());
    }

    @Test
    public void canGetHighestDebt() {
        customer.setDebt(300);
        customer1.setDebt(888);
        customer2.setDebt(2000);
        financialAdvisor.addCustomer(customer);
        financialAdvisor.addCustomer(customer1);
        financialAdvisor.addCustomer(customer2);
        assertEquals(2000, financialAdvisor.returnHighestDebt());
    }

    @Test
    public void canGetHighestDebtInCustomersArrayList() {
        customer.setDebt(250);
        financialAdvisor.addCustomer(customer);
        assertEquals(250, financialAdvisor.getCustomerDebt(customer));
    }

    @Test
    public void canGetHighestFundsInCustomerArrayList() {
        financialAdvisor.addCustomer(customer);
        financialAdvisor.addCustomer(customer1);
        financialAdvisor.addCustomer(customer2);
        assertEquals(2000, financialAdvisor.returnHighestFunds());
    }

    @Test
    public void canGetNameOfCustomerWithHighestFunds() {
        financialAdvisor.addCustomer(customer);
        financialAdvisor.addCustomer(customer1);
        financialAdvisor.addCustomer(customer2);
        assertEquals("Dan", financialAdvisor.returnHighestFundsCustomerName());
    }

    @Test
    public void canGetNameOfCustomerWithHighestDebt(){
        customer.setDebt(500);
        customer1.setDebt(560);
        customer2.setDebt(800);
        financialAdvisor.addCustomer(customer);
        financialAdvisor.addCustomer(customer1);
        financialAdvisor.addCustomer(customer2);
        assertEquals("Danielo", financialAdvisor.returnNameOfCustomerWithHighestDebt());
    }

}


