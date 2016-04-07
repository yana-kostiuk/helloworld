package heloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Яна Костюк on 21.03.2016.
 */
public class LiniaKino {
    WebDriver driver;

    String url = "http://liniakino.com/showtimes/aladdin/";


    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void liniaKino() {
        driver.get(url);

        driver.findElement(By.xpath("//*[contains(text(), 'Зоотрополіс')]")).click();
        driver.findElement(By.xpath("//*[contains(text(), '23 березня')]")).click();


        //*[contains(text(), '23 березня')]


    }



    @AfterTest
    public void thearDown() {
        driver.close(); //закроет только вкладку
        driver.quit(); //закроет окно
    }


}
