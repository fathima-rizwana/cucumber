Feature: Test Login
Scenario: Login with valid
Given open newtours app
When user enters un as "mercury" and pwd as "mercury"
And submit login form
Then verify pass

Scenario: Login with invalid
Given open newtours app
When user enters un as "saranya" and pwd as "saranya"
And submit login form
Then verify failure