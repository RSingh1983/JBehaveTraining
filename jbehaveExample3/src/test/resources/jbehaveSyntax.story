Meta:

Narrative:
As a user
I want to add two numbers
So that I can achieve a business goal

Lifecycle:
Before:



After:
    Given I execute the step after every scenario

Scenario: Sum two positive numbers
Given two numbers 1 and 10
When I add the numbers
Then I validate the sum of numbers as 11

Scenario: Sum two negative numbers
Given two numbers -1 and -10
When I add the numbers
Then I validate the sum of numbers as -11

Scenario: Sum two positive and negative numbers
Given two numbers -1 and 10
When I add the numbers
Then I validate the sum of numbers as 9