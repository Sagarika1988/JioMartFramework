package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import testbase.WebTestBase;
import utility.Utility;

public class GroceriesPage extends WebTestBase {

    @FindBy(xpath = "//span[contains(text(),'Fruits & Vegetables')]")
    static WebElement fruits;

    @FindBy(xpath = "//a[@title=\"Go to Fresh Vegetables\"]")
    WebElement Fresh;
    @FindBy(xpath = "//span[text()='Sort by:']")
    WebElement sortBy;

    public void clickOnSortBy() {
        sortBy.click();
    }
    @FindBy(xpath = "(//div[@class='label jm-ml-xs jm-body-s'])[2]")
    WebElement radioButton;

    public void clickOnRadioBtn() {
        radioButton.click();
    }

    public boolean selectRadioBtn() {
        return Utility.isDisplayedVerify(radioButton);
    }

    public GroceriesPage() {
        PageFactory.initElements(driver, this);
    }

    public static void fruitsVegetables() {
        fruits.click();
        fruits.getText().equalsIgnoreCase("Fresh Vegetables");
    }

    public void clickOnFreshlink() {
        Fresh.click();
    }

    @FindBy(xpath = "//input[@class='aa-Input search_input']")
    WebElement searchBox;

    public void clickOnGroceries(String keyword) {
        searchBox.click();
        searchBox.sendKeys(keyword);
    }

}











