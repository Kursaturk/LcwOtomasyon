package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends App {

    By filterLocator= By.id("filter-label");
    By productNameLocator=new By.ByCssSelector("col-xs-6 col-sm-6 col-md-3 four-column c-item product-item-wrapper");

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isOnProductPage() {
    return isDisplayed(filterLocator);
    }

    public void selectProduct(int i) {
    getAllProducts().get(i).click();
    }
    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}
