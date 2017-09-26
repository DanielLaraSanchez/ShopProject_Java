package com.example.daniellarasanchez.shopproject;

import java.util.HashMap;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */



//i have to find out how to charge the debt every 31st of the month, so the

public class Runner {
    public static void main(String args[]){
        Shop shop = new Shop();
        Customer customer = new Customer("Dani", 1000);
        Product product = new Product("hola", 3);
        Product product1 = new Product("adios", 2);
        Sale sale = new Sale(100, product);
        shop.canAddSale(sale, customer, PaymentType.CASH );
        HashMap<Product, Integer> stock = new HashMap<>();
        stock.put(product, 3);
        stock.put(product1, 4);
        System.out.println(stock.values());
        System.out.println(stock.get(product));
//        System.out.println(shop.setValueOfHashMap(sale.getProduct(), sale.getQuantity()));
////        Sale sale1 = new Sale(100, Product.POTATOS);;
//        Customer customer1 = new Customer("Daniel", 2000, PaymentType.CREDITCARD);
//
//        System.out.println(customer1.getName() + customer1.getFunds());
//        System.out.println(sale1.getDate());//how can i test the getDate method? the date is so specific!












    }
}
