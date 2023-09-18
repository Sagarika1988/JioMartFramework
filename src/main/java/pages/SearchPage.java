package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class SearchPage extends WebTestBase {
    @FindBy(xpath = "//input[@class='aa-Input search_input']")
    WebElement searchBox;

    @FindBy(xpath = "//span[text()='oil']")
    WebElement oil;





    public void clickOnGroceries(String keyword) throws InterruptedException {
        searchBox.click();
        searchBox.sendKeys(keyword);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }

    public SearchPage(){
        PageFactory.initElements(driver,this);
    }


}


