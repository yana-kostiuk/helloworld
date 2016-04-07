package heloworld;

import org.testng.annotations.Test;

/**
 * Created by Яна Костюк on 22.03.2016.
 */
public class PersonEmployeeTest {

    @Test
    public void tryUserInit() {
        Employee jhonnyDepp = new Employee("Jack", "Sparrow", "Black pearl");
        Person person1 = new Person("Petr", "Ivanov");

        jhonnyDepp.displayInfo();
        person1.displayInfo();


        Person person2 = new Employee("Jack2", "Black2", "FedEx");

        person2.displayInfo();

    }

}
