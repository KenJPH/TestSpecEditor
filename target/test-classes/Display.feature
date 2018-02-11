Feature: This deals with the display of words

  Scenario: Display words in dictionary
    Given there are words in the dictionary
    And i request to view the words in the dictionary
    Then i should see the words in the dictionary