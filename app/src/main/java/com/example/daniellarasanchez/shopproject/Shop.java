package com.example.daniellarasanchez.shopproject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */
//

public class Shop  {

     ArrayList<Sale> sales;
     ArrayList<Refund> refunds;
     HashMap<Product, Integer> stock;
     int funds;

    public Shop(){
        this.sales = new ArrayList<Sale>();
        this.refunds = new ArrayList<Refund>();
        this.funds = 0;
        this.stock = new HashMap<Product, Integer>();
    }







    public void setNewValueInHashMap(Product product, Integer newValue){
        stock.put(product, newValue);
    }

    public void setValueOfHashMapAfterSale(Product product, Integer newValue){//hability of shop for updating the value of hashmap.
        Integer s = stock.get(product);
        stock.put(product, s -= newValue);

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
    public HashMap<Product, Integer> getStock(){

        return this.stock;
    }


    public void addStock(Product product, Integer quantity){//notTested
        this.stock.put(product, quantity );
    }



    public int getTotalSales(){
        int total = 0;
        for(Sale sale : this.sales ) {
            total += sale.getAmount();
        }
        return total;
    }
    public int getTotalRefunds(){
        int total = 0;
        for(Refund refund : this.refunds ) {
            total += refund.getAmount();
        }
        return total;
    }
    public int getProfitOfShop(){
        int result = getTotalSales() - getTotalRefunds();
        return result;
    }





    public void canAddSale(Sale sale, Customer customer, PaymentType paymentType){
        this.sales.add(sale);
        chargeCustomer(sale.getAmount(), customer, paymentType  );//this method already adds amount to the shop funds when charging customer.
        setValueOfHashMapAfterSale(sale.getProduct(),  sale.getQuantity());
    }
    public void canAddRefund(Refund refund, Customer customer){
        this.refunds.add(refund);
        refundCustomer(refund.getAmount(), customer);//this method already subtracts amount from the shop funds when refunding customer.
    }

    public void chargeCustomer(int amount, Customer customer, PaymentType paymentType){

        if(paymentType != PaymentType.CREDITCARD){
            customer.charge(amount);//this method calls the "hability" of customer to be charged.
            this.funds += amount;
        }else{
            customer.charge(amount, paymentType.CREDITCARD);
            this.funds += amount;
        }
    }

    public void refundCustomer(int amount, Customer customer){
        customer.recieveRefund(amount);
        this.funds -= amount;
    }

    public void setStock(HashMap<Product, Integer> stock) {
        this.stock = stock;
    }









}
