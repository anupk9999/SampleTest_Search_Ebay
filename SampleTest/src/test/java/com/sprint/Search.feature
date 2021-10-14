Feature: To test the search module functionality
Scenario: To validate the search functionality and product page
Given user is on home page
And user is able to see search bar and products on home page
When user clicks on search bar and enters the product to be searched
And hit the search button
When User should be to see the products
And click on any product which user is interested to buy
When Product specification page should be visible
Then user should be able to access add to cart or buy button 

Scenario: To Validate the deals of the day tab funcionality
Given User shall be redirected to home page
When User is able to see deals of the tab
Then Click on deals of the day tab 

Scenario: To Validate All category tab on search bar
Given User should be available on home page
When User should be able to see the all category section
Then user should be able to click on that

Scenario: To validate the Section category
Given Home page of the user should be visible
When user should be able to see section wise category
Then click on any of the sub category

Scenario: To validate the Advance search category
Given Navigated to home page
When User should be able to see advance search button
Then click on advance search 

Scenario: To validate the shop by category tab
Given User should be redirected to home Page
When Shopb by category sould be visible
Then click on shop by category