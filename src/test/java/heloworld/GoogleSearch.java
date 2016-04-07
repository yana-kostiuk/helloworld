package heloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Яна Костюк on 01.03.2016.
 */
public class GoogleSearch {


    public static void main(String[] args) throws InterruptedException {


        // вызов хрома
        WebDriver driver = new ChromeDriver();

        // перейти по ссылке
        driver.get("https://google.com");

        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("hello, world!");

        driver.findElement(By.id("sblsbb")).click();

        Thread.sleep(5000);

        String title = driver.findElement(By.xpath(".//*[@id=\'rso\']/div[1]/div/h3/a")).getText();

        System.out.println(title);


    }

}

