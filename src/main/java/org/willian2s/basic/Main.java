package org.willian2s.basic;

/**
 * This Class is entry point of the program Java.
 */
public class Main {
  /**
   * The main method.
   *
   * @param args Command line arguments
   */
  public static void main(String[] args) {
    Variable var = new Variable();
    var.Print();

    DataType dataType = new DataType();
    dataType.Print();

    TypeCasting typeCasting = new TypeCasting();
    typeCasting.Print();

    Operators operators = new Operators();
    operators.Print();

    StringMethods stringMethods = new StringMethods();
    stringMethods.Print("Hello World!", "!");

    MathClass mathClass = new MathClass();
    mathClass.Print();

    IfElse ifElse = new IfElse();
    ifElse.Print(1, 2);

    SwitchCondition switchCondition = new SwitchCondition();
    switchCondition.Print(2);

    Loops loops = new Loops();
    loops.Print(1, 15);

    ArrayClass arrayClass = new ArrayClass();
    arrayClass.Print();

    ClassMethods classMethods = new ClassMethods();
    classMethods.method();
    classMethods.withParameter("Willian");
    String greeting = classMethods.withReturn("Willian");
    System.out.println(greeting);

    int intNum = classMethods.plusMethod(2, 3);
    System.out.println("Int: " + intNum);
    double doubleNum = classMethods.plusMethod(2.5, 3.5);
    System.out.println("Double: " + doubleNum);

    Recursion recursion = new Recursion();
    int sum = recursion.sum(5);
    System.out.println("Sum: " + sum);

    int halting = recursion.sum(10, 5);
    System.out.println("Halting: " + halting);
  }
}
