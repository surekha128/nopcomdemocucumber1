Feature: Computer Test
  As a user sort position by "Name: Z to A"

  @Sanity
  Scenario: verify Product Arrange In Alphabatical Order
    Given I am on homepage
    And I click on <Computers>
    And I click on <Desktop>
    When click on <sortby> position select "Name: Z to A"
    Then The Product will arrange in Descending order verify

