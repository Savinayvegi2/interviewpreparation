package com.example.coding;

import java.util.Scanner;

public class WaveOfMatrix {
    public static void main(String[] args) {
        int matric[][], rows, column;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        rows = in.nextInt();
        System.out.print("Enter the number of columns : ");
        column = in.nextInt();
        matric = new int [rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                matric[i][j] = in.nextInt();
            }
        }
        for(int j=0;j<matric[0].length;j++) {
            if(j% 2 == 0) {
                for(int i=0;i<matric.length;i++) {
                    System.out.print(matric[i][j] + " ");
                }
            } else {
                for(int i=matric.length-1;i>=0;i--) {
                    System.out.print(matric[i][j] + " ");
                }
            }
            System.out.println();

        }
    }
}
