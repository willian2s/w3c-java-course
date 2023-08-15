package org.willian2s.classes;

import java.util.Scanner;

// The Scanner class is used to get user input, and it is found in the java.util package.
//
// To use the Scanner class,
// create an object of the class and use any of the available methods found in the Scanner class documentation
//
// Method	Description
// nextBoolean()    Reads a boolean value from the user
// nextByte()       Reads a byte value from the user
// nextDouble()     Reads a double value from the user
// nextFloat()      Reads a float value from the user
// nextInt()        Reads a int value from the user
// nextLine()       Reads a String value from the user
// nextLong()       Reads a long value from the user
// nextShort()      Reads a short value from the user
public class UserInputs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    String username = sc.nextLine();

    System.out.println("Enter your age:");
    int age = sc.nextInt();

    System.out.println("Enter your salary:");
    double salary = sc.nextDouble();
    System.out.println("Your name is " + username + " and your age is " + age + " and your salary is " + salary);
  }
}
