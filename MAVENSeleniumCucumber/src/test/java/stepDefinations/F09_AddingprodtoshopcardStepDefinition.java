package stepDefinations;

import Pages.Addingproducttoshopcard;
import Pages.Caller;
import Pages.LoginPage;
import Pages.Searchcategory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class F09_AddingprodtoshopcardStepDefinition extends Caller {



    LoginPage addingprodtoshop =new LoginPage();
    Searchcategory addingprodtoshop2 =new Searchcategory();
    Addingproducttoshopcard addingprodtoshop3 = new Addingproducttoshopcard();

    @Given("user can login")
    public void user_login()
    {
        addingprodtoshop.loginEle(driver).click();
        addingprodtoshop.emailEle(driver).sendKeys("minafouad168@gmail.com");
        addingprodtoshop.passwordEle(driver).sendKeys("Mina@123@456");
        addingprodtoshop.loginbuttonEle(driver).click();
    }
    @When("user click on shop card")
    public void user_click() throws InterruptedException {
        addingprodtoshop2.altEle(driver).click();
        Actions action3=  new Actions(driver);
        action3.clickAndHold(addingprodtoshop2.ApparelEle(driver))
                .perform();
        addingprodtoshop2.ShoesEle(driver).click();
        addingprodtoshop3.httpsEle(driver).click();
        addingprodtoshop3.selectdataattrEle(driver).click();
        addingprodtoshop3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        addingprodtoshop3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        addingprodtoshop3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        addingprodtoshop3.selectdataattrEle(driver).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        addingprodtoshop3.spanEle(driver).click();
        addingprodtoshop3.addtocartbutton25Ele(driver).click();
        Thread.sleep(3000);
    }
    @Then("user get his product added")
    public void product_added() throws InterruptedException {
        String actualresult =addingprodtoshop3.contentEle(driver).getText();
        String expectedresult = "The product has been added to your shopping cart";
        Assert.assertTrue(actualresult.contains(expectedresult));
        System.out.println(actualresult);
        Thread.sleep(5000);
        addingprodtoshop.icologoutEle(driver).click();
    }

}
