package com.TechSolution;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(" enter num1 op num2 (5 * 7): ");

        Scanner s = new Scanner(System.in);
        double d1 = s.nextDouble();
        char op = s.next().charAt(0);
        double d2 = s.nextDouble();

        if (op == '+')
            System.out.println(d1 + d2);
        else if (op == '-')
            System.out.println((int) (d1 + d2));
        else if (op == '-')
            System.out.println((int) (d1 - d2));
        else if (op == '-')
            System.out.println((d1 / d2));
        else if (op == '-')
            System.out.println((int) (d1 * d2));

    }
}
