package ru.ssau.tk.gropprjone.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringsTest {

    @Test
    public void testGetChars() {
        String string = "java";
        char[] chars = Strings.stringToChars(string);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    @Test
    public void testStringToBytes() {
        String string = "java опп";
        byte[] bytes = Strings.stringToBytes(string);
    }

    @Test
    public void testIsPal() {
        String string = "eye";
        assertTrue(Strings.isPal(string));
    }

    @Test
    public void testEqualStrings() {
        String string1 = "thread";
        String string2 = "Threads";
        assertTrue(Strings.equalStrings(string1,string2));
    }

    @Test
    public void testShielding(){
        Strings.shielding();
    }

    @Test
    public void testIndexOfFirstEntry() {
        String str1 = "abcabc";
        String str2 = "bc";
        assertEquals(Strings.indexOfFirstEntry(str1,str2),1);
    }

    @Test
    public void testIndexOfSecondEntry(){
        String str1 = "abcabc";
        String str2 = "ab";
        assertEquals(Strings.indexOfSecondEntry(str1,str2),3);
    }

    @Test
    public void testIndexOfLastEntry() {
        String str1 = "abcabc";
        String str2 = "abc";
        assertEquals(Strings.indexOfLastEntry(str1,str2),0);
    }
}