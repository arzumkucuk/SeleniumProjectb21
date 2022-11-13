package com.cybertek.tests.Tasks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class task1 {
    WebDriver driver;

    @BeforeMethod
   public void setUp(){

       driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       driver.get("http://practice.cybertekschool.com/forgot_password");

   }

   @Test
    public void test1_homelinkverification(){

      WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));

      WebElement forgotPassHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

      WebElement emailText = driver.findElement(By.xpath("//label[.='E-mail']"));

      WebElement emailinput = driver.findElement(By.xpath("//input[@name='email']"));
      WebElement retrievePass = driver.findElement(By.xpath("//i[.='Retrieve password']"));
      WebElement cybertekText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

       Assert.assertTrue(homeLink.isDisplayed() && forgotPassHeader.isDisplayed() && emailinput.isDisplayed()
       && emailText.isDisplayed() && retrievePass.isDisplayed() && cybertekText.isDisplayed(),
               "ALL eelements are displayed!");

       driver.close();





   }


}
