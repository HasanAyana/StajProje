package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _09_Departments {
    DialogContent dc=new DialogContent();
    LeftNav lv=new LeftNav();
    @When("User add {string},{string} in Departments Categories")
    public void userAddInDepartmentsCategories(String name, String code) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",name);
        dc.findAndSend("codeInput",code);
        dc.findAndClick("saveButton");
    }

    @And("Naviagate to Departments Categories")
    public void naviagateToDepartmentsCategories() {
        lv.findAndClick("setupOne");
        lv.findAndClick("schoolSetup");
        lv.findAndClick("Departments");
    }

    @Then("already exists message should be displayed departments")
    public void alreadyExistsMessageShouldBeDisplayedDepartments() {
        dc.findAndContainsText("existsMessage","There is already");
    }

    @When("User search {string} edit {string}departments")
    public void userSearchEditDepartments(String name, String editName) {
       /* try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput",editName);
        dc.findAndClick("saveButton");
    }

    @When("User delete the {string}departments")
    public void userDeleteTheDepartments(String name) {
        dc.findAndDeleteGradeLevel(name);
    }
}
