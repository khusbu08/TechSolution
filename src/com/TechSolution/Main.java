package com.TechSolution;

import java.awt.*;
import java.awt.geom.Point2D;

public class Main {

    public static void main(String[] args) {
        final String COMPANY_NAME;
        COMPANY_NAME = "Tech Solution";
        System.out.println(COMPANY_NAME);
        boolean isAlive = true;
        if (isAlive)
            System.out.println("alive");
        else
            System.out.println("not alive");
        String s1 = "teCH SoluTIoN";
        int i = s1.length();
        System.out.println(i);
        System.out.println(s1.toUpperCase());
        String s2 = "";
        System.out.println(true);
        String S3 = "abcd";
        char c = S3.charAt(0);
        System.out.println(c);

        String s4 = "abcd";
        System.out.println(s4.indexOf('a'));
        s1.concat("Solution");
        System.out.println(s2);

        String part1 = "Tech";
        String part2 = "Solution";
        String full = part1 + " " + part2;
        System.out.println(full);



    }
}
