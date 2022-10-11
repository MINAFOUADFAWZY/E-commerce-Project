package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebElement loginEle(WebDriver driver)
    {
        By login =By.className("ico-login");
        WebElement loginEle= driver.findElement(login);
        return loginEle;
    }
    public WebElement emailEle(WebDriver driver)
    {
        By email= By.name("Email");
        WebElement emailEle =driver.findElement(email);
        return emailEle;
    }

    public WebElement passwordEle(WebDriver driver)
    {
        By Password = By.name("Password");
        WebElement passwordEle=driver.findElement(Password);
        return passwordEle;
    }
    public WebElement loginbuttonEle(WebDriver driver)
    {
        By loginbutton = By.className("login-button");
        WebElement loginbuttonEle=driver.findElement(loginbutton);
        return loginbuttonEle;
    }
    public WebElement MyaccountEle(WebDriver driver)
    {
        By Myaccount = By.linkText("My account");
        WebElement MyaccountEle=driver.findElement(Myaccount);
        return MyaccountEle;
    }
    public WebElement icologoutEle(WebDriver driver)
    {
        By icologout = By.className("ico-logout");
        WebElement icologoutEle=driver.findElement(icologout);
        return icologoutEle;
    }


}
