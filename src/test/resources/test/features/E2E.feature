Feature: End to End Tests for ToolsQA's Books Library API
 To Test the books API and make sure that the customer won't face any problems

  @web @chrome
  Scenario Outline: Multiple creat book
    Given The user is on books list page
    When the create book btn Clicked
    Then check if on the create book page
    When The book title "<title>" is entered
    And The book year "<year>" is entered
    And the save btn is entered
    Then the browser navigate to the book page and the book is added


    Examples:
      | title      | year|
      | 1984       | 1949|
      |Animal Farm | 1945|

  @web @chrome
  Scenario : edit book
    Given The user is on books list page
    When the create book btn Clicked
    Then check if on the create book page
    When The book title "test1234" is entered
    And The book year "2021" is entered
    And the save btn is entered
    Then the browser navigate to the book page and the book is added



  @web @chrome
  Scenario : delete book
    Given The user is on books list page
    When the create book btn Clicked
    Then check if on the create book page
    When The book title "test1234" is entered
    And The book year "2021" is entered
    And the save btn is entered
    Then the browser navigate to the book page and the book is added
