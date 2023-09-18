package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class ElectronicsPage extends WebTestBase {

    @FindBy(xpath="//a[@id='nav_link_4']")
    WebElement electronics;

    public void clickOnElectro(){
        electronics.click();
    }
    public ElectronicsPage(){

        PageFactory.initElements(driver,this);
    }

}
