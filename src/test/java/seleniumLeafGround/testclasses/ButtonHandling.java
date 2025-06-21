package seleniumLeafGround.testclasses;

import seleniumLeafGround.pagefactory.LeafGroundButtonPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
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

    @Test
    public void findColour(){
        String colour = LeafGroundButtonPage.findColour.getCssValue("background");
        System.out.println("Colour is " + colour );
    }

    @Test
    public void findSize(){
        Dimension buttonSize = LeafGroundButtonPage.findSize.getSize();
        int buttonHeight = buttonSize.getHeight();
        int buttonWidth = buttonSize.getWidth();

        System.out.println("Button Height is " + buttonHeight);
        System.out.println("Button Width is " + buttonWidth);
    }

    @Test
    public void moverOverAndConfirmColourChange(){
        String beforeColour = LeafGroundButtonPage.colourchange.getCssValue("background-color");
        System.out.println("beforeColour is " + beforeColour );

        Actions actions = new Actions(driver);
        actions.moveToElement(LeafGroundButtonPage.colourchange).perform();

        String afterColour = LeafGroundButtonPage.colourchange.getCssValue("background-color");
        System.out.println("afterColour is " + afterColour );

        boolean colourMatching = beforeColour.equals(afterColour);
        System.out.println("Is Colour Matching " + colourMatching);

    }

    @Test
    public void clickOnImageButtonAndClickOnHiddenButton(){

        LeafGroundButtonPage.imageButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", LeafGroundButtonPage.primaryButton);

    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
