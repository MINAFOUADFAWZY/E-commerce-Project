package stepDefinations;

import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class F12_SuccessfulOrderStepDefinition extends Caller {


    LoginPage checkout =new LoginPage();
    Searchcategory checkout2 = new Searchcategory();
    Addingproducttoshopcard checkout3 =new Addingproducttoshopcard();
    SuccessfulOrder checkout4 =new SuccessfulOrder();

    @Given("user can login with his user")
    public void user_login()
    {
        checkout.loginEle(driver).click();
        checkout.emailEle(driver).sendKeys("minafouad168@gmail.com");
        checkout.passwordEle(driver).sendKeys("Mina@123@456");
        checkout.loginbuttonEle(driver).click();
    }

    @When("user complete checkout steps")
    public void user_complete_steps() throws InterruptedException {
        checkout2.altEle(driver).click();
        Actions action5=  new Actions(driver);
        action5.clickAndHold(checkout2.ApparelEle(driver))
                .perform();
        checkout2.ShoesEle(driver).click();
        checkout3.httpsEle(driver).click();
        checkout3.selectdataattrEle(driver).click();
        checkout3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        checkout3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        checkout3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        checkout3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        checkout3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        checkout3.selectdataattrEle(driver).sendKeys(Keys.ARROW_DOWN);
        checkout3.selectdataattrEle(driver).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        checkout3.spanEle(driver).click();
        checkout3.addtocartbutton25Ele(driver).click();
        checkout4.cartlabelEle(driver).click();
        checkout4.labelfortermsofserviceEle(driver).click();
        checkout4.checkoutbuttonEle(driver).click();
        checkout4.BillingNewAddressFirstNameEle(driver).clear();
        checkout4.BillingNewAddressFirstNameEle(driver).sendKeys("Mina");
        checkout4.BillingNewAddressLastNameEle(driver).clear();
        checkout4.BillingNewAddressLastNameEle(driver).sendKeys("Fouad");
        checkout4.BillingNewAddress_EmailEle(driver).clear();
        checkout4.BillingNewAddress_EmailEle(driver).sendKeys("minafouad110@gmail.com");
        checkout4.BillingNewAddress_CountryIdEle(driver).sendKeys(Keys.ARROW_DOWN);
        checkout4.BillingNewAddress_CountryIdEle(driver).sendKeys(Keys.ENTER);
        Thread.sleep(6000);
        checkout4.BBillingNewAddress_StateProvinceIdEle(driver).sendKeys(Keys.ARROW_DOWN);
        checkout4.BBillingNewAddress_StateProvinceIdEle(driver).sendKeys(Keys.ENTER);
        checkout4.BillingNewAddress_CityEle(driver).sendKeys("jhjj");
        checkout4.BillingNewAddress_Address1Ele(driver).sendKeys("jhhbhbh");
        checkout4.BillingNewAddress_ZipPostalCodeEle(driver).sendKeys("6516565");
        checkout4.BillingNewAddress_PhoneNumberEle(driver).sendKeys("+201270668447");
        checkout4.newaddressnextstepbuttonEle(driver).click();
        Thread.sleep(8000);
        checkout4.shippingmethodnextstepbuttonEle(driver).click();
        Thread.sleep(8000);
        driver.findElement(By.cssSelector("label[for=\"paymentmethod_1\"]")).click();
        Thread.sleep(6000);
        checkout4.paymentmethodnextstepbuttonEle(driver).click();
        Thread.sleep(6000);
        checkout4.CreditCardTypeEle(driver).click();
        checkout4.CreditCardTypeEle(driver).sendKeys(Keys.ENTER);
        checkout4.CardholderNameEle(driver).sendKeys("Mina Fouad Fawzy");
        checkout4.CardNumberEle(driver).sendKeys("5682-8475-2247-9245");
        checkout4.ExpireMonthEle(driver).click();
        checkout4.ExpireMonthEle(driver).sendKeys(Keys.ARROW_DOWN);
        checkout4.ExpireMonthEle(driver).sendKeys(Keys.ENTER);
        checkout4.ExpireYearEle(driver).click();
        checkout4.ExpireYearEle(driver).sendKeys(Keys.ENTER);
        checkout4.CardCodeEle(driver).sendKeys("645");
        Thread.sleep(4000);
        checkout4.paymentinfonextstepbuttonEle(driver).click();
    }

    @Then("user do checkout successfully")
    public void user_checked_out() throws InterruptedException {

        checkout4.paymentinfonextstepbuttonEle(driver).click();
        Thread.sleep(4000);
        String actualresult =checkout4.messageerrorEle(driver).getText();
        String expectedresult = "Wrong card number";
        Assert.assertTrue(actualresult.contains(expectedresult));

    }
}
