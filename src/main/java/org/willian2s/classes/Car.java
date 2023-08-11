package org.willian2s.classes;

public class Car {
  private final int maxSpeed;
  private final String model;

  public Car(int maxSpeed, String model) {
    this.maxSpeed = maxSpeed;
    this.model = model;
  }

  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed() {
    System.out.println("The car is going at " + this.maxSpeed + " km/h");
  }

  public void getInfo() {
    System.out.println("The car is " + this.model + " with a max speed of " + this.maxSpeed + " km/h");
  }
}
