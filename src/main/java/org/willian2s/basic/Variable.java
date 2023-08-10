package org.willian2s.basic;

// Names can contain letters, digits, underscores, and dollar signs
// Names must begin with a letter
// Names should start with a lowercase letter, and it cannot contain whitespace
// Names can also begin with $ and _ (but we will not use it in this tutorial)
// Names are case-sensitive ("myVar" and "myvar" are different variables)
// Reserved words (like Java keywords, such as int or boolean) cannot be used as names
public class Variable {

  public void Print() {
    String name = "Willian", lastName = "Silva";
    System.out.println("Full Name " + name + " " + lastName);
    int age = 26;
    System.out.println("Age " + age);
    float height = 1.75f;
    System.out.println("Height " + height);
    char gender = 'M';
    System.out.println("Gender " + gender);
    boolean isMarried = true;
    System.out.println("isMarried " + isMarried);
  }
}
