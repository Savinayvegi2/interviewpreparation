package com.example.oops;

/**
 * All properties and behavior of parent class Zoo are
 * acquired by subclass Animal and subclass Animal act as a parent class to the another
 * subclass to acquire properties is known as MultiLevel Inheritance
 */
class Zoo {
    String zooName;
    String zooPlace;

    void displayZooName(String zooName) {
        this.zooName = zooName;
        System.out.println("Zoo Name: "+zooName);
    }
}

/**
 * Subclass Animal Acquires properties from parent class Zoo
 * And it acts as parent class to it's subclass MultiLevelInheritance
 */
class Animal extends Zoo {
    String animalName;
    String animalAction;

    void displayAnimalName(String animalName) {
        this.animalName = animalName;
        System.out.println("Animal Name: "+animalName);
    }
}

/**
 * Subclass MultiLevelInheritance acquires properties from it's
 * parent class Animal which is subclass of it's parent class Zoo
 */
public class MultiLevelInheritance extends Animal {
    void displayAnimalAction(String animalAction) {
        this.animalAction = animalAction;
        System.out.println("Animal Action: "+animalAction);
    }
    void displayZooPlace(String zooPlace) {
        this.zooPlace = zooPlace;
        System.out.println("Zoo Place: "+zooPlace);
    }

    public static void main(String[] args) {
        MultiLevelInheritance obj = new MultiLevelInheritance();
        obj.displayAnimalAction("Running");
        obj.displayZooName("Nehru zoo park");
        obj.displayAnimalName("Lion");
        obj.displayZooPlace("Vizag");
    }

}
