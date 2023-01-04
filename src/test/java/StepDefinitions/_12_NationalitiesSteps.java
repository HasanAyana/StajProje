package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;

public class _12_NationalitiesSteps {
    DialogContent dc=new DialogContent();
    @Then("Wait untill finding the item")
    public void waitUntillFindingTheItem() {
        dc.waitUntilLoading();
    }
}
