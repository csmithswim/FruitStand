package com.csmithswim;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public int balance;
    List<Product> products = new ArrayList<>();

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
       StringBuilder output = new StringBuilder();
       for (Product e : products) {
           output.append(e + " ");
       }
       return new String(output);
    }
}
