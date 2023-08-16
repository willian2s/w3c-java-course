package org.willian2s.classes;

import java.util.HashSet;

// HashSet
// - A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
public class HashSetClass {
  public static void main(String[] args) {
    // Create an HashSet
    HashSet<String> cars = new HashSet<>();

    // Add an element
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    // Note: In the example above, even though BMW is added twice it only
    // appears once in the set because every item in a set has to be unique.
    System.out.println(cars);

    // Check if an element is in the set
    System.out.println(cars.contains("BMW"));

    // Remove an element
    cars.remove("BMW");
    System.out.println(cars);

    // Size of the set
    System.out.println(cars.size());

    // Loop through the set
    for (String car : cars) {
      System.out.println(car);
    }

    // Clean the set
    cars.clear();
  }
}
