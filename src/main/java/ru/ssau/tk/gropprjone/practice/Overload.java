package ru.ssau.tk.gropprjone.practice;

import sun.reflect.generics.tree.VoidDescriptor;

public class Overload {

    static void printType(byte value) {
        System.out.println("byte");
    }

    static void printType(char value) {
        System.out.println("char");
    }

    static void printType(short value) {
        System.out.println("short");
    }

    static void printType(int value) {
        System.out.println("int");
    }

    static void printType(long value) {
        System.out.println("long");
    }

    static void printType(float value) {
        System.out.println("float");
    }

    static void printType(double value) {
        System.out.println("double");
    }

    static void printType(boolean value) {
        System.out.println("boolean");
    }

    static void printType(Object value) {
        if (value == null) {
            System.out.println("null");
        } else {
            System.out.println(value.getClass().getSimpleName());
        }
    }
}
