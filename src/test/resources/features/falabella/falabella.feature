#Author: jhmf01@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


@Falabella

Feature: Page Falabella

@ListOfFavorites @Falabella
Scenario: Add a article to the Favorites List
Given I want to login in web page falabella
When I add a article to the favorites list
Then I validate the favorites list


@BuyArticle @Falabella
Scenario: Buy a article in web pae falabella
Given I want to login in web page falabella
When I buy article on the page
Then I validate my buy

