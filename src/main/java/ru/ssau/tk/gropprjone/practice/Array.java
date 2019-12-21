package ru.ssau.tk.gropprjone.practice;


import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

class Array {

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
        if (a != 0) {
            if (D == 0) {
                return new double[]{-b / (2 * a)};
            } else if (D > 0) {
                return new double[]{(-b + Math.sqrt(D)) / (2 * a), (-b - Math.sqrt(D)) / (2 * a)};
            } else {
                return new double[0];
            }
        } else {
            return new double[]{-c / b};
        }
    }

    static int[] natural(int count) {
        int[] array = new int[count];
        int j = 1;
        for (int i = 0; i < count; i++) {
            if (j % 3 == 0) {
                j++;
            }
            array[i] = j;
            j++;
        }
        return array;
    }

    static double[] arithmeticProgression(int count, double first, double dis) {
        double[] array = new double[count];
        array[0] = first;
        for (int i = 1; i < count; i++) {
            array[i] = array[i - 1] + dis;
        }
        return array;
    }

    static double[] geometricProgression(int count, double first, double den) {
        double[] array = new double[count];
        array[0] = first;
        for (int i = 1; i < count; i++) {
            array[i] = array[i - 1] * den;
        }
        return array;
    }

    /*static double[] dividers(int dividend) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(dividend); i++) {
            if (dividend % i == 0)
                count++;
        }
    }

     */
    static void invertArray(Number[] array) {
        for (Number arr : array) {
            if (array instanceof Double[]) {
                arr = -(Double) arr;
            }
            if (array instanceof Integer[]) {
                arr = -(Integer) arr;
            }
        }

    }

    static boolean arrayContainNumber(Number[] array, Number number) {
        for (Number value : array) {
            if (value.equals(number)) {
                return true;
            }
        }
        return false;
    }

    static boolean arrayIsNull(Integer[] array) {
        for (Integer i : array) {
            if (i == null) {
                return true;
            }
        }
        return false;
    }

    static int countOfEvenNumber(double[] array) {
        int k = 0;
        for (double v : array) {
            if (v % 2 == 0) {
                k++;
            }
        }
        return k;
    }

    static int countOfInteger(int[] array) {

        if (array.length == 0) {
            return Integer.parseInt(null);
        }
        int j = array[0];
        for (int i = 1; i < array.length; i++) {
            if (j < array[i])
                j = array[i];
        }
        return j;
    }

    static double sumOfEvenIndex(double[] array) {
        double sum = 0;
        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    static boolean divisionOfElements(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value % array[0] == 0) {
                count++;
            }
            if (value % array[array.length - 1] == 0) {
                count--;
            }
        }
        return (count > 0);
    }

    static int indexOfElement(double[] array, double k) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                return i;
            }
        }
        return 0;
    }


    static void stringArray(String[] strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    static double multiplication(double[] array) {
        double tmp = 1;
        for (double i : array) {
            if (i != 0 && i != Double.POSITIVE_INFINITY && !Double.isNaN(i)) {
                tmp *= i;
            }
        }
        return tmp;
    }

    static void bitNot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }

    static int[] bitNotTwo(int[] array) {
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = ~array[i];
        }
        return array1;
    }

    static int[] sumPairsOfArray(int[] array) {
        int[] arrayNew;
        if (array.length % 2 == 0) {
            arrayNew = new int[array.length / 2];
            for (int i = 0; i < arrayNew.length; i++) {
                arrayNew[i] = array[2 * i] + array[2 * i + 1];
            }
        } else {
            arrayNew = new int[array.length / 2 + 1];
            for (int i = 0; i < arrayNew.length - 1; i++) {
                arrayNew[i] = array[2 * i] + array[2 * i + 1];
            }
            arrayNew[arrayNew.length - 1] = array[array.length - 1];
        }
        return arrayNew;
    }

    public static boolean[] arrayOfBoolean(int[] array) {
        boolean[] array1;
        array1 = new boolean[array.length];
        for (int i = 0; i < array1.length; i++) {
            if (array[i] % 2 == 0) {
                array1[i] = true;
            } else {
                array1[i] = false;
            }
        }
        return array1;
    }

    static int[] longToInt(long i) {
        int a = (int) (i >> 32);
        int b = (int) i;
        return new int[]{a, b};
    }

    static long intToLong(int[] array) {
        return ((long) array[0] << 32) | ((long) array[1] & 4294967295L);
    }

    static int[] naturalWithIndex(int size, int index) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            if ((i + index) < size) {
                array[i + index] = i + 1;
            } else {
                array[i + index - size] = i + 1;
            }
        }
        return array;
    }

    static int[][] twoDimensionalArray(int count) {
        int[][] arrays = new int[count][];
        int n = 1;
        for (int i = 0; i < count; i++) {
            arrays[i] = new int[count - i];
            for (int j = 0; j < (count - i); j++) {
                arrays[i][j] = n;
                n++;
            }
        }
        return arrays;
    }

    static void arrayIsNotNull(double[] array) {
        for (double i : array) {
            if (!Double.isNaN(i)) {
                Arrays.sort(array);
            } else {
                return;
            }
        }
    }

    static Collection<String> intToHexString(int[] array) {
        Collection<String> hexStringArray = new LinkedList<>();
        Arrays.stream(array).forEach(value -> hexStringArray.add(Integer.toHexString(value)));
        return hexStringArray;
    }

    //task 2.21
    static int getOftenElement(int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int key : array) {
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, 1);
            } else {
                int tmp = hashMap.get(key);
                hashMap.replace(key, ++tmp);
            }
        }

        int result = 1;
        int resultKey = array[0];
        for (int key : array) {
            if (hashMap.get(key) > result) {
                result = hashMap.get(key);
                resultKey = key;
            }
        }

        return resultKey;
    }
}


