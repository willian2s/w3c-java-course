package org.willian2s;

public class TypeCasting {

    public void Print() {
        System.out.println("Widening Casting");
        this.Widening();
        System.out.println("Narrowing Casting");
        this.Narrowing();
    }
    private void Widening() {
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double
        int myNum = 5;
        double myDouble = myNum;
        System.out.println("My Int: " + myNum);
        System.out.println("My Double: " + myDouble);
    }

    private void Narrowing() {
        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte

        double myDouble = 9.88d;
        int myNum = (int) myDouble;
        System.out.println("My Double: " + myDouble);
        System.out.println("My Int: " + myNum);
    }
}
