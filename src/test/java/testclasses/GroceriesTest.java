package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.GroceriesPage;
import pages.HomePage;
import testbase.WebTestBase;

public class GroceriesTest extends WebTestBase {

    public HomePage homepage;

    public GroceriesPage groceriesPage;


    GroceriesTest() {
        super();

    }

    @BeforeMethod
    public void beforeMethod() {
        intialization();
        homepage = new HomePage();
        groceriesPage = new GroceriesPage();


    }

    @Test()
    public void clickOnGroceries() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();

        homepage.clickOnGroceries();

        groceriesPage.fruitsVegetables();
        groceriesPage.clickOnFreshlink();
        groceriesPage.clickOnSortBy();
        Thread.sleep(2000);
        groceriesPage.clickOnRadioBtn();
        softAssert.assertTrue(groceriesPage.selectRadioBtn(), "Must be clickable");
    }
    @AfterMethod()
    public void driverClose(){
        driver.quit();
    }
}



