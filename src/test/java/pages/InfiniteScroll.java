package pages;

import driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.swing.plaf.basic.BasicSliderUI;

public class InfiniteScroll extends BasePage{

    String text = "Ratione ipsum qui hic similique assumenda molestiae pariatur velit rem";

    public void scrollDown() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("return document.body.scrollHeight");

    }
}
