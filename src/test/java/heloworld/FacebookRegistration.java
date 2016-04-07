package heloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Яна Костюк on 10.03.2016.
 */
public class FacebookRegistration {

    static By nameField = By.id("u_0_1");
    static By lastNameField = By.id("u_0_3");
    static By emailField = By.id("u_0_6");
    static By repeatEmailField = By.id("u_0_9");
    static By passField = By.id("u_0_b");
    static By day = By.id("day");
    static By month = By.id("month");
    static By year = By.id("year");
    static By sex = By.id("u_0_f");
    static By registrationButton = By.id("u_0_j");

    static int randomNum = 11111 + (int)(Math.random() * 99999);

    static String userName = "piter";
    static String userLastName = "donovan";
    static String userEmail = "coca80802+"+randomNum+"@gmail.com";
    static String userPassword = "q12345678Q";

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://facebook.com");

        Select selectDay = new Select(driver.findElement(day));
        Select selectMonth = new Select(driver.findElement(month));
        Select selectYear = new Select(driver.findElement(year));

        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys(userName);

        driver.findElement(lastNameField).clear();
        driver.findElement(lastNameField).sendKeys(userLastName);

        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(userEmail);

        driver.findElement(repeatEmailField).clear();
        driver.findElement(repeatEmailField).sendKeys(userEmail);

        driver.findElement(passField).clear();
        driver.findElement(passField).sendKeys(userPassword);

        selectDay.selectByIndex(3);
        selectMonth.selectByIndex(3);
        selectYear.selectByIndex(20);

//        Select monthSelect = new Select(driver.findElement(By.id("month")));
//        monthSelect.selectByValue("8");

        driver.findElement(sex).click();
        driver.findElement(registrationButton).click();

        Thread.sleep(10000);

        driver.close();

    }

//    public static void setText();


}
