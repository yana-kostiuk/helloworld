package heloworld;

/**
 * Created by Яна Костюк on 22.03.2016.
 */
public class User {

    public String name;
    public String password;
    public String email;
    public int age;

    public User(String email, String password) {

        this.email = email;
        this.password = password;
    }

    public User(String name, String password, String email, int age) {

        this.email = email;
        this.password = password;

        // or this(email, password);

        this.age = age;
        this.name = name;
    }

}



