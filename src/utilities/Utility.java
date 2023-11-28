package utilities;

import browser_factory.Base_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends Base_Test {

    //method to click on elements
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    //method to send text on elements
    public void sendTextElement(By by,String text){
        driver.findElement(by).sendKeys(text);
    }

    //method to get text
    public String getTextFromElement(By by){
       return driver.findElement(by).getText();
    }

    //method to hover mouse on element
    public void mouseHoverToElement(By by){
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(by));
    }

    //method to select element from drop down
    public void selectByvalueFromDropDown(By by,String value){

        WebElement dropDown=driver.findElement(by);
        Select select=new Select(dropDown);
        select.selectByValue(value);
    }
}
