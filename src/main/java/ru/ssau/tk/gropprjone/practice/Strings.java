package ru.ssau.tk.gropprjone.practice;

import sun.nio.cs.UTF_32;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Strings {

    static char[] stringToChars(String str) {
        char[] char1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char1[i] = str.charAt(i);
        }
        return char1;
    }

    static byte[] stringToBytes(String string) {
        byte[] masBytes = string.getBytes();
        for (byte num : masBytes) {
            System.out.println(num + '\n');
        }
        return masBytes;
    }

    public static void main(String[] args) {
        String string1 = "Скоро Новый год!";
        String string2 = new String(string1);
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
    }

    static boolean isPal(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static boolean equalStrings(String str1, String str2) {
        return str1 != null && str2 != null && !(str1.equalsIgnoreCase(str2)) && !(str1.equals(str2));
    }

    static void shielding() {
        int i = 0;
        System.out.println("Символ\t№" + ++i);  //символ табуляции
        System.out.println("Символ\b№" + ++i);  //удаление одного предыдущего символа
        System.out.println("Символ\n№" + ++i);  //переход на новую строчку
        System.out.println("Символ\r№" + ++i);  //символ взврата каретки
        System.out.println("Символ\'№" + ++i);  //символ одинарной кавычки
        System.out.println("Символ\"№" + ++i);  //символ двойной кавычки
        System.out.println("Символ\\№" + ++i);  //символ обратной косой черты
        //Экранировать символ обратной косой черты необходимо для указания,
        // что последующий символ не будет являтся частью escape-последовательности

    }

    static int indexOfFirstEntry(String str1, String str2) {
        if (str2.length() < str1.length()) {
            return str1.indexOf(str2);
        }
        return -1;
    }

    static int indexOfSecondEntry(String str1, String str2) {
        if (str2.length() < str1.length()) {
            return str1.indexOf(str2, str1.length() / 2);
        }
        return -1;
    }

    static int indexOfLastEntry(String str1, String str2) {
        if (str2.length() < str1.length()) {
            return str1.lastIndexOf(str2, str1.length() / 2 - 1);
        }
        return -1;
    }

    static int countOfStrings(String[] string, String prefix, String postfix) {
        int j = 0;
        for (String s : string) {
            if (s.startsWith(prefix) && s.endsWith(postfix)) {
                j++;
            }
        }
        return j;
    }

    static int similarStrings(String[] string, String prefix, String postfix) {
        int j = 0;
        for (String s : string) {
            if (s.trim().startsWith(prefix) && s.trim().endsWith(postfix)) {
                j++;
            }
        }
        return j;
    }

    static String partOfString(String string1, String string2, String string3) {
        for (int i = 0; i < 100; i++) {
            if (string1.contains(string2)) {
                string1 = string1.replaceAll(string2, string3);
            } else {
                break;
            }
        }
        return string1;
    }

    static String subString(String string, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > string.length()) {
            to = string.length();
        } else if (to <= from) {
            return "";
        }
        return string.substring(from, to);
    }

    static void descriptionOfObject(Object object) {
        System.out.println("Описание обьекта: " + object);
    }

    static String[] stringToArray(String string) {
        String[] array = string.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (!array[i].isEmpty()) {
                array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);
            }
        }
        return array;
    }

    static String arrayToString(String[] arrayString) {
        return String.join(", ", arrayString);
    }

    static String replaceAndRevertString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) {
                stringBuilder.replace(i, i + 1, Integer.toString(i));
            }
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    static String fromIntToString(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(0);
        for (int i = 1; i < number; i++) {
            stringBuilder.append(" ").append(i);
        }
        return stringBuilder.toString();
    }

    static String codeConversion(String string, Charset code1, Charset code2) {
        return new String(string.getBytes(code1), code2);
    }

}
