package PageFactoryModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeafGroundToolBoxPage {

    @FindBy(id = "j_idt88:name")
    public static WebElement inputBox;

    @FindBy(id = "j_idt88:j_idt91")
    public static WebElement appendBox;

    @FindBy(id = "j_idt88:j_idt93")
    public static WebElement isDisabledBox;

    @FindBy(id ="j_idt88:j_idt95")
    public static WebElement clearTextBox;

    @FindBy(id = "j_idt88:j_idt97")
    public static WebElement retrieveBox;

    @FindBy(id = "j_idt88:j_idt99")
    public static WebElement typeAndTabBox;

    @FindBy(id = "j_idt88:j_idt101")
    public static WebElement typeAboutUrselfBox;

//Find Text Editor Still Pending
    @FindBy(className = "ql-editor")
    public static WebElement textEditorBox;

    @FindBy(id = "j_idt106:thisform:age")
    public static WebElement EnterAndConfirmErrorMsgBox;

    @FindBy(id="j_idt106:thisform:j_idt110_error-detail")
    public static WebElement errorMessageShown;

    @FindBy(id = "j_idt106:float-input")
    public static WebElement clickAndConfirmLablePositionButton;

    @FindBy(id = "j_idt106:j_idt113")
    public static WebElement clickAndConfirmLablePositionLabel;

//Type your name and choose the third option

    @FindBy(id="j_idt106:auto-complete_input")
    public static WebElement typeAndChoose;

    @FindBy(xpath = "/html/body/span/ul/li[4]/span")
    public static WebElement chooseThirdOption;

//Type your DOB (mm/dd/yyyy) and confirm date chosen

    @FindBy(id="j_idt106:j_idt116_input")
    public static WebElement typeDOBBox;

//Type number and spin to confirm value changed
    @FindBy(id="j_idt106:j_idt118_input")
    public static WebElement typeNumberAndSpin;

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[2]/div/div[2]/div/span[3]/a[1]/span/span")
    public static WebElement incrementButton;

    //Type random number (1-100) and confirm slider moves correctly

    //Click and Confirm Keyboard appears

    //Custom Toolbar
}
