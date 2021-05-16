package com.company;

import java.util.Scanner;

public class Shop {
    private String name;
    private String address;
    private int countOfProduct;
    private int priceForProduct;
    private int shopBalance;

    public Shop(String name, String address, int countOfProduct, int priceForProduct, int shopBalance) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;
    }

    private boolean checkProduct(int countOrder) {
        boolean check = false;
        if (countOfProduct >= countOrder) {
            check = true;
        }
        return check;
    }

    public void acceptOrder(int countOrder) {
        Scanner scanner = new Scanner(System.in);
        boolean check = checkProduct(countOrder);
        if (check) {
            System.out.println("We have this product");
            System.out.println("If you want to buy it, Please press 1 , if you don't want to buy it press any bottom");
            String input = scanner.next();
            if (input.equals("1")) {
                int total = calculateTotal(countOrder);
                addToBalance(total);
                System.out.println("You must to pay " + total);
                System.out.println("Thanks for your order");
            } else {
                System.out.println("We hope you will come back");
            }
        } else {
            System.out.println("Now we don't have so much product,sorry");
        }
    }

    private int calculateTotal(int countOrder) {
        int total = priceForProduct * countOrder;
        return total;
    }

    private void addToBalance(int total) {
        shopBalance += total;
    }

}
