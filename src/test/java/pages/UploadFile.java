package pages;

import driver.WaitForElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class UploadFile extends BasePage{
    @FindBy(id = "file-upload")
    WebElement selectFileButton;

    @FindBy(id = "file-submit")
    WebElement submitFileButton;
    @FindBy(id = "uploaded-files")
    WebElement uploadedFiles;

    public UploadFile uploadFile() {
        WaitForElement.waitUntilVisibilityOfElement(selectFileButton);
        String path = "C:/windows-version.txt";
        selectFileButton.sendKeys(path);
        submitFileButton.click();
        logger.info("Uploading \"windows-version.txt\" file");
        return this;
    }
    public String getNameOfUploadedFiles() {
        WaitForElement.waitUntilVisibilityOfElement(uploadedFiles);
        logger.info("Getting from website name of uploaded file");
        logger.info("File name " + uploadedFiles.getText());
        return uploadedFiles.getText();
    }
}
