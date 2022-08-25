
Feature: Validate Twitter Signup

Scenario Outline: Validate Twitter Signup 

Given user visit Twitter signup page
When user click signup with phone number or email
When user type "<Name>"and "<Phone Number>" and "<Email>"
When user select dropdown Month and dropdown Day and dropdown Year
When user click Next
When user click Next 
When user click Signup
Then user able to signup Twitter account

Examples:

|Name|  |Phone Number| |Email| Month| Day| Year|
|Naz|    |3682254001| |naz@gmail.com|7   |7  | 1988|
 