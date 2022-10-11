package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addingtowhillist {
    public WebElement addtowishlistbutton25Ele(WebDriver driver)
    {
        By addtowishlistbutton25 = By.id("add-to-wishlist-button-25");
        WebElement addtowishlistbutton25Ele=driver.findElement(addtowishlistbutton25);
        return addtowishlistbutton25Ele;
    }

    public WebElement contentEle(WebDriver driver)
    {
        By content = By.className("content");
        WebElement contentEle=driver.findElement(content);
        return contentEle;
    }
}
