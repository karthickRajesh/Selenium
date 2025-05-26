package seleniumLetCode;

import PageFactoryModel.LetCodeFramePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameHandling {

    WebDriver driver;

    @BeforeTest
    public void startBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://letcode.in/frame");
        PageFactory.initElements(driver , LetCodeFramePage.class);
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void sendFirstNameInFrame(){
        driver.switchTo().frame(0);
        LetCodeFramePage.firstNameField.sendKeys("Karthick Rajesh");
        driver.switchTo().defaultContent();

    }
    @Test(priority = 2)
    public void sendLastNameInFrame(){
        driver.switchTo().frame("firstFr");
        LetCodeFramePage.lastNameField.sendKeys("DN");
        driver.switchTo().parentFrame();
    }

    @Test(priority = 3)
    public void sendEmail(){
        driver.switchTo().frame(LetCodeFramePage.firstFrame);
        driver.switchTo().frame(LetCodeFramePage.innerFrame);
        LetCodeFramePage.emailField.sendKeys("karthickrajesh.dn@gmail.com");
    }

    @Test(priority = 4)
    public void getTextInDefaultDOM(){
        driver.switchTo().defaultContent();
        String text = LetCodeFramePage.getTextinDefaultDOM.getText();
        System.out.println("Text is " + text);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
