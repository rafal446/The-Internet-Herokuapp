package tests;

import org.testng.annotations.Test;
import pages.MainPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class BrokenImagesTests extends TestBase {

    @Test
    public void shouldDisplayFirstImages() {
        boolean isDisplayed = new MainPage()
                .goToBrokenImages()
                .isFirstImageDisplayed();

        assertTrue(isDisplayed);
    }

    @Test
    public void shouldDisplaySecondImages() {
        boolean isDisplayed = new MainPage()
                .goToBrokenImages()
                .isSecondImageDisplayed();

        assertTrue(isDisplayed);
    }

    @Test
    public void shouldDisplayThirdImage() {
        boolean isDisplayed = new MainPage()
                .goToBrokenImages()
                .isThirdImageDisplayed();

        assertTrue(isDisplayed);
    }
}
