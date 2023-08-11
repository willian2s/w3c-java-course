package org.willian2s.basic;

import java.util.Arrays;

// Arrays
// Are used to store multiple values in a single variable, instead of declaring separate variables for each value.
//
// To declare an array, define the variable type with square brackets:
public class ArrayClass {
  public void Print() {
    this.Arrays();
    this.MultiDimensionalArray();
  }

  private void Arrays() {
    String[] cars = {"Volvo", "Audi", "BMW"};
    System.out.println(Arrays.toString(cars));
    System.out.println(cars[0]);

    // Change the value of the array
    cars[0] = "Toyota";
    System.out.println(Arrays.toString(cars));

    // Loop through the array
    for (String car : cars) {
      System.out.println(car);
    }
  }

  private void MultiDimensionalArray() {
    int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9},
    };
    System.out.println(matrix[0][2]);

    // Change the value of the array
    matrix[0][2] = 10;
    System.out.println(matrix[0][2]);

    // Loop through the array
    for (int[] ints : matrix) {
      for (int anInt : ints) {
        System.out.println(anInt);
      }
    }
  }
}
