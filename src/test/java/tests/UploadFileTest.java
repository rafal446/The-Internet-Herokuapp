package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.UploadFile;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UploadFileTest extends TestBase {

    @Test
    public void shouldUploadSelectFile() {
        UploadFile uploadFile = new MainPage()
                .goToUploadFile()
                .uploadFile();

        String name = uploadFile.getNameOfUploadedFiles();

        assertTrue(name.equals("windows-version.txt"));
    }
}
