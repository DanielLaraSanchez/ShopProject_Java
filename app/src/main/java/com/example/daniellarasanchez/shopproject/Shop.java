package com.example.daniellarasanchez.shopproject;

import java.util.ArrayList;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class Shop  {


     ArrayList<Sale> sales;
     ArrayList<Refund> refunds;


    public Shop(){
        this.sales = new ArrayList<Sale>();
        this.refunds = new ArrayList<Refund>();
    }



    public ArrayList<Sale> getSales() {
        return sales;
    }

    public ArrayList<Refund> getRefunds() {
        return refunds;
    }



    public void canAddSale(Sale sale, Customer customer){
        this.sales.add(sale);
        chargeCustomer(sale.getAmount(), customer);
    }

    public void chargeCustomer(int amount, Customer customer){
        customer.charge(amount);
    }



    public void canAddRefund(Refund refund, Customer customer){
        this.refunds.add(refund);
        refundCustomer(refund.getAmount(), customer);

    }

    public void refundCustomer(int amount, Customer customer){
        customer.recieveRefund(amount);
    }

    




}
