package stepDefinations;

import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class F11_AddtocomparelistStepDefinition extends Caller {



    LoginPage addtocompare =new LoginPage();
    Searchcategory addtocompare2 =new Searchcategory();
    Addingproducttoshopcard addtocompare3 =new Addingproducttoshopcard();
    Addingtocomparelist addtocompare4 = new Addingtocomparelist();
    Searchcategory addtocompare5 =new Searchcategory();

    @Given("user could login with valid data")
    public void user_login()
    {
        addtocompare.loginEle(driver).click();
        addtocompare.emailEle(driver).sendKeys("minafouad168@gmail.com");
        addtocompare.passwordEle(driver).sendKeys("Mina@123@456");
        addtocompare.loginbuttonEle(driver).click();
    }

    @When("user click on add to comparelist")
    public void user_click() throws InterruptedException {
        addtocompare5.altEle(driver).click();
        Actions action4=  new Actions(driver);
        action4.clickAndHold(addtocompare2.ApparelEle(driver))
                .perform();
        addtocompare2.ShoesEle(driver).click();
        addtocompare3.httpsEle(driver).click();
        addtocompare3.selectdataattrEle(driver).click();
        addtocompare3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        addtocompare3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        addtocompare3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        addtocompare3.selectdataattrEle(driver).sendKeys(Keys.ENTER);
        Thread.sleep(6000);
        addtocompare3.spanEle(driver).click();
        addtocompare4.addtocomparelistbuttonEle(driver).click();
        Thread.sleep(3000);
    }

    @Then("product added successfully to comparelist")
    public void product_added() throws InterruptedException {
        String actualresult =addtocompare3.contentEle(driver).getText();
        String expectedresult = "The product has been added to your product comparison";
        Assert.assertTrue(actualresult.contains(expectedresult));
        System.out.println(actualresult);
        Thread.sleep(5000);
        addtocompare.icologoutEle(driver).click();

    }



}
