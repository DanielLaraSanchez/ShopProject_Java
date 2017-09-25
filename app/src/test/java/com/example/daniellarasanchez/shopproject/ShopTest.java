package com.example.daniellarasanchez.shopproject;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by daniellarasanchez on 22/09/2017.
 */

public class ShopTest {
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


    @Before
    public void before(){
        product1 = new Product("Eggs", 9);
        sale1 = new Sale(200, product1, 1);
        sale2 = new Sale(343);
        sale3 = new Sale(200, new Product("Eggs", 9));
        refund1 = new Refund(100);
        refund2 = new Refund(110);
        sales = new ArrayList<Sale>();
        refunds = new ArrayList<>();
        shop = new Shop();
        customer = new Customer("Daniel", 1000, PaymentMethod.DEBITCARD);
        customer2 = new Customer("Daniel", 1000, PaymentMethod.CREDITCARD);
    }
//
//    @Test
//    public void compareProducts(){
//
//        shop.canAddSale(sale1, customer);
//        shop.addStock(product1, 9 );
//        assertEquals(6, shop.getStock().values());
//
//    }


    @Test
    public void salesArrayStartsEmpty(){
        assertEquals(0, shop.sales.size());
    }
    @Test
    public void canAddSale() {
        shop.canAddSale(sale1, customer);
        assertEquals(sale1, shop.sales.get(0));
    }
    @Test
    public void canAddSaleIndex(){
        shop.canAddSale(sale1, customer);
        assertEquals(1, shop.getSales().size());
    }

    @Test
    public void canDecreaseFundsOfCustomerAfterSale(){
        shop.chargeCustomer(120, customer);
        assertEquals(880, customer.getFunds());
    }

    @Test
    public void canAddDebtToCreditCardAfterSale(){
        shop.chargeCustomer(120, customer2);
        assertEquals(120, PaymentMethod.CREDITCARD.getDebt());
    }



    @Test
    public void getTotalOfSales(){
        shop.canAddSale(sale1, customer);
        shop.canAddSale(sale2, customer);
        assertEquals(543, shop.getTotalSales());
    }

    @Test
    public void getTotalOfRefunds(){
        shop.canAddRefund(refund1, customer);
        shop.canAddRefund(refund2, customer);
        assertEquals(210, shop.getTotalRefunds());
    }

    @Test
    public void getProfitOfShop(){
        shop.canAddRefund(refund1, customer);
        shop.canAddRefund(refund2, customer);
        shop.canAddSale(sale1, customer);
        shop.canAddSale(sale2, customer);
        assertEquals(333, shop.getProfitOfShop());
    }

    @Test
    public void canIncreaseFundsOfShopAfterSale(){
        shop.chargeCustomer(120, customer);
        assertEquals(120, shop.getFunds());
    }

    @Test
    public void canIncreaseFundsOfShopAfterSaleWithCreditCard(){
        shop.chargeCustomer(120, customer2);
        assertEquals(120, shop.getFunds());
    }


    @Test
    public void refundsArrayStartsEmpty(){
        assertEquals(0, shop.refunds.size());
    }
    @Test
    public void canAddRefund(){
        shop.canAddRefund(refund1, customer);
        assertEquals(refund1, shop.refunds.get(0));
    }
    @Test
    public void canAddRefundIndex(){
        shop.canAddRefund(refund1, customer);
        assertEquals(1, shop.getRefunds().size());
    }
    @Test
    public void canIncreaseFundsOfCustomerAfterRefund(){
        shop.refundCustomer(120, customer);
        assertEquals(1120, customer.getFunds());
    }
    @Test
    public void subtractAmountFromShopAfterRefund(){
        shop.refundCustomer(120,customer);
        assertEquals(-120, shop.getFunds());
    }














}
