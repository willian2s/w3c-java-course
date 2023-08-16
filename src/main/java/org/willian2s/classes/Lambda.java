package org.willian2s.classes;

import java.util.ArrayList;
import java.util.function.Consumer;

// Lambda Expressions
// - Lambda expressions are usually passed as parameters to a function:
//
// - Lambda expressions can be stored in variables if the variable's type is an interface which has only one method.
//   The lambda expression should have the same number of parameters and the same return type as that method.
//   Java has many of these kinds of interfaces built in, such as the Consumer interface (found in the java.util package)
//   used by lists.
//
// - To use a lambda expression in a method, the method should have a parameter with a single-method interface as its type.
//   Calling the interface's method will run the lambda expression.
interface StringFunction {
  String run(String s);
}

public class Lambda {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    // Use a lambda expression in the ArrayList's forEach() method to print every item in the list:
    numbers.forEach(n -> {
      System.out.println(n);
    });

    // Use Java's Consumer interface to store a lambda expression in a variable:
    Consumer<Integer> print = n -> System.out.println(n);
    numbers.forEach(print);

    // Create a method which takes a lambda expression as a parameter:
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
  }

  public static void printFormatted(String s, StringFunction format) {
    String result = format.run(s);
    System.out.println(result);
  }
}
