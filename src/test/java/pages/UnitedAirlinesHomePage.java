package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UnitedAirlinesHomePage {
    public UnitedAirlinesHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class*='app-components-GlobalHeader-globalHeader__globalBottomNav-'] a")
    public List<WebElement> navigationList;

    @FindBy(xpath = "//ul[@class='app-components-BookTravel-bookTravel__travelNav--3RNBj']/li")
    public List<WebElement> travelMenuList;

    @FindBy(xpath = "//label[@for='roundtrip']")
    public WebElement roundTripText;

    @FindBy(id = "roundtrip")
    public WebElement roundTripButton;

    @FindBy(xpath = "//label[@for='oneway']")
    public WebElement oneWayText;

    @FindBy(id = "oneway")
    public WebElement oneWayButton;

    @FindBy(css = "label[for='award']")
    public WebElement bookWithMilesButton;

    @FindBy(css = "label[for='flexibleDates']")
    public WebElement flexibleDatesButton;

    //BEGIN TASK 5
    @FindBy(id = "bookFlightOriginInput")
    public WebElement fromInputBox;

    @FindBy(id = "bookFlightDestinationInput")
    public WebElement toInputBox;

    @FindBy(xpath = "//td[@aria-label='Monday, January 30, 2023, Currently selected as Start Date.']")
    public WebElement jan30DateBox;

    @FindBy(id = "passengerSelector")
    public WebElement passengerBox;

    @FindBy(id = "cabinType")
    public WebElement cabinDropdown;

    @FindBy(xpath = "//button[@aria-label='Find flights']")
    public WebElement findFlightsButton;






}
