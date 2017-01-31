package com.galvanize;

import java.util.*;

public class Business implements Addressable {
  private String name;
  private ArrayList<Address> addresses = new ArrayList<Address>();

  public Business(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public List<Address> getAddresses() {
    List<Address> result = new ArrayList<Address>();

    for (Address address : this.addresses) {
      result.add(address);
    }

    return result;
  }

  public void addAddress(Address newAddress) {
    this.addresses.add(newAddress);
  }
}
