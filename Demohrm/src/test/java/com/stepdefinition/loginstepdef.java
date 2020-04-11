package com.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.library;
import com.pages.orangelogin;
import com.seleniumutillity.seleniumutil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepdef extends library {
	final static Logger lOG = LogManager.getLogger(loginstepdef.class.getName());
	@Given("^i will launch the web browser and open the orangerhrm webpage$")
	public void i_will_launch_the_web_browser_and_open_the_orangerhrm_webpage() throws IOException {
launchapp();
lOG.info("browser is launched ");
}

	@When("^login page appears i will enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_page_appears_i_will_enter_and(String arg1, String arg2) { 
orangelogin org= new orangelogin(driver);
org.username(arg1);
org.password(arg2);
lOG.info("username and password is enterd");
}

 @Then("^i will click on login button$")
 public void i_will_click_on_login_button() {
orangelogin org=new orangelogin(driver);
org.loginbtn();
lOG.info("login button is clicked");

seleniumutil util=new seleniumutil(driver);
util.takeSnapShot("C:\\Users\\veera prasad\\git\\OrangeHRM\\Demohrm\\src\\test\\resources\\screenshot\\login.png");
lOG.info("screenshot is taken");
driver.quit();

}

}
