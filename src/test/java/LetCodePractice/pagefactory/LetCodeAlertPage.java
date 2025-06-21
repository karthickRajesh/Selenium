package LetCodePractice.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetCodeAlertPage {

    @FindBy(id="accept")
    public static WebElement acceptAlert;

    @FindBy(id="confirm")
    public static WebElement confirmAlert;

    @FindBy(id="prompt")
    public static WebElement promptAlert;

    @FindBy(id="myName")
    public static WebElement nameSent;

    @FindBy(id="modern")
    public static WebElement sweetAlert;

    @FindBy(className = "modal-content")
    public static WebElement sweetAlertMessage;
}
