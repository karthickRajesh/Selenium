import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);

        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("testuser");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password@123");

        WebElement login = driver.findElement(By.id("login"));
        login.click();

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            WebElement logout = driver.findElement(By.id("submit"));

            if (logout.isDisplayed()){
                logout.click();
                System.out.println("LogOut Successful!");
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
