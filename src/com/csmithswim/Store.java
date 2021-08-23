package com.csmithswim;

import java.util.HashMap;

public class Store implements Register {
    private String name;
    private int employees;
    private String address;
    private long balance;

    //HashMap to store how many products there are in the store.
    private HashMap<String, Integer> inventory = new HashMap<>();

    @Override
    public void stockProduct(String[] product) {
        System.out.println(product[0]);
        String productName = product[0];
        int quantity = Integer.parseInt(product[1]);
        StringBuilder message = new StringBuilder(quantity + " " + productName + " added to inventory.\n");
        if (quantity > 1 ) {
            message.replace(productName.length() + 2, productName.length() + 3, "(s) ");
        }
        if (inventory.containsKey(productName)) {
            inventory.put(productName, inventory.get(productName) + quantity);
        }
        else if (!inventory.containsKey(productName)) {
            inventory.put(productName, quantity);
        }

        System.out.println(inventory);
        System.out.println(message);
    }



    //HashMap to store SKU/prices
    private HashMap<String, Integer> priceList;

    @Override
    public void catalog() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void recycle() {

    }

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




