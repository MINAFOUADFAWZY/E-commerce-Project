package stepDefinations;

import Pages.Caller;
import Pages.Filterwithcolor;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class F07_FilterwithcolorStepDifinition extends Caller {

    Filterwithcolor Filter=new Filterwithcolor();
    LoginPage Filter2 =new LoginPage();
    @Given("user can login with his user valid data")
    public void login()
    {
        Filter2.loginEle(driver).click();
        Filter2.emailEle(driver).sendKeys("minafouad168@gmail.com");
        Filter2.passwordEle(driver).sendKeys("Mina@123@456");
        Filter2.loginbuttonEle(driver).click();

    }


    @When("user open a category")
    public void opencat()
    {
        Filter.ApparelEle(driver);
        Actions action3=  new Actions(driver);
        action3.clickAndHold(Filter.ApparelEle(driver))
                .perform();
        Filter.ShoesEle(driver).click();


    }

    @Then("user can choose different color")
    public void choosecolor() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/shoes");
        Filter.attributeoption14Ele(driver).click();
        Thread.sleep(3000);
        Filter.attributeoption14Ele(driver).click();
        Thread.sleep(3000);
        Filter.attributeoption16Ele(driver).click();
        Filter2.icologoutEle(driver).click();



    }

}
