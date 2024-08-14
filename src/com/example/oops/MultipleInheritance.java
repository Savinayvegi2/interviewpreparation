package com.example.oops;

/**
 * Multiple inheritance is not supported in java due to diamond problem
 * to overcome the diamond problem interface is used to achieve the functionality
 * of multiple inheritance.
 * Interface: is a blueprint of class where we can have only one abstract method without
 * method body. It can be either implemented by a class or
 * extended by another interface
 */
interface Person {
    void getPersonName(String name);
}
interface Designation extends Person {
    void getDesignation(String designation);
}
public class MultipleInheritance implements Person, Designation {
    @Override
    public void getDesignation(String designation) {
        System.out.println("Designation: " + designation);
    }

    @Override
    public void getPersonName(String name) {
        System.out.println("Person Name "+name);
    }

    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance();
        mi.getPersonName("John");
        mi.getDesignation("Engineering");

    }
}
