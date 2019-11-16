package ru.ssau.tk.gropprjone.practice;

public class Array {

    static int[] workThisArray(int count) {
        return new int[count];
    }

    static int[] generation(int count) {
        int[] ar = new int[count];
        ar[0] = 2;
        ar[count - 1] = 2;
        for (int i = 1; i < count - 1; i++) {
            ar[i] = 1;
        }
        return ar;
    }

    static int[] oddNum(int count) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = 2 * i + 1;
        }
        return array;
    }

    static int[] evenNum(int count) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = 2 * (count - i);
        }
        return array;
    }

    static int[] fibonacci(int count) {
        int[] array = new int[count];
        array[0] = 1;
        array[1] = array[0];
        for (int i = 2; i < count; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    static int[] square(int count) {

        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = i * i;
        }
        return array;
    }

    static double[] solution(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D == 0) {
            return new double[]{-b / (2 * a)};
        }
        else if(D > 0) {
            return new double[]{(-b + Math.sqrt(D)) / (2 * a),(-b - Math.sqrt(D)) / (2 * a) };
        }
        else {
            return new double[0];
        }
    }
}


