package org.example.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public class Cart {
    private UUID id;
    private List<Item> items;
    private boolean isCheckedOut = false;

    public void checkOut() {
        isCheckedOut =true;
    }

    //product hashset
    private HashSet<Product> removedItems;

    public Cart() {
        this.id=UUID.randomUUID();
        this.items = new ArrayList<>();
        this.removedItems=new HashSet<>();
    }
    public void add(Item item) {
        items.add(item);
    }

    public void showItemsInCart() {
        for(Item item:items){
            System.out.println(item.getProduct().getName()+" "+item.getQuantity());
        }

    }
    public void remove(Item item){
        for(int i=0;i<items.size();i++) {
            if (items.get(i).equals(item)) {
                removedItems.add(items.get(i).getProduct());
                items.remove(items.get(i));
            }
        }
    }

    public void showRemovedItems() {
        for(Product removedItem:removedItems){
            System.out.println("removed items : "+removedItem.getName());
        }
    }

}
