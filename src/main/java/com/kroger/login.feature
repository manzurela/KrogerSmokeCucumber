
  Feature: kroger web application smoke test

    Scenario: login kroger web application with valid user and password
      Given I am on kroger homepage
      When I click on sign in link
      Then I navigate to sign in page
      When I enter valid user name, password and click on sign in button
      Then I successfully enter into my account