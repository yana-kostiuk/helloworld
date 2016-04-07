package kismia.tests;

import heloworld.User;
import kismia.pages.BasePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

/**
 * Created by Яна Костюк on 29.03.2016.
 */
public class EmailValidationTest extends BaseTest {

    public boolean isUrlEquals(String expectedUrl, int sec) throws InterruptedException {

        for(int i = 0; i<sec*10; i++) {
            if(driver.getCurrentUrl().equals(expectedUrl)) {
                return true;
            } else {
                Thread.sleep(100);
            }
        }

        return false;
    }

    String expectedUrl = "https://kismia.com/test";

    @DataProvider(name = "emails")
    public Object[][] emails() {
        return new Object[][] {
                {"someEmail.asdsad" },
                {"aDadasdasd" },
                {"фывфыа" },
                {"someEmail@asd.com" },
                {"someEmail+1234@asd.com" },
                {"someEmail.asdsad" },

        };
    }

    @Test(dataProvider = "emails")

    public void regWithValidEmail(String email) throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.get("https://kismia.com/");
        User user = new User(email, "qwerty");
        BasePage basePage = new BasePage(driver);

    }
















}
