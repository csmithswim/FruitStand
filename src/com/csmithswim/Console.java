package com.csmithswim;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);

    public boolean getYN(String yes, String no, String query) {
        String input = "";
        do {
            System.out.println(query);
            input = scanner.next();
        } while (!input.equals(yes) && !input.equals(no));
        return input.equals(yes);
    }

    public String[] getStockSelection() {
        System.out.println("\nEnter which type of product you want to stock.\n" + "The available products are [FRUIT, VEGETABLE].\n");
        String[] output = new String[3];
        do {
            System.out.print("Product: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fruit") || input.equalsIgnoreCase("vegetable")) {
                break;
            }
            System.out.println("\n" + input + " is not a valid product. The available products are [FRUIT, VEGETABLE].\n");
        } while (true);

        do {
        System.out.println("\nEnter PRODUCT, PRICE and QUANTITY with one space between each field.\n" +
                "For Example >>> Product Fields: orange 5 5_00 to stock 5 oranges that cost 5 dollars a piece.\n");
            System.out.print("Product Fields: ");
            String[] input = scanner.nextLine().split(" ");

            if (input.length == 3) {
                return input;
            }
            System.out.println("\nWrong input >>>> " + Arrays.toString(input) + " ");
        } while (true);

    }




    public String getString(String query) {
        System.out.println(query);
        return scanner.nextLine();
    }

    //Greets user & displays options & returns the input.
    public String getOption() {
            System.out.print("[STOCK, SELL, RECYCLE, EXIT].\n");
        do {
            System.out.print("Option: ");
            String[] options = new String[]{"STOCK", "SELL", "RECYCLE", "EXIT"};
            String input = scanner.nextLine();
            for (String e : options) {
                if (input.equalsIgnoreCase(e)) {
                   return input;
                }
            }
            System.out.println("\n" + input + " is not an option. The options are [STOCK, SELL, RECYCLE, EXIT].\n");
        } while (true);
    }
}
