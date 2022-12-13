package tests;

import org.testng.annotations.Test;
import pages.MainPage;

import static org.testng.Assert.assertEquals;

public class AddAndRemoveElementsTest extends TestBase {

    @Test
    public void shouldAddNewElementToList() {
        int startNumberOfElements = new MainPage()
                .goToAddAndRemoveElement()
                .addTwoElements()
                .numbersOfElements();

        assertEquals(2, startNumberOfElements);
    }

    @Test
    public void shouldRemoveOneElementFromList() {
        int numberOfElements = new MainPage()
                .goToAddAndRemoveElement()
                .addTwoElements()
                .removeElement()
                .numbersOfElements();

        assertEquals(1, numberOfElements);
    }
}
