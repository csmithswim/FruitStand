package com.csmithswim;

public interface Register {
    //add products to inventory
    void stockProduct(String[] product);

    //add products to priceList
    void catalog();

    //sell products
    void sell();

    //throw away products
    void recycle();
}
