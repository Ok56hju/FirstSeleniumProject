package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HW2 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        //maximize browser to window
        driver.manage().window().maximize();
        //wait for all elements on the site to load before starting the test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test

        public void findElementByTagName(){
        WebElement element1 = driver.findElement(By.tagName("img"));
        System.out.println(element1.getText());
//
//        WebElement element2 = driver.findElement(By.tagName("head"));
//        System.out.println("First <header> element: " + element2.getText());
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
