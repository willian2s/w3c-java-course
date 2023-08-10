package org.willian2s.basic;

public class StringMethods {
  public void Print(String text, String find) {
    System.out.println(text);
    System.out.println("Length: " + text.length());
    System.out.println("Upper case: " + text.toUpperCase());
    System.out.println("Lower case: " + text.toLowerCase());
    System.out.println("IndexOf: " + text.indexOf(find));
    System.out.println("Contains: " + text.contains(find));
    System.out.println("Concat: " + text.concat(find));
  }
}
