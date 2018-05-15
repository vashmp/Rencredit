package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Nikita Blokhin.
 */
public class DepositPage extends BasePageObject{

    @FindBy(xpath="//h2[contains(@class, 'calculator')]")
    public WebElement depositHeader;

    @FindBy(xpath="//span[@class='calculator__currency-field-btn']")
    public WebElement currency;

    @FindBy(xpath="//input[@name='amount']")
    public WebElement amount;

    @FindBy(xpath="//select[@class='calculator__slide-input js-slide-value']")
    public WebElement time;

    @FindBy(xpath="//input[@name='replenish']")
    public WebElement replenish;

    @FindBy(xpath="//div[@class='calculator__check-row-field']")
    public WebElement checkbox;

    @FindBy(xpath="//span[@class='js-calc-rate']")
    WebElement rate;

    @FindBy(xpath="//span[@class='js-calc-earned']")
    WebElement earned;

    @FindBy(xpath="//span[@class='js-calc-replenish']")
    WebElement replenishTotal;

    @FindBy(xpath="//span[@class='js-calc-result']")
    WebElement earnedTotal;

    public void fillField(String fieldName, String value){
        switch (fieldName){
            case  "Валюта":
                currency.findElement(By.xpath("//span[text()='" + value + "']")).click();
                break;
            case  "Сумма вклада":
                fillField(amount, value);
                break;
            case  "Срок в месяцах":
                Select timeSelect = new Select(time);
                timeSelect.selectByValue(value);
                break;
            case  "Ежемесячное пополнение":
                fillField(replenish, value);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
        }
    }
    public void clickCheckBox(String condition){
        checkbox.findElement(By.xpath("//span[contains(text(),'" + condition + "')]")).click();
    }

    public String getFillField(String fieldName){
        switch (fieldName){
            case  "Ставка":
                return rate.getText();
            case  "Начислено":
                return earned.getText();
            case  "Пополнения к концу срока":
                return replenishTotal.getText();
            case  "К снятию к концу срока":
                return earnedTotal.getText();
        }
        throw new AssertionError("Поле не объявлено на странице");
    }
}
