package com.TechSolution;

import java.util.Scanner;

public class whileloop {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        while(n <1 || n > 10) {
            System.out.println( n + "is not between 1 and 10.Try again:");
            n = s.nextInt();

        }
        System.out.println( n + "is between 1 and 10.");
    }
}

