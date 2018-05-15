package steps;

import io.qameta.allure.Step;
import pages.DepositPage;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nikita Blokhin.
 */
public class DepositSteps {

    @Step("заголовок страницы вклада равен {expectedTitle}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new DepositPage().depositHeader.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("поле {field} заполняется значением {value}")
    public void fillField(String field, String value){
        new DepositPage().fillField(field, value);
    }

    @Step("Отмечается чекбокс {0}")
    public void clickCheckBox(String condition){
        new DepositPage().clickCheckBox(condition);
    }

    @Step("поле {field} заполнено значением {value}")
    public void checkFillField(String field, String value){
        String actual = new DepositPage().getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }
}
