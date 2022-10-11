package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchcategory {

    public WebElement ComputersEle(WebDriver driver)
    {
        By Computers = By.linkText("Computers");
        WebElement ComputersEle=driver.findElement(Computers);
        return ComputersEle;
    }

    public WebElement DesktopsEle(WebDriver driver)
    {
        By Desktops = By.linkText("Desktops");
        WebElement DesktopsEle=driver.findElement(Desktops);
        return DesktopsEle;
    }

    public WebElement ViewallEle(WebDriver driver)
    {
        By Viewall = By.linkText("View all");
        WebElement ViewallEle=driver.findElement(Viewall);
        return ViewallEle;
    }

    public WebElement ApparelEle(WebDriver driver)
    {
        By Apparel = By.linkText("Apparel");
        WebElement ApparelEle=driver.findElement(Apparel);
        return ApparelEle;
    }

    public WebElement ShoesEle(WebDriver driver)
    {
        By Shoes = By.linkText("Shoes");
        WebElement ShoesEle=driver.findElement(Shoes);
        return ShoesEle;
    }

    public WebElement attributeoption14Ele(WebDriver driver)
    {
        By attributeoption14 = By.id("attribute-option-14");
        WebElement attributeoption14Ele=driver.findElement(attributeoption14);
        return attributeoption14Ele;
    }

    public WebElement attributeoption16Ele(WebDriver driver)
    {
        By attributeoption16 = By.id("attribute-option-16");
        WebElement attributeoption16Ele=driver.findElement(attributeoption16);
        return attributeoption16Ele;
    }

    public WebElement altEle(WebDriver driver)
    {
        By alt = By.cssSelector("img[alt=\"nopCommerce demo store\"]");
        WebElement altEle=driver.findElement(alt);
        return altEle;
    }
}
