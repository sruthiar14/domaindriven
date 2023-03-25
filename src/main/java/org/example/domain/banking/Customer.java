package org.example.domain.banking;

import java.util.List;

public class Customer {
    List<Accounts> accountsList;
    Address address;

    public Customer(List<Accounts> accountsList, Address address) {
        this.accountsList = accountsList;
        this.address = address;
    }

    public void updateAddress(Address address) {
        this.address = address;
            for(Accounts account : accountsList){
                account.setAddress(address);
            }
    }
}
