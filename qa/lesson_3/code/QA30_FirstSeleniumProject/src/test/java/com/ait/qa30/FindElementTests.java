package com.ait.qa30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");

        //maximize browser to window
        driver.manage().window().maximize();
        //wait for all elements on the website to load before starting the test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTagName() {
        //find element by tag
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.println(element1.getText());

        //find list of elements
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }

    @Test
    public void startFindLocatorsTest() {
        //id
        driver.findElement(By.id("city"));
        //className
        driver.findElement(By.className("input-label"));
        //link text
        driver.findElement(By.linkText("Let the car work"));
        //partial link text
        driver.findElement(By.partialLinkText("work"));
    }

    @Test
    public void findElementByCss() {
        //tag name == css
        // driver.findElement(By.tagName("h1"));
        driver.findElement(By.cssSelector("h1"));
        //id == #id
        // driver.findElement(By.id("city"));
        driver.findElement(By.cssSelector("#city"));
        //className == .className
        // driver.findElement(By.className("input-label"));
        driver.findElement(By.cssSelector(".input-label"));
        //attr - par == [attr='par']
        driver.findElement(By.cssSelector("[ng-reflect-name='city']"));
    }

    @Test
    public void findElementByXpath() {
        //  //tag[@attr='par']
        //id == //tag[@id='par']
        // driver.findElement(By.id("city"));
        driver.findElement(By.xpath("//input[@id='city'"));
        //className == //tag[@class='par']
        // driver.findElement(By.className("input-label"));
        driver.findElement(By.xpath("//label[@class='input-label'"));
        //contains //tag[contains(.,'Text')]
        driver.findElement(By.xpath("//*[contains(.,'data and hit Yalla!')]"));
        driver.findElement(By.xpath("//*[text()='Type your data and hit Yalla!']"));
        driver.findElement(By.xpath("//*[.='Type your data and hit Yalla!']"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
