package ru.ssau.tk.Practice.Tasks.functions;

import org.junit.jupiter.api.Test;
import ru.ssau.tk.Practice.Tasks.functions.Person;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void testPerson() {

        Person person1 = new Person();
        person1.setFirstName("Алексей");
        person1.setLastName("Никитин");
        person1.setPassportId(308748323);

        String result = "Алексей";
        String result1 = "Никитин";
        int result2 = 308748323;

        assertEquals(person1.getFirstName(), result);
        assertEquals(person1.getLastName(), result1);
        assertEquals(person1.getPassportId(), result2);


    }

}