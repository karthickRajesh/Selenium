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

    @FindBy(id = "j_idt106:thisform:age")
    public static WebElement EnterAndConfirmErrorMsgBox;

    @FindBy(id = "j_idt106:float-input")
    public static WebElement clickAndConfirmLablePositionBox;

//Type your name and choose the third option

//Type your DOB (mm/dd/yyyy) and confirm date chosen

//Type number and spin to confirm value changed

    //Type random number (1-100) and confirm slider moves correctly

    //Click and Confirm Keyboard appears

    //Custom Toolbar
}
