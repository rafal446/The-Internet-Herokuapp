package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import properties.LocalWebDriverProperties;
import properties.TestRunProperties;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserFactory {

    private static final String MESSAGE_UNKNOWN_BROWSER = "Unknown browser, please check your configuration";

    private BrowserType browserType;

    private boolean isRemote;

    public BrowserFactory(BrowserType browserType, boolean isRemote) {
        this.browserType = browserType;
        this.isRemote = isRemote;
    }

    public WebDriver getBrowser() {

        if (isRemote) {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

            switch (browserType) {
                case CHROME:
                    ChromeOptions chromeOptions = new ChromeOptions();
                    desiredCapabilities.merge(chromeOptions);
                    return getRemoteWebDriver(desiredCapabilities);
                case FIREFOX:
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    desiredCapabilities.merge(firefoxOptions);
                    return getRemoteWebDriver(desiredCapabilities);
                case EDGE:
                    EdgeOptions edgeOptions = new EdgeOptions();
                    desiredCapabilities.merge(edgeOptions);
                    return getRemoteWebDriver(desiredCapabilities);
                default:
                    throw new IllegalStateException(MESSAGE_UNKNOWN_BROWSER);
            }
        } else {

            switch (browserType) {
                case EDGE:
                    System.setProperty("webdriver.msedgedriver.driver", LocalWebDriverProperties.getEdgeWebDriverLocation());
                    return new EdgeDriver();
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", LocalWebDriverProperties.getChromeWebDriverLocation());
                    return new ChromeDriver();
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", LocalWebDriverProperties.getFirefoxWebDriverLocation());
                    FirefoxOptions optionsf = new FirefoxOptions();
                    optionsf.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");
                    FirefoxDriver firefoxDriver = new FirefoxDriver(optionsf);
                    return firefoxDriver;
                default:
                    throw new IllegalStateException("Unknow browser type, please check your configuration");
            }
        }
    }
        private WebDriver getRemoteWebDriver (DesiredCapabilities desiredCapabilities){
            RemoteWebDriver remoteWebDriver = null;

            try {
                remoteWebDriver = new RemoteWebDriver(new URL(TestRunProperties.getGridURL()), desiredCapabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to create RemoteWebDriver due to: " + e.getMessage());
            }
            return remoteWebDriver;
        }
    }

