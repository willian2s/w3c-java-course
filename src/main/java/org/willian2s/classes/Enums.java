package org.willian2s.classes;

import java.util.Scanner;

enum Level {
  LOW, MEDIUM, HIGH
}

public class Enums {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter level:");
    Level level = Level.valueOf(sc.next().toUpperCase());

    switch (level) {
      case LOW -> System.out.println("Low level");
      case MEDIUM -> System.out.println("Medium level");
      case HIGH -> System.out.println("High level");
    }

    for (Level l : Level.values()) {
      System.out.println(l);
    }
  }
}
