package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registeration {

    public WebElement icoregisterEle (WebDriver driver)
    {
        By icoregister = By.className("ico-register");
        WebElement icoregisterEle=driver.findElement(icoregister);
        return icoregisterEle;
    }

    public WebElement gendermaleEle ( WebDriver driver)
    {
        By gendermale = By.id("gender-male");
        WebElement gendermaleEle=driver.findElement(gendermale);
        return gendermaleEle;
    }

    public WebElement FirstNameEle ( WebDriver driver)
    {
        By FirstName = By.id("FirstName");
        WebElement FirstNameEle=driver.findElement(FirstName);
        return FirstNameEle;
    }

    public WebElement LastNameEle ( WebDriver driver)
    {
        By LastName = By.id("LastName");
        WebElement LastNameEle=driver.findElement(LastName);
        return LastNameEle;
    }
    public WebElement ConfirmPasswordEle ( WebDriver driver)
    {
        By ConfirmPassword = By.id("ConfirmPassword");
        WebElement ConfirmPasswordEle=driver.findElement(ConfirmPassword);
        return ConfirmPasswordEle;
    }
    public WebElement registerbuttondEle ( WebDriver driver)
    {
        By registerbutton = By.id("register-button");
        WebElement registerbuttonEle=driver.findElement(registerbutton);
        return registerbuttonEle;
    }

    public WebElement resultEle ( WebDriver driver)
    {
        By result = By.className("result");
        WebElement resultEle=driver.findElement(result);
        return resultEle;
    }
}
