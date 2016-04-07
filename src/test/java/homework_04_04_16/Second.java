package homework_04_04_16;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Яна Костюк on 04.04.2016.
 */
/* Минимальное из n чисел
1. Ввести с клавиатуры число n.
2. Считать n целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Second {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {
        int min = Collections.min(list);

        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> listInt = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter quantity of numbers:  ");
        int n = in.nextInt();

        System.out.println("Please enter a list of numbers: ");

        for ( int i = 0; i < n; i++ ) {
            int a = in.nextInt();

            listInt.add(a);
        }

        return listInt;
    }

}