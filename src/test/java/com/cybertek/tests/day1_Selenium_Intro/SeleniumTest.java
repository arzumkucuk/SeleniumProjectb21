package com.cybertek.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {
         // 1- Setup web driver manager
        WebDriverManager.chromedriver().setup(); // chrome kurma methodu
        //System.setProperty("type of driver", "path of driver");

        // WebDriverManager.firefoxdriver().setup();
        // WebDriver driver = new FirefoxDriver();

        // 2- Create instance of web driver and use it to open page
        // this is the line where the Selenium WebDriver opens the browser
        WebDriver driver = new ChromeDriver();

        // this is line maximizes the browser
        driver.manage().window().maximize();

        // 3. Use the instance to get the URL we want
        driver.get("https://www.google.com");

        System.out.println("Current title of the page: "+driver.getTitle() );

        String currentURL = driver.getCurrentUrl();

        System.out.println("current URL: "+ currentURL);

        // we are using navigate.back method from SELENIUM LIBRARY
        Thread.sleep(3000);

        // goes to back
        driver.navigate().back();

        Thread.sleep(3000);

        // goes to forward
        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().to("https://www.tesla.com");

        System.out.println("Current title of the page: "+driver.getTitle() );

        // we are refreshing (re-assigning) the value of "currentURL"
        currentURL = driver.getCurrentUrl();

        System.out.println("current URL: "+ currentURL);

        // closing the browser
        driver.close();






    }
}
