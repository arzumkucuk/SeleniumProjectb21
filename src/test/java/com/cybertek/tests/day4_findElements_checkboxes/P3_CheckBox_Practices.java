package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P3_CheckBox_Practices {

    public static void main(String[] args) {

        // cybertek CheckBoxes

        //1.open browser and go to http://practice.cybertekschool.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        //Locating CHECKBOXES

         WebElement checkBox1 = driver.findElement(By.name("checkbox1"));
         WebElement checkBox2 = driver.findElement(By.name("checkbox2"));

         //another option as locator for checkboxes: //form[@id='checkboxes']/input[1]
         //another option as locator for checkboxes: //form[@id='checkboxes']/input[2]

        //2. confirm checkbox #1 is NOT SELECTED by default
        if (!checkBox1.isSelected()){
            System.out.println("Checkbox1 is NOT selected. Default value verification PASSED!");
        }else{
            System.out.println("CheckBox2 is selected. Default value verification FAILED!!!");
        }

        //3. confirm checkbox #2 is SELECTED by default


        //4. Click checkbox #1 to select it.
        checkBox1.click();

        //5. click checkbox #2 to deselect it.
        checkBox2.click();


        //6. confirm checkbox #1 is SELECTED.


        //7. confirm checkbox #2 is NOT SELECTED.




    }
}
