package com.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import com.baseclass.library;
import com.pages.orangelogin;
import com.pages.orangemaintenance;
import com.seleniumutillity.seleniumutil;

@RunWith(Cucumber.class)
public class maintenanacestepdef extends library {
	final static Logger lOG = LogManager.getLogger(maintenanacestepdef.class.getName());
	orangelogin login;
	orangemaintenance org;

    @Given("^i will launch the browser and open orangehrm page$")
    public void i_will_launch_the_browser_and_open_orangehrm_page() throws IOException {
    	launchapp();
    	
    	login = new orangelogin(driver);
    	login.username("Admin");
    	login.password("admin123");
    	login.loginbtn();
    	lOG.info("browser is launched and user is logged in");
    	
    }
    @Then("^i will click on verify password and enters the password$")
    public void i_will_click_on_verify_password_and_enters_the_password() {
    	org = new orangemaintenance(driver);
    	org.Maintenance();
    	org.verifypwd();
    	lOG.info("password is verified and enterd");
    }

    @Then("^i will click on verify button$")
    public void i_will_click_on_verify_button() {
    	org.verifybtn();
    	lOG.info("verify button is clicked");
    }

    @Then("^i will search in textvacancy$")
    public void i_will_search_in_textvacancy() {
    	org.textvacancy();
    	lOG.info("textvacancy is searched");
    }

    
    @Then("^i will click on search button$")
    public void i_will_click_on_search_button() {
    	org.searchbtn();
    	lOG.info("search button is clicked");
    }
    
    @Then("^it will take screenshot$")
    public void it_will_take_screenshot() {
    

    	seleniumutil util=new seleniumutil(driver);
    	util.takeSnapShot("C:\\Users\\veera prasad\\git\\OrangeHRM\\Demohrm\\src\\test\\resources\\screenshot\\maintenance.png");
    	lOG.info("screenshot is taken");
    	driver.quit();
    }

}