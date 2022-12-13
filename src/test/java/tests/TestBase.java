package tests;

import driver.BrowserType;
import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import properties.ConfigurationProperties;
import properties.PropertiesLoader;

import java.util.Properties;

public class TestBase {
    protected WebDriver driver;
    @Parameters("browser")
    @BeforeMethod
    public void goToMainPage(@Optional BrowserType browserType) {
        driver = DriverManager.getDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void afterTest() {
        DriverManager.dispose();
    }
    @BeforeClass
    public void beforeClass() {
        PropertiesLoader propertiesLoader = new PropertiesLoader();
        Properties properties = propertiesLoader.getPropertiesFromFile("configuration.properties");
        ConfigurationProperties.setProperties(properties);
    }
}
