package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_PositionCategories {
    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();

    @And("Naviagate to Position Categories")
    public void naviagateToPositionCategories() {
        ln.findAndClick("humanRsrButton");
        ln.findAndClick("setupButtonUnderHuman");
        ln.findAndClick("positionCategories");
    }

    @When("User add name in Position Categories")
    public void userAddNameInPositionCategories(String name) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",name);
        dc.findAndClick("saveButton");
    }

     @Then("Success message should be displayed")
     public void successMessageShouldBeDisplayed() {
         dc.findAndContainsText("successMessage","successfully");
     }

    @When("User add {string} in Position Categories")
    public void userAddInPositionCategories(String name) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",name);
        dc.findAndClick("saveButton");
    }

    @When("User edit {string} in Position Categories")
    public void userEditInPositionCategories(String EditName) {
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput",EditName);
        dc.findAndClick("saveButton");
    }

    @When("User delete the {string} Position Categories")
    public void userDeleteThePositionCategories(String EditName) {
        dc.findAndDelete(EditName);
    }
}
