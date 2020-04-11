package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class testrunner {

@RunWith(Cucumber.class)
@CucumberOptions(
   features="src/test/resources/features/",
glue= "com.stepdefinition",
tags = {"@tc_01_login,@tc_02_logout,@tc_03_leave,@4_maintenance"},
plugin = {"pretty", "html:target/cucumber-html-report",
            "json:target/cucumber-json-report",
            "junit:target/cucumber-junit-report",
            "com.cucumber.listener.ExtentCucumberFormatter:target/Extentreports/Extentreport.html"},
 
   monochrome = true    
)
public static class LoginRunner
{
@AfterClass
public static void extentreport() 
{
Reporter.loadXMLConfig("C:\\Users\\veera prasad\\git\\ORANGEHRMDEMO\\Demohrm\\src\\test\\resources\\testdata\\extent.config.xml");
Reporter.setSystemInfo("user",System.getProperty("user.name"));
Reporter.setSystemInfo("os","Windows");
Reporter.setTestRunnerOutput("sample test runner output message");
}

}
}
