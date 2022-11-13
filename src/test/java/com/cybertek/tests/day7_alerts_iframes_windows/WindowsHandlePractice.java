package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsHandlePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. open browser
        driver = WebDriverFactory.getDriver("chrome");

        //2. Go to websites: http://practice.cybertekschool.com/windows
        driver.get("http://practice.cybertekschool.com/windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void window_handling_test(){
        //4- Assert:  Title is "Practice"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";

        Assert.assertEquals(actualTitle,expectedTitle);

        //5- Click to "Click Here" text
        WebElement clickHereButton = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereButton.click();

        String titleclickAfter = driver.getWindowHandle();
        System.out.println("titleclickAfter = " + titleclickAfter);

        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        //Similar to ArrayList, but SET CAN ONLY STORE UNIQUE VALUE
        // You cannot have two of same value: String1, String2
        Set<String> windowHandles = driver.getWindowHandles();

        //6- Switch to new window
        for (String each : windowHandles){

            driver.switchTo().window(each);
            System.out.println("CURRENT TITLE WHILE SWITCHING: "+ driver.getTitle());
        }

        //7- Assert: Title is "New Window"
        String currentWindowTitle = driver.getTitle();
        String expectedWindowTitle = "New Window";

        Assert.assertEquals(currentWindowTitle,expectedWindowTitle);

        driver.switchTo().window(mainHandle);


    }
/*
    @AfterMethod
    public void tearDownMethod() {
        //driver.close();
    }

 */
}
