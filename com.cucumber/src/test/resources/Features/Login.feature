 Feature: feature to test login functionality
 
 Scenario: verify to check login is successful with valid credentials
 Given user is on login page
 When user enter valid credentials(usename: "Admin", password: "admin123"
 And click on the login button 
 Then user is navigated to Home page
 And close the browser
 
 
 