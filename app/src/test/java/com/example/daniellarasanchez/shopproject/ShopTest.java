package com.example.daniellarasanchez.shopproject;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

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
     HashMap<Product, Integer> stock;
     Product product2;


    @Before
    public void before(){
        product1 = new Product("Eggs", 9);
        product2 = new Product("Peppers", 8);
        sale1 = new Sale(200, product1, 1);
        sale2 = new Sale(343, product1, 1);
        sale3 = new Sale(200, new Product("Eggs", 9));
        refund1 = new Refund(100);
        refund2 = new Refund(110);
        sales = new ArrayList<>();
        refunds = new ArrayList<>();
        stock = new HashMap<Product, Integer>();
        shop = new Shop();
        customer = new Customer("Daniel", 1000);
        customer2 = new Customer("Daniel", 1000);
    }

    //TEST IF PAYMENT CASH AND DEBITCARD WORK PROPERLY!!!!!


    @Test
    public void canFinallyGetTheFuckingValueOrLongValueToBeMoreSpecific_Peace(){
        shop.addStock(product1, 10);
        assertEquals(10, shop.stock.get(product1).intValue());
    }
    @Test
    public void canSetValueOfHashMap(){
        shop.addStock(product1, 10);
        shop.setNewValueInHashMap(product1, 4);
        assertEquals(4, shop.stock.get(product1).longValue());
    }
    @Test
    public void canUpdateStockAfterSale(){
        shop.addStock(product1, 7);
        shop.canAddSale(sale1, customer, PaymentType.CASH);

        assertEquals(6, shop.stock.get(product1).longValue());
    }
    @Test
    public void salesArrayStartsEmpty(){
        assertEquals(0, shop.sales.size());
    }
    @Test
    public void canAddSale() {
        shop.addStock(product1, 10);
        shop.canAddSale(sale1, customer, PaymentType.CASH);
        assertEquals(sale1, shop.sales.get(0));
    }
    @Test
    public void canAddSaleIndex(){
        shop.addStock(product1, 10);
        shop.canAddSale(sale1, customer, PaymentType.CASH );
        assertEquals(1, shop.getSales().size());
    }

    @Test
    public void canDecreaseFundsOfCustomerAfterSale(){
        shop.chargeCustomer(120, customer, PaymentType.CASH);
        assertEquals(880, customer.getFunds());
    }

    @Test
    public void canIncreaseDebtOfCustomerAfterCreditSale(){
        shop.chargeCustomer(120, customer, PaymentType.CREDITCARD);
        assertEquals(1000, customer.getFunds());
        assertEquals(120, customer.getDebt());
    }
    @Test
    public void canIncreaseFundsOfShopAfterSale(){
        shop.chargeCustomer(120, customer, PaymentType.CASH);
        assertEquals(120, shop.getFunds());
    }

    @Test
    public void canIncreaseFundsOfShopAfterSaleWithCreditCard(){
        shop.chargeCustomer(120, customer2, PaymentType.CREDITCARD);
        assertEquals(120, shop.getFunds());

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

    @Test
    public void getTotalOfSales(){
        shop.addStock(product1, 10);
        shop.canAddSale(sale1, customer, PaymentType.CASH);
        shop.canAddSale(sale2, customer, PaymentType.CASH);
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
        shop.addStock(product1, 10);
        shop.canAddRefund(refund1, customer);
        shop.canAddRefund(refund2, customer);
        shop.canAddSale(sale1, customer, PaymentType.CASH);
        shop.canAddSale(sale2, customer, PaymentType.CASH);
        assertEquals(333, shop.getProfitOfShop());
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
    public void canAddStock(){
        shop.addStock(product1, 9);
        assertEquals(1, shop.getStock().size());
    }
















}
