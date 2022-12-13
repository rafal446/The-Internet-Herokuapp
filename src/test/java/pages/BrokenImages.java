package pages;

import driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenImages extends BasePage {

    @FindBy(xpath = "//img[@src=\"asdf.jpg\"]")
    WebElement firstImage;
    @FindBy(xpath = "//img[@src=\"hjkl.jpg\"]")
    WebElement secondImages;
    @FindBy(xpath = "//img[@src=\"img/avatar-blank.jpg\"]")
    WebElement thirdElement;

    public boolean isFirstImageDisplayed() {
        Boolean isImageLoaded = (Boolean) ((JavascriptExecutor)DriverManager.getDriver())
                .executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", firstImage);
        logger.info("Checking that first image is displayed");
        return isImageLoaded;
    }
    public boolean isSecondImageDisplayed() {
        Boolean isImageLoaded = (Boolean) ((JavascriptExecutor)DriverManager.getDriver())
                .executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", secondImages);
        logger.info("Checking that second image is displayed");
        return isImageLoaded;
    }
    public boolean isThirdImageDisplayed() {
        Boolean isImageLoaded = (Boolean) ((JavascriptExecutor)DriverManager.getDriver())
                .executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", thirdElement);
        logger.info("Checking that third image is displayed");
        return isImageLoaded;
    }
}
