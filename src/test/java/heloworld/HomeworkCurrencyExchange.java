package heloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Яна Костюк on 15.03.2016.
 */
public class HomeworkCurrencyExchange {


    WebDriver driver;

    String url = "https://unian.net";
    String currencyRate = "Курс валют НБУ";
    String afterCurrency = ">";
    String afterUsd = "<span>";

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        // Выставить ожидание элементов
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Ожидание загрузки страницы
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //Открыть браузер на весь экран
        driver.manage().window().maximize();
    }



    @Test
    public void switchRuToUa() throws InterruptedException {
        driver.get(url);
        String sourceCode = driver.getPageSource();
//        System.out.println(sourceCode);


        int startIndex = sourceCode.lastIndexOf(currencyRate);
        int lastIndex = sourceCode.indexOf(afterUsd);
        sourceCode = sourceCode.substring(startIndex, lastIndex);

        int firstIndex = sourceCode.lastIndexOf(afterCurrency) + 1;
        sourceCode = sourceCode.substring(firstIndex);

        double usd = Double.valueOf(sourceCode);

        System.out.println(usd);
    }

    @AfterTest
    public void thearDown(){
        driver.close();
        driver.quit();
    }


}
