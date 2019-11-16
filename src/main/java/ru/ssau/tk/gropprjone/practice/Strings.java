package ru.ssau.tk.gropprjone.practice;

public class Strings {

    static char[] stringToChars(String str) {
        char[] char1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char1[i] = str.charAt(i);
        }
        return char1;
    }

    public static byte[] stringToBytes(String string){
        byte[] masBytes = string.getBytes();
        for(byte num :masBytes) {
            System.out.println(num + '\n');
        }
        return masBytes;
    }
}
