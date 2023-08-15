package org.willian2s.classes;


import java.util.HashMap;

// HashMap
// In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access them
// with an index number (int type). A HashMap however, store items in "key/value" pairs, and you can access them by
// an index of another type (e.g. a String).
//
// One object is used as a key (index) to another object (value). It can store different types:
// String keys and Integer values, or the same type, like: String keys and String values:
public class MyHashMap {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<>();

    // Add elements
    capitalCities.put("Spain", "Madrid");
    capitalCities.put("France", "Paris");
    capitalCities.put("Germany", "Berlin");
    System.out.println(capitalCities);

    // Get an element
    System.out.println(capitalCities.get("Spain"));

    // Remove an element
    capitalCities.remove("Spain");
    System.out.println(capitalCities);

    // Size
    System.out.println(capitalCities.size());

    // Loop through the array
    for (String key : capitalCities.keySet()) {
      System.out.println("key: " + key + " value: " + capitalCities.get(key));
    }

    // Clean the map
    capitalCities.clear();
    System.out.println(capitalCities);
  }
}
