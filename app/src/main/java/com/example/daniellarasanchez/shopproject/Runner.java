package com.example.daniellarasanchez.shopproject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */



//i have to find out how to charge the debt every 31st of the month, so the

public class Runner {
    public static void main(String args[]) {
        PaymentType paymentType;
        Sale sale1;
        Sale sale2;
        Sale sale3;
        Refund refund1;
        Refund refund2;
        ArrayList<Sale> sales;
        ArrayList<Refund> refunds;
        Shop shop;
        Customer customer;
        Customer customer2;
        Product product1;
        HashMap<Product, Integer> stock;
        FinancialAdvisor financialAdvisor;
        ArrayList<Customer> customers;
        Customer customer3;
        Customer customer4;
        Product product2;

        customer4 = new Customer("Joe", 1500);

        product1 = new Product("Eggs", 9);
        product2 = new Product("Weapons", 1000);
        sale1 = new Sale(200, product1, 1);

        sale3 = new Sale(888, product1, 3);
        refund1 = new Refund(100);
        refund2 = new Refund(110);
        sales = new ArrayList<>();
        sales.add(sale1);
        sale2 = new Sale(343, product1, 1);
        refunds = new ArrayList<>();
        stock = new HashMap<Product, Integer>();

        shop = new Shop();
        shop.addStock(product1, 10);
        shop.addStock(product2, 20);

        customer = new Customer("Daniel", 1001);
        customer2 = new Customer("Jose", 1002);
        customer3 = new Customer("Antonia", 1000);
        shop.canAddSale(sale1, customer3, PaymentType.CREDITCARD);
        shop.canAddSale(sale2, customer, PaymentType.CREDITCARD);
        shop.canAddSale(sale1, customer2, PaymentType.CREDITCARD);
        shop.canAddSale(sale3, customer2, PaymentType.CREDITCARD);
        financialAdvisor = new FinancialAdvisor();


        financialAdvisor.addCustomer(customer);
        financialAdvisor.addCustomer(customer2);
        System.out.println(financialAdvisor.returnHighestDebt());
        System.out.println(financialAdvisor.returnHighestFunds());
//d
//        System.out.println(financialAdvisor.returnSortedArrayListByCustomerDebt().toString());
        System.out.println(financialAdvisor.returnFirst10NamesOfCustomerWithHighestDebt());

        }



//
//
////        FinancialAdvisor financialAdvisor = new FinancialAdvisor();
////        ArrayList<Customer> customers = new ArrayList<>();
//////
////        Shop shop = new Shop();
////        Customer customer = new Customer("Dani", 1000);
////        customers.add(customer);
////        Product product = new Product("hola", 3);
////        Product product1 = new Product("adios", 2);
////        Sale sale = new Sale(100, product,4);
////        shop.canAddSale(sale, customer, PaymentType.CREDITCARD );
////        HashMap<Product, Integer> stock = new HashMap<>();
////        stock.put(product, 3);
////        stock.put(product1, 4);
////        System.out.println(stock.values());
////        System.out.println(stock.get(product));
////        System.out.println(financialAdvisor.getDebtOfCustomer());
////        System.out.println(shop.setValueOfHashMap(sale.getProduct(), sale.getQuantity()));
//////        Sale sale1 = new Sale(100, Product.POTATOS);;
////        Customer customer1 = new Customer("Daniel", 2000, PaymentType.CREDITCARD);
////
////        System.out.println(customer1.getName() + customer1.getFunds());
////        System.out.println(sale1.getDate());//how can i test the getDate method? the date is so specific!
//

    }

