package com.stepdefinition;

import java.io.IOException;

import com.baseclass.library;
import com.pages.orangeleaves;
import com.pages.orangelogin;
import com.seleniumutillity.seleniumutil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class leavestepdef extends library {
	final static Logger lOG = LogManager.getLogger(leavestepdef.class.getName());

@Given("^i launch the browser and open orangehrm page$")
public void i_launch_the_browser_and_open_orangehrm_page() throws IOException{
	launchapp();
	orangelogin org = new orangelogin(driver);
	org.username("Admin");
	org.password("admin123");
	org.loginbtn();
	lOG.info("browser is launched and user is logged in");
	
}




@Then("^i will click on leave$")
public void i_will_click_on_leave() {
	orangeleaves org=new orangeleaves(driver);
	org.leave();
	lOG.info("leaves is clicked");
}


@Then("^i will select paternity$")
public void i_will_select_paternity() throws InterruptedException {
	orangeleaves org=new orangeleaves(driver);
	org.paternity();
	lOG.info("paternity is selected");

}

@Then("^screenshot is captured$")
public void screenshot_is_captured() {


	seleniumutil util=new seleniumutil(driver);
	util.takeSnapShot("C:\\Users\\veera prasad\\git\\OrangeHRM\\Demohrm\\src\\test\\resources\\screenshot\\leaves.png");
	lOG.info("screenshot is taken");
	driver.quit();

}


}
	
	
	
	



