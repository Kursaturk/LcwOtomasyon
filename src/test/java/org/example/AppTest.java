package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest
{
    WebDriver driver;
    @BeforeAll
    public  void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kursa\\IdeaProjects\\untitled\\LCW\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();

    }
    @AfterAll
    public void tearDown(){
        driver.quit();
    }

}
