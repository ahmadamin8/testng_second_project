package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitedTest extends Base{

    @Test(priority = 1, description = "Validate Main Menu navigation items")
    public void testMainMenuNavigationItems(){
        driver.get("https://www.united.com/en/us");
        String[] navigationItems = {"BOOK", "MY TRIPS", "TRAVEL INFO", "MILEAGEPLUS® PROGRAM", "DEALS", "HELP"};
        for (int i = 0; i < 6; i++) {
            Assert.assertEquals(unitedAirlinesHomePage.navigationList.get(i).getText(), navigationItems[i]);
        }
    }

    @Test(priority = 2, description = "Validate Book travel menu navigation items")
    public void testBookTravelNavigationItems(){
        driver.get("https://www.united.com/en/us");
        String[] travelMenuOptions = {"Book", "Flight status", "Check-in", "My trips"};
        for (int i = 0; i < 4; i++) {
            Assert.assertEquals(unitedAirlinesHomePage.travelMenuList.get(i).getText(),travelMenuOptions[i]);
        }
    }

    @Test(priority = 3, description = "Validate Round-trip and One-way radio buttons")
    public void testRoundTripAndOneWayRadioButtons(){
        driver.get("https://www.united.com/en/us");
        Assert.assertEquals(unitedAirlinesHomePage.roundTripText.getText(),"Roundtrip");
        Assert.assertTrue(unitedAirlinesHomePage.roundTripButton.isEnabled());
        Assert.assertTrue(unitedAirlinesHomePage.roundTripButton.isSelected());

        Assert.assertEquals(unitedAirlinesHomePage.oneWayText.getText(),"One-way");
        Assert.assertTrue(unitedAirlinesHomePage.oneWayButton.isEnabled());
        Assert.assertFalse(unitedAirlinesHomePage.oneWayButton.isSelected());
    }

    @Test(priority = 4, description = "Validate Book with miles and Flexible dates checkboxes")
    public void testBookAndFlexibleCheckboxes(){
        driver.get("https://www.united.com/en/us");
        Assert.assertTrue(unitedAirlinesHomePage.bookWithMilesButton.isDisplayed());
        Assert.assertTrue(unitedAirlinesHomePage.bookWithMilesButton.isEnabled());
        Assert.assertFalse(unitedAirlinesHomePage.bookWithMilesButton.isSelected());

        Assert.assertTrue(unitedAirlinesHomePage.flexibleDatesButton.isDisplayed());
        Assert.assertTrue(unitedAirlinesHomePage.flexibleDatesButton.isEnabled());
        Assert.assertFalse(unitedAirlinesHomePage.flexibleDatesButton.isSelected());

        unitedAirlinesHomePage.bookWithMilesButton.click();
        unitedAirlinesHomePage.flexibleDatesButton.click();
        unitedAirlinesHomePage.bookWithMilesButton.click();
        unitedAirlinesHomePage.flexibleDatesButton.click();

        Assert.assertFalse(unitedAirlinesHomePage.bookWithMilesButton.isSelected());
        Assert.assertFalse(unitedAirlinesHomePage.flexibleDatesButton.isSelected());
    }

    @Test(priority = 5, description = "Validate One-way ticket search results from Chicago IL, US to Miami FL")
    public void testSearchResults(){
        driver.get("https://www.united.com/en/us");
        unitedAirlinesHomePage.oneWayButton.click();
        unitedAirlinesHomePage.fromInputBox.sendKeys("Chicago, IL, US (ORD)");
        unitedAirlinesHomePage.toInputBox.sendKeys("Miami, FL, US (MIA)");
        unitedAirlinesHomePage.jan30DateBox.click();
        unitedAirlinesHomePage.passengerBox.click();
        unitedAirlinesHomePage.cabinDropdown.click();
        unitedAirlinesHomePage.findFlightsButton.click();
        Assert.assertEquals(departPage.departText.getText(),"Depart: Chicago, IL, US to Miami, FL, US");

    }
}
