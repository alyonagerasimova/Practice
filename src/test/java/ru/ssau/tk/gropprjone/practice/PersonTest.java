package ru.ssau.tk.gropprjone.practice;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

class PersonTest {

    @Test
    void testPerson() {

        Person person1 = new Person();
        person1.setFirstName("Алексей");
        person1.setLastName("Никитин");
        person1.setPassportId(308748323);
        person1.setGender(Gender.MALE);

        String result = "Алексей";
        String result1 = "Никитин";
        int result2 = 308748323;
        Gender male = Gender.MALE;

        assertEquals(person1.getFirstName(), result);
        assertEquals(person1.getLastName(), result1);
        assertEquals(person1.getPassportId(), result2);
        assertEquals(person1.getGender(), male);
    }

    @Test
    void passportIdTest() {
        int testValue = 4;
         Person person1 = new Person();
         Person person2 = new Person("","");
         Person person3 = new Person(testValue);

         person1.setPassportId(testValue);
         person2.setPassportId(testValue);

         assertEquals(person1.getPassportId(), testValue);
         assertEquals(person2.getPassportId(), testValue);
         assertEquals(person3.getPassportId(), testValue);
    }

    @Test
    void firstNameTest() {
        String testValue = "value";
        Person person1 = new Person();
        Person person2 = new Person(testValue,"");
        Person person3 = new Person(null,"");
        Person person4 = new Person();

        person1.setFirstName(testValue);

        assertEquals(person1.getFirstName(), testValue);
        assertEquals(person2.getFirstName(), testValue);
        assertNull(person3.getFirstName());
        assertNull(person4.getFirstName());
    }

    @Test
    void lastNameTest(){
        String testValue = "value";
        Person person1 = new Person();
        Person person2 = new Person("",testValue);
        Person person3 = new Person("",null);
        Person person4 = new Person();

        person1.setLastName(testValue);

        assertEquals(person1.getLastName(), testValue);
        assertEquals(person2.getLastName(), testValue);
        assertNull(person3.getLastName());
        assertNull(person4.getLastName());
    }
}