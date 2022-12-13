package pages;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    Logger logger = LogManager.getRootLogger();
    protected WebDriver driver;

    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }
}
