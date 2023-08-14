package org.willian2s.classes;

// Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
//
// Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class.
// Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
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
  public void fly() {
    System.out.println("The eagle flies high");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.animalSound();

    Dog dog = new Dog();
    dog.animalSound();

    Cat cat = new Cat();
    cat.animalSound();

    Pig pig = new Pig();
    pig.animalSound();

    Eagle eagle = new Eagle();
    eagle.animalSound();
    eagle.fly();
  }
}
