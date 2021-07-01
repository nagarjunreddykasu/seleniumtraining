Feature: Login
In order to verify Login functionality
As a user
I want to enter username and password

Scenario: In order to verify Login with valid credentials
Given user navigates to the application
When user validates the page title
And user entered valid username
And user entered valid password
Then user shouldbe succesfully logged in


Scenario: In order to verify Login with invalid credentials
Given user navigates to the application
When user validates the page title
And user entered invalid username
And user entered invalid password
Then user shouldnot succesfully logged in

