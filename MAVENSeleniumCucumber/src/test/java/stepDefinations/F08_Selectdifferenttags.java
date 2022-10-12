package stepDefinations;

import Pages.Caller;
import Pages.LoginPage;
import Pages.Selectdifferenttags;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class F08_Selectdifferenttags extends Caller {

    LoginPage tags =new LoginPage();
    Selectdifferenttags tags2 =new Selectdifferenttags();
    @Given("user can login with his user mail and password")
        public void login()
    {
        tags.loginEle(driver).click();
        tags.emailEle(driver).sendKeys("minafouad168@gmail.com");
        tags.passwordEle(driver).sendKeys("Mina@123@456");
        tags.loginbuttonEle(driver).click();
    }

    @When("user open a category page")
    public void opencat() throws InterruptedException {
        Actions action3=  new Actions(driver);
        action3.clickAndHold(tags2.ApparelEle(driver))
                .perform();
        tags2.ShoesEle(driver).click();
        tags2.ViewallEle(driver).click();

    }
    @Then("user can choose different tags")
    public void choosetags() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/producttag/all");
        tags2.ApparelEle(driver).click();
        Thread.sleep(5000);
        tags.icologoutEle(driver).click();
    }
}
