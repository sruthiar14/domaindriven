package org.example.domain;

import java.util.Objects;

public class Item {
    public Product getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return quantity == item.quantity && Objects.equals(product, item.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, product);
    }

    public Item() {
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;
    public int getQuantity() {
        return quantity;
    }

    private Product product;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

}
