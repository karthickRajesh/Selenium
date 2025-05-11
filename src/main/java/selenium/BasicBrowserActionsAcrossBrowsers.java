package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class BasicBrowserActionsAcrossBrowsers {

    @Test
    public void browserActionOnChrome(){

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://demoqa.com/");
        System.out.println(chromeDriver.getTitle());
        chromeDriver.quit();
    }

    @Test
    public void browserActionOnFirefox(){

        WebDriver fireFoxDriver = new FirefoxDriver();
        fireFoxDriver.get("https://demoqa.com/");
        System.out.println(fireFoxDriver.getTitle());
        fireFoxDriver.quit();
    }

    @Test
    public void browserActionOnSafari(){

        WebDriver safariDriver = new SafariDriver();
        safariDriver.get("https://demoqa.com/");
        System.out.println(safariDriver.getTitle());
        safariDriver.quit();

        }
    }
