package com.csmithswim;


//SKU is 8 characters

public class PointOfSale {
    Console console = new Console();

    public void run() {
        Store store = new Store("Hell Foods", 1, "420 In Your Dreams Lane, Providence, Rhode Island, 02906", 150_00);
        boolean exitNumber = true;

        String choice = console.greetUser();

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
            console.getStockSelection();

        }
        if (choice.equalsIgnoreCase("EXIT")) {
            System.out.println("\nGoodbye and have a GREAT DAY!");
            exitNumber = false;
        }


        while (exitNumber);
    }
}






