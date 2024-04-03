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
    @Test
    public void findElementByCssSelector(){
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector(".bar-notification"));
        driver.findElement(By.cssSelector("[title='Error']"));
        driver.findElement(By.cssSelector("[title='Close']"));
        driver.findElement(By.cssSelector("[class*='bar']"));
        driver.findElement(By.cssSelector(".page-body"));
        driver.findElement(By.cssSelector("[class$='grid']"));
        driver.findElement(By.cssSelector("[class$='my-account']"));
        driver.findElement(By.cssSelector(".ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all"));
        driver.findElement(By.cssSelector("[type='text/javascript']"));

    }
    @Test
    public void findElementByXpath(){
        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//*[@class='bar-notification']"));
        driver.findElement(By.xpath("//*[contains(@title,'Error')]"));
        driver.findElement(By.xpath("//*[contains(@title,'Close')]"));
        driver.findElement(By.xpath("//*[contains(@class,'bar')]"));
        driver.findElement(By.xpath("//*[@class='page-body']"));
        driver.findElement(By.xpath("//*[contains(@class,'grid')]"));
        driver.findElement(By.xpath("//*[contains(@class,'my-account')]"));
        driver.findElement(By.xpath("//*[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']"));
        driver.findElement(By.xpath("//*[contains(@type,'text/javascript')]"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
