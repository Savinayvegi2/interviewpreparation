package com.example.collections;

import java.util.*;

class Fruit {
    String name;
    int price;
    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Fruit [name=" + name + ", price=" + price + "]";
    }
}
public class ListExample {
    public static void main(String[] args) {

        /*
        * List: is an interface represents ordered collection of elements and  provides various methods
        * to manipulate and access elements in the list
        * */
        List<Fruit> fruits = Arrays.asList(
                new Fruit("Apple",200),
                new Fruit("Mango", 250),
                new Fruit("Orange",300)
        );

        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Kiwi", 250));
        fruitList.add(new Fruit("Pineapple", 300));
        fruitList.add(new Fruit("Pear", 200));

        /*
        * Iterator: is used for traversing of elements based on whether it has elements or not
        * it has two methods like hasNext(), next()
        * while loop is used to check the condition and it will iterate the loop
        * */
        Iterator<Fruit> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        for-each loop is also used for iteration purpose
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
        
        fruitList.forEach(name-> {
            System.out.println(name);
        });


    }
}
