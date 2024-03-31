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

public class HomeWork27_03 {
    WebDriver driver;
    List<String> tegs;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        tegs = List.of("head","body","title");

        driver.navigate().to("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findUnikElementTest(){

        for (String teg : tegs) {
            List<WebElement> elements = driver.findElements((By.tagName(teg)));
            System.out.println("Number of <" + teg + "> elements: " + elements.size());
        }

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
