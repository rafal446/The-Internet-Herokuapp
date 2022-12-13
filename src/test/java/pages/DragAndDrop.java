package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDrop extends BasePage{
    @FindBy(id = "column-a")
    WebElement firstSquare;

    @FindBy(id = "column-b")
    WebElement secondSquare;

    public DragAndDrop replaceSquareBtoA(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(firstSquare).moveToElement(secondSquare).release(secondSquare).build();
        actions.perform();
        return this;
    }

    public String getHeaderOfSquareA() {
        return firstSquare.getText();
    }
    public String getHeaderOfSquareB() {
        return secondSquare.getText();
    }
}
