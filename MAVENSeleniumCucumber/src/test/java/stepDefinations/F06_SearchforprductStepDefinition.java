package stepDefinations;

import Pages.Hoocks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class F06_SearchforprductStepDefinition extends Hoocks {


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

    @Given("user log in")
    public void user_login()
    {
        loginEle().click();
        emailEle().sendKeys("minafouad130@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.className("login-button")).click();
    }
    @When("user write down his search in search bar")
    public void user_write_in_search()
    {
        driver.findElement(By.linkText("Computers"));
        Actions action=  new Actions(driver);
        action.clickAndHold(driver.findElement(By.linkText("Computers")))
                .perform();
        driver.findElement(By.linkText("Desktops")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/desktops");
        driver.findElement(By.cssSelector("img[alt=\"nopCommerce demo store\"]")).click();
        driver.findElement(By.linkText("Apparel"));
        Actions action2=  new Actions(driver);
        action.clickAndHold(driver.findElement(By.linkText("Apparel")))
                .perform();
        driver.findElement(By.linkText("Shoes")).click();
    }
    @Then("user got his search successfully")
    public void user_got_his_search() throws InterruptedException {
        driver.findElement(By.linkText("Shoes")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/shoes");
        driver.findElement(By.id("attribute-option-14")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("attribute-option-14")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("attribute-option-16")).click();
        driver.findElement(By.linkText("View all"));
        driver.findElement(By.linkText("apparel"));
        Thread.sleep(5000);
        driver.findElement(By.className("ico-logout")).click();
    }


}
