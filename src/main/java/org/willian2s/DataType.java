package org.willian2s;

// Even though there are many numeric types in Java, the most used for numbers are int (for whole numbers) and double (for floating point numbers).

// The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c'
// Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:
// 'A' = 65, 'B' = 66, 'Z' = 90, 'a' = 97, 'b' = 98, 'z' = 122
//  A list of all ASCII values can be found in our ASCII Table Reference.

//The String type is so much used and integrated in Java, that some call it "the special ninth type".
//
//A String in Java is actually a non-primitive data type, because it refers to an object. The String object has methods that are used to perform certain operations on strings.
public class DataType {
  int myNum = 5;               // Integer (whole number)
  float myFloatNum = 5.99f;    // Floating point number
  char myLetter = 'D';         // Character
  boolean myBool = true;       // Boolean
  String myText = "Hello";     // String

  public void Print() {
    System.out.println("Data Type\tSize\t\tDescription");
    System.out.println("byte\t\t1 byte\t\tStores whole numbers from -128 to 127");
    System.out.println("short\t\t2 bytes\t\tStores whole numbers from -32,768 to 32,767");
    System.out.println("int\t\t\t4 bytes\t\tStores whole numbers from -2,147,483,648 to 2,147,483,647");
    System.out.println("long\t\t8 bytes\t\tStores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
    System.out.println("float\t\t4 bytes\t\tStores fractional numbers. Sufficient for storing 6 to 7 decimal digits");
    System.out.println("double\t\t8 bytes\t\tStores fractional numbers. Sufficient for storing 15 decimal digits");
    System.out.println("boolean\t\t1 bit\t\tStores true or false values");
    System.out.println("char\t\t2 bytes\t\tStores a single character/letter or ASCII values");
  }
}
