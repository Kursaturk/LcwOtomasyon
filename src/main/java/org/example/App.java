package org.example;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
public class App{

    WebDriver webDriver;

    public App(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    public WebElement find(By locator){
        return webDriver.findElement(locator);

    }
    public List<WebElement>findAll(By locator){
        return webDriver.findElements(locator);
    }
    public void click(By locator){
        find(locator).click();
    }
    public void type(By locator,String text){
        find(locator).sendKeys(text);

    }
    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();


    }

}
