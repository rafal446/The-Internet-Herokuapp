package tests;

import org.testng.annotations.Test;
import pages.Iframe;
import pages.MainPage;

import static org.testng.Assert.assertEquals;

public class IframeTest extends TestBase{
    @Test
    public void shouldAddTextInTextEditor() {
        Iframe iframe = new MainPage()
                .goToIframe();

        driver.switchTo().frame(0);
        iframe.writeTextInTextField("Selenium test");

        String expected = iframe.getTextFromEditableField();
        assertEquals(expected, "Selenium test");
    }
}
