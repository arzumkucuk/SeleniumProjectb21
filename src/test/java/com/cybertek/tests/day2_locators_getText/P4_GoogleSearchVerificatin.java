package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerificatin {
    public static void main(String[] args) {

        //TC #4 : Google Search
        // 1- Open a chrome browser
        // setup driver
        WebDriverManager.chromedriver().setup();

        //open browser
        WebDriver driver = new ChromeDriver();

        //maximize the page
        driver.manage().window().maximize();

        // 2- Go to: https://google.com
        driver.get("https://www.google.com");

        //3- Write "apple"in search box
        //   Click google search button we press ENTER
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        //4- Verify title:
        // Expected: Title should start with "apple" word
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.err.println("Title verification FAILED!!!");
            System.out.println("expectedTitle= "+expectedTitle);
            System.out.println("actualTitle= "+ actualTitle);
        }
            driver.close();


    }
}
