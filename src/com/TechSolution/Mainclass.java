package com.TechSolution;

import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        String username = "Khusbu";
        System.out.println("hello" + username);

        System.out.print("Enter your name and age: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double age = input.nextDouble();

        System.out.println( name + " you are " + age + "years old! ");


    }
}
