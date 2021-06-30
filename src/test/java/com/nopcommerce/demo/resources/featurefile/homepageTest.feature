Feature:HomePageMenu Test
  As a user should click on the menu list

  @Smoke
  Scenario Outline: Verify user should navigate to Top Menu Pages Successfully
    Given I am on homepage
    When  I click on "<menu>"
    Then I should navigate Computers successfully "<verify>"
    Examples:
      | menu      |verify|
      | <Computers> |Computers|

  @Smoke
  Scenario Outline: Verify user should navigate to Top Menu Pages Successfully
    Given I am on homepage
    When I click on "<menu>"
    Then I should navigate Electonics  Successfully "<verify>"
    Examples:
      | menu          | verify      |
      | <Electronics> | Electronics |

  @Smoke
  Scenario Outline: Verify user should navigate to Top Menu Pages Successfully
    Given I am on homepage
    When I click on "<menu>"
    Then I should navigate Apparel Successfully "<verify>"
    Examples:
      | menu      | verify  |
      | <Apparel> | Apparel |

  @Smoke
  Scenario Outline: Verify user should navigate to Top Menu Pages Successfully
    Given I am on homepage
    When I click on "<menu>"
    Then I should navigate "<verify>" Successfully
    Examples:
      | menu                | verify            |
      | <Digital downloads> | Digital downloads |

  @Smoke
  Scenario Outline: Verify user should navigate to Top Menu Pages Successfully
    Given I am on homepage
    When I click on "<menu>"
    Then I should navigate "<verify>" Successfully
    Examples:
      | menu    | verify |
      | <Books> | Books  |

  @Smoke
  Scenario Outline: Verify user should navigate to Top Menu Pages Successfully
    Given I am on homepage
    When I click on "<menu>"
    Then I should navigate "<verify>" Successfully
    Examples:
      | menu      | verify  |
      | <Jewelry> | Jewelry |

  @Smoke
  Scenario Outline: Verify user should navigate to Top Menu Pages Successfully
    Given I am on homepage
    When I click on "<menu>"
    Then I should navigate "<verify>" Successfully
    Examples:
      | menu         | verify     |
      | <Gift Cards> | Gift Cards |

