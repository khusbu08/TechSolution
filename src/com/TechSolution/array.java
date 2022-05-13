package com.TechSolution;

import org.w3c.dom.ls.LSOutput;

public class array {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        numbers[0] = 5;
        numbers[2] = 8;
        numbers[4] = 10;
        System.out.println(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i] + " ");
    }



}
