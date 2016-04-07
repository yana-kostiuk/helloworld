package heloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Яна Костюк on 15.03.2016.
 */
public class Lesson4_1 {


    WebDriver driver;

    String url = "https://google.com";

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        // Выставить ожидание элементов
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Ожидание загрузки страницы
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //Открыть браузер на весь экран
        driver.manage().window().maximize();
    }




    @Test
    public void switchRuToUa() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("Jack");
        driver.findElement(By.id("sblsbb")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='g']//*[@class='r']"));


        List<String> strings = new ArrayList<String>();


        System.out.println("For each");
        for(WebElement element: elements) {
            String titleText = element.getText();

            titleText = titleText.toLowerCase();

            if(titleText.contains("википедия")) {
                System.out.println("This title: "+titleText+" is on site "+"https://ru.wikipedia.org");
            } else if (titleText.contains("youtube")) {
                System.out.println("This title: "+titleText+" is on site "+"https://youtube.com");
            } else if (titleText.contains("twitter")) {
                System.out.println("This title: "+titleText+" is on site "+"https://twitter.com");
            } else {
                System.out.println("This is not wikipedia");
            }




//            strings.add(titleText);


//            System.out.println(titleText);


        }


        for (String s : strings) {
            System.out.println(s);
        }

//        System.out.println("Simple for");
//        for(int i = 0; i < elements.size(); i++) {
//            String titleText = elements.get(i).getText();
//            System.out.println(titleText);
//        }

        Thread.sleep(5000);
    }







    @AfterTest
    public void thearDown(){
        driver.close();
        driver.quit();
    }






    public void log(String s){
        System.out.println(s);
    }





}
