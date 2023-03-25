package org.example.application;

import org.example.domain.*;
import org.example.domain.banking.Accounts;
import org.example.domain.banking.Address;
import org.example.domain.banking.Customer;
import org.example.domain.domain_service.DiscountPriceCalculator;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();
        DiscountPriceCalculator discountPriceCalculator =new DiscountPriceCalculator();
        Price price = new Price(Currency.getInstance("USD"), 2000);
        Product applePencil = new Product("Apple Pencil", new Price(Currency.getInstance("USD"), discountPriceCalculator.calculateDiscountedPrice("apple pods")));

        Product sonyWirelessHeadphone = new Product("Sony Wireless headphone", new Price(Currency.getInstance("USD"),1));
        Item applePencilItem1 = new Item(applePencil, 1);
        Item applePencilItem2 = new Item(applePencil, 1);
        Item competitorApplePencil = new Item(applePencil, 1);
        Item sonyHeadphoneItem = new Item(sonyWirelessHeadphone, 2);

        cart.add(applePencilItem1);
        cart.add(sonyHeadphoneItem);
        cart.showItemsInCart();
        cart.remove(applePencilItem1);
        cart.showItemsInCart();
        cart.add(applePencilItem2);
        cart.add(competitorApplePencil);
        cart.showRemovedItems();
        cart.showItemsInCart();

        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Item item1 = new Item(sonyWirelessHeadphone, 1);
        Item item2 = new Item(sonyWirelessHeadphone, 1);
        cart1.add(item1);
        cart2.add(item2);

        List<Accounts> accountsList = new ArrayList<>();
        accountsList.add(new Accounts(1,new Address("mumbai")));
        accountsList.add(new Accounts(2,new Address("mumbai")));

        Customer customer = new Customer(accountsList,new Address("mumbai"));
        customer.updateAddress(new Address("pune"));

        System.out.println(cart1.equals(cart2));
    }
}