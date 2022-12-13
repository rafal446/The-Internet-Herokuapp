package tests;

import org.testng.annotations.Test;
import pages.InfiniteScroll;
import pages.MainPage;

public class InfiniteScrollTest extends TestBase{
    @Test
    public void should() throws InterruptedException {
        InfiniteScroll infiniteScroll = new MainPage()
                .goToInfiniteScroll();

        infiniteScroll.scrollDown();
    }
}
