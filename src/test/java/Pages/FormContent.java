package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {
    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }



    WebElement myElement;

    public void findAndClick(String Strlement) {
        switch (Strlement) {


        }
        clickFunction(myElement);
    }
}
