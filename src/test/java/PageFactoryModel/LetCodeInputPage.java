package PageFactoryModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetCodeInputPage {

    @FindBy(id="fullName")
    public static WebElement enterTextBox;

    @FindBy(id="join")
    public static WebElement appendTextBox;

    @FindBy(id="getMe")
    public static WebElement readTextBox;

    @FindBy(id="clearMe")
    public static WebElement cleartextBox;

    @FindBy(id="noEdit")
    public static WebElement isDisabledBox;

    @FindBy(id="dontwrite")
    public static WebElement isReadOnlyBox;

}
