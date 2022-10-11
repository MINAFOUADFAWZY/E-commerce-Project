package stepDefinations;

import Pages.Hoocks;
import Pages.LoginPage;
import Pages.Searchforproduct;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F04_SearchforproductStepDefinition extends Hoocks {



    Searchforproduct Forgotpass2 =new Searchforproduct();
    LoginPage searchforprod =new LoginPage();


    @Given("user can open login page")
    public void user_open_login()
    {
        searchforprod.loginEle(driver).click();
    }
    @And("user log in successfully")
    public void user_login()
    {
        searchforprod.emailEle(driver).sendKeys("minafouad153@gmail.com");
        searchforprod.passwordEle(driver).sendKeys("Mina@123@456");
        searchforprod.loginbuttonEle(driver).click();
    }
    @When("user enters valid search data")
    public void user_enters_valid_search_data()
    {
        Forgotpass2.qEle(driver).sendKeys("Laptop");
        Forgotpass2.buttonEle(driver).click();
    }

    @Then("user redirected to his search successfully")
    public void user_get_the_search() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=Laptop");
        Thread.sleep(5000);
        searchforprod.icologoutEle(driver).click();
    }


}
