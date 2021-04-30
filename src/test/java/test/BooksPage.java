package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BooksPage {

    private WebDriver driver;

    public BooksPage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    protected WebDriverWait driverWait(long timeoutSeconds) {
        return new WebDriverWait(driver, timeoutSeconds);
    }

    public void navigateToBooksPage(){
        driver.get("http://localhost:8080/books");
    }

    public void clickCreateBook(){
        WebElement createBookBtn = driver.findElement((By.cssSelector(".pull-right")));
        createBookBtn.click();
    }

    public void checkCreateBookPage(){
        WebElement pageHeader = driver.findElement(By.className("page-header"));
        assertEquals("Create Book", pageHeader.getText());
    }

    public void enterTheTitle(String title) throws InterruptedException {
    WebElement input = driver.findElement(By.xpath("//*[@id=\"title\"]"));
        input.sendKeys(title);
        Thread.sleep(1000);
    }

    public void enterYear(String year) throws InterruptedException {
    WebElement input = driver.findElement(By.xpath("//*[@id=\"year\"]"));
        input.sendKeys(year);
        Thread.sleep(1000);
    }

    public void clickSave(){
        WebElement savebtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/button[1]"));
        savebtn.click();
    }

    public void checkBookPage(){
        WebElement pageHeader = driver.findElement(By.cssSelector(".page-header"));
        assertEquals("Books", pageHeader.getText());
    }

    public void checkAddedBook(String bookTitle){
        List<WebElement> titles = driver.findElements(By.xpath("/html/body/div/div/div[2]/table/thead/tr/th"));
        int lastTitleNum = titles.size()-1;
        assertEquals(titles.get(lastTitleNum).getText(),bookTitle);
        System.out.println(titles.get(lastTitleNum).getText());
    }

    public void navigateToEditBookPage(){}

    public void deleteBook(){}
}
