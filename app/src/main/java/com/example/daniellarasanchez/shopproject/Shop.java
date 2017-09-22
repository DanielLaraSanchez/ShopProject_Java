package com.example.daniellarasanchez.shopproject;

import java.util.ArrayList;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class Shop  {


     ArrayList<Sale> sales;
     ArrayList<Refund> refunds;
     int funds;

    public Shop(){
        this.sales = new ArrayList<Sale>();
        this.refunds = new ArrayList<Refund>();
        this.funds = 0;
    }



    public ArrayList<Sale> getSales() {
        return sales;
    }

    public ArrayList<Refund> getRefunds() {
        return refunds;
    }
    public int getFunds(){
        return this.funds;
    }

    public int getTotalSales(){
        int total = 0;
        for(Sale sale : this.sales )
            total += sale.getAmount();
        return total;
    }

    public int getTotalRefunds(){
        int total = 0;
        for(Refund refund : this.refunds )
            total += refund.getAmount();
        return total;
    }

    public int getProfitOfShop(){
        int result = getTotalSales() - getTotalRefunds();
        return result;

    }




    public void canAddSale(Sale sale, Customer customer){
        this.sales.add(sale);
        chargeCustomer(sale.getAmount(), customer);

    }


    public void canAddRefund(Refund refund, Customer customer){
        this.refunds.add(refund);
        refundCustomer(refund.getAmount(), customer);

    }



    public void chargeCustomer(int amount, Customer customer){
        customer.charge(amount);
        this.funds += amount;

    }

    public void refundCustomer(int amount, Customer customer){
        customer.recieveRefund(amount);
        this.funds -= amount;
    }








}
