package electronics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * Create the class ElectronicsTest
 * Write the following test
 * 1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
 * 1.1 Mouse Hover on “Electronics” Tab
 * 1.2 Mouse Hover on “Cell phones” and click
 * 1.3 Verify the text “Cell phones”
 * <p>
 * <p>
 * 2. Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
 * 2.1 Mouse Hover on “Electronics” Tab
 * 2.2 Mouse Hover on “Cell phones” and click
 * 2.3 Verify the text “Cell phones”
 * 2.4 Click on List View Tab
 * 2.5 Click on product name “Nokia Lumia 1020” link
 * 2.6 Verify the text “Nokia Lumia 1020”
 * 2.7 Verify the price “$349.00”
 * 2.8 Change quantity to 2
 * 2.9 Click on “ADD TO CART” tab
 * 2.10 Verify the Message "The product has been added to your shopping cart" on Top
 * green Bar
 * After that close the bar clicking on the cross button.
 * 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 * 2.12 Verify the message "Shopping cart"
 * 2.13 Verify the quantity is 2
 * 2.14 Verify the Total $698.00
 * 2.15 click on checkbox “I agree with the terms of service”
 * 2.16 Click on “CHECKOUT”
 * 2.17 Verify the Text “Welcome, Please Sign In!”
 * 2.18 Click on “REGISTER” tab
 * 2.19 Verify the text “Register”
 * 2.20 Fill the mandatory fields
 * 2.21 Click on “REGISTER” Button
 * 2.22 Verify the message “Your registration completed”
 * 2.23 Click on “CONTINUE” tab
 * 2.24 Verify the text “Shopping card”
 * 2.25 click on checkbox “I agree with the terms of service”
 * 2.26 Click on “CHECKOUT”
 * 2.27 Fill the Mandatory fields
 * 2.28 Click on “CONTINUE”
 * 2.29 Click on Radio Button “2nd Day Air ($0.00)”
 * 2.30 Click on “CONTINUE”
 * 2.31 Select Radio Button “Credit Card”
 * 2.32 Select “Visa” From Select credit card dropdown
 * 2.33 Fill all the details
 * 2.34 Click on “CONTINUE”
 * 2.35 Verify “Payment Method” is “Credit Card”
 * 2.36 Verify “Shipping Method” is “2nd Day Air”
 * 2.37 Verify Total is “$698.00”
 * 2.38 Click on “CONFIRM”
 * 2.39 Verify the Text “Thank You”
 * 2.40 Verify the message “Your order has been successfully processed!”
 * 2.41 Click on “CONTINUE”
 * 2.42 Verify the text “Welcome to our store”
 * 2.43 Click on “Logout” link
 * 2.44 Verify the URL is “https://demo.nopcommerce.com/”
 */
public class Electronics_Test extends Utility {

    String baseUrl = " https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        //1.1 Mouse Hover on “Electronics” Tab
        mouseHoverToElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a"));

        //1.2 Mouse Hover on “Cell phones” and click
        mouseHoverToElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul//li[2]/a"));
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul//li[2]/a"));

        //1.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {

        //2.1 Mouse Hover on “Electronics” Tab
        mouseHoverToElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a"));


        //2.2 Mouse Hover on “Cell phones” and click
        mouseHoverToElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul//li[2]/a"));
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul//li[2]/a"));
        //sir, i dont know this same thing is working in above test but it is not working in this method

        // 2.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals(expectedText, actualText);

        // 2.4 Click on List View Tab
        clickOnElement(By.xpath("//a[@class='viewmode-icon list']"));

        //2.5 Click on product name “Nokia Lumia 1020” link
        clickOnElement(By.xpath("//a[text()='Nokia Lumia 1020']"));

        // 2.6 Verify the text “Nokia Lumia 1020”
        String expectedText1="Nokia Lumia 1020";
        String actualText1=getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals(expectedText1,actualText1);

        //2.7 Verify the price “$349.00”
        String expectedPrice="$349.00";
        String actualPrice=getTextFromElement(By.xpath("//span[@id='price-value-20']"));
        Assert.assertEquals(expectedPrice,actualPrice);

        //2.8 Change quantity to 2
        sendTextElement(By.id("product_enteredQuantity_20"),"2");

        // 2.9 Click on “ADD TO CART” tab
        clickOnElement(By.id("add-to-cart-button-20"));

