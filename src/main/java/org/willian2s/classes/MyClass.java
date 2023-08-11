package org.willian2s.classes;

public class MyClass {
  // attribute can't overwrite
  final int x = 5;
  int y;

  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.myPublicMethod();
    myStaticMethod();
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
}
