package com.csmithswim;

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


    public String getString(String query) {
        System.out.println(query);
        return scanner.nextLine();
    }



}
