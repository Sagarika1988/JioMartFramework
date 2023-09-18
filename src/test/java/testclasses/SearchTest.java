package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchPage;
import testbase.WebTestBase;

public class SearchTest extends WebTestBase {
    public SearchPage searchPage;

    SearchTest() {
        super();

    }

    @BeforeMethod
    public void beforeMethod() {
        intialization();
        searchPage = new SearchPage();
    }

    @Test
    public void verifyAddCart() throws InterruptedException {

        searchPage.clickOnGroceries(prop.getProperty("keyword"));


    }
  @AfterMethod()
    public void driverClose() {
        driver.quit();
    }
}



