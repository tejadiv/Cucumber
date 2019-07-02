Feature: Test background keyword
Background: display welcome
Given app displays welcome message
@smoke @regression
Scenario:signin
Given user un and psd 
And click sigin
@smoke
Scenario: search for the product
When user searches for iphone
@regression
Scenario:add to cart
When user adding the searched product to cart
@smoke @regression
Scenario:payment process
When user performing payment process using netbanking
@smoke @regression
Scenario:signout
When user performing logout from online shopping cart
