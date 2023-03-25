package org.example.domain.domain_service;

import java.util.HashMap;

public class DiscountPriceCalculator {
    private final HashMap<String, Double> competitorPrice = new HashMap<>();

    public DiscountPriceCalculator(){
        this.competitorPrice.put("apple pods", 900.0);
        this.competitorPrice.put("mobile", 700.0);
    }
    public double calculateDiscountedPrice(String productName){
           return competitorPrice.get(productName);
    }
}


