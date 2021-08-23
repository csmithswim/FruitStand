package com.csmithswim;


//SKU is 8 characters

public class PointOfSale {
    Console console = new Console();

    public void run() {
        System.out.print("Welcome to Hell Foods.\n");
        Store store = new Store("Hell Foods", 1, "420 In Your Dreams Lane, Providence, Rhode Island, 02906", 150_00);
        boolean exitNumber = true;

        while (exitNumber) {
            String choice = console.getOption();

        /* Greet user, display options [STOCK, SELL, RECYCLE, EXIT].
            if STOCK
                Print how parameters should be input
                validate params
                deduct long value from store balance
                increment long value from store inventory

            if SELL

            if RECYCLE
        */
            if (choice.equalsIgnoreCase("STOCK")) {
                store.stockProduct(console.getStockSelection());
            continue;
            }
            if (choice.equalsIgnoreCase("EXIT")) {
                System.out.println("\nGoodbye and have a GREAT DAY!");
                exitNumber = false;
            }
        }

    }
}






