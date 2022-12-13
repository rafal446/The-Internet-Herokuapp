package pages;

import driver.DriverManager;
import driver.WaitForElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class MainPage extends BasePage{

    @FindBy(xpath = "//a[@href=\"/add_remove_elements/\"]")
    WebElement addElementLink;
    @FindBy(xpath = "//a[@href=\"/broken_images\"]")
    WebElement brokenImagesLink;
    @FindBy(linkText = "Context Menu")
    WebElement contextMenuLink;
    @FindBy(xpath = "//a[@href=\"/drag_and_drop\"]")
    WebElement dragAndDropLink;
    @FindBy(xpath = "//a[@href=\"/upload\"]")
    WebElement uploadFileLink;
    @FindBy(xpath = "//a[@href=\"/infinite_scroll\"]")
    WebElement infiniteScrollLink;
    @FindBy(xpath = "//a[@href=\"/download\"]")
    WebElement downloadFileLink;
    @FindBy(xpath = "//a[@href=\"/frames\"]")
    WebElement framesLink;
    @FindBy(xpath = "//a[@href=\"/iframe\"]")
    WebElement iframeLink;
    @FindBy(xpath = "//a[@href=\"/basic_auth\"]")
    WebElement basicAuthLink;

    public AddAndRemoveElements goToAddAndRemoveElement() {
        addElementLink.click();
        logger.info("Going to add/remove elements page");
        return new AddAndRemoveElements();
    }
    public BrokenImages goToBrokenImages() {
        WaitForElement.waitUntilVisibilityOfElement(brokenImagesLink);
        brokenImagesLink.click();
        logger.info("Going to broken images page");
        return new BrokenImages();
    }
    public ContextMenu goToContextMenu() {
        WaitForElement.waitUntilVisibilityOfElement(contextMenuLink);
        contextMenuLink.click();
        logger.info("Going to context menu page");
        return new ContextMenu();
    }
    public DragAndDrop goToDragAndDrop() {
        WaitForElement.waitUntilVisibilityOfElement(dragAndDropLink);
        dragAndDropLink.click();
        logger.info("Going to drag and drop page");
        return new DragAndDrop();
    }

    public UploadFile goToUploadFile() {
        WaitForElement.waitUntilVisibilityOfElement(uploadFileLink);
        uploadFileLink.click();
        logger.info("Going to upload file page");
        return new UploadFile();
    }
    public InfiniteScroll goToInfiniteScroll() {
        WaitForElement.waitUntilVisibilityOfElement(infiniteScrollLink);
        infiniteScrollLink.click();
        logger.info("Going to infinite scroll page");
        return new InfiniteScroll();
    }

    public FileDownload goToFileDownload() {
        WaitForElement.waitUntilVisibilityOfElement(downloadFileLink);
        downloadFileLink.click();
        logger.info("Going to file download page");
        return new FileDownload();
    }

    public Iframe goToIframe() {
        WaitForElement.waitUntilVisibilityOfElement(framesLink);
        framesLink.click();
        WaitForElement.waitUntilVisibilityOfElement(iframeLink);
        iframeLink.click();
        return new Iframe();
    }
}

