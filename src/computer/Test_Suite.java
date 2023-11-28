package computer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * write the following Test:
 * 1.Test name verifyProductArrangeInAlphaBaticalOrder()
 * 1.1 Click on Computer Menu.
 * 1.2 Click on Desktop
 * 1.3 Select Sort By position "Name: Z to A"
 * 1.4 Verify the Product will arrange in Descending order.
 * <p>
 * <p>
 * 2. Test name verifyProductAddedToShoppingCartSuccessFully()
 * 2.1 Click on Computer Menu.
 * 2.2 Click on Desktop
 * 2.3 Select Sort By position "Name: A to Z"
 * 2.4 Click on "Add To Cart"
 * 2.5 Verify the Text "Build your own computer"
 * 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
 * 2.7.Select "8GB [+$60.00]" using Select class.
 * 2.8 Select HDD radio "400 GB [+$100.00]"
 * 2.9 Select OS radio "Vista Premium [+$60.00]"
 * 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
 * [+$5.00]"
 * 2.11 Verify the price "$1,475.00"
 * 2.12 Click on "ADD TO CARD" Button.
 * 2.13 Verify the Message "The product has been added to your shopping cart" on Top
 * green Bar
 * After that close the bar clicking on the cross button.
 * 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 * 2.15 Verify the message "Shopping cart"
 * 2.16 Change the Qty to "2" and Click on "Update shopping cart"
 * 2.17 Verify the Total"$2,950.00"
 * 2.18 click on checkbox “I agree with the terms of service”
 * 2.19 Click on “CHECKOUT”
 * 2.20 Verify the Text “Welcome, Please Sign In!”
 * 2.21Click on “CHECKOUT AS GUEST” Tab
 * 2.22 Fill the all mandatory field
 * 2.23 Click on “CONTINUE”
 * 2.24 Click on Radio Button “Next Day Air($0.00)”
 * 2.25 Click on “CONTINUE”
 * 2.26 Select Radio Button “Credit Card”
 * 2.27 Select “Master card” From Select credit card dropdown
 * 2.28 Fill all the details
 * 2.29 Click on “CONTINUE”
 * 2.30 Verify “Payment Method” is “Credit Card”
 * 2.32 Verify “Shipping Method” is “Next Day Air”
 * 2.33 Verify Total is “$2,950.00”
 * 2.34 Click on “CONFIRM”
 * 2.35 Verify the Text “Thank You”
 * 2.36 Verify the message “Your order has been successfully processed!”
 * 2.37 Click on “CONTINUE”
 * 2.37 Verify the text “Welcome to our store”
 */
public class Test_Suite extends Utility {

