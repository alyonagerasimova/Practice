package ru.ssau.tk.gropprjone.practice;

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
            return str1.indexOf(str2, str1.length()/2);
        }
        return -1;
    }

    static int indexOfLastEntry(String str1, String str2) {
        if (str2.length() < str1.length()) {
            return str1.lastIndexOf(str2, str1.length()/2 - 1);
        }
        return -1;
    }
}
