package heloworld;

import org.testng.annotations.Test;

/**
 * Created by Яна Костюк on 18.03.2016.
 */
public class SwitchExample {

    @Test

    public void login() {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("ERROR");

        }

    }
}
