Feature: End to End Tests for ToolsQA's Books Library API
 To Test the books API and make sure that the customer won't face any problems

    @web @chrome
    Scenario: Multiple creat book
      Given The user is on books list page
      When the create book btn Clicked
      Then check if on the create book page
      When The book title "test1234" is entered
      And The book year "2021" is entered
      And the save btn is entered
      Then the browser navigate to the book page and the book is added
