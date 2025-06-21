package LetCodePractice.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetCodeFramePage {

    @FindBy(name = "fname")
    public static WebElement firstNameField;

    @FindBy(name = "lname")
    public static WebElement lastNameField;

    @FindBy(name = "email")
    public static WebElement emailField;

    @FindBy(xpath = "//iframe[@src='frameui']")
    public static WebElement firstFrame;

    @FindBy(xpath = "//iframe[@src='innerframe']")
    public static WebElement innerFrame;

    @FindBy(xpath = "(//div[contains(@class,'column is-3-desktop')])[1]")
    public static WebElement getTextinDefaultDOM;

}
