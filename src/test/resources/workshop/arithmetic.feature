@foo
Feature: Basic Arithmetic

  Background: A Calculator
    Given a calculator I just turned on

  Scenario: Addition

    When I add 4 and 5
    Then the result is 9

  Scenario: Another Addition

    When I add 4 and 7
    Then the result is 11





  Scenario Outline:  Differents operations
   Given a calculator I just turned on
   When Operation <operation> is applied on <number1> and <number2>
   Then the result is <answer>

    Examples: operations
    | number1 | number2 | operation | answer |
    | 2       | 3       |     +     |  5     |
    | 6       | 2       |     -     |  4     |
    | 2       | 3       |     *     |  6     |
