package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addingtocomparelist {
    public WebElement addtocomparelistbuttonEle(WebDriver driver)
    {
        By addtocomparelistbutton = By.className("add-to-compare-list-button");
        WebElement addtocomparelistbuttonEle=driver.findElement(addtocomparelistbutton);
        return addtocomparelistbuttonEle;
    }
}
