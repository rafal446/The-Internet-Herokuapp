package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAndRemoveElements extends BasePage{

    @FindBy(tagName = "button")
    WebElement addButton;
    @FindBy(id = "elements")
    WebElement elementsField;

    public AddAndRemoveElements addTwoElements() {
        addButton.click();
        addButton.click();
        logger.info("Adding two elements");

        return this;
    }
    public int numbersOfElements() {
        int number = elementsField.findElements(By.className("added-manually")).size();
        return number;
    }

    public AddAndRemoveElements removeElement() {
        elementsField.findElement(By.className("added-manually")).click();
        logger.info("Removing element");
        return new AddAndRemoveElements();
    }



}
