package com.example.daniellarasanchez.shopproject;

/**
 * Created by daniellarasanchez on 25/09/2017.
 */

public class DebtCollector {
    PaymentMethod paymentMethod;
    Customer customer;

    public DebtCollector(PaymentMethod paymentMethod, Customer customer) {
        this.paymentMethod = paymentMethod;
        this.customer = customer;
    }

    public PaymentMethod getPaymentMethod(){
        return this.paymentMethod;
    }
    public Customer getCustomer(){
        return this.customer;
    }

    public void setNewDebt( int newDebt){
        this.paymentMethod.setDebt(newDebt);
    }

    public void setDebtToZero(Customer customer, PaymentMethod newDebt) {
        if (customer.getFunds() >= PaymentMethod.CREDITCARD.getDebt()) {
           customer.payOffDebt(PaymentMethod.CREDITCARD);
            setNewDebt(0);
        }
    }
}
