package com.learning.basicTesting;

import java.util.ArrayList;
import java.util.Collection;

public class Client {
    private ArrayList<Address> addresses=new ArrayList<>();

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public void setAddresses(Address address)
    {
        addresses.add(address);
    }
}
