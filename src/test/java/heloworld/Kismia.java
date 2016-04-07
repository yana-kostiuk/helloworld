package heloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Яна Костюк on 25.03.2016.
 */
public class Kismia extends BeforeAfterTest {
    String url = "https://n.kismia.com/link/?p=1&u=849038929&m=1945127886&t=17&o=aHR0cHM6Ly9raXNtaWEuY29tL2EwNjJlL2NvbmZpcm0vTVRjek9USTVPVEE3Wm1ObFptRmlZelppWkRGbU16a3laR1JpWXprMll6UmlNRGd6TVRObFlUST0%2FYT0mJmFrPWRlSUxNamRTVndmYSZtYWlsX3R5cGVfaWQ9MTc%3D&s=0";
    String email = "pavel.bunyaner.81@mail.ru";
    String password = "prosto555";

    private By emailField = By.xpath(".//*[@id='user-email']");
    private By passwordField = By.xpath(".//*[@id='user-password']");
    private By submitButton = By.xpath(".//*[@id='sign-in-form']/button");


    public void enterEmail (String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword (String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSubmitButton () {
        driver.findElement(submitButton).click();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickSubmitButton();
    }

}
