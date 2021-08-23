package com.csmithswim;

import java.util.HashMap;

public class Store {
    private String name;
    private int employees;
    private String address;
    private long balance;

    //HashMap to store SKU/prices
    private HashMap<String, Long> priceList;

    //HashMap to store how many products there are in the store.
    private HashMap<String, Long> inventory;

    //Constructor
    public Store(String name, int employees, String address, long balance) {
        this.name = name;
        this.employees = employees;
        this.address = address;
        this.balance = balance;

        HashMap<String, Long> priceList = new HashMap<>();
        HashMap<String, Long> inventory = new HashMap<>();
    }
}




