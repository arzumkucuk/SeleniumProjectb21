package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_SmartBearLoginVerification {

    public static void main(String[] args) {

        // open a chrome browser
        // setup
        WebDriverManager.chromedriver().setup();

        // open browser
        WebDriver driver = new ChromeDriver();

        // maximize
        driver.manage().window().maximize();

        //2. Go to;
        // http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/Login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/Login.aspx");

        //3- Verify title equals:
        // Expected: Web Orders Login

        String expectedTitle = "Web Orders Login";

        // when you use a method, you can press alt + enter to introduce local variable
        // it will automatically create variable and guess name for it
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Landing page title verification PASSED!!!");
        }else{
            System.out.println("Landing page title verification FAILED!!!");
            System.out.println("Expected Title = "+ expectedTitle);
            System.out.println("Actual Title= "+actualTitle);
        }

        //4- Enter username: Tester
        // first we need to locate the username input box and then sendKeyss(username) to it
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");

        //5- Enter password: test
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        //6- Click "sign in" button
        driver.findElement(By.className("button")).click();

        //7- Verify title equals:
        //Expected: Web Orders

        String expectedLoginTitle = "Web Orders";
        String actualLoginTitle = driver.getTitle();

        if(actualLoginTitle.equals(expectedLoginTitle)){
            System.out.println("Login Title Verification PASSED!");
        }else{
            System.out.println("Login Title verification FAILED!!!");
            System.out.println("ExpectedLoginTitle= "+expectedLoginTitle);
            System.out.println("ActualLoginTitle= "+actualLoginTitle);
        }

    }
}
