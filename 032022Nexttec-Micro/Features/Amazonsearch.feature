Feature: Validate Amazon search

Scenario Outline: Validate Amazon search

Given users visit amazon homepage
When users type "<productname>" and click search icon
Then users should able to see the expected product

Examples:
|productname| 
| iphone 12 promax |
 

