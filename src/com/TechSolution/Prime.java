package com.TechSolution;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println(" enter a number: ");
        int n = s.nextInt();

        int sum = 1;
        for(int i = 2; i <= n/2; i++)
            if( n % 1 == 0)
                sum +=i;

        System.out.println(sum ==1 ? " prime " : "not prime");

    }
}
