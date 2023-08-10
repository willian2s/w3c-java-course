package org.willian2s;

// Java Conditions and If Statements
// You already know that Java supports the usual logical conditions from mathematics:
//
// Less than: a < b
// Less than or equal to: a <= b
// Greater than: a > b
// Greater than or equal to: a >= b
// Equal to a == b
// Not Equal to: a != b
// You can use these conditions to perform different actions for different decisions.
//
// Java has the following conditional statements:
//
// Use if to specify a block of code to be executed, if a specified condition is true
// Use else to specify a block of code to be executed, if the same condition is false
// Use else if to specify a new condition to test, if the first condition is false
// Use switch to specify many alternative blocks of code to be executed
public class IfElse {
  public void Print(int x, int y) {
    if (x > y) {
      System.out.println(x + " is greater than " + y);
    } else if (x < y) {
      System.out.println(x + " is not greater than " + y);
    } else {
      System.out.println(x + " is equal to " + y);
    }
  }
}
