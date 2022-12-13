package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends TestBase{

    @Test
    public void shouldDisplayContextMenuWhenClickedRightMouseButton() {
        String message = new MainPage()
                .goToContextMenu()
                .getContextMenuMessage()
                        .getMessage();

        assertEquals(message, "You selected a context menu");
    }
}
