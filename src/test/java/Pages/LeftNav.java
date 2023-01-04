package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{


    public LeftNav()
    {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(),'Human Resources')]") // omer
    private WebElement humanRsrButton;

    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c252-18 ng-star-inserted']") // omer
    private WebElement setupButtonUnderHuman;

    @FindBy(xpath = "//span[contains(text(),'Position Categories')]") // omer
    private WebElement positionCategories;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]") // Ali
    private WebElement Attestations;

    @FindBy(xpath="(//span[text()='Fields'])")
    private WebElement fields; //kamala

    @FindBy(xpath="(//span[text()='Setup'])[1]")  //kamala
    private WebElement setupOne;
    @FindBy(xpath="(//span[text()='Grade Levels'])[1]")  // Ali
    private WebElement GradeLevels;

    @FindBy(xpath="(//span[text()='Parameters'])")   //kamala
    private WebElement parameters;

    @FindBy(xpath="(//span[text()='School Setup'])")  // omer
    private WebElement schoolSetup;

    @FindBy(xpath="(//span[text()='Locations'])")  // omer
    private WebElement locations;
    @FindBy(xpath="//*[text()='Departments']")  // Ali
    private WebElement Departments;

    @FindBy(xpath = "//span[contains(text(),'Document Types')]") // hasan
    private WebElement documentTypes;

    @FindBy(xpath="(//span[text()='Bank Accounts'])[1]")
    private WebElement bankAccount; //hasan
    @FindBy(xpath="//span[text()='Dashboard ']")
    private WebElement Dashboard;

    @FindBy(xpath="(//span[text()='Discounts'])[1]")
    private WebElement discounts; // Samet





    WebElement myElement;

    public void findAndClick(String Strlement) {
        switch (Strlement)
        {
            case "humanRsrButton":myElement=humanRsrButton;break;
            case "setupButtonUnderHuman":myElement=setupButtonUnderHuman;break;
            case "positionCategories":myElement=positionCategories;break;
            case "Attestations":myElement=Attestations;break;
            case "fields":myElement=fields;break;
            case "setupOne" : myElement=setupOne;break;
            case "parameters" : myElement=parameters;break;
            case "schoolSetup" : myElement=schoolSetup;break;
            case "locations" : myElement=locations;break;
            case "Departments" : myElement=Departments;break;
            case "GradeLevels" : myElement=GradeLevels;break;
            case "documentTypes" : myElement=documentTypes;break;
            case "bankAccount" : myElement=bankAccount;break;
            case "Dashboard" : myElement=Dashboard;break;
            case "discounts" : myElement=discounts;break;

        }
        clickFunction(myElement);
    }
}
