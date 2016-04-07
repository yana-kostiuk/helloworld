package heloworld;

import org.testng.annotations.Test;

/**
 * Created by Яна Костюк on 22.03.2016.
 */
public class TestUserClass {

    @Test
    public void tryUserInit() {
        User user1 = new User("1tsrtard@gmail.com", "1asdsad");
        User user2 = new User("2tsrtard@gmail.com", "2asdsad");
        User user3 = new User("3tsrtard@gmail.com", "3asdsad");

        User user4 = new User("name", "password", "email", 18);


        System.out.println("User1 email: " +user1.email+" password: "+user1.password);
        System.out.println("User2 email: " +user2.email+" password: "+user2.password);
        System.out.println("User3 email: " +user3.email+" password: "+user3.password);

        System.out.println("User4 email: " +user4.email+" password: "+user4.password);

    }
}
