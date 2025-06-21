package LetCodePractice.testclasses;

import LetCodePractice.pagefactory.LetCodeAlertPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertHandling {
    WebDriver driver;

    @BeforeTest
    public void startBrowser(){
        driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");
        PageFactory.initElements(driver, LetCodeAlertPage.class);
    }

    @Test
    public void acceptAlert(){
        LetCodeAlertPage.acceptAlert.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        driver.switchTo().alert().accept();
    }

    @Test
    public void dismissAlert(){
        LetCodeAlertPage.confirmAlert.click();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println("alertMessage is " + alertMessage);
        driver.switchTo().alert().dismiss();
    }

    @Test
    public void sendTextAndAccept(){
        LetCodeAlertPage.promptAlert.click();
        driver.switchTo().alert().sendKeys("Karthick Rajesh");
        String alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        System.out.println("Name Sent is " + LetCodeAlertPage.nameSent.getText());
    }

    @Test
    public void sweetAlert(){
        LetCodeAlertPage.sweetAlert.click();
        String sweetAlertMessage = LetCodeAlertPage.sweetAlertMessage.getText();
        System.out.println("sweetAlertMessage is " + sweetAlertMessage);

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
