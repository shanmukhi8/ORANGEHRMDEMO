package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangelogout {
WebDriver driver;
@FindBy(xpath = "/html/body/div[1]/div[1]/a[2]")
WebElement welcomeadmin;
@FindBy(xpath ="//a[contains(text(),'Logout')]" )
WebElement logout;
public orangelogout(WebDriver driver) {
PageFactory.initElements(driver, this);
this.driver=driver;
}
public void welcomeadmin() throws InterruptedException {

welcomeadmin.click();
Thread.sleep(5000);
}




public void logout() {
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


logout.click();
}


}