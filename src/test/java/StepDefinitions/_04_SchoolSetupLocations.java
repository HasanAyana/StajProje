package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _04_SchoolSetupLocations {

    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();



    @And("Naviagate to Locations under School Setup")
    public void naviagateToLocationsUnderSchoolSetup() {
        ln.findAndClick("setupOne");
        ln.findAndClick("schoolSetup");
        ln.findAndClick("locations");
    }

    @When("User create new locaiton")
    public void userCreateNewLocaiton() {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","Amar");
        dc.findAndSend("shortNameInput","boncuk");
        dc.findAndClick("locationsTypes");
        dc.findAndClick("otherTypes");
        dc.findAndSend("capasityInput","1");
        dc.findAndClick("toggleBar");
        dc.findAndClick("saveButton");


    }

    @When("User delete item from Dialog")
    public void userDeleteItemFromDialog() {
        dc.findAndDelete2();
    }
}
