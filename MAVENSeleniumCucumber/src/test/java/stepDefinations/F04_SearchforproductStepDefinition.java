package stepDefinations;

import Pages.Hoocks;
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



    public WebElement loginEle()
    {
        By login =By.className("ico-login");
        WebElement loginEle= driver.findElement(login);
        return loginEle;
    }
    public WebElement emailEle()
    {
        By email= By.name("Email");
        WebElement emailEle =driver.findElement(email);
        return emailEle;
    }


    @Given("user can open login page")
    public void user_open_login()
    {
        loginEle().click();
    }
    @And("user log in successfully")
    public void user_login()
    {
        emailEle().sendKeys("minafouad130@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.className("login-button")).click();
    }
    @When("user enters valid search data")
    public void user_enters_valid_search_data()
    {
        driver.findElement(By.name("q")).sendKeys("Laptop");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    }

    @Then("user redirected to his search successfully")
    public void user_get_the_search() throws InterruptedException {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=Laptop");
        Thread.sleep(5000);
        driver.findElement(By.className("ico-logout")).click();
    }


}
