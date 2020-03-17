Feature: OrangeHRM Website

@tc_01
Scenario:
Log in to OrangeHRM with valid details

Given user launch the chrome browser1
When user open the orange hrm login page1
Then login with enter details


@tc_02
Scenario:
adding user details in admin page

Given  user launch the chrome browser2
When  user open the orange hrm login page2
Then login with valid details2 
Then user is able to add the new user in the admin page


@tc_03
Scenario:
adding user details in admin page

Given user launch the chrome browser3
When  user open the orange hrm login page3
Then login with required details 
Then user is able to delet the  admin in the admin page

@tc_04
Scenario:
about orange HRM

Given launcing the application via chrome browser
When login with valid details
Then user is able to know about orange hrm application
Then take the screenshot of about page 

@tc_05
Scenario:
searching for employee 

Given user launch the chrome browser5
When  user open the orange hrm login page5
Then login with valid details5
Then searching for employee in the admin page