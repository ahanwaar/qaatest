package test.stepdef;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.BooksPage;

public class CreateBook implements En {

    private WebDriver  driver;
    private BooksPage page;

    public CreateBook(){

        Before(new String[]{"@web", "@chrome"}, 0, 1, (Scenario scenario) -> {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
            page = new BooksPage(driver);
        });

        Given("^The user is on books list page$",() -> page.navigateToBooksPage());

        When("the create book btn Clicked", () -> page.clickCreateBook());

        Then("check if on the create book page", () -> page.checkCreateBookPage());

        When("The book title {string} is entered", (String title) -> page.enterTheTitle(title));

        And("The book year {string} is entered", (String year) -> page.enterYear(year));

        And("the save btn is entered", () -> page.clickSave());

        Then("the browser navigate to the book page", () -> page.checkBookPage());

         Then("the browser navigate to the book page and the book is added", () -> page.checkBookPage());

        After(new String[]{"@web"}, (Scenario scenario) -> driver.quit());
    }
}
