import sun.security.util.Password;

class Program{
    public static void main(String[] args) {
        Person person1 = new Person("Иван","Иванов",35664378 );
        person1.displayInfo();
        Person person2 = new Person("Василий","Титов");
        person2.setPassportId(34858851);
        person2.displayInfo();
        Person person3 = new Person();
        person3.setFirstName("Дмитрий");
        person3.setLastName("Абрамов");
        person3.setPassportId(27364773);
        person3.displayInfo();
    }
        }

public class Person {

    private String firstName;
    private String lastName;
    private int passportId;

    public Person(){

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

    public int getPassportId(){
        return passportId;
    }
     void displayInfo(){
         System.out.println("First Name: " + firstName + ", Last name: " + lastName + ", Id passport: " + passportId);
     }
}
