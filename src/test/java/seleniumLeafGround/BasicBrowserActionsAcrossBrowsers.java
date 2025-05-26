package seleniumLeafGround;

import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class LaunchingBrowser {

    @Test
    public void launchingChromeBrowser(){

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://demoqa.com/");
        System.out.println(chromeDriver.getTitle());
        chromeDriver.quit();
    }

    @Test
    public void launchingFireFoxBrowser(){

        WebDriver fireFoxDriver = new FirefoxDriver();
        fireFoxDriver.get("https://demoqa.com/");
        System.out.println(fireFoxDriver.getTitle());
        fireFoxDriver.quit();
    }

    @Test
    public void launchingSafariBrowser(){

        WebDriver safariDriver = new SafariDriver();
        safariDriver.get("https://demoqa.com/");
        System.out.println(safariDriver.getTitle());
        safariDriver.quit();

        }

    @Test
    public void launchingInternetExplorerBrowser(){

        WebDriver internetExplorerDriver = new InternetExplorerDriver();
        internetExplorerDriver.get("https://demoqa.com/");
        System.out.println(internetExplorerDriver.getTitle());
        internetExplorerDriver.quit();
    }
    @Test
    public void launchingEdgeBrowser(){
        WebDriver edgeBrowser = new EdgeDriver();
        edgeBrowser.get("https://demoqa.com/");
        System.out.println(edgeBrowser.getTitle());
        edgeBrowser.quit();

    }
    }
