package kismia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Яна Костюк on 28.03.2016.
 */
public class ProfileSettingsPage extends BasePage {

    private final String PAGE_URL = "https://kismia.com/profile/settings";

//    private By = By.xpath("");

    private By nameField = By.xpath(".//*[@id='settingsName']");
    private By dateOfBirthField = By.xpath(".//*[@id='settingsBDate']");
    private By setPass = By.xpath(".//*[@id='settingsPassword']");
    private By repeatPass = By.xpath(".//*[@id='settingsPassword2']");
    private By selectGender = By.xpath(".//*[@id='settingsGender']");
    private By selectSearchGender = By.xpath(".//*[@id='settingsSearchGender']");
    private By searchAgeFrom = By.xpath(".//*[@id='settingsSearchAgeFrom']");
    private By searchAgeTo = By.xpath(".//*[@id='settingsSearchAgeTo']");
    private By changePhone = By.xpath(".//*[@id='change-phone']");
    private By saveButton = By.xpath(".//*[@id='content']/form/div[3]/button");
    private By changeCityButton = By.xpath(".//*[@id='content']/p/button");



    public ProfileSettingsPage openPage() {
        driver.get(PAGE_URL);
        return this;

    }


    public void changeName(String name) {
        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys(name);

    }

    public void saveChanges() {
        driver.findElement(saveButton).click();
    }


    public String getNameFromField() {
        return driver.findElement(nameField).getAttribute("value");
    }















    public ProfileSettingsPage(WebDriver driver) {
        super(driver);
    }



}
