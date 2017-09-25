package com.example.daniellarasanchez.shopproject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class Shop  {

     ArrayList<Sale> sales;
     ArrayList<Refund> refunds;

//    public void setStock(HashMap<Product product, Integer >, Integer newValue) {
//        stock.put(product, newValue);
//    }

    HashMap<Product, Integer> stock;
     int funds;




    public Shop(){
        this.sales = new ArrayList<Sale>();
        this.refunds = new ArrayList<Refund>();
        this.funds = 0;
        this.stock = new HashMap<Product, Integer>();
    }


//    public Integer getValuesOfHashMaps(Integer i){
//        HashMap<Product, Integer> stock = new HashMap<Product, Integer>();
//        for(Product products : stock.keySet()){
//            if(stock.get(products).equals(i)){
//
//            }
//        }
//    }



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
//
//    public void decreaseValueOfHashMap(Sale sale){
////        this.stock.put(sale.getProduct(), this.stock.get(sale.getProduct()) - quantity);
//        Integer quant = sale.getQuantity();
//        String title = sale.getProduct().getTitle();
//        if (this.stock.containsKey(sale.getProduct())){
////        this.stock.put(sale.getProduct(), this.stock.values() -quant)
//            setStock(sale.getProduct(), sale.getQuantity().intValue());
//
//    }

//    public void decreaseValueHashMap(HashMap<Product, Integer> stock, Integer newValue){
//        stock.set
//    }


    public void addStock(Product product, Integer quantity){//notTested
        this.stock.put(product, quantity );
    }

//    public void compareProducts(Sale sale, Product product){
//        Product s = sale.getProduct();
//        if  (this.stock.containsKey(s));
//        decreaseValueOfHashMap(s, sale.getQuantity());
//    }


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





    public void canAddSale(Sale sale, Customer customer){
        this.sales.add(sale);
//        compareProducts(sale);
        chargeCustomer(sale.getAmount(), customer);//this method already adds amount to the shop funds when charging customer.

    }
    public void canAddRefund(Refund refund, Customer customer){
        this.refunds.add(refund);
        refundCustomer(refund.getAmount(), customer);//this method already subtracts amount from the shop funds when refunding customer.
    }



    public void chargeCustomer(int amount, Customer customer){
        customer.charge(amount);//this method calls the "hability" of customer to be charged.
        this.funds += amount;
        if(customer.choosePaymentType() != PaymentType.)
        if(customer.getPaymentType() != PaymentType.CREDITCARD){
//            customer.charge(amount);//this method calls the "hability" of customer to be charged.
//            this.funds += amount;
//        }else{
//            PaymentType.CREDITCARD.addAmountToDebt(amount);//this method calls the "hability" of Paymentmethod to increase the debt.
//            this.funds += amount;
//        }
    }



    public void refundCustomer(int amount, Customer customer){
        customer.recieveRefund(amount);
        this.funds -= amount;
    }








}
