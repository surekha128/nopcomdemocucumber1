Feature:Product Added To Shopping Cart
  As a user Product Added To Shopping Cart SuccessFully
@Regression
  Scenario: verify ProductAdded To Shopping Cart SuccessFully
    Given I am on homepage
    And I click on <Computers>
    And I click on <Desktop>
    And I click on <sortby> position select "Name: A to Z"
    When Click Build your own computer "Add To Cart"
    And verify text "Build your own computer"
    And select processor "2.2 GHz Intel Pentium Dual-Core E2200"
    And select ram "8GB [+$60.00]"
    And select HDD radio "400 GB [+$100.00]"
    And Select OS radio "Vista Premium [+$60.00]"
    And check two check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    And verify price
    And click on "ADD TO CARD"
    Then verify message "The product has been added to your shopping cart"
