Feature: Test background
Background: display welcome
Given application displays welcome msg
@smoke @reg
Scenario: signin
Given user enter un and pwd
And click signin
@smoke
Scenario: search for prod
When user searches for phone
@reg
Scenario: add to cart
When user adding the searched prod to cart
@smoke
Scenario: payment process
When user performing payment using netbanking
@reg
Scenario: signout
When user performing logout
