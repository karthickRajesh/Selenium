package selenium;

import PageFactoryModel.LeafGroundButtonPage;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ButtonHandling {

     WebDriver driver;

    @BeforeTest
    public void startBrowser (){
        driver = new ChromeDriver();
        driver.get("https://leafground.com/button.xhtml");
        PageFactory.initElements(driver,LeafGroundButtonPage.class);
    }

    @Test
    public void clickAndVerifyTitle(){
        LeafGroundButtonPage.clickButton.click();
        String title = driver.getTitle();
        System.out.println("title " + title);

        Boolean titlecheck = driver.getTitle().equals("Dashboard");
        System.out.println("titlecheck " + titlecheck);
        driver.navigate().back();
    }

    @Test
    public void isDisabled(){
        boolean isEnabled = LeafGroundButtonPage.disabledButton.isEnabled();
        System.out.println("isDisabled " + !isEnabled);
    }

    @Test
    public void buttonPosition(){
        Point buttonPosition = LeafGroundButtonPage.positionfindButton.getLocation();
        int positionX = buttonPosition.getX();
        int positionY = buttonPosition.getY();

        System.out.println("X Position is " + positionX);
        System.out.println("Y Position is " + positionY);

    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
