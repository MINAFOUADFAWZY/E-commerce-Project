package stepDefinations;

import Pages.Hoocks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class F10_CheckoutStepDefinition extends Hoocks {


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

    @Given("user can login with his user")
    public void user_login()
    {
        loginEle().click();
        emailEle().sendKeys("minafouad130@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.className("login-button")).click();
    }

    @When("user complete checkout steps")
    public void user_complete_steps() throws InterruptedException {
        driver.findElement(By.cssSelector("img[alt=\"nopCommerce demo store\"]")).click();
        Actions action5=  new Actions(driver);
        action5.clickAndHold(driver.findElement(By.linkText("Apparel")))
                .perform();
        driver.findElement(By.linkText("Shoes")).click();
        driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000053_adidas-consortium-campus-80s-running-shoes_415.jpg\"")).click();
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).click();
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("span[style=\"background-color:#363656\"]")).click();
        driver.findElement(By.id("add-to-cart-button-25")).click();
        driver.findElement(By.className("cart-label")).click();
        driver.findElement(By.cssSelector("label[for=\"termsofservice\"]")).click();
        driver.findElement(By.className("checkout-button")).click();
        //      driver.findElement(By.id("billing-address-select")).click();
//        driver.findElement(By.id("billing-address-select")).sendKeys(Keys.ARROW_DOWN);
//        driver.findElement(By.id("billing-address-select")).sendKeys(Keys.ARROW_DOWN);
//        driver.findElement(By.id("billing-address-select")).sendKeys(Keys.ARROW_DOWN);
//        driver.findElement(By.id("billing-address-select")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("BillingNewAddress_FirstName")).clear();
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Mina");
        driver.findElement(By.id("BillingNewAddress_LastName")).clear();
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Fouad");
        driver.findElement(By.id("BillingNewAddress_Email")).clear();
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("minafouad110@gmail.com");
        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys(Keys.ENTER);
        Thread.sleep(6000);
        driver.findElement(By.id("BillingNewAddress_StateProvinceId")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("BillingNewAddress_StateProvinceId")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("jhjj");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("jhhbhbh");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("6516565");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("+201270668447");
        driver.findElement(By.className("new-address-next-step-button")).click();
        Thread.sleep(6000);
        driver.findElement(By.className("shipping-method-next-step-button")).click();
        Thread.sleep(6000);
        driver.findElement(By.cssSelector("label[for=\"paymentmethod_1\"]")).click();
        Thread.sleep(6000);
        driver.findElement(By.className("payment-method-next-step-button")).click();
        Thread.sleep(6000);
        driver.findElement(By.id("CreditCardType")).click();
        driver.findElement(By.id("CreditCardType")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("CardholderName")).sendKeys("Mina Fouad Fawzy");
        driver.findElement(By.id("CardNumber")).sendKeys("5682-8475-2247-9245");
        driver.findElement(By.id("ExpireMonth")).click();
        driver.findElement(By.id("ExpireMonth")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("ExpireMonth")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("ExpireYear")).click();
        driver.findElement(By.id("ExpireYear")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("CardCode")).sendKeys("645");
        Thread.sleep(4000);
        driver.findElement(By.className("payment-info-next-step-button")).click();
    }

    @Then("user do checkout successfully")
    public void user_checked_out()
    {
        driver.findElement(By.className("ico-logout")).click();
    }
}
