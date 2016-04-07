package heloworld;

/**
 * Created by Яна Костюк on 22.03.2016.
 */
public class Person {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }
    public  String getSurname() {
        return surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " Surname: " + surname);
    }


}
