package seleniumLeafGround;

import PageFactoryModel.LeafGroundDropDownPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownHandling {
    WebDriver driver;

    @BeforeTest
    public void startBrowser(){
        driver = new ChromeDriver();
        driver.get("https://leafground.com/select.xhtml");
        PageFactory.initElements(driver, LeafGroundDropDownPage.class);
    }

    @Test
    public void selectToolUsingIndex(){
        Select select = new Select(LeafGroundDropDownPage.selectTool);
        select.selectByIndex(1);

        String selectedOption = select.getFirstSelectedOption().getText();
        System.out.println("selectedOption is " + selectedOption);
    }

    @Test
    public void selctCountryAndVerifyOutputCities() throws InterruptedException {

        Select select = new Select(LeafGroundDropDownPage.selectTool);
        LeafGroundDropDownPage.selectTool.click();
        select.selectByVisibleText("Selenium");

        String selectedOption = select.getFirstSelectedOption().getText();
        System.out.println("selectedOption is " + selectedOption);
    }

    @Test
    public static void selectByVisibleTexy(){
        Select select = new Select(LeafGroundDropDownPage.selectCountry);
        select.selectByVisibleText("India");
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
