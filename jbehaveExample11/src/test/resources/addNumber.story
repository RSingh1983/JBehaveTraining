Narrative:
As a user
I want to add two numbers
So that I can achieve a business goal

Scenario: Sum two positive numbers

Given two integer numbers as <num1> and <num2>
When I add the numbers
Then I validate the sum of numbers as <res>

Examples:
|num1|num2|res|
|10  |20  |30|
|45  |10  |55|
|9   |91  |100|


Scenario: Sum two negative numbers
Given User is being provided two numbers as -9 and 9
When User adds the given numbers
Then I validate the sum of numbers as 0
