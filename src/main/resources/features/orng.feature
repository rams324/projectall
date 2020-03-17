@orangeHRM 
Feature: OrangeHRM website 



@Tc_16 
Scenario: 
	Login in to demo blaze steps
	Given the user launched the chromebrowser 
	When the user open the Demoblaze website 
	Then user clicks on login button 
	Then the user enters the username and password clicks on login button 	
	
@TC_17 
Scenario: 
	Validating the click functionality of Directory Tab sss
	Given Launch the chrome browser 
	When Open the OrangeHRM Home Page 
	Then Navigate to Directory Tab 
	And Click on the Directory Tab 
	Then Verify whether page is navigated or not 
	
@TC_18 
Scenario: validating valid in search directory 
	Given launch the chrome browser 
	When Open the OrangeHRM Home Page and click on the Directory Tab 
	Then Enter the valid data 
	And Click on the Search button 
	
	
@TC_19 
Scenario: validating invalid in search directory 
	Given Launch the Chrome browser 
	When Open the OrangeHRM Home Page and click on the directory Tab 
	Then Enter the valid Data 
	And Click on the Search Button 
	
@TC_20 
Scenario: validating Reset button in search directory 
	Given Launch the chrome Browser 
	When Open the OrangeHRM Home Page and click on the DirectoryTab 
	Then Enter the invalid data 
	And Click on the Reset Button 