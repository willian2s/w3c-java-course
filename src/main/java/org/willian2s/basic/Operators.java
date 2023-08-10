package org.willian2s.basic;

public class Operators {
  public void Print() {
    System.out.println("\t\t\t\t\t\t\tArithmetic Operators");
    System.out.println("Operator\tName\t\t\tDescription\t\t\t\t\t\t\t\t\tExample");
    System.out.println("+\t\t\tAddition\t\tAdds together two values\t\t\t\t\tx + y");
    System.out.println("-\t\t\tSubtraction\t\tSubtracts one value from another\t\t\tx - y");
    System.out.println("*\t\t\tMultiplication\tMultiplies two values\t\t\t\t\t\tx * y");
    System.out.println("/\t\t\tDivision\t\tDivides one value by another\t\t\t\tx / y");
    System.out.println("%\t\t\tModulus\t\t\tReturns the division remainder\t\t\t\tx % y");
    System.out.println("++\t\t\tIncrement\t\tIncreases the value of a variable by 1\t\t++x");
    System.out.println("--\t\t\tDecrement\t\tDecreases the value of a variable by 1\t\t--x");

    System.out.println("\tAssignment Operators");
    System.out.println("Operator\tExample\t\tSame As");
    System.out.println("=\t\t\tx = 5\t\tx = 5");
    System.out.println("+=\t\t\tx += 3\t\tx = x + 3");
    System.out.println("-=\t\t\tx -= 3\t\tx = x - 3");
    System.out.println("*=\t\t\tx *= 3\t\tx = x * 3");
    System.out.println("/=\t\t\tx /= 3\t\tx = x / 3");
    System.out.println("%=\t\t\tx %= 3\t\tx = x % 3");
    System.out.println("&=\t\t\tx &= 3\t\tx = x & 3");
    System.out.println("|=\t\t\tx |= 3\t\tx = x | 3");
    System.out.println("^=\t\t\tx ^= 3\t\tx = x ^ 3");
    System.out.println(">>=\t\t\tx >>= 3\t\tx = x >> 3");
    System.out.println("<<=\t\t\tx <<= 3\t\tx = x << 3");

    System.out.println("\tComparison Operators");
    System.out.println("Operator\tName\t\t\t\t\t\tExample");
    System.out.println("==\t\t\tEqual to\t\t\t\t\tx == y");
    System.out.println("!=\t\t\tNot equal\t\t\t\t\tx != y");
    System.out.println(">\t\t\tGreater than\t\t\t\tx > y");
    System.out.println("<\t\t\tLess than\t\t\t\t\tx < y");
    System.out.println(">=\t\t\tGreater than or equal to\tx >= y");
    System.out.println("<=\t\t\tLess than or equal to\t\tx <= y");

    System.out.println("\t\t\t\t\t\t\t\tLogical Operators");
    System.out.println("Operator\tName\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tExample");
    System.out.println("&&\t\t\tLogical and\tReturns true if both statements are true\t\t\t\t\t\tx < 5 && x < 10");
    System.out.println("||\t\t\tLogical or\tReturns true if one of the statements is true\t\t\t\t\tx < 5 || x < 4");
    System.out.println("!\t\t\tLogical not\tReverse the result, returns false if the result is true\t\t\t!(x < 5 && x < 10)");
  }
}
