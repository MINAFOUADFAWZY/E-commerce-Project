package stepDefinations;

import Pages.Caller;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class F02_LoginStepDefinition extends Caller {


    LoginPage login = new LoginPage();
    @Given("user navigates to login page")
    public void user_navigate()  {
        login.loginEle(driver).click();

    }

    @When("user enter valid username and password")
    public void valid_data() throws InterruptedException {

        login.emailEle(driver).sendKeys("minafouad155@gmail.com");
        login.passwordEle(driver).sendKeys("Mina@123@456");
        login.loginbuttonEle(driver).click();

    }
    @Then("user could login successfully")
    public void user_login_successfully() throws InterruptedException {
        String expectedresult = "My account";
        String actualresult = login.MyaccountEle(driver).getText();
        Assert.assertTrue(actualresult.contains(expectedresult));
        Thread.sleep(5000);
        login.icologoutEle(driver).click();
    }







    }

