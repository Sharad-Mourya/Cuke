Feature: Validate Search Cars page is working fine

Scenario: Validate search cars page
Given I am on Home Page
When I move to menu
|Menu|
|Buy|
|Sell|
And click on "Search Cars" link
And select car brand as "BMW"
And select car model as "1 SERIES"
And select location as "Australia"
And select price as "$1,000"
And click on Find_My_Next_Car button
Then title should be "Bmw 1 Series Under 1000 for Sale | carsguide"