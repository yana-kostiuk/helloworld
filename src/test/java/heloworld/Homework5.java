package heloworld;

import org.testng.annotations.Test;

/**
 * 1. Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль. - done
 2. Вывести на консоль количество максимальных чисел среди этих четырех. - done
 3. Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел. - done
 4. Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками. - done
 5. Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль. - done
 */

public class Homework5 {
    int a = 4;
    int b = -123;
    int c = 13;
    int d = 13;
    int e = -150;
    int max;
    int min;

    @Test
    public void minMaxFour() {
        int i = 0;

        if (a <= b && a <= c && a <= d) {
            min = a;
        } else if (b <= a && b <= c && b <= d) {
            min = b;
        } else if (c <= a && c <= b && c <= d) {
            min = c;
        } else if (d <= a && d <= b && d <= c) {
            min = d;
        }

        if (a >= b && a >= c && a >= d) {
            max = a;
            i += 1;
        }
        if (b >= a && b >= c && b >= d) {
            max = b;
            i += 1;
        }
        if (c >= a && c >= b && c >= d) {
            max = c;
            i += 1;
        }
        if (d >= a && d >= b && d >= c) {
            max = d;
            i += 1;
        }

        System.out.println("MinOfFour is: " +min);
        System.out.println("Quantity of max numbers is: " +i);
    }

    @Test
    public void minMaxFive() {

        if ( a >= b && a >= c && a >= d && a >= e ) {
            max = a;
        } else if ( b >= a && b >= c && b >= d && b >= e ) {
            max = b;
        } else if ( c >= a && c >= b && c >= d && c >= e ) {
            max = c;
        } else if ( d >= a && d >= b && d >= c && d >= e ) {
            max = d;
        } else {
            max = e;
        }

        if ( a <= b && a <= c && a <= d && a <= e ) {
            min = a;
        } else if ( b <= a && b <= c && b <= d && b <= e ) {
            min = b;
        } else if ( c <= a && c <= b && c <= d && c <= e ) {
            min = c;
        } else if ( d <= a && d <= b && d <= c && d <= e ) {
            min = d;
        } else {
            min = e;
        }

        System.out.println("MinOfFive is: " +min);
        System.out.println("MaxOfFive is: " +max);
    }

    @Test
    public void names() {
        String name1 = new String("Nick");
        String name2 = new String("Nick");

        if( name1.equals(name2) ) {
            System.out.println("They have the same names. They are namesakes");
        } else {
            System.out.println("Names are different");
        }
    }

    @Test
    public void seasons() {
        int month = 12;
        String season;

        switch (month) {
            case 1: case 2: case 12:
                season = "winter";
                break;
            case 3: case 4: case 5:
                season = "spring";
                break;
            case 6: case 7: case 8:
                season = "summer";
                break;
            default:
                season = "winter";
        }

        System.out.println("Season is "+season);
    }

}