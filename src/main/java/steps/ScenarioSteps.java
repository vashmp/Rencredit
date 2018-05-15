package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by m.baykova on 13.09.2017.
 */
public class ScenarioSteps {

    MainSteps mainPageSteps = new MainSteps();
    DepositSteps depositPageSteps = new DepositSteps();

    @When("^выбран калькулятор вкладов$")
    public void selectDeposit(){
        mainPageSteps.selectDeposit();
    }
    @Then("^заголовок страницы вклада равен \"(.+)\"$")
    public void checkTitleDepositPage(String title){
        depositPageSteps.checkPageTitle(title);
    }

    @When("^заполняются поля:$")
    public void fillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> depositPageSteps.fillField(field, value));

    }
    @When("^Отмечается чекбокс \"(.+)\"$")
    public void clickCheckBox(String condition){
        depositPageSteps.clickCheckBox(condition);
    }

    @Then("^значения полей равны:$")
    public void checkFillForm(DataTable fields){
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> depositPageSteps.checkFillField(field, value));
    }
}
