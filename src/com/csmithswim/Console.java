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

    public void StockSelection() {
        System.out.print("\nEnter which type of product you want to stock.\n" + "The available products are [FRUIT, VEGETABLE].\n");
        System.out.print("Input product here: ");

        String[] products = new String[]{"FRUIT, VEGETABLE"};
        String input = scanner.nextLine();
        boolean validChoice = true;




    }




    public String getString(String query) {
        System.out.println(query);
        return scanner.nextLine();
    }

    //Greets user & displays options & returns the input.
    public String greetUser() {
            System.out.print("Welcome to Hell Foods.\n" +
            "There are four available options: [STOCK, SELL, RECYCLE, EXIT].\n");
        do {
            System.out.print("Enter option: ");
            String[] options = new String[]{"STOCK", "SELL", "RECYCLE", "EXIT"};
            String input = scanner.next();
            for (String e : options) {
                if (input.equalsIgnoreCase(e)) {
                   return input;
                }
            }
            System.out.println("\n" + input + " is not an option. The options are [STOCK, SELL, RECYCLE, EXIT].\n");
        } while (true);
    }
}
