package com.TechSolution;

import java.util.Scanner;

public class Getname {

    public static void main(String[] args) {
        System.out.println("enter your name: and age: ");
        System.out.println(getName() + " " + getAge());

    }
    public static String getName() {
        return new Scanner(System.in).nextLine();

    }
    public static double getAge() {
        return new Scanner(System.in).nextDouble();
    }
}
