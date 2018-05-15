package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Nikita Blokhin.
 */
public class MainPage extends BasePageObject{

    @FindBy(xpath = "//div[@class='service__title-text' and text()='Вклады']/../..//span[text()='Калькулятор']")
    public WebElement calculator;

}
