package stepDefinations;

import Pages.Changecurrency;
import Pages.Hoocks;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class F05_ChangecurrenciesStepDefinition extends Hoocks {



    LoginPage changecurrency =new LoginPage();
    Changecurrency change = new Changecurrency();
    @Given("user log in to the home page")
    public void user_login()
    {
        changecurrency.loginEle(driver).click();
        changecurrency.emailEle(driver).sendKeys("minafouad153@gmail.com");
        changecurrency.passwordEle(driver).sendKeys("Mina@123@456");
        changecurrency.loginbuttonEle(driver).click();
    }
    @When("user choose the right currency")
    public void user_choose() throws InterruptedException {
        change.customerCurrencyEle(driver).click();
        change.customerCurrencyEle(driver).sendKeys(Keys.ARROW_DOWN);
        change.customerCurrencyEle(driver).sendKeys(Keys.ENTER);
        Thread.sleep(5000);


    }

    @Then("user change the currency successfully")
    public void currency_changed()
    {
        changecurrency.icologoutEle(driver).click();
    }





}
