package com.example.daniellarasanchez.shopproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Created by daniellarasanchez on 25/09/2017.
 */

public class FinancialAdvisor  {
    private ArrayList<Customer> customers;
    private ArrayList<Customer> customersWithHighDebt;


    public FinancialAdvisor() {
        this.customers = new ArrayList<Customer>();
        this.customersWithHighDebt = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomer(){
        return this.customers;
    }

    public ArrayList<Customer> getCustomersWithHighDebt(){
        return this.customersWithHighDebt;
    }

    public int getCustomerDebt(Customer customer){
        return customer.getDebt();
    }


    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public void removeCustomer(Customer customer){
        this.customers.remove(customer);
    }


    public int returnHighestDebt() {
        Collections.sort(customers);
        Collections.reverse(customers);

        return customers.get(0).getDebt();

    }

    public int returnHighestFunds(){
        CustomerFundsComparator customerFundsComparator = new CustomerFundsComparator();
        Collections.sort(customers, customerFundsComparator );
        Collections.reverse(customers);

        return customers.get(0).getFunds();
    }


    public String returnHighestFundsCustomerName(){
        CustomerFundsComparator customerFundsComparator = new CustomerFundsComparator();
        Collections.sort(customers, customerFundsComparator );
        Collections.reverse(customers);

        return customers.get(0).getName();
    }

    public String returnNameOfCustomerWithHighestDebt(){
        Collections.sort(customers);
        Collections.reverse(customers);

        return customers.get(0).getName();
    }

    public ArrayList<Customer> returnSortedArrayListByCustomerDebt(){
       Collections.sort(customers);
        Collections.reverse(customers);

        return customers;
    }

    public  List returnFirst10NamesOfCustomerWithHighestDebt(){
        Collections.sort(customers);
        Collections.reverse(customers);

        for(int index = 0; index < customers.size(); index++){
           customers.subList(0, 2);
        }

        return customers;

    }

//
//    public String returnNameOfFirst10CustomersWithHighestDebt(){
//        for(Customer customers: this.){
//
//        }
//    }














}






