import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverCommandsPractice2 {

    /*

    Launch a new Chrome browser.
    Open ToolsQA Practice Automation Page for Switch Windows: https://demoqa.com/browser-windows/
    Use this statement to click on a New Browser Window button "driver.findElement(By.id("New Browser Window")).click();"
    Close the browser using close() command

     */
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.id("tabButton")).click();

        driver.close();

    }
}
