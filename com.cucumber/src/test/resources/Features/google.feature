@TC001
Feature: Google Search Functionality

  Scenario: Verify GoogleSearch Functionality
   Given browser is open
   And user is on google search page
   When user enters a text in search box
   And hits enter
   Then use is navigate to search results page.
