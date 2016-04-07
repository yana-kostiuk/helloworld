package kismia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Яна Костюк on 29.03.2016.
 */
public class LoginPage extends BasePage {

    private final String LOGIN_URL = "https://kismia.com/";
    private By emailField = By.xpath(".//*[@id='user-email']");
    private By passwordField = By.xpath(".//*[@id='user-password']");
    private By loginButton = By.xpath(".//*[@id='sign-in-form']/button");




    public LoginPage (WebDriver driver) {
        super(driver);
    }
}
