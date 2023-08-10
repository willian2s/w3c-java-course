package org.willian2s;

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
  }
}
