package kismia.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Яна Костюк on 28.03.2016.
 */
public class BasePage {
    WebDriver driver;

    private final String AUTOLOGIN_URL = "https://n.kismia.com/link/?p=1&u=849038929&m=1945127886&t=17&o=aHR0cHM6Ly9raXNtaWEuY29tL2EwNjJlL2NvbmZpcm0vTVRjek9USTVPVEE3Wm1ObFptRmlZelppWkRGbU16a3laR1JpWXprMll6UmlNRGd6TVRObFlUST0%2FYT0mJmFrPWRlSUxNamRTVndmYSZtYWlsX3R5cGVfaWQ9MTc%3D&s=0";

    public void autoLogin() {
        driver.get(AUTOLOGIN_URL);
    }



    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
