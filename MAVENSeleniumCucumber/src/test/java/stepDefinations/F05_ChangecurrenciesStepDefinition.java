package stepDefinations;

import Pages.Changecurrency;
import Pages.Caller;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class F05_ChangecurrenciesStepDefinition extends Caller {



    LoginPage changecurrency =new LoginPage();
    Changecurrency change = new Changecurrency();
    @Given("user log in to the home page")
    public void user_login()
    {
        changecurrency.loginEle(driver).click();
        changecurrency.emailEle(driver).sendKeys("minafouad168@gmail.com");
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
    public void currency_changed() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        Thread.sleep(5000);

        changecurrency.icologoutEle(driver).click();
    }





}