        // 2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        // After that close the bar clicking on the cross button.
        String expectedMessage="The product has been added to your shopping cart";
        String actualMessage=getTextFromElement(By.xpath("//p[@class='content']"));
        Assert.assertEquals(expectedMessage,actualMessage);

        clickOnElement(By.xpath("//span[@class='close']"));

        // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        mouseHoverToElement(By.xpath("//span[@class='cart-label']"));
        clickOnElement(By.xpath("//button[@class='button-1 cart-button']"));

        // 2.12 Verify the message "Shopping cart"
        String expectedMessage1="Shopping cart";
        String actualMessage1=getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals(expectedMessage1,actualMessage1);

        // 2.13 Verify the quantity is 2
        String expectedQuantity="2";
        String actualQuantity=getTextFromElement(By.id("itemquantity11241"));
        Assert.assertEquals(expectedQuantity,actualQuantity);

        //2.14 Verify the Total $698.00
        String expectedTotal="$698.00";
        String actualTotal=getTextFromElement(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]"));
        Assert.assertEquals(expectedTotal,actualTotal);

        // 2.15 click on checkbox “I agree with the terms of service”//
        clickOnElement(By.id("termsofservice"));

        // 2.16 Click on “CHECKOUT”
        clickOnElement(By.id("checkout"));

        // 2.17 Verify the Text “Welcome, Please Sign In!”
        String expectedText2="Welcome, Please Sign In!";
        String actualText2=getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals(expectedText2,actualText2);

        //2.18 Click on “REGISTER” tab
        clickOnElement(By.className("register-button"));

        // 2.19 Verify the text “Register”
        String expectedText3="Register";
        String actualText3=getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals(expectedText3,actualText3);

        // 2.20 Fill the mandatory fields
        sendTextElement(By.id("FirstName"),"Nill");
        sendTextElement(By.id("LastName"),"Poddar");
        selectByvalueFromDropDown(By.xpath("//select[@name='DateOfBirthDay']"),"20");
        selectByvalueFromDropDown(By.xpath("//select[@name='DateOfBirthMonth']"),"11");
        selectByvalueFromDropDown(By.xpath("//select[@name='DateOfBirthYear']"),"1998");
        sendTextElement(By.id("Email"),"abc123@gmail.com");
        sendTextElement(By.id("Password"),"Nill123");
        sendTextElement(By.id("ConfirmPassword"),"Nill123");

        // 2.21 Click on “REGISTER” Button
        clickOnElement(By.id("register-button"));

        // 2.22 Verify the message “Your registration completed”
        String expectedMessage2="Your registration completed";
        String actualMessage2=getTextFromElement(By.xpath("//div[text()='Your registration completed']"));
        Assert.assertEquals(expectedMessage2,actualMessage2);

        // 2.23 Click on “CONTINUE” tab
        clickOnElement(By.className("register-continue-button"));

        // 2.24 Verify the text “Shopping cart”
        String expectedText4="Shopping cart";
        String actualText4=getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals(expectedText4,actualText4);

        // 2.25 click on checkbox “I agree with the terms of service”
        //clickOnElement(By.);
        //when im reaching here, my shopping cart is showing empty, thats why i havent done rest of the steps

        // 2.26 Click on “CHECKOUT”
        // 2.27 Fill the Mandatory fields
        // 2.28 Click on “CONTINUE”
        // 2.29 Click on Radio Button “2nd Day Air ($0.00)”
        // 2.30 Click on “CONTINUE”
        // 2.31 Select Radio Button “Credit Card”
        // 2.32 Select “Visa” From Select credit card dropdown
        // 2.33 Fill all the details
        // 2.34 Click on “CONTINUE”
        // 2.35 Verify “Payment Method” is “Credit Card”
        // 2.36 Verify “Shipping Method” is “2nd Day Air”
        // 2.37 Verify Total is “$698.00”
        // 2.38 Click on “CONFIRM”
        // 2.39 Verify the Text “Thank You”
        // 2.40 Verify the message “Your order has been successfully processed!”
        // 2.41 Click on “CONTINUE”
        // 2.42 Verify the text “Welcome to our store”
        // 2.43 Click on “Logout” link
        // 2.44 Verify the URL is “https://demo.nopcommerce.com/”
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
