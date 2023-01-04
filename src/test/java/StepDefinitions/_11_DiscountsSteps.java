package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _11_DiscountsSteps {
    DialogContent dc=new DialogContent();
    @And("User delete item from DialogContent by place")
    public void userDeleteItemFromDialogContentByPlace(DataTable element) {
        List<List<String>> listElemanlar = element.asLists(String.class);
        for (int i = 0; i < listElemanlar.size(); i++) {
            dc.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1));
            dc.findAndClick("searchButton");
            dc.waitUntilLoading();
            dc.findAndClick("deleteButton");
            dc.findAndClick("deleteDialogButton");
        }
    }
}
