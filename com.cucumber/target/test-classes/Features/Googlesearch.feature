Feature: Login functionality

  Scenario: verify Login functionality with valid credentials
    Given user in on OrangeHRM Login page
    When user enter valid username:"Admin" and password:"admin123"
    And user clicks on the Login button
    Then user should redirect to the dashboard page
    And close the browser
