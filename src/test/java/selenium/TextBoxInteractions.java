package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextBoxInteractions {

    WebDriver driver;

    @BeforeClass
    public void StartBrowser(){
        driver = new ChromeDriver();
        driver.get("https://leafground.com/input.xhtml");
    }

    @Test
    public void TextBoxInteraction(){

        //1.Type your Name
        WebElement nameTextBox = driver.findElement(By.id("j_idt88:name"));
        nameTextBox.sendKeys("Karthick Rajesh");

        //2.Append Country to this City.
        WebElement appendbox = driver.findElement(By.id("j_idt88:j_idt91"));
        appendbox.sendKeys(",India");
        //Note: Selenium will only append to replace u have to clear and sendkeys

        //3.Verify if text box is disabled
        WebElement disabledBox = driver.findElement(By.id("j_idt88:j_idt93"));
        if (!disabledBox.isEnabled()){
            System.out.println("Box is Disabled");
        }

        //4.Clear the typed text.
        WebElement clearBox = driver.findElement(By.id("j_idt88:j_idt95"));
        clearBox.clear();

        //5.Retrieve the typed text.
        WebElement retriveTextBox = driver.findElement(By.id("j_idt88:j_idt97"));
        String textretrivedDomProperty = retriveTextBox.getDomProperty("value");
        System.out.println("textretrivedDomProperty is " + textretrivedDomProperty);

        String textretrivedusingdomattribute = retriveTextBox.getDomAttribute("value");
        System.out.println("textretrivedusingdomattribute is " + textretrivedusingdomattribute);

        //6.Type email and Tab. Confirm control moved to next element.
        WebElement typeandtab = driver.findElement(By.id("j_idt88:j_idt99"));
        typeandtab.sendKeys("karthickrajesh.dn@gmail.com" + Keys.TAB);
        driver.switchTo().activeElement()

        //7.Type about yourself
        WebElement typeAboutYourselfBox = driver.findElement(By.id("j_idt88:j_idt101"));

        //8.Text Editor

        //9.Just Press Enter and confirm error message*

        //10.Click and Confirm Label Position Changes

        //11.Type your name and choose the third option

        //12.Type your DOB (mm/dd/yyyy) and confirm date chosen

        //13.Type number and spin to confirm value changed

        //14.Type random number (1-100) and confirm slider moves correctly

        //15.Click and Confirm Keyboard appears

        //16.Custom Toolbar

    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }

}
