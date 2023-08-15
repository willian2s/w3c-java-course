package org.willian2s.classes;

import java.util.ArrayList;
import java.util.Collections;

// The ArrayList class is a resizable array, which can be found in the java.util package.
// The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
// (if you want to add or remove elements to/from an array, you have to create a new one).
// While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
public class Array {
  public static void main(String[] args) {
    // Create an ArrayList
    ArrayList<String> cars = new ArrayList<>();
    System.out.println(cars);

    // Add an element
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Audi");
    System.out.println(cars);

    // Get an element
    System.out.println(cars.get(0));

    // Change an element
    cars.set(0, "Toyota");
    System.out.println(cars);

    // Remove an element
    cars.remove(0);
    System.out.println(cars);

    // Array length
    System.out.println(cars.size());

    // Loop through the array
    for (String car : cars) {
      System.out.println(car);
    }

    // Sort the array
    Collections.sort(cars);
    System.out.println(cars);

    // Clean the array
    cars.clear();
    System.out.println(cars);
  }
}
