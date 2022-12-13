package pages;

import driver.DriverManager;
import driver.WaitForElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenu extends BasePage{

    @FindBy(id = "hot-spot")
    WebElement hotSpotBox;
    String message;

    public ContextMenu getContextMenuMessage() {
        WaitForElement.waitUntilVisibilityOfElement(hotSpotBox);
        Actions action = new Actions(DriverManager.getDriver());
        action.contextClick(hotSpotBox).perform();
        logger.info("Context click on box");
        Alert alert = WaitForElement.waitUntilAlertIsPresent();
        message = alert.getText();
        logger.info("Getting message from alert field. Received message : " + message);
        alert.accept();
        return this;
    }

    public String getMessage() {
        return message;
    }
}
