package com.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.library;
import com.pages.orangelogin;
import com.pages.orangelogout;
import com.seleniumutillity.seleniumutil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class logoutstepdef extends library {
	final static Logger lOG = LogManager.getLogger(logoutstepdef.class.getName());

@Given("^i will launch the chrome browser and open the orangehrm webpage$")
public void i_will_launch_the_chrome_browser_and_open_the_orangehrm_webpage() throws IOException {
	launchapp();
	orangelogin org= new orangelogin(driver);
	org.username("Admin");
	org.password("admin123");
	org.loginbtn();
	lOG.info("browser is launched and user is logged in");
}


@Then("^i will click on welcome admin$")
public void i_will_click_on_welcome_admin() throws InterruptedException {
	orangelogout org= new orangelogout(driver);
	org.welcomeadmin();
	lOG.info("welcome admin is clicked"); 
}

@Then("^i will click on logout button$")
public void i_will_click_on_logout_button() {
	orangelogout org= new orangelogout(driver);
	org.logout();
	lOG.info("logout button is clicked");
	
}
@Then("^screenshot is taken$")
public void screenshot_is_taken() {


	seleniumutil util=new seleniumutil(driver);
	util.takeSnapShot("C:\\Users\\veera prasad\\git\\OrangeHRM\\Demohrm\\src\\test\\resources\\screenshot\\logout.png");
	lOG.info("screenshot is taken");
	driver.quit();

}
}