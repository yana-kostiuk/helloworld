package heloworld;

import java.util.Scanner;

/**
 * Created by Яна Костюк on 20.03.2016.
 */
public class Calculator_1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = in.nextInt();

        System.out.println("Enter second number:");
        int b = in.nextInt();

        System.out.println("Enter action type:");
        String operation = in.next();

        if ( operation.equals("+") ) {
            System.out.println("Result is: " +(a - b));
        } else if ( operation.equals("-") ) {
            System.out.println("Result is: " +(a - b));
        } else if ( operation.equals("*") ) {
            System.out.println("Result is: " +(a * b));
        } else if ( operation.equals("/") ) {
            System.out.println("Result is: " +(a / b));
        } else {
            System.out.println("Error");
        }

    }

}
