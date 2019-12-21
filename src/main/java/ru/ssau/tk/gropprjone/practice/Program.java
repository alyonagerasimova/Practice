package ru.ssau.tk.gropprjone.practice;


public class Program {
    public static void main(String[] args) {
        Person person = new Person();// Ссылка, указвает на обьект в куче
        person.setFirstName("Arkadiy");
        int number = 5; // Хранится в стеке, передается по значению
        checkInt(number);
        checkPerson(person);
        System.out.println(number);
        System.out.println(person.getFirstName());
    }

    private static void checkInt(int number) {// Т.к простой тип по значению
        number = 10;
        System.out.println(number);
    }

    private static void checkPerson(Person person) {// Передается ссылка на обьект в куче
        person.setFirstName("Oleg");// изменение обьекта
        System.out.println(person.getFirstName());
    }
 /* public static void main(String[] args) {
      Person person = new Person();
      person.setFirstName("Arkadiy");
      checkAnotherPerson(person);
      System.out.println(person.getFirstName());
  }

    private static void checkAnotherPerson(Person person) {
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }

  */
//Сначала выводится Ignat , т.к вначале вызывается метод, который иниациализирует имя и выводит его в консоль, после этого
//производится вывод в консоль имени person, заданном в  main
}
