package com.example.arrays;

public class SingleDimensionalArrayExample {

    public static void main(String[] args) {
        // Initialize an array to store grades of 5 students
        double[] grades = new double[5];

        // Assign grades to each student
        grades[0] = 88.5;
        grades[1] = 92.0;
        grades[2] = 79.5;
        grades[3] = 85.0;
        grades[4] = 91.0;

        // Print all grades
        System.out.println("Student Grades:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }

        // Calculate and print the average grade
        double average = calculateAverage(grades);
        System.out.println("Average Grade: " + average);

        // Find and print the highest grade
        double highest = findHighestGrade(grades);
        System.out.println("Highest Grade: " + highest);
    }

    // Method to calculate the average grade
    public static double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Method to find the highest grade
    public static double findHighestGrade(double[] grades) {
        double highest = grades[0];
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
}
