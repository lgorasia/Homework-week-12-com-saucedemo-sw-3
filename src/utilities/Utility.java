package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Utility extends BaseTest {

    public void clickOnElement(By by){
        WebElement element = driver.findElement(by);
        element.click();
    }

    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public int getNumberFromElement(By by) {
        List<WebElement> actualNumberElement = driver.findElements(by);
        int actualNumber = actualNumberElement.size();
        return actualNumber;}


    }




