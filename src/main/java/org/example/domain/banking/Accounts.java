package org.example.domain.banking;

public class Accounts {
    long id;
    Address address;

    public Accounts(long id,Address address) {
        this.id = id;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
