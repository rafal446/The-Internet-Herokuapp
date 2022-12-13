package tests;

import org.testng.annotations.Test;
import pages.DragAndDrop;
import pages.MainPage;

import static org.testng.Assert.assertEquals;

public class DragAndDropTest extends TestBase {

    @Test
    public void shouldReplaceSquares() {
        DragAndDrop dragAndDrop = new MainPage()
                .goToDragAndDrop();

        dragAndDrop.replaceSquareBtoA(driver);
        String newTextInFirstSquare = dragAndDrop.getHeaderOfSquareA();
        assertEquals(newTextInFirstSquare, "B");
    }
}
