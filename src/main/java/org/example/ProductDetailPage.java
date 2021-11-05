package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends App{
    By addToCartButtonLocator = By.id("pd_add_to_cart");
    public ProductDetailPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }

    public void addToCart() {
        click(addToCartButtonLocator);
    }
}
