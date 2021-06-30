package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/child::li")
    WebElement expextedresult;

   @FindBy(xpath = "//ul[@class='top-menu notmobile']/child::li")
  //@FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement actualresult;




    public void getHomePage(String menu) throws InterruptedException {
Thread.sleep(5000);
        List<WebElement> elementList = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/child::li"));
        log.info("Clicking on menu link : " + elementList.toString());
        for (WebElement element : elementList) {
            if (element.getText().equals(menu)) {
                log.info("Clicking on menu element link : " + element.toString());
                clickOnElement(element);
            }
        }
    }



    public String getActualResult() throws InterruptedException {
        Thread.sleep(5000);
       return getTextFromElement(actualresult);
    }
}

