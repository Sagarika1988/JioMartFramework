package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class HomePage extends WebTestBase {

    @FindBy(xpath="//a[text()='Groceries']")
    WebElement groceriesLink;



    public HomePage(){

        PageFactory.initElements(driver,this);
    }

    public void clickOnGroceries(){
        groceriesLink.click();
    }
}
