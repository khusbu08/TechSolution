package com.TechSolution;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        System.out.println("Enter any Number ");
        Scanner  r=new Scanner(System.in);
        int i =r.nextInt();

        if(i%2==0) {
            System.out.println("Even ");
        }
        else {
            System.out.println("odd number");
        }
    }
}
