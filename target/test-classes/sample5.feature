Feature: search multiple item

Scenario: search for products
When user searches for the products
|iphone|
|headphone|
|washing machine|
|iron box|
And verify the products
Then close app
