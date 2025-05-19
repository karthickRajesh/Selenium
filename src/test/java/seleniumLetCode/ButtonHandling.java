package seleniumLetCode;

import PageFactoryModel.LetCodeButtonPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ButtonHandling {
    WebDriver driver;

    @BeforeTest
    public void startBrowser(){
        driver = new ChromeDriver();
        driver.get("https://letcode.in/button");
        PageFactory.initElements(driver, LetCodeButtonPage.class);

    }

    @Test
    public void getCoordiates(){
        Point point = LetCodeButtonPage.findLocationButton.getLocation();
        int xLocation = point.getX();
        int yLocation = point.getY();

        System.out.println("X Location is " + xLocation);
        System.out.println("Y Location is " + yLocation);
    }

    @Test
    public void findColor(){
      String colour = LetCodeButtonPage.findColorButton.getCssValue("background-color");
      System.out.println(colour);

    }

    @Test
    public void findDimensions(){
        Dimension dimension = LetCodeButtonPage.findSizeButton.getSize();
        int height = dimension.getHeight();
        int width = dimension.getWidth();

        System.out.println("Height is " + height);
        System.out.println("Width is " + width);
    }

    @Test
    public void findIsDisabled(){
        boolean isDisabled = LetCodeButtonPage.isDisabledButton.isEnabled();
        System.out.println("Is Button DIsabled " + !isDisabled);
    }

    @Test
    public void clickAndHold(){
        Actions action = new Actions(driver);
        action.clickAndHold(LetCodeButtonPage.holdButton);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