    String baseUrl = " https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        //1.1 Click on Computer Menu.
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));

        //1.2 Click on Desktop
        clickOnElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']"));

        //1.3 Select Sort By position "Name: Z to A"
        clickOnElement(By.id("products-orderby"));
        selectByvalueFromDropDown(By.id("products-orderby"),"6");

        //1.4 Verify the Product will arrange in Descending order

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {

        //2.1 Click on Computer Menu.
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));

        //2.2 Click on Desktop
        clickOnElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']"));

        //2.3 Select Sort By position "Name: A to Z"
        clickOnElement(By.xpath("//select[@id='products-orderby']"));
        selectByvalueFromDropDown(By.xpath("//select[@id='products-orderby']"),"5");

        //2.4 Click on "Add To Cart"
        clickOnElement(By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]"));

        //2.5 Verify the Text "Build your own computer"
        String expectedText="Build your own computer";
        String actualText=getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals(expectedText,actualText);

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        clickOnElement(By.xpath("//select[@id='product_attribute_1']"));
        selectByvalueFromDropDown(By.xpath("//select[@id='product_attribute_1']"),"2.2 GHz Intel Pentium Dual-Core E2200");

        //2.7.Select "8GB [+$60.00]" using Select class.
        clickOnElement(By.xpath("//select[@id='product_attribute_2']"));
        selectByvalueFromDropDown(By.xpath("//select[@id='product_attribute_2']"),"8GB [+$60.00]");

        //2.8 Select HDD radio "400 GB [+$100.00]"
        clickOnElement(By.xpath("//label[text()='400 GB [+$100.00]']"));

        //2.9 Select OS radio "Vista Premium [+$60.00]"
        clickOnElement(By.xpath("//label[text()='Vista Premium [+$60.00]']"));

        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander * [+$5.00]"
        clickOnElement(By.xpath("//label[text()='Microsoft Office [+$50.00]']"));
        clickOnElement(By.xpath("//label[text()='Total Commander [+$5.00]']"));

        //2.11 Verify the price "$1,475.00"
        String expectedPrice="$1,475.00";
        String actualPrice=getTextFromElement(By.xpath("//span[@id='price-value-1']"));
        Assert.assertEquals(expectedPrice,actualPrice);

        //2.12 Click on "ADD TO CARD" Button.
        clickOnElement(By.xpath("//button[@class='button-1 add-to-cart-button']"));

        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        //After that close the bar clicking on the cross button.
        String expectedText1="The product has been added to your shopping cart";
        String actualText1=getTextFromElement(By.xpath("//p[@class='content']"));
        Assert.assertEquals(expectedText1,actualText1);
        clickOnElement(By.xpath("//span[@class='close']"));

        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        mouseHoverToElement(By.xpath("//span[@class='cart-label']"));
        clickOnElement(By.xpath("//button[@class='button-1 cart-button']"));

        //2.15 Verify the message "Shopping cart"
        String expectedMessage="Shopping cart";
        String actualMessage=getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals(expectedMessage,actualMessage);

        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        sendTextElement(By.xpath("//input[@class='qty-input']"),"2");
        clickOnElement(By.id("updatecart"));

        //2.17 Verify the Total"$2,950.00"
        String expectedAmount="$2,950.00";
        String actualAmount=getTextFromElement(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]"));
        Assert.assertEquals(expectedAmount,actualAmount);

        //2.18 click on checkbox “I agree with the terms of service”
        clickOnElement(By.xpath("//input[@id='termsofservice']"));

        //2.19 Click on “CHECKOUT”
        clickOnElement(By.id("checkout"));

        //2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedText2="Welcome, Please Sign In!";
        String actualText2=getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals(expectedText2,actualText2);

        //2.21Click on “CHECKOUT AS GUEST” Tab
        clickOnElement(By.className("checkout-as-guest-button"));

        //2.22 Fill the all mandatory field
        sendTextElement(By.id("BillingNewAddress_FirstName"),"Nill");
        sendTextElement(By.id("BillingNewAddress_LastName"),"Poddar");
        sendTextElement(By.id("BillingNewAddress_Email"),"Nill123@gmail.com");
        selectByvalueFromDropDown(By.id("BillingNewAddress_CountryId"),"United Kingdom");
        sendTextElement(By.id("BillingNewAddress_City"),"London");
        sendTextElement(By.id("BillingNewAddress_Address1"),"21,");
        sendTextElement(By.id("BillingNewAddress_ZipPostalCode"),"LA1 2QL");
        sendTextElement(By.id("BillingNewAddress_PhoneNumber"),"+44 7076543725");

        //2.23 Click on “CONTINUE”
        clickOnElement(By.xpath("//button[@onclick='Billing.save()']"));

        //2.24 Click on Radio Button “Next Day Air($0.00)”
        clickOnElement(By.xpath("//input[@id='shippingoption_1']"));

        //2.25 Click on “CONTINUE”
        clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));

        //2.26 Select Radio Button “Credit Card”
        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
        clickOnElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));

        //2.27 Select “Master card” From Select credit card dropdown
        selectByvalueFromDropDown(By.xpath("//select[@id='CreditCardType']"),"MasterCard");

        //2.28 Fill all the details
        sendTextElement(By.id("CardholderName"),"Nill Poddar");
        sendTextElement(By.id("CardNumber"),"34987654325567895");
        selectByvalueFromDropDown(By.id("ExpireMonth"),"10");
        selectByvalueFromDropDown(By.id("ExpireYear"),"2027");
        sendTextElement(By.id("CardCode"),"0044");

        //2.29 Click on “CONTINUE”
        clickOnElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));

        //2.30 Verify “Payment Method” is “Credit Card”
        String expectedMethod="Credit Card";
        String actualMethod=getTextFromElement(By.xpath("//span[normalize-space()='Credit Card']"));
        Assert.assertEquals(expectedMethod,actualMethod);

        //2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedMethod1="Next Day Air";
        String actualMethod1=getTextFromElement(By.xpath("//span[normalize-space()='Next Day Air']"));
        Assert.assertEquals(expectedMethod1,actualMethod1);

        //2.33 Verify Total is “$2,950.00”
        String expectedAmount1="$2,950.00";
        String  actualAmount1=getTextFromElement(By.xpath("(//strong[contains(text(),'$2,950.00')])[2]"));
        Assert.assertEquals(expectedAmount1,actualAmount1);

        //2.34 Click on “CONFIRM”
        clickOnElement(By.xpath("//button[text()='Confirm']"));

        //2.35 Verify the Text “Thank You”
        String expectedText3="Thank You";
        String actualText3=getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals(expectedText3,actualText3);

        //2.36 Verify the message “Your order has been successfully processed!”
        String expectedMessage1="Your order has been successfully processed!";
        String actualMessage1=getTextFromElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        Assert.assertEquals(expectedMessage1,actualMessage1);

        //2.37 Click on “CONTINUE”
        clickOnElement(By.xpath("//button[@class='button-1 order-completed-continue-button']"));

        //2.37 Verify the text “Welcome to our store”
        String expectedText4="Welcome to our store";
        String actualText4=getTextFromElement(By.xpath("//h2[text()='Welcome to our store']"));
        Assert.assertEquals(expectedText4,actualText4);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
