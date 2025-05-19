package PageFactoryModel;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class LeafGroundDropDownPage {

@FindBy(className = "ui-selectonemenu")
    public static WebElement selectTool;

@FindBy(id="j_idt87:country_label")
public static WebElement selectCountrydropdown;

@FindBy(id="j_idt87:country_input")
    public static WebElement selectCountry;

@FindBy(id="j_idt87:city_label")
    public static WebElement citiesShown;
}
