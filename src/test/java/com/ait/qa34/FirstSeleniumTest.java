package com.ait.qa34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    //before - setUp
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
       driver = new ChromeDriver();
//       driver.get("https://www.google.com");  //without history
       driver.navigate().to("https://www.google.com");  //with history
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh(); //обновление
    }
    //test - name t
    @Test
    public void openGoogleTest(){
        System.out.println("Google is opened");
    }
    //after - tearDown
    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();  //close browser(all tabs)  drive.close - only one tab (if only 1 -> close browser)
    }
}
