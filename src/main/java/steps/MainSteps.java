package steps;

import io.qameta.allure.Step;
import pages.MainPage;

/**
 * Created by Nikita Blokhin.
 */
public class MainSteps {

    @Step("выбран калькулятор вкладов")
    public void selectDeposit(){ new MainPage().calculator.click();
    }
}
