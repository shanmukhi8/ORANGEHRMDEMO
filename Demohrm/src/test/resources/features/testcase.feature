Feature: orangehrm demo
This is used to verify the functionality of orangehrm demo
@tc_01_login
Scenario Outline: i want to validate the login functionality of orangehrm webpage
Given i will launch the web browser and open the orangerhrm webpage
When login page appears i will enter "<username>" and "<password>"
Then i will click on login button
Examples:
|username                 |password|
|Admin                   |admin123|
|admin                      |admin|

@tc_02_logout
Scenario: i want to validate the logout functionality of orangehrm webpage
Given i will launch the chrome browser and open the orangehrm webpage
Then i will click on welcome admin
Then i will click on logout button
Then screenshot is taken
@tc_03_leave
Scenario: i want to validate the leave functionality of orangehrm webpage
Given i launch the browser and open orangehrm page
Then i will click on leave
Then i will select paternity
Then screenshot is captured
@4_maintenance
Scenario: i want  to validate the maintenance functionality of orangehrm webpage
Given i will launch the browser and open orangehrm page
Then i will click on verify password and enters the password
Then i will click on verify button
Then i will search in textvacancy
Then i will click on search button
Then it will take screenshot



