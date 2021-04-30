$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/test/features/E2E.feature");
formatter.feature({
  "name": "End to End Tests for ToolsQA\u0027s Books Library API",
  "description": " To Test the books API and make sure that the customer won\u0027t face any problems",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Multiple creat book",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@web"
    },
    {
      "name": "@chrome"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on books list page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateBook.java:27"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the create book btn Clicked",
  "keyword": "When "
});
formatter.match({
  "location": "CreateBook.java:32"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check if on the create book page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateBook.java:37"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The book title \"test1234\" is entered",
  "keyword": "When "
});
formatter.match({
  "location": "CreateBook.java:42"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The book year \"2021\" is entered",
  "keyword": "And "
});
formatter.match({
  "location": "CreateBook.java:47"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the save btn is entered",
  "keyword": "And "
});
formatter.match({
  "location": "CreateBook.java:52"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the browser navigate to the book page and the book is added",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateBook.java:62"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});