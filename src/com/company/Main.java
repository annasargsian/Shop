package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop("Sas", "Ninth Street", 10, 20, 0);
        System.out.println("How many pieces of this product do you need ?");
        shop.acceptOrder(scanner.nextInt());
    }
}
