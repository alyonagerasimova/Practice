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
        assertTrue(Strings.equalStrings(string1, string2));
    }

    @Test
    public void testShielding() {
        Strings.shielding();
    }

    @Test
    public void testIndexOfFirstEntry() {
        String str1 = "abcabc";
        String str2 = "bc";
        assertEquals(Strings.indexOfFirstEntry(str1, str2), 1);
    }

    @Test
    public void testIndexOfSecondEntry() {
        String str1 = "abcabc";
        String str2 = "ab";
        assertEquals(Strings.indexOfSecondEntry(str1, str2), 3);
    }

    @Test
    public void testIndexOfLastEntry() {
        String str1 = "abcabc";
        String str2 = "abc";
        assertEquals(Strings.indexOfLastEntry(str1, str2), 0);
    }

    @Test
    public void testCountOfStrings() {
        String[] strings = {"new day", " tomorrow is monday ", "today is sunday", "new sunday"};
        String prefix = "new";
        String postfix = "day";
        assertEquals(Strings.countOfStrings(strings, prefix, postfix), 2);
    }

    @Test
    public void testSimilarStrings() {
        String[] strings = {"new day", " tomorrow is monday ", "today is sunday", "   new sunday"};
        String prefix = "new";
        String postfix = "day";
        assertEquals(Strings.similarStrings(strings, prefix, postfix), 2);
    }

    @Test
    public void testPartOfString() {
        String str1 = "arrarraaaa";
        String str2 = "arr";
        String str3 = "rra";
        assertEquals(Strings.partOfString(str1, str2, str3), "rrrraaaaaa");
    }

    @Test
    public void testSubString() {
        String string = "have a nice day";
        assertEquals(Strings.subString(string, 2, 1), "");
        assertEquals(Strings.subString(string, 0, 5), "have ");
        assertEquals(Strings.subString(string, -1, 4), "have");

    }

    @Test
    public void testDescriptionOfObject() {
        Object object1 = new Person("Andrew", "Garfield", 2323214);
        Object object2 = new Point(1, 2, 3);
        Object object3 = new NamedPoint(4, 5, 6, "A");
        double[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        Object object4 = new Matrix(matrix);
        Strings.descriptionOfObject(object1);
        Strings.descriptionOfObject(object2);
        Strings.descriptionOfObject(object3);
        Strings.descriptionOfObject(object4);

    }

    @Test
    public void testStringToArray() {
        String string = "have a nice day";
        String[] array = Strings.stringToArray(string);
        assertEquals(array[0], "Have");
        assertEquals(array[1], "A");
        assertEquals(array[2], "Nice");
        assertEquals(array[3], "Day");
    }

    @Test
    public void testArrayToString() {
        String[] arString = {"лимон", "грейпфрут", "апельсины","мандарины",  "улыбнитесь)"};
        assertEquals(Strings.arrayToString(arString),"лимон, грейпфрут, апельсины, мандарины, улыбнитесь)");
    }
}