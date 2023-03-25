package org.example.domain;

import java.util.Currency;

public class Price {
    Currency currency;
    double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Price(Currency currency, double value) {
        this.currency = currency;
        this.value = value;
    }

    public double calculateDiscountedPrice(int value){
        return value-0.10*value;
    }

}
