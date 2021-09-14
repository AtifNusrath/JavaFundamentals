package com.company;

public class PdataType {
    boolean val1;
    char val7;
    short val;
    double val2;
    float val3;
    int val4;
    long val5;
    String val6;
    public void printValue()
    {
        System.out.println("Default values.....");
        System.out.println("Boolean default value = " + val1);
        System.out.println("Char default value = " + val7);
        System.out.println("Short default value = " + val);
        System.out.println("double default value = " + val2);
        System.out.println("float default value = " + val3);
        System.out.println("int default value = " + val4);
        System.out.println("long default value = " + val5);
        System.out.println("String default value = " + val6);
    }
    public static void main(String[] args) {
        PdataType test = new PdataType();
        test.printValue();
    }
}
