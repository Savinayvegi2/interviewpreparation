package com.example.coding;

import java.util.Scanner;

public class FibonaciSeriesAtNthNumber {
    public static void main(String[] args) {
        int firstNumber=0, secondNumber=1,temp =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        if(n==0) {
            System.out.println(firstNumber);
        } else if (n==1) {
            System.out.println(secondNumber);
        } else {
//            0-0, 1-1, 2-1, 3-2, 4-3
            for(int i=2;i<=n-1;i++) {
                temp = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = temp;
            }

            System.out.println(temp);
        }
    }
}
