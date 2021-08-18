package com.practice;
// basic calculator program

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your first number");
        double firstnumber=scanner.nextDouble();
        System.out.println("enter your second number");
        double secondnumber=scanner.nextDouble();
        double answer= firstnumber + secondnumber;
        System.out.println("the sum is:"+ answer);

    }
}
