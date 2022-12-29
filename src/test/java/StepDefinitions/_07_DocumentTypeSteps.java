package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class _07_DocumentTypeSteps {
    @And("Escape character")
    public void escapeCharacter() {
        Actions actions=new Actions(GWD.getDriver());
        actions.sendKeys(Keys.ESCAPE).perform();
    }
}
