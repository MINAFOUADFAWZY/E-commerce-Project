package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addingproducttoshopcard {
    public WebElement selectdataattrEle(WebDriver driver)
    {
        By selectdataattr = By.cssSelector("select[data-attr=\"9\"]");
        WebElement selectdataattrEle=driver.findElement(selectdataattr);
        return selectdataattrEle;
    }
    public WebElement addtocartbutton25Ele(WebDriver driver)
    {
        By addtocartbutton25 = By.id("add-to-cart-button-25");
        WebElement addtocartbutton25Ele=driver.findElement(addtocartbutton25);
        return addtocartbutton25Ele;
    }
    public WebElement contentEle(WebDriver driver)
    {
        By content = By.className("content");
        WebElement contentEle=driver.findElement(content);
        return contentEle;
    }

    public WebElement httpsEle(WebDriver driver)
    {
        By https = By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000053_adidas-consortium-campus-80s-running-shoes_415.jpg\"");
        WebElement httpsEle=driver.findElement(https);
        return httpsEle;
    }

    public WebElement spanEle(WebDriver driver)
    {
        By span = By.cssSelector("span[style=\"background-color:#363656\"]");
        WebElement spanEle=driver.findElement(span);
        return spanEle;
    }
}
