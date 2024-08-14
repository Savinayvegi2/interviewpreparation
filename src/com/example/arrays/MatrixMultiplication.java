package com.example.arrays;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Matrix A
        System.out.print("Enter the number of rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = scanner.nextInt();

        int[][] matrixA = new int[rows][cols];
        System.out.println("Enter the elements for Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        int[][] matrixB = new int[rows][cols];
        System.out.println("Enter the elements for Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Multiply matrices
        int[][] result = multiplyMatrices(matrixA, matrixB);

        // Print the result
        System.out.println("Resultant Matrix:");
        printMatrix(result);

        scanner.close();
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
