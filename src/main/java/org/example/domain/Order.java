package org.example.domain;

import java.util.List;

public class Order {
    private List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }

}
