package seleniumLetCode;

import PageFactoryModel.LetCodeButtonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NavigationHandling {
    WebDriver driver;

    @BeforeTest
    public void startBrowser(){
        driver = new ChromeDriver();
    }

    @Test
    public void navigationHandling(){

        driver.get("https://letcode.in/button");
        PageFactory.initElements(driver, LetCodeButtonPage.class);

        System.out.println("Initial Url is " + driver.getCurrentUrl());
        LetCodeButtonPage.goToHomeButton.click();
        System.out.println("After Clicking Url is " + driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println("After Navigating back Url is " + driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println("After Navigating Forward Url is " + driver.getCurrentUrl());

        driver.navigate().to("https://letcode.in/button");
        System.out.println("After Navigating TO Url is " + driver.getCurrentUrl());

        driver.navigate().refresh();
        System.out.println("After Refreshing Url is " + driver.getCurrentUrl());

    }

    @Test
    public void naviationClassCommands(){

        WebDriver.Navigation navigate = driver.navigate();
        navigate.to("https://letcode.in/");
        System.out.println("After Navigating TO Url is " + driver.getCurrentUrl());

        navigate.back();
        System.out.println("After Navigating back Url is " + driver.getCurrentUrl());

        navigate.forward();
        System.out.println("After Navigating Forward Url is " + driver.getCurrentUrl());

        navigate.refresh();
        System.out.println("After Refreshing Url is " + driver.getCurrentUrl());

    }

    @AfterTest
    public void quitBrowser(){
        driver.quit();
    }

}
