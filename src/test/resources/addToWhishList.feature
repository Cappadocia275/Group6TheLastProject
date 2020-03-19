
Feature: add the item to the wish list

  Scenario: Add to wish list

    Given Navigate to website
    And Click on My Account
    And Click on Login
    And Type the email address and password and click on login button
    And Hover over on Desktops
    And Click on Mac
    When Click on Add to Wish List button
    Then Verify that item is in your wish list
    And Click on Wish List
    And Remove that item in your wish list
    Then Verify that item is removed
