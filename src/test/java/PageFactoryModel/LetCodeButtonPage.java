package PageFactoryModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetCodeButtonPage {


    @FindBy(id="home")
    public static WebElement goToHomeButton;

    @FindBy(id="position")
    public static WebElement findLocation;

    @FindBy(id="color")
    public static WebElement findColor;

    @FindBy(id="property")
    public static WebElement findSize;

    @FindBy(id="isDisabled")
    public static WebElement isDisabled;

    @FindBy(className = "is-primary")
    public static WebElement holdButton;

}
