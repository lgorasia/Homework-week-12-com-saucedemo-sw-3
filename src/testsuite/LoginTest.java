package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class LoginTest extends Utility {
    String baseUrl="https://www.saucedemo.com/";
    @Before
    public void openUp(){
        openBrowser(baseUrl);
    }
   @After
    public void tearDown(){
        closeBrowser();
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //locate userid
        sendTextToElement(By.id("user-name"),"standard_user");

        //locate password
        sendTextToElement(By.id("password"),"secret_sauce");

        //login button
        clickOnElement(By.id("login-button"));

        //this is requirement
        String expectedText = "PRODUCTS";
        // actual text

       
        String actualText = getTextFromElement(By.xpath("//span[contains(text(),'Products')]"));
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        //locate userid
        sendTextToElement(By.id("user-name"),"standard_user");

        //locate password
        sendTextToElement(By.id("password"),"secret_sauce");

        //login button
        clickOnElement(By.id("login-button"));

        //this is requirement
        int expectedNumber = 6;
        int actualNumber =getNumberFromElement(By.className("inventory_item"));

        System.out.println(actualNumber);
        Assert.assertEquals(expectedNumber,actualNumber);

    }
}
