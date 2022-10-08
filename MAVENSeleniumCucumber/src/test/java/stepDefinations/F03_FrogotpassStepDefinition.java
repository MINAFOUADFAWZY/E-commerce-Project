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

public class F03_FrogotpassStepDefinition extends Hoocks {


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


    @Given("user open login page")
    public void user_open_login()
    {
        loginEle().click();
    }
    @And("user click on frogot password button")
    public void user_click_on_forgot_password()
    {
        driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]")).click();
    }
    @When("user enters valid mail")
    public void user_enter_mail() throws InterruptedException {
        driver.findElement(By.id("Email")).sendKeys("minafouad130@gmail.com");
        driver.findElement(By.name("send-email")).click();
        Thread.sleep(3000);
    }
    @Then("user could change his password successfully")
    public void user_changes_password() throws InterruptedException {
        String SuccessMsg =driver.findElement(By.className("content")).getText();
        System.out.println(SuccessMsg);
        String expectedresult = "Email with instructions has been sent to you.";
        String actualresult = driver.findElement(By.className("content")).getText();
        Assert.assertTrue(actualresult.contains(expectedresult));
        Thread.sleep(5000);
    }


}
