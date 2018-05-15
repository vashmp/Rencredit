package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

/**
 * Created by Nikita Blokhin.
 */
public class BasePageObject  {

    public BasePageObject() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


    public void fillField(WebElement field, String value){
        field.clear();
        field.sendKeys(value);
    }

}
