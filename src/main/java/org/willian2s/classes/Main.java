package org.willian2s.classes;

public class Main {

  public static void main(String[] args) {
    Car car = new Car(200, "Mustang");
    car.fullThrottle();
    car.speed();
    car.getInfo();

    // Final
    // If you don't want the ability to override existing attribute values, declare attributes as final:
    Modifiers myObj = new Modifiers();
    // myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    // myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
    System.out.println(myObj.PI);

    // Static method
    myObj.myPublicMethod();

    Encapsulation encapsulation = new Encapsulation();
    System.out.println(encapsulation.getName());
    encapsulation.setName("Silva");
    System.out.println(encapsulation.getName());
  }
}
