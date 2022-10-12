package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forgotpassword {

    public WebElement contentEle(WebDriver driver)
    {
        By content = By.className("content");
        WebElement contentEle=driver.findElement(content);
        return contentEle;
    }

    public WebElement ahrefpasswordrecoveryEle(WebDriver driver)
    {
        By ahrefpasswordrecovery = By.cssSelector("a[href=\"/passwordrecovery\"]");
        WebElement ahrefpasswordrecoveryEle=driver.findElement(ahrefpasswordrecovery);
        return ahrefpasswordrecoveryEle;
    }

    public WebElement imgEle(WebDriver driver)
    {
        By img = By.cssSelector("img[src=\"https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png\"]");
        WebElement imgEle=driver.findElement(img);
        return imgEle;
    }
}
