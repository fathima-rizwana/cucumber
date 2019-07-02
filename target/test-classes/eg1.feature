Feature: Login test
Description: Registered user can login into application using valid username and password
Scenario: Login with valid combination
Given user opens login page in newtours application
When user enters username as "mercury" and password as "mercury"
And Click submit button
Then verify login success
