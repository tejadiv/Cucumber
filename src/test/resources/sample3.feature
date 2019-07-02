Feature: sigup

Scenario Outline: test signup function with different set of inputs

Given user open signup page
When user enters fn as "<firstname>"
And user enters ln as "<lastname>"
And user enters dob as "<dob>"
And user enters psd as "<psd>"
And user enters confirmpsd as "<confirmpsd>"
Then click signup button
And verify signup success message

Examples:
|firstname|lastname|dob|psd|confirmpsd|
|saranya|shanmugam|13/2/2009|abc123|abc123|
|divya|devaraj|02/11/1997|ddd456|ddd456|






