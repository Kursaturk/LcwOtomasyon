package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends App{
    By searchBoxLocator = By.id("search_input");
   By submitButtonLocator=By.className("searchButton");
    public SearchBox(WebDriver webDriver) {
        super(webDriver);
    }
    public void search(String text) {
        type(searchBoxLocator,text);
        click(submitButtonLocator);
    }
}
