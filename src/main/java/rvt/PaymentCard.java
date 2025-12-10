package rvt;

import java.util.*;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + "euros";
    }

    public void eatAffordably() {
        if (balance >= 2.60) {
            balance -= 2.60;
        }
        else {
            balance = balance;
        }
    }
    public void eatHeartily() {
        if (balance >= 4.60) {
            balance -= 4.60;
        }
        else {
            balance = balance;
        }   
    }

    public void addMoney(double amount) {
        if(amount > 0) {
            balance += amount;
        }
        if (balance > 150) {
            balance = 150;
        }

        if(amount < 0) {
            balance = balance;
        }
    
}
}