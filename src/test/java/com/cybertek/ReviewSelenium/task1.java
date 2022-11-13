package com.cybertek.ReviewSelenium;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class task1 {

    public static void main(String[] args) {

        // "http://practice.cybertekschool.com/forgot_password"

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        String expectedTitle = "Forgot Password";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("pass");
        }else {
            System.out.println("failed");
        }

        // go to home link
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));

        List<WebElement> links = driver.findElements(By.xpath("//body//a"));

        for (WebElement eachlink : links) {
            System.out.println(eachlink.getText());
        }

        driver.close();






    }
}
