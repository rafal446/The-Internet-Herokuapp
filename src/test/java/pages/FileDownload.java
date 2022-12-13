package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.util.List;
import java.util.Random;

public class FileDownload extends BasePage{

    @FindBy(className = "example")
    WebElement filesList;

    WebElement randomFile;

    public void downloadOneRandomFile() {
        Random random = new Random();
        List<WebElement> files = filesList.findElements(By.tagName("a"));
        int randomNumber = random.nextInt(files.size() - 1);
        randomFile = files.get(randomNumber);
        randomFile.click();
        logger.info("Downloading random file :" + randomFile.getText());
    }

    public String getNameOfRandomFile() {
        return randomFile.getText();
    }

    public boolean doesFileExistsOnDisc() throws InterruptedException {
        File file = new File("C:\\Users\\rafal\\Downloads\\" + getNameOfRandomFile());
        logger.info("Checking that file " + getNameOfRandomFile() + " exists on disc");
        Thread.sleep(5000);
        if (file.exists()) return true;
        else return false;
    }

    public void deleteFile() {
        File fileToDelete = new File("C:\\Users\\rafal\\Downloads\\" + getNameOfRandomFile());
        fileToDelete.delete();
    }
}
