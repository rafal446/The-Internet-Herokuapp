package pages;

import driver.DriverManager;
import driver.WaitForElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicAuth extends BasePage{
    @FindBy(css = ".example > p")
    WebElement successMessage;

    public String getSuccessMessage() {
        WaitForElement.waitUntilVisibilityOfElement(successMessage);
        logger.info("Getting message from the page. Message : " + successMessage.getText());
        return successMessage.getText();
    }


}
