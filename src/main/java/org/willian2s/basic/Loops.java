package org.willian2s.basic;

// Loops
// Can execute a block of code as long as a specified condition is reached.
//
// Loops are handy because they save time, reduce errors, and they make code more readable.
public class Loops {

  public void Print(int x, int y) {
    // While Loop
    // The while loop loops through a block of code as long as a specified condition is true:
    this.whileLoop(x, y);

    // The Do/While Loop
    //  The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
    this.doWhileLoop(x, y);

    // For Loop
    // When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
    this.forLoop(x, y);

    // Nested Loops
    // It is also possible to place a loop inside another loop. This is called a nested loop.
    this.NestedLoops(x, y);

    // For-Each Loop
    // There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
    String[] cars = {"Volvo", "Audi", "BMW"};
    this.ForEachLoop(cars);
  }

  private void whileLoop(int x, int y) {
    while (x < y) {
      System.out.println(x);
      x++;
    }
  }

  private void doWhileLoop(int x, int y) {
    do {
      System.out.println(x);
      x++;
    } while (x < y);
  }

  private void forLoop(int x, int y) {
    for (int i = x; i < y; i++) {
      System.out.println(i);
    }
  }

  private void NestedLoops(int x, int y) {
    for (int i = 0; i < x; i++) {
      System.out.println("Outer: " + i);
      for (int j = 0; j < y; j++) {
        System.out.println(" Inner: " + j);
      }
    }
  }

  private void ForEachLoop(String[] cars) {
    for (String car : cars) {
      System.out.println(car);
    }
  }
}
