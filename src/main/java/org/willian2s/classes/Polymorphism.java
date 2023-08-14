package org.willian2s.classes;

// Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
//
// Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class.
// Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

// Why And When To Use Abstract Classes and Methods?
// To achieve security - hide certain details and only show the important details of an object.
//
// Note: Abstraction can also be achieved with Interfaces, which you will learn more about in the next chapter.
abstract class Animal {
  abstract public void animalSound();

  public void sleep() {
    System.out.println("Zzz");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Cat extends Animal {
  public void animalSound() {
    System.out.println("The cat says: meow");
  }
}

class Eagle extends Animal {
  public void animalSound() {
    System.out.println("The eagle says: fly fly");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.animalSound();
    dog.sleep();

    Cat cat = new Cat();
    cat.animalSound();

    Pig pig = new Pig();
    pig.animalSound();

    Eagle eagle = new Eagle();
    eagle.animalSound();
  }
}
