package ru.ssau.tk.gropprjone.practice;

import sun.security.util.Password;


public class Person {

    private String firstName;
    private String lastName;
    private int passportId;

    Person(){
    }

     public Person(String firstName,String lastName) {
         this.firstName = firstName;
         this.lastName = lastName;
     }

     public Person(int passportId) {
         this.passportId = passportId;
     }

    public Person(String firstName, String lastName, int passportId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    int getPassportId(){
        return passportId;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }
}
