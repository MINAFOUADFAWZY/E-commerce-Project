package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchforproduct {

    public WebElement qEle (WebDriver driver)
    {
        By q = By.name("q");
        WebElement qEle=driver.findElement(q);
        return qEle;
    }

    public WebElement buttonEle (WebDriver driver)
    {
        By button = By.cssSelector("button[type=\"submit\"]");
        WebElement buttonEle=driver.findElement(button);
        return buttonEle;
    }
}
