package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IFramePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. open browser
        driver = WebDriverFactory.getDriver("chrome");

        //2. Go to websites: http://practice.cybertekschool.com/iframe
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void iframe_test(){

        //Let's change driver's focus to the <iframe>
        //1- Locate as webElement
       // WebElement iframe = driver.findElement(By.id("mce_0_ifr"));

        // switching driver's focus to iframe usng "switchTo" method
        //driver.switchTo().frame(iframe);

        //2- Pass index number
        driver.switchTo().frame(0); // eger bu sekilde yazarsak, yukardaki iki satiri yazmana gerek kalmaz.

        //3- Pass id or name attribute value (IF THERE ARE ANY)
        // if there is ID or NAME attribute value, they can be directly passed as a String.
        driver.switchTo().frame("mce_0_ifr");

        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        //4. Assert: "Your content goes here." Text is displayed.
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        // Locating the Header
       // driver.switchTo().defaultContent(); // eger 2 den fazla html frame varsa en sonki frameden direk en bastaki frame gelmek
        //                                      icin default kullanilir.
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(headerText.isDisplayed());

        //5. Assert: "An iFrame containing the TinyMCEWYSIWYG Editor


    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }


}