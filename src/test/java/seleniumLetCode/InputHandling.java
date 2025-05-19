package seleniumLetCode;

import PageFactoryModel.LetCodeInputPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InputHandling {

    WebDriver driver;

    @BeforeTest
    public void startBrowser(){
        driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");
        PageFactory.initElements(driver, LetCodeInputPage.class);
    }

    @Test
    public void enterFullName(){
        LetCodeInputPage.enterTextBox.sendKeys("Karthick Rajesh");

    }
    @Test
    public void appendText(){
        LetCodeInputPage.appendTextBox.sendKeys(" Listerner ");
    }

    @Test
    public void getText(){
        String text = LetCodeInputPage.readTextBox.getText();
        System.out.println("Text is " + text);
    }

    @Test
    public void clearText(){
        LetCodeInputPage.cleartextBox.clear();

    }
    @Test
    public void isDisabled(){
        boolean isEnabled = LetCodeInputPage.isDisabledBox.isEnabled();
        System.out.println("isDisabled is " + !isEnabled);
    }

    @Test
    public void isReadOnly(){
        String isReadOnly = LetCodeInputPage.isReadOnlyBox.getDomAttribute("readonly");
        System.out.println("isReadOnly is " + isReadOnly);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
