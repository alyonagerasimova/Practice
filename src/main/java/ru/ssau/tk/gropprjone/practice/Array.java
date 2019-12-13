package ru.ssau.tk.gropprjone.practice;


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
}


