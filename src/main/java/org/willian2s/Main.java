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
    }
}