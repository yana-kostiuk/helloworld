package kismia.tests;

import kismia.pages.IndexPage;
import kismia.pages.ProfileSettingsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Яна Костюк on 28.03.2016.
 */
public class ProfileSettingsTest extends BaseTest {

    @Test
    public void changeNameTest() throws InterruptedException {



        ProfileSettingsPage settingsPage = new ProfileSettingsPage(driver);
        settingsPage.autoLogin();

        Thread.sleep(2000);

        settingsPage.openPage().changeName("Emm NoSpencer");
        settingsPage.saveChanges();
        Assert.assertEquals( settingsPage.getNameFromField(), "jkkhkjh dfgdfg", "name was not changed");





    }



}
