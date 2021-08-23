package com.csmithswim;

abstract class Product {
    private int price;
    private String name;
    private String sku;
    private String type;

    public Product(int price, String name, String sku, String type) {
        this.price = price;
        this.name = name;
        this.sku = sku;
        this.type = type;
    }
}
