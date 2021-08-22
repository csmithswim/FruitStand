package com.csmithswim;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public int balance;
    List<Product> products = new ArrayList<>();

    public int getBalance() {
        return balance;
    }

    public List<Product> addFruit(Fruit fruit) {
        products.add(fruit);
        return products;
    }
    public List<Product> addVegetable(Vegetable vegetable) {
        products.add(vegetable);
        return products;
    }

    public String printInventory(List<Fruit> fruit, List<Vegetable> vegetables) {
        StringBuilder output = new StringBuilder();

        //loop through products and append to output.
        for (Product e : products) {

            output.append(e.getName());
        }

        return output.toString();
    }

}
