package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(partialLinkText = "Compute")
    WebElement computer;

    @FindBy(partialLinkText = "Deskto")
    WebElement desktop;

    public void clickonComputer() {
        mouseHoverToElement(computer);
        log.info("Clicking on computer link : " + computer.toString());
    }
    public void clickonDesktop(){
        clickOnElement(desktop);
        log.info("Clicking on desktop link : " + desktop.toString());

    }

}
