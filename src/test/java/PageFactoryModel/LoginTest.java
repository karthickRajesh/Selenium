package PageFactoryModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    public void startBrowser(){
        driver =  new ChromeDriver();
    }

    @Test
    public void Login() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        PageFactory.initElements(driver,OrangeHRMLoginPage.class);

        OrangeHRMLoginPage.username.sendKeys("Admin");
        OrangeHRMLoginPage.password.sendKeys("admin123");
        OrangeHRMLoginPage.login.click();

    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }

}
