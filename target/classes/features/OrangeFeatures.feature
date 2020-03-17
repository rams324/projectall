Feature: OrangeHRM Website

@tc_01
Scenario:
Log in to OrangeHRM with valid Cradentials

Given user launch the chrome browser
When user open the orange hrm login page
Then user enter the username and password with valid data
And user click the Login button

@tc_02
Scenario:
Log in to OrangeHRM with invalid Cradentials

Given the user launch the chrome browser
When the user open the orange hrm login page
Then user enter the username and password with invalid data
And the user click the Login button

@tc_03
Scenario:
 To check if the dashboard page is present when user log into the website

Given  user launch the Chrome browser
When user open the orangehrm login page
Then the user enter the username and password with valid data
And user click the login button
Then take the screenshot of the dashboard page

@tc_04
Scenario:
To check the footer of the dash borad contains OrangeHRM

Given  user Launch the chrome browser
When user open the orangeHrm login page
Then User enter the username and password with valid data
And User click the Login button
Then compare the footer content 

@tc_05
Scenario:
Leave link is working in properly or not in the dashborad page 

Given  user launch the chrome Browser
When user open the orangehrm Login page
Then user enter the username and password with Valid data
And user click the Login Button
Then user  click Leave link in the dash borad page

@tc_06
Scenario:
LogOut the application

Given  user launch the Chrome Browser
When user open the orangehrm login Page
Then user enter the username and password with valid Data
And user click on the Login button
Then user click the logout button
