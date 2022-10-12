package stepDefinations;

import Pages.Caller;
import Pages.LoginPage;
import Pages.Searchcategory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class F06_SearchforcategoryStepDefinition extends Caller {


    LoginPage searchforcat =new LoginPage();
    Searchcategory searchforcat2 = new Searchcategory();

    @Given("user log in")
    public void user_login()
    {
        searchforcat.loginEle(driver).click();
        searchforcat.emailEle(driver).sendKeys("minafouad168@gmail.com");
        searchforcat.passwordEle(driver).sendKeys("Mina@123@456");
        searchforcat.loginbuttonEle(driver).click();
    }
    @When("user write down his search in search bar")
    public void user_write_in_search()
    {
        searchforcat2.ComputersEle(driver);
        Actions action=  new Actions(driver);
        action.clickAndHold(searchforcat2.ComputersEle(driver))
                .perform();
        searchforcat2.DesktopsEle(driver).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/desktops");
        searchforcat2.altEle(driver).click();
        searchforcat2.ApparelEle(driver);
        Actions action2=  new Actions(driver);
        action.clickAndHold(searchforcat2.ApparelEle(driver))
                .perform();
        searchforcat2.ShoesEle(driver).click();
    }
    @Then("user got his search successfully")
    public void user_got_his_search() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/shoes");
        Thread.sleep(5000);
        searchforcat.icologoutEle(driver).click();
    }


}
