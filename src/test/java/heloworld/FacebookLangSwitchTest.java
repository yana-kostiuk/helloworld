package heloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Яна Костюк on 11.03.2016.
 */
public class FacebookLangSwitchTest {

    WebDriver driver;

    String url = "https://ru-ru.facebook.com/";

    By uaLink = By.xpath("//div[@data-referrer='page_footer']//a[@title='Ukrainian']");
    By uaTitle = By.xpath(".//*[@id='content']/div/div/div/div/div[2]/div[1]/div[1]");

    By enLink = By.xpath("//div[@data-referrer='page_footer']//a[@title='English (US)']");
    By enTitle = By.xpath(".//*[@id='content']/div/div/div/div/div[2]/h2");

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @Test
    public void switchRuToUa() {
        driver.get(url);
        driver.findElement(uaLink).click();
        driver.findElement(uaTitle).getText();
        String regTitle = driver.findElement(uaTitle).getText();
        log(regTitle);
        Assert.assertEquals(regTitle, "Зареєструватися");
    }

    @Test
    public void switchSRuToEn() {

        driver.get(url);

        driver.findElement(enLink).click();
        driver.findElement(enTitle).getText();
        String regTitle = driver.findElement(enTitle).getText();
        log(regTitle);
        Assert.assertEquals(regTitle, "Sign Up");
    }



    @AfterTest
    public void thearDown() {
        driver.close(); //закроет только вкладку
        driver.quit(); //закроет окно
    }

    public void log(String s) {
        System.out.println(s);
    }

}
