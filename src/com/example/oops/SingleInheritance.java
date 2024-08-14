package com.example.oops;

/**
 * The subclass that acquires properties and behavior from it's
 * parent class is known as Single inheritance
 */
class Employee {
    String empName;
    int empAge;
    Employee(int empAge, String empName) {
        this.empAge = empAge;
        this.empName = empName;
    }
    void displayName() {
        System.out.println("Employee Name: " + empName);
    }
}

/**
 * single inheritance acquires properties from parent class
 * employee along with its implementation
 */
public class SingleInheritance extends Employee{

    SingleInheritance(int empAge, String empName) {
        super(empAge, empName);
    }
    void displayAge() {
        System.out.println("Employee Age: " + empAge);
    }

    public static void main(String[] args) {
        SingleInheritance singleInheritance = new SingleInheritance(20,"Savi");
        singleInheritance.displayName();
        singleInheritance.displayAge();
    }
}
