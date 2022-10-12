package stepDefinations;

import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class F10_AddtowhillistStepDefinition extends Caller {



    LoginPage addtowhillist=new LoginPage();
    Searchcategory addtowhillist2 =new Searchcategory();
    Addingproducttoshopcard addtowhillist3 =new Addingproducttoshopcard();
    Addingtowhillist addtowhillist4 =new Addingtowhillist();
    Addingproducttoshopcard addtowhillist5 =new Addingproducttoshopcard();
    Searchcategory addtowhillist6 =new Searchcategory();

    @Given("user login with right data")
    public void user_login()
    {
        addtowhillist.loginEle(driver).click();
        addtowhillist.emailEle(driver).sendKeys("minafouad168@gmail.com");
        addtowhillist.passwordEle(driver).sendKeys("Mina@123@456");
        addtowhillist.loginbuttonEle(driver).click();
    }
    @When("user click on add to whillist")
    public void user_click() throws InterruptedException {
        addtowhillist6.altEle(driver).click();
        Actions action4=  new Actions(driver);
        action4.clickAndHold(addtowhillist2.ApparelEle(driver))
                .perform();
        addtowhillist2.ShoesEle(driver).click();
        addtowhillist5.httpsEle(driver).click();
        addtowhillist3.selectdataattrEle(driver).click();
        addtowhillist3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        addtowhillist3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        addtowhillist3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        addtowhillist3.selectdataattrEle(driver).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        addtowhillist5.spanEle(driver).click();
        addtowhillist4.addtowishlistbutton25Ele(driver).click();
        Thread.sleep(3000);
    }

    @Then("product added successfully to whillist")
    public void product_added() throws InterruptedException {
        String actualresult =addtowhillist3.contentEle(driver).getText();
        String expectedresult = "The product has been added to your wishlist";
        Assert.assertTrue(actualresult.contains(expectedresult));
        System.out.println(actualresult);
        Thread.sleep(5000);
        addtowhillist.icologoutEle(driver).click();

    }
}
