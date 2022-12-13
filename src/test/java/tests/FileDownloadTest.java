package tests;

import org.testng.annotations.Test;
import pages.FileDownload;
import pages.MainPage;

import static org.testng.Assert.assertTrue;

public class FileDownloadTest extends TestBase{

    @Test
    public void shouldDownloadRandomFile() throws InterruptedException {
        FileDownload fileDownload = new MainPage()
                .goToFileDownload();

        fileDownload.downloadOneRandomFile();

        assertTrue(fileDownload.doesFileExistsOnDisc());
        fileDownload.deleteFile();
    }
}
