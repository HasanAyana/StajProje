package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _04_SchoolSetupLocations {

    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();

    Parent parent=new Parent();



    @And("Naviagate to Locations under School Setup")
    public void naviagateToLocationsUnderSchoolSetup() {
        ln.findAndClick("setupOne");
        ln.findAndClick("schoolSetup");
        ln.findAndClick("locations");
    }

    @When("User create new locaiton")
    public void userCreateNewLocaiton() {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","Omer");
        dc.findAndSend("shortNameInput","boncuk");
        dc.findAndClick("locationsTypes");
        dc.findAndClick("otherTypes");
        dc.findAndSend("capasityInput","1");
        dc.findAndClick("toggleBar");
        dc.findAndClick("saveButton");
    }

    @When("User edit in School Setup Locations")
    public void userEditInSchoolSetupLocations() {
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput","Omer2");
        dc.findAndSend("shortNameInput","boncuk2");
        dc.findAndSend("capasityInput","2");
        dc.findAndClick("toggleBar");
        dc.findAndClick("saveButton");
    }

    @When("User delete School Setup Locations")
    public void userDeleteSchoolSetupLocations() {
        dc.findAndClick("deleteButtonOmer"); // silme butonua bas, çöp kutusu
        parent.waitUntilLoading(); // progressbar ın çocukları 0 olana kadar bekle
        dc.findAndClick("deleteDialogButton"); // dilogdaki silme butonuna bas
        dc.findAndClick("deleteButtonOmer2");
        parent.waitUntilLoading();
        dc.findAndClick("deleteDialogButton");
    }
}
