package test.stepdef;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.BooksPage;

import java.util.Objects;

public class CreateBook implements En {


    private WebDriver  driver;
    private BooksPage page;

    public CreateBook(){


        Before(new String[]{"@web", "@chrome"}, 0, 1, (Scenario scenario) -> {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
            page = new BooksPage(driver);
        });

        Given("^The user is on books list page$",() -> {
            page.navigateToBooksPage();
            //throw new PendingException("Web browsed needs to be setup");
        });

        When("the create book btn Clicked", () ->{
            page.clickCreateBook();
           // throw new PendingException("can't click the create book button");
        });

        Then("check if on the create book page", () ->{
            page.checkCreateBookPage();
            //throw new PendingException("Web browser isn't navigating to create book page");
        });

        When("The book title {string} is entered", (String title) ->{
            page.enterTheTitle(title);
            //throw new PendingException("book title isn't implemented");
        });

        And("The book year {string} is entered", (String year) ->{
            page.enterYear(year);
           // throw new PendingException("book year isn't implemented");
        });

        And("the save btn is entered", () ->{
            page.clickSave();
           // throw new PendingException("save btn isn't implemented");
        });

        Then("the browser navigate to the book page", () ->{
            page.checkBookPage();
           // throw new PendingException("the book isn't added");
        });

         Then("the browser navigate to the book page and the book is added", () -> {
            page.checkBookPage();

          // throw new PendingException("the book isn't added");
        });

        After(new String[]{"@web"}, (Scenario scenario) -> {
            driver.quit();
        });

    }
}
