package com.csmithswim;

abstract class Product {
    private String name;
    private int price;
    private String sku;

    public Product(int price, String name, String sku) {
        this.price = price;
        this.name = name;
        this.sku = sku;
    }
}
