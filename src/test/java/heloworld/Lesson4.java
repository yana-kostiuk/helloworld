package heloworld;


import org.testng.annotations.Test;

/**
 * Created by Яна Костюк on 15.03.2016.
 */
public class Lesson4 {

    int sec = 2;

//    @Test
//
//
//    public void blaBla() {
//
//        for(int i = 0; i < 10; i++, sec *= 2) {
//            System.out.println(i);
//            System.out.println(sec);
//        }
//
//    }

    boolean isValidInteger;

    @Test

    public void tryIf() {
        if(sec == 2) {
            System.out.println("sec == 2");
            isValidInteger = true;
        }

        if(!isValidInteger) {
            System.out.println("boolean isValidInteger == false");
        }
    }

}
