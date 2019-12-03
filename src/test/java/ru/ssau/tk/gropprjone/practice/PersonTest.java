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
        assertEquals(person1.getGender(),male);


    }

}