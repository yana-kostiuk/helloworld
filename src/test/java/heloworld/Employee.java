package heloworld;

/**
 * Created by Яна Костюк on 22.03.2016.
 */
public class Employee extends Person {

    private String company;

    public Employee(String name, String surname, String company) {
        super(name, surname);
        this.company = company;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Company: " + company);
    }


}
