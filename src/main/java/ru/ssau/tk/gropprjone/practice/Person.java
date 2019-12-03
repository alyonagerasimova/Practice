package ru.ssau.tk.gropprjone.practice;

import sun.security.util.Password;


public class Person {

    private String firstName;
    private String lastName;
    private int passportId;
    private Gender gender;

    Person(){
    }

     public Person(String firstName,String lastName) {
         this.firstName = firstName;
         this.lastName = lastName;
     }

     public Person(int passportId) {
         this.passportId = passportId;
     }

    Person(String firstName, String lastName, int passportId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    void setPassportId(int passportId) {
        this.passportId = passportId;
    }
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGender(Gender male) {
        this.gender = male;
    }
    String getFirstName() {
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    int getPassportId(){
        return passportId;
    }
    Gender getGender(){
        return gender;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }


}
