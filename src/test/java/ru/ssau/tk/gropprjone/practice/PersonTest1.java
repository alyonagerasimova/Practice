package ru.ssau.tk.gropprjone.practice;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class PersonTest1 {

    @Test
    public void firstName_NO_NULL() {
        Person person1 = new Person("","",43434);
        Assert.assertNotNull(person1.getFirstName());
    }

    @Test
    public void lastName_NO_NULL() {
        Person person1 = new Person("","",43434);
        Assert.assertNotNull(person1.getLastName());
    }

    @Test
    public void passportId_NO_NULL() {
        Person person1 = new Person("","",667);
        Assert.assertNotNull(person1.getPassportId());
    }

    }