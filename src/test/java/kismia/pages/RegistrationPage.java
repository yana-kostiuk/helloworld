package kismia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Яна Костюк on 29.03.2016.
 */
public class RegistrationPage extends BasePage {

    private final String LOGIN_URL = "https://kismia.com/#registration";
    private By myGenderIsMaleButton = By.xpath(".//*[@id='block-first']/div[1]/div[1]/label");
    private By iLookForFemaleButton = By.xpath(".//*[@id='block-first']/div[2]/div[2]/label");
    private By namedField = By.xpath(".//*[@id='user-reg-myname']");
    private By continueButton = By.xpath(".//*[@id='block-first']/button");
    private By emailField = By.xpath(".//*[@id='user-reg-myemail']");
    private By passwordField = By.xpath(".//*[@id='user-reg-mypass']");
    private By registerButton = By.xpath(".//*[@id='block-last']/button");


    public RegistrationPage openPage() {
        driver.get(LOGIN_URL);
        return this;
    }

    public void selectMyGender() {
        driver.findElement(myGenderIsMaleButton).click();
    }

    public void selectSearchedGender() {
        driver.findElement(iLookForFemaleButton).click();
    }

    public void enterName(String name) {
        driver.findElement(namedField).clear();
        driver.findElement(namedField).sendKeys(name);
    }

    public void clickOnContinue() {
        driver.findElement(continueButton).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickOnRegister() {
        driver.findElement(registerButton).click();

    }






    public RegistrationPage (WebDriver driver) {
        super(driver);
    }
}

