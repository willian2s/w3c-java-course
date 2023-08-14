package org.willian2s.classes;

abstract class BaseModifiers {
  final int x = 10;
  final double PI = 3.14;

  public abstract void myPublicMethod();
}

// https://www.w3schools.com/java/java_modifiers.asp
public class Modifiers extends BaseModifiers {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    myStaticMethod();

    System.out.println("Public methods must be called by creating objects");
  }
}
