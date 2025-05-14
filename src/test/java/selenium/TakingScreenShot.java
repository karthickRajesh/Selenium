package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakingScreenShot {

    WebDriver driver;

    @BeforeTest
    public void startBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void takeScreenshot() throws IOException, InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        // Take a screenshot
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        // Define the destination file path
        File destFile = new File("screenshot.png");

        // Save the screenshot to the destination
        FileUtils.copyFile(srcFile,destFile);

        System.out.println("Screenshot saved successfully at: " + destFile.getAbsolutePath());

    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
