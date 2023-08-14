package org.willian2s.classes;

// Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
//
// Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class.
// Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

// Why And When To Use Abstract Classes and Methods?
// To achieve security - hide certain details and only show the important details of an object.
//
// Note: Abstraction can also be achieved with Interfaces, which you will learn more about in the next chapter.

// Interfaces
// Another way to achieve abstraction in Java, is with interfaces.
//
// An interface is a completely "abstract class" that is used to group related methods with empty bodies:
//
// Notes on Interfaces:
// - Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
// - Interface methods do not have a body - the body is provided by the "implement" class
// - On implementation of an interface, you must override all of its methods
// - Interface methods are by default abstract and public
// - Interface attributes are by default public, static and final
// - An interface cannot contain a constructor (as it cannot be used to create objects)
//
// Why And When To Use Interfaces?
//  1) To achieve security - hide certain details and only show the important details of an object (interface).
//
//  2) Java does not support "multiple inheritance" (a class can only inherit from one superclass).
//     However, it can be achieved with interfaces, because the class can implement multiple interfaces.
//     Note: To implement multiple interfaces, separate them with a comma.
interface Animal {
  public void animalSound();

  public void sleep();
}

class Pig implements Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }

  public void sleep() {
    System.out.println("Zzz");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    Pig pig = new Pig();
    pig.animalSound();
  }
}
