package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Changecurrency {
    public WebElement customerCurrencyEle(WebDriver driver)
    {
        By customerCurrency = By.id("customerCurrency");
        WebElement customerCurrencyEle=driver.findElement(customerCurrency);
        return customerCurrencyEle;
    }
}
