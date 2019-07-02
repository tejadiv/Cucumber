Feature: Login Test


Scenario: Login with valid combination 
Given user opens login page in newtours app
When user enters username as "mercury" and password as "mercury"
And Click on submit button
Then verify login  success




Scenario: Login with invalid combination 
Given user opens login page in newtours app
When user enters username as "saranya" and password as "saranya"
And Click on submit button
Then verify login  failure