package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class Lcw extends AppTest{

    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void search_pantolon(){
        homePage=new HomePage(driver);
        productPage=new ProductPage(driver);
        homePage.searchBox().search("pantolon");
       Assertions.assertTrue(productPage.isOnProductPage(),"Not on product page!");

    }
    @Order(2)
    @Test
    public void select_pantolon (){
        productDetailPage=new ProductDetailPage(driver);
    productPage.selectProduct(1);
        //Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page!");

    }
    @Order(3)
    @Test
    public void add_to_cart (){

        productDetailPage.addToCart();
       // Assertions.assertTrue(homePage.isProductCountUp(),"Product count did not increase!");

    }
    @Order(4)
    @Test
    public void go_to_cart (){
        cartPage=new CartPage(driver);
    homePage.goToCart();

      //  Assertions.assertTrue(cartPage.checkIfProductAdded(),"Not on product page!");

    }
    @Test
    public void add_pantolon (){

    }
    @Test
    public void delete_cart (){


    }
}
