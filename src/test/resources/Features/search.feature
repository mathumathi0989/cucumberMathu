
@search
Feature: Verify search functionality

  Scenario Outline: Verify search works for different data
    Given Enter <modelNumber> in the search textbox
    When I click on search button
    Then Results should be displayed
    And Extract the search Product or search Message 

    Examples: 
      | modelNumber  |
      | AT082410C 	 |
      | AT082110C 	 |
