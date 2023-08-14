package org.willian2s.classes;

// Did you notice the protected modifier in Vehicle?
//
// We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car class would not be able to access it.
//
// Why And When To Use "Inheritance"?
// - It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
//
// Tip: Also take a look at the next chapter, Polymorphism, which uses inherited methods to perform different tasks.
class Vehicle {
  protected String brand;

  public void honk() {
    System.out.println("Tut, tut!");
  }
}

class MuscleCar extends Vehicle {
  private String model;

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
}

public class Inheritance {
  public static void main(String[] args) {
    MuscleCar car = new MuscleCar();
    car.honk();
    car.setModel("Mustang");
    System.out.println(car.getModel());
    car.setBrand("Ford");
    System.out.println(car.getBrand());
  }
}
