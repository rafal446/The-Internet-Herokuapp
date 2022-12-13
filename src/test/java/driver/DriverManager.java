package driver;

import org.openqa.selenium.WebDriver;

import properties.LocalWebDriverProperties;
import properties.TestRunProperties;

import static driver.BrowserType.FIREFOX;
import static properties.TestRunProperties.getBrowser;
import static properties.TestRunProperties.isRemoteRun;

public class DriverManager {
    private static WebDriver driver;

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new BrowserFactory(getBrowser(),  isRemoteRun()).getBrowser();
        }
        return driver;
    }
    public static void dispose() {
        driver.close();
        if (!getBrowser().equals(FIREFOX)) {
            driver.quit();
        }
        driver = null;
        }
}
