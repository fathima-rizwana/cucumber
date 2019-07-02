Feature: search multiple item
Scenario: search for products
When user searches for products
|iphone|
|travelkit|
|headphone|
And verify products displayed
Then close application