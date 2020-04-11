package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class orangeleaves  {
WebDriver driver;
@FindBy(linkText = "Leave")
WebElement leave;
@FindBy(linkText  = "Configure")
WebElement configure;
@FindBy(linkText  = "Leave Types")
WebElement leavetypes;
@FindBy(xpath = "//a[contains(text(),'Paternity US')]")
WebElement paternity;
@FindBy(xpath = "//input[contains(text(),'Add')]")
WebElement add;
@FindBy(xpath = "//input[@name='leaveType[txtLeaveTypeName]']")
WebElement textleave;
@FindBy(xpath = "//input[@value='Save']")
WebElement savebtn;

public orangeleaves(WebDriver driver) {
PageFactory.initElements(driver, this);
this.driver =driver;

}
public void leave() {

Actions action = new Actions(driver);
action.moveToElement(leave).perform();
action.moveToElement(configure).perform();

Actions seriesofactions = action.moveToElement(leavetypes).click();
seriesofactions.build().perform();
}
public void paternity() throws InterruptedException {

paternity.click();
Thread.sleep(5000);
}


}


