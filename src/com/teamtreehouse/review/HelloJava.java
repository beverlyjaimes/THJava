package com.teamtreehouse.review;

import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a random number: ");
        int userNumber = input.nextInt();
        System.out.println("You entered "+ userNumber);

    }
}
