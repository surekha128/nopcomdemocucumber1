package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/*
2.3 Select Sort By position "Name: A to Z"

 */
public class DesktopsortbyAtoZ extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsortbyAtoZ.class.getName());

    @FindBy(id = "products-orderby")
    WebElement sortby;
    @FindBy(xpath = "//option[contains(text(),'Name: A to Z')]")
    WebElement SortBypositionNameAtoZ;

    public void getsortingpositionNameAtoZ() {
        mouseHoverToElement(sortby);
        log.info("Clicking on sortby link : " + sortby.toString());

        clickOnElement(SortBypositionNameAtoZ);
        log.info("Clicking on sortbyposition link : " + SortBypositionNameAtoZ.toString());




    }
}
