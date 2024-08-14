package com.example.exceptionHandling;

import java.util.Scanner;

public class ExceptionForNumberDivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
       try {
               int remainder = num % 0;
               System.out.println(remainder);
       } catch (ArithmeticException e) {
           throw new ArithmeticException("Number cannot Divide by zero");
       }
    }
}
