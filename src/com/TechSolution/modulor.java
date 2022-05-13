package com.TechSolution;

import java.util.Scanner;

public class modulor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a four digit number: ");
        int n = s.nextInt();

        //ABCD
        int fourthDigit = n % 10;
        int thirdDigit = (n / 10) % 10;
        int secondDigit = (n / 100) % 10;
        int firstDigit = (n / 1000) % 10;

        if(firstDigit + secondDigit == thirdDigit + fourthDigit)
            System.out.println("lucky");
        else
            System.out.println("not lucky");

    }
}
