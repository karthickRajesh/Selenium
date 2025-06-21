package LetCodePractice.testclasses;

import LetCodePractice.pagefactory.LetCodeButtonPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakingScreenShot {

    ChromeDriver driver;
    @BeforeTest
    public void startBrowser(){
        driver = new ChromeDriver();
        driver.get("https://letcode.in/button");
        PageFactory.initElements(driver, LetCodeButtonPage.class);
    }

    @Test
    public void takeEntirePageScreenshot() throws IOException {
        File srcFile = driver.getScreenshotAs(OutputType.FILE);
        File destFile = new File("src/Screenshots/fullPageSC.png");
        FileHandler.copy(srcFile,destFile);

    }

    @Test
    public void takeElementScreenshot() throws IOException {
        File srcFile = LetCodeButtonPage.goToHomeButton.getScreenshotAs(OutputType.FILE);
        File destFile = new File("src/Screenshots/eleSC.png");
        FileHandler.copy(srcFile,destFile);

    }

    @Test
    public void takeSectionScreenshot() throws IOException {
        File srcFile = LetCodeButtonPage.section.getScreenshotAs(OutputType.FILE);
        File destFile = new File("src/Screenshots/sectionSC.png");
        FileHandler.copy(srcFile,destFile);
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
