package kismia.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Яна Костюк on 28.03.2016.
 */
public class BaseTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void thearDown() {
//        driver.close(); //закроет только вкладку
        driver.quit(); //закроет окно
    }

}
