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

public class FindElementsTests {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        //maximize browser to window
        driver.manage().window().maximize();
        //wait for all elements on the site to load before starting the test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTagName(){
        // find element by tag name
//        WebElement element = driver.findElement(By.tagName("h1"));
//        System.out.println(element.getText());
        // find List of elements by tag name

        WebElement element1 = driver.findElement((By.tagName("a")));
        System.out.println(element1.getText());

        List<WebElement> elements = driver.findElements((By.tagName("a")));
        System.out.println(elements.size());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
