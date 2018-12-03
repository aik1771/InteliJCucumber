

Feature: Heroku Search Feature

  Background:
    Given User is on the Threely register page

  @heroku
Scenario Outline: Verify invalid email on registration
    When I enter name as "testuser" email as <email> password as "test12345"
And I click 'submit' button
Then  I verify invalid email address

Examples:
| email |
| test.com |
| test@test@test.com |