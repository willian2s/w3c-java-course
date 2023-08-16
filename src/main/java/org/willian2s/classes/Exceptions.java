package org.willian2s.classes;

import java.util.Scanner;

// Exception
// - When executing Java code, different errors can occur:
//   coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.
//
// - When an error occurs, Java will normally stop and generate an error message. The technical term for this is:
//   Java will throw an exception (throw an error).
public class Exceptions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age:");
    int age = sc.nextInt();
    try {
      if (age < 18){
        throw new ArithmeticException("Access denied - You must be at least 18 years old.");
      }
      System.out.println("Access granted - You are old enough!");
    } catch (Exception e) {
        assert System.out != null;
        System.out.println("Something went wrong");
    } finally {
        assert System.out != null;
        System.out.println("Finally");
    }
  }
}
