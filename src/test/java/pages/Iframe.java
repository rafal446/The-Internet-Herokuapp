package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Iframe extends BasePage {
    @FindBy(id = "tinymce")
    WebElement editableField;

    public void writeTextInTextField(String text) {
        editableField.clear();
        editableField.sendKeys(text);
        logger.info("Sending text to text field. Text " + text);
    }

    public String getTextFromEditableField() {
        return editableField.getText();
    }
}
