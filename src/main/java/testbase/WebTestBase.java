package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utility.Utility;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {

    public static WebDriver driver;

    public Properties prop;

    public WebTestBase()  {
        prop= new Properties();
        FileInputStream fileInputStream;
        try {
            fileInputStream  =new FileInputStream(System.getProperty("user.dir") +"/src/main/resources/properties/config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            prop.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void intialization(){
        String browserName = prop.getProperty("browser");
        if(browserName.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            chromeOptions.setBinary("C:/Program Files/Google/Chrome/Application/chrome.exe");
            System.setProperty("webdriver.chromedriver",System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver(chromeOptions);


        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");
            System.setProperty("webdriver.gecodriver",System.getProperty("user.dir") + "/src/main/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver(firefoxOptions);


        }
        else if (browserName.equalsIgnoreCase("edge")) {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--remote-allow-origins=*");
            edgeOptions.setBinary("C:/Users/sacharya/Downloads/edgedriver_win64/msedgedriver.exe");
            System.setProperty("webdriver.edge.driver",System.getProperty("user.dir") + "/src/main/resources/drivers/msedgedriver.exe");
            driver = new EdgeDriver(edgeOptions);


        }
        else {
            throw new RuntimeException("Please select correct browser Name");
        }
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.PAGE_LOAD));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.IMPLICIT_WAIT));
        driver.manage().deleteAllCookies();
    }

}
