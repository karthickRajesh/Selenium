package PageFactoryModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetCodeButtonPage {


    @FindBy(id="home")
    public static WebElement goToHomeButton;

    @FindBy(id="position")
    public static WebElement findLocationButton;

    @FindBy(id="color")
    public static WebElement findColorButton;

    @FindBy(id="property")
    public static WebElement findSizeButton;

    @FindBy(id="isDisabled")
    public static WebElement isDisabledButton;

    @FindBy(className = "is-primary")
    public static WebElement holdButton;

}
