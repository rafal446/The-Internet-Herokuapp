package tests;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.testng.annotations.Test;
import pages.BasicAuth;
import pages.MainPage;

import static org.testng.Assert.*;

public class BasicAuthTest extends TestBase{

    @Test
    public void shouldNotGoToPageWithoutBasicAuth() {

        driver.get("http://the-internet.herokuapp.com/basic_auth");

        String page = driver.getPageSource();

        assertFalse(page.contains("Basic Auth"));
    }

    @Test
    public void shouldGoToPageWithBasicAuth() {

        ((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));
        driver.get("http://the-internet.herokuapp.com/basic_auth");

        String message = new BasicAuth()
                .getSuccessMessage();

        assertEquals(message, "Congratulations! You must have the proper credentials.");
        assertTrue(driver.getPageSource().contains("Basic Auth"));
    }
}
