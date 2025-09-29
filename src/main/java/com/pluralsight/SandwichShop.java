package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void  main(String[]args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Regular: price ($5.45");
        System.out.println("Select Sandwich Size");
        System.out.println("Large: base price $8.95");
        System.out.println(" Enter 1 or 2: ");
        int sizeChoice = scan.nextInt();

        double basePrice = 0.0;
        switch (sizeChoice) {
            case 1:
                basePrice = 5.45;
                break;
            case 2 :
                basePrice = 8.95;
                break;
            default:
                System.out.println("Inavild choice, Defaulting equal regular size");
                basePrice = 5.45;

        }
        System.out.println(" Enter your age");
        int age = scan.nextInt();
        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10;

        } else if (age >= 65) {
            discount = 0.20

        }
        double finaLPrice = basePrice * (1 - discount);

        scan.close();


    }
}






