package com.example.oops;

/**
 * All properties and behavior from parent class College
 * are acquired by two different subclasses Student and Department
 * is known as Hirarical Inheritance
 */
class College {
    String collegeName;
    String studentName;
    String departmentName;

    void displayCollegeName(String collegeName) {
        this.collegeName = collegeName;
        System.out.println("College Name: " + collegeName);
    }
    void displayStudentName(String studentName) {
        this.studentName = studentName;
        System.out.println("Student Name: " + studentName);
    }
    void displayDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        System.out.println("Department Name: " + departmentName);
    }
}
class Student extends College {
    String studentName;

    @Override
    void displayStudentName(String studentName) {
        this.studentName = studentName;
        System.out.println("Student Name: " + studentName);
    }
}

class Department extends College {
    String departmentName;

    @Override
    void displayDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        System.out.println("Department Name: " + departmentName);
    }
}
public class HiraricalInheritance {
    public static void main(String[] args) {
        College obj = new College();

        obj.displayCollegeName("Vits");
        obj.displayStudentName("Vinay");
        obj.displayDepartmentName("CSE");
    }
}
