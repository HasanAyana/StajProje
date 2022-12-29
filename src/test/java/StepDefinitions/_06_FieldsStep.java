package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _06_FieldsStep {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the element in left nav")
    public void clickOnTheElementInLeftNav(DataTable element) {


        List<String> listelements = element.asList(String.class);

        for (String s : listelements) {
            ln.findAndClick(s);

        }


    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable element)
    {
        List<String> listelements = element.asList(String.class);

        for (String s : listelements) {
            dc.findAndClick(s);

        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable element) {


        List<List<String>> listElemanlar = element.asLists(String.class);

        for (int i = 0; i < listElemanlar.size(); i++)
            dc.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1));
    }

    @And("User delete item from DialogContent")
    public void userDeleteItemFromDialogContent(DataTable element) {
        List<String> listelements = element.asList(String.class);

        for (String s : listelements) {
           dc.findAndDelete(s);

        }

    }
}

