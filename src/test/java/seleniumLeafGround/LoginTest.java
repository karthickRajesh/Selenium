package seleniumLeafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    public void startBrowser(){
        // Initiate Browser
        driver = new ChromeDriver();
    }

    @Test
    public void login() throws InterruptedException {
        //Navigate To URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        //Find and Enter UserName
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        //Find and Enter PassWord
        WebElement password = driver.findElement(By.name("password"));;
        password.sendKeys("admin123");

        //Find and Enter Login
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
    }

    @AfterClass
    public void closeBrowser(){
        // Close Browser
        driver.quit();
    }
}
