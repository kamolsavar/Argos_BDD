Feature: filter
  As an End User
  I want to filter
  so that I can view filtered product

Scenario Outline: Filter by rating
  Given I am on the home page
  When I search a product "nike"
  And I select the filter<value>
  Then I should see the results filtered by <expected value>

  Examples:

|Value|Expected Value|
|5only|5.0           |
|4Only|4.0           |