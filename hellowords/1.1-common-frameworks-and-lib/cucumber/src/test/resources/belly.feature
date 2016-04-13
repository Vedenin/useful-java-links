Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 10 seconds
    Then my belly should growl
    Then I say Hello World!