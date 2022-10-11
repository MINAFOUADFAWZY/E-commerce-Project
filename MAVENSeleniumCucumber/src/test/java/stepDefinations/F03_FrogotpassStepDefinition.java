package stepDefinations;

import Pages.Forgotpassword;
import Pages.Caller;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class F03_FrogotpassStepDefinition extends Caller {



    LoginPage forgotpass = new LoginPage();
    Forgotpassword forgotpass3=new Forgotpassword();

    @Given("user open login page")
    public void user_open_login()
    {
        forgotpass.loginEle(driver).click();
    }
    @And("user click on frogot password button")
    public void user_click_on_forgot_password()
    {
        forgotpass3.ahrefpasswordrecoveryEle(driver).click();
    }
    @When("user enters valid mail")
    public void user_enter_mail() throws InterruptedException {
        forgotpass.emailEle(driver).sendKeys("minafouad155@gmail.com");
        driver.findElement(By.name("send-email")).click();
        Thread.sleep(3000);
    }
    @Then("user could change his password successfully")
    public void user_changes_password() throws InterruptedException {
        String SuccessMsg =forgotpass3.contentEle(driver).getText();
        System.out.println(SuccessMsg);
        String expectedresult = "Email with instructions has been sent to you.";
        String actualresult = forgotpass3.contentEle(driver).getText();
        Assert.assertTrue(actualresult.contains(expectedresult));
        forgotpass3.imgEle(driver).click();
        Thread.sleep(5000);
    }


}
