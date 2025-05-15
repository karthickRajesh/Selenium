package selenium;

import PageFactoryModel.LeafGroundDropDownPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class DropDownHandling {
    WebDriver driver;

    @BeforeTest
    public void startBrowser(){
        driver = new ChromeDriver();
        driver.get("https://leafground.com/select.xhtml");
        PageFactory.initElements(driver, LeafGroundDropDownPage.class);
    }
}
