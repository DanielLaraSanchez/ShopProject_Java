package com.example.daniellarasanchez.shopproject;

/**
 * Created by daniellarasanchez on 23/09/2017.
 */

public enum PaymentMethod {


        DEBITCARD(1234566),
        CREDITCARD(7877676),
        CASH();

         PaymentMethod() {

        }

         PaymentMethod(int accountNumber) {
            this.accountNumber = accountNumber;
             this.debt = 0;

         }


        public int accountNumber;
        public int debt;



        public int getDebt(){
            return this.debt;
        }

        public void addAmountToDebt(int amount){
            this.debt += amount;
        }

        public void setDebt(int newDebt){
            this.debt = newDebt;
        }


    }




