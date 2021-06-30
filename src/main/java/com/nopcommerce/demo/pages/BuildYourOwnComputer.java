package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/*
2.4 Click on "Add To Cart"
	2.5 Verify the Text "Build your own computer"
	2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
	2.7.Select "8GB [+$60.00]" using Select class.
	2.8 Select HDD radio "400 GB [+$100.00]"
	2.9 Select OS radio "Vista Premium [+$60.00]"
    2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
	2.11 Verify the price "$1,475.00"
	2.12 Click on "ADD TO CARD" Button.
	2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar

 */
public class BuildYourOwnComputer extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement clickaddtocart;
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement veifybuildtext;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement  selectprocessor;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement  selectram;
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement selectHDD1;
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement selectHDD2;
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement selectOS1;
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement selectOS2;
    @FindBy(id = "product_attribute_5_10")
    WebElement selectMicrofoftOffice;
    @FindBy(id = "product_attribute_5_11")
    WebElement selectAcrobatReader;
    @FindBy(id = "product_attribute_5_12")
    WebElement selectTotalCommander;
    @FindBy(xpath = "//span[@id='price-value-1']")
     WebElement  totalverify;
   @FindBy(id = "add-to-cart-button-1")
   WebElement addtocart;
   @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]")
   WebElement verifyproductaddedcart;
    //span[@id='price-value-1']

    public void addtocartclick() throws InterruptedException {
        Thread.sleep(4000);
        clickOnElement(clickaddtocart);
        log.info("Clicking on addtocart link : " + clickaddtocart.toString());
      //  String actualMessage = getTextFromElement(veifybuildtext);

    }
    public String getAbuildtext(){

        return getTextFromElement(veifybuildtext);
    }

    public void buildyourowncomputerproductselectprocessor(String value){

        selectByValueFromDropDown(selectprocessor, value);
        log.info("Clicking on processor link : " + selectprocessor.toString());

    }

    public void buildyourowncomputerproductselectram(String value) {

        selectByValueFromDropDown(selectram, value);
        log.info("Clicking on ram link : " + selectram.toString());

    }

    public void buildyourowncomputerproductselectHDD(String value){
        if (value == "6") {
            clickOnElement(selectHDD1);
            log.info("Clicking on Hdd link : " + selectHDD1.toString());

        } else if (value == "7") {
            clickOnElement(selectHDD2);
            log.info("Clicking on processor link : " + selectHDD2.toString());

        } else {
            System.out.println("Accepts value 6 or 7 only");
        }
    }

    public void selectOS(String value) {
        if (value == "8") {
            clickOnElement(selectOS1);
            log.info("Clicking on processor link : " + selectOS1.toString());

        } else if (value == "9") {
            clickOnElement(selectOS2);
            log.info("Clicking on processor link : " + selectOS2.toString());

        }
    }

    public void selectSoftware(String value){
        if (value == "10") {
            clickOnElement(selectMicrofoftOffice);
            log.info("Clicking on processor link : " + selectMicrofoftOffice.toString());

        } else if (value == "11") {
            clickOnElement(selectAcrobatReader);
            log.info("Clicking on processor link : " + selectAcrobatReader.toString());

        }else if (value == "12") {
            clickOnElement(selectTotalCommander);
            log.info("Clicking on processor link : " + selectTotalCommander.toString());

        }

      }

    public String gettotalPrice(){

        return getTextFromElement(totalverify);
    }

    public void clickoOnADDTOCARD(){
        clickOnElement(addtocart);
        log.info("Clicking on processor link : " + addtocart.toString());
    }

    public String productAddedSuccessfully(){

        return getTextFromElement(verifyproductaddedcart);
    }


}

