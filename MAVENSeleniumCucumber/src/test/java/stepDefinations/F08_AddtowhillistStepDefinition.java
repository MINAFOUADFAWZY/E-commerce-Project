package stepDefinations;

import Pages.Hoocks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class F08_AddtowhillistStepDefinition extends Hoocks {



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

    @Given("user login with right data")
    public void user_login()
    {
        loginEle().click();
        emailEle().sendKeys("minafouad130@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.className("login-button")).click();
    }
    @When("user click on add to whillist")
    public void user_click() throws InterruptedException {
        driver.findElement(By.cssSelector("img[alt=\"nopCommerce demo store\"]")).click();
        Actions action4=  new Actions(driver);
        action4.clickAndHold(driver.findElement(By.linkText("Apparel")))
                .perform();
        driver.findElement(By.linkText("Shoes")).click();
        driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000053_adidas-consortium-campus-80s-running-shoes_415.jpg\"")).click();
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).click();
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("span[style=\"background-color:#363656\"]")).click();
        driver.findElement(By.id("add-to-wishlist-button-25")).click();
        Thread.sleep(3000);
    }

    @Then("product added successfully to whillist")
    public void product_added() throws InterruptedException {
        String actualresult =driver.findElement(By.className("content")).getText();
        String expectedresult = "The product has been added to your wishlist";
        Assert.assertTrue(actualresult.contains(expectedresult));
        System.out.println(actualresult);
        Thread.sleep(5000);
        driver.findElement(By.className("ico-logout")).click();


    }
}
