package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ElectronicsPage;
import pages.SearchPage;
import testbase.WebTestBase;

public class ElectronicsTest extends WebTestBase {
    public ElectronicsPage electronicsPage;

    ElectronicsTest() {
        super();

    }

    @BeforeMethod
    public void beforeMethod() {
        intialization();
        electronicsPage = new ElectronicsPage();
    }

    @Test
    public void clickOnElectronics() {
        electronicsPage.clickOnElectro();
    }
    @AfterMethod()
    public void driverClose() {
        driver.quit();
    }
}
