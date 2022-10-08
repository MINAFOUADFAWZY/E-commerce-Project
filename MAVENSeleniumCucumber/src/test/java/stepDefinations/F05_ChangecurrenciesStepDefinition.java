package stepDefinations;

import Pages.Hoocks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class F05_ChangecurrenciesStepDefinition extends Hoocks {



    public WebElement loginEle()
    {
        By login =By.className("ico-login");
        WebElement loginEle= driver.findElement(login);
        return loginEle;
    }
    public WebElement emailEle()
    {
        By email= By.name("Email");
        WebElement emailEle =driver.findElement(email);
        return emailEle;
    }

    @Given("user log in to the home page")
    public void user_login()
    {
        loginEle().click();
        emailEle().sendKeys("minafouad130@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.className("login-button")).click();
    }
    @When("user choose the right currency")
    public void user_choose() throws InterruptedException {
        driver.findElement(By.id("customerCurrency")).click();
        driver.findElement(By.id("customerCurrency")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("customerCurrency")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);


    }

    @Then("user change the currency successfully")
    public void currency_changed()
    {
        driver.findElement(By.className("ico-logout")).click();
    }





}
