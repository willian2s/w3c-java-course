package org.willian2s.basic;

// A method is a block of code which only runs when it is called.
//
// You can pass data, known as parameters, into a method.
//
// Methods are used to perform certain actions, and they are also known as functions.
//
// Why use methods? To reuse code: define the code once, and use it many times.

public class ClassMethods {
  public void method() {
    System.out.println("I'm a method!");
  }

  public void withParameter(String name) {
    System.out.println("Hello " + name);
  }

  public String withReturn(String name) {
    return "Hello " + name;
  }

  public int plusMethod(int a, int b) {
    return a + b;
  }

  public double plusMethod(double a, double b) {
    return a + b;
  }
}
