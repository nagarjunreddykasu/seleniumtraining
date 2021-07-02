Feature: Login
In order to verify Login functionality
As a user
I want to enter username and password

#Background:
#Given user navigates to the application
#When user validates the page title
#
#Scenario: In order to verify Login with valid credentials
#And user entered "valid" username
#And user entered "valid" password
#Then user "shouldbe" succesfully logged in
#
#
#Scenario: In order to verify Login with invalid credentials
#And user entered "invalid" username
#And user entered "invalid" password
#Then user "shouldnot" succesfully logged in

#To comment block of code: Ctrl+/


#Scenario Outline: In order to verify Login with valid credentials
#Given user navigates to the application
#When user validates the page title
#And user entered "<username>" username
#And user entered "<password>" password
#Then user "<result>" succesfully logged in
#
#Examples:
#|username|password|result|
#|nkasu@frontier.com|xeno@123|shouldbe|
#|nagarjun@gmail.com|Inv@123	|shouldnot|

Scenario: In order to verify Login with valid credentials
Given user navigates to the application
When user validates the page title
And user entered valid username
And user entered valid password
And user selects Age category
	|Age		 |Location|
	|Below 18|India		|
	|Above 18|USA			|
Then user shouldbe succesfully logged in
















