package seleniumLeafGround;

import PageFactoryModel.LeafGroundToolBoxPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextBoxHandling {

    WebDriver driver;

    @BeforeClass
    public void StartBrowser(){
        driver = new ChromeDriver();
        driver.get("https://leafground.com/input.xhtml");
        PageFactory.initElements(driver,LeafGroundToolBoxPage.class);
    }

    @Test
    public void inputBox(){

        //1.Type your Name
        LeafGroundToolBoxPage.inputBox.sendKeys("Karthick Rajesh");
    }

    @Test
    public void appendBox(){
        //2.Append Country to this City.
        LeafGroundToolBoxPage.appendBox.sendKeys(",India");
        //Note: Selenium will only append to replace u have to clear and sendkeys
    }

    @Test
    public void isDisabledBox(){
        //3.Verify if text box is disabled
        if (!LeafGroundToolBoxPage.isDisabledBox.isEnabled()){
            System.out.println("Box is Disabled");
        }
    }

    @Test
    public void clearTextBox(){
        //4.Clear the typed text.
        LeafGroundToolBoxPage.clearTextBox.clear();
    }

    @Test
    public void retrieveBox(){
        //5.Retrieve the typed text.
        String textRetrievedUsingDOMProperty = LeafGroundToolBoxPage.retrieveBox.getDomProperty("value");
        System.out.println("textRetrievedUsingDOMProperty is " + textRetrievedUsingDOMProperty);

        String textRetrievedUsingDOMAttribute = LeafGroundToolBoxPage.retrieveBox.getDomAttribute("value");
        System.out.println("textRetrievedUsingDOMAttribute is " + textRetrievedUsingDOMAttribute);
    }

    @Test
    public void typeAndTabBox(){
        //6.Type email and Tab. Confirm control moved to next element.
        LeafGroundToolBoxPage.typeAndTabBox.sendKeys("karthickrajesh.dn@gmail.com" + Keys.TAB);

        if (LeafGroundToolBoxPage.typeAboutUrselfBox.equals(driver.switchTo().activeElement())){
            System.out.println("Switched Sucessfully");
        }else {
            System.out.println("Switch Unsucessfully");
        }
    }

    @Test
    public void typeAboutUrselfBox(){
        //7.Type about yourself
        LeafGroundToolBoxPage.typeAboutUrselfBox.sendKeys("I am here to learn Selenium");
    }

    @Test
    public void textEditorBox(){
        //8.Text Editor
        LeafGroundToolBoxPage.textEditorBox.sendKeys("I am here to Edit Text");
    }

    @Test
    public void EnterAndConfirmErrorMsgBox(){
        //9.Just Press Enter and confirm error message*

        LeafGroundToolBoxPage.EnterAndConfirmErrorMsgBox.sendKeys(Keys.ENTER);
        if (LeafGroundToolBoxPage.errorMessageShown.isDisplayed()){
            System.out.println("Error Message is Displayed");
        } else{
            System.out.println("Error Message is Not Displayed");
        }
    }

    public void clickAndConfirmLabelPosition(){
        //10.Click and Confirm Label Position Changes

        Point positionBeforeClicking = LeafGroundToolBoxPage.clickAndConfirmLablePositionLabel.getLocation();
        LeafGroundToolBoxPage.clickAndConfirmLablePositionLabel.sendKeys(Keys.ENTER);
        Point positionAfterClicking = LeafGroundToolBoxPage.clickAndConfirmLablePositionLabel.getLocation();

        if(!positionBeforeClicking.equals(positionAfterClicking)){
            System.out.println("Label position changed successfully");
        } else {
            System.out.println("Label position not changed");
        }
    }

    public void typeAndChoose(){
        //11.Type your name and choose the third option
        LeafGroundToolBoxPage.typeAndChoose.sendKeys("Karthick");
        LeafGroundToolBoxPage.chooseThirdOption.click();
    }

    @Test
    public void typeDOB(){
        //12.Type your DOB (mm/dd/yyyy) and confirm date chosen
        LeafGroundToolBoxPage.typeDOBBox.sendKeys("22/11/1992");
        LeafGroundToolBoxPage.typeDOBBox.getDomAttribute("value");
    }

    public void typeAndSpin() {
        //13.Type number and spin to confirm value changed
        LeafGroundToolBoxPage.typeNumberAndSpin.sendKeys("10");
        String initialValue = LeafGroundToolBoxPage.typeNumberAndSpin.getDomAttribute("value");

        LeafGroundToolBoxPage.incrementButton.click();
        String finalValue = LeafGroundToolBoxPage.typeNumberAndSpin.getDomAttribute("value");

        if (!finalValue.equals(initialValue)) {
            System.out.println("Spin Confirmed");
        } else {
            System.out.println("Spin Not Confirmed");
        }
    }
        //14.Type random number (1-100) and confirm slider moves correctly

        //15.Click and Confirm Keyboard appears

        //16.Custom Toolbar



    @AfterClass
    public void closeBrowser(){
        driver.close();
    }

}
