package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GradeLevelSteps {
    LeftNav lv=new LeftNav();
    DialogContent dc=new DialogContent();
    @Then("already exists message should be displayed Grade level")
    public void alreadyExistsMessageShouldBeDisplayedGradeLevel() {
        dc.findAndContainsText("existsMessage","The Grade Level");
    }

    @And("Naviagate to Grade level Categories")
    public void naviagateToGradeLevelCategories() {
        lv.findAndClick("setupOne");
        lv.findAndClick("parameters");
        lv.findAndClick("GradeLevels");
    }

    @When("User add {string},{string},{string} in Grade level  Categories")
    public void userAddInGradeLevelCategories(String name, String shortName, String order) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",name);
        dc.findAndSend("shortNameInput",shortName);
        dc.findAndSend("orderInput",order);
        dc.findAndClick("saveButton");
    }

}
