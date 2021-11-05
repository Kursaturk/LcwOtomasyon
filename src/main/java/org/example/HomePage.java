package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends App {
    SearchBox searchBox;
    By cartCountLocator=By.id("spanCart");
    public HomePage(WebDriver webDriver) {
        super(webDriver);
        searchBox=new SearchBox(webDriver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount()>0;
    }

    public void goToCart() {
    click(cartCountLocator);
    }
    private int getCartCount(){
       String count=find(cartCountLocator).getText();
       return Integer.parseInt(count);
    }
}
