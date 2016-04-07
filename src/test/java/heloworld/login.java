package heloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Яна Костюк on 04.03.2016.
 */
public class login {

    public static void main(String[] args) throws InterruptedException{

        By emailFld = By.id("quick_email");
        By passFld = By.id("quick_pass");

        String userEmail = "asdasd";
        String userPass = "sdaasdas";

        WebDriver driver = new ChromeDriver();

        driver.get("https://vk.com");

        driver.findElement(emailFld).clear();
        driver.findElement(emailFld).sendKeys(userEmail);

        driver.findElement(passFld).clear();
        driver.findElement(passFld).sendKeys(userPass);

        driver.findElement(By.id("quick_login_button")).click();

        Thread.sleep(5000);

    }

}
