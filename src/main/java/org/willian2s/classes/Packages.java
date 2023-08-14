package org.willian2s.classes;

import java.util.Date;
import java.util.Scanner;

public class Packages {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter username:");

    String username = sc.nextLine();
    System.out.println("Hello " + username);

    System.out.println("Date: " + new Date());
  }
}
