package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessfulOrder {
    public WebElement cartlabelEle(WebDriver driver)
    {
        By cartlabel = By.className("cart-label");
        WebElement cartlabelEle=driver.findElement(cartlabel);
        return cartlabelEle;
    }

    public WebElement labelfortermsofserviceEle(WebDriver driver)
    {
        By labelfortermsofservice = By.cssSelector("label[for=\"termsofservice\"]");
        WebElement labelfortermsofserviceEle=driver.findElement(labelfortermsofservice);
        return labelfortermsofserviceEle;
    }
    public WebElement checkoutbuttonEle(WebDriver driver)
    {
        By checkoutbutton = By.className("checkout-button");
        WebElement checkoutbuttonEle=driver.findElement(checkoutbutton);
        return checkoutbuttonEle;
    }

    public WebElement BillingNewAddressFirstNameEle(WebDriver driver)
    {
        By BillingNewAddressFirstName = By.id("BillingNewAddress_FirstName");
        WebElement BillingNewAddressFirstNameEle=driver.findElement(BillingNewAddressFirstName);
        return BillingNewAddressFirstNameEle;
    }

    public WebElement BillingNewAddressLastNameEle(WebDriver driver)
    {
        By BillingNewAddressLastName = By.id("BillingNewAddress_LastName");
        WebElement BillingNewAddressLastNameEle=driver.findElement(BillingNewAddressLastName);
        return BillingNewAddressLastNameEle;
    }

    public WebElement BillingNewAddress_EmailEle(WebDriver driver)
    {
        By BillingNewAddress_Email = By.id("BillingNewAddress_Email");
        WebElement BillingNewAddress_EmailEle=driver.findElement(BillingNewAddress_Email);
        return BillingNewAddress_EmailEle;
    }

    public WebElement BillingNewAddress_CountryIdEle(WebDriver driver)
    {
        By BillingNewAddress_CountryId = By.id("BillingNewAddress_CountryId");
        WebElement BillingNewAddress_CountryIdEle=driver.findElement(BillingNewAddress_CountryId);
        return BillingNewAddress_CountryIdEle;
    }

    public WebElement BBillingNewAddress_StateProvinceIdEle(WebDriver driver)
    {
        By BillingNewAddress_StateProvinceId = By.id("BillingNewAddress_StateProvinceId");
        WebElement BillingNewAddress_StateProvinceIdEle=driver.findElement(BillingNewAddress_StateProvinceId);
        return BillingNewAddress_StateProvinceIdEle;
    }

    public WebElement BillingNewAddress_CityEle(WebDriver driver)
    {
        By BillingNewAddress_City = By.id("BillingNewAddress_City");
        WebElement BillingNewAddress_CityEle=driver.findElement(BillingNewAddress_City);
        return BillingNewAddress_CityEle;
    }

    public WebElement BillingNewAddress_Address1Ele(WebDriver driver)
    {
        By BillingNewAddress_Address1 = By.id("BillingNewAddress_Address1");
        WebElement BillingNewAddress_Address1Ele=driver.findElement(BillingNewAddress_Address1);
        return BillingNewAddress_Address1Ele;
    }

    public WebElement BillingNewAddress_ZipPostalCodeEle(WebDriver driver)
    {
        By BillingNewAddress_ZipPostalCode = By.id("BillingNewAddress_ZipPostalCode");
        WebElement BillingNewAddress_ZipPostalCodeEle=driver.findElement(BillingNewAddress_ZipPostalCode);
        return BillingNewAddress_ZipPostalCodeEle;
    }

    public WebElement BillingNewAddress_PhoneNumberEle(WebDriver driver)
    {
        By BillingNewAddress_PhoneNumber = By.id("BillingNewAddress_PhoneNumber");
        WebElement BillingNewAddress_PhoneNumberEle=driver.findElement(BillingNewAddress_PhoneNumber);
        return BillingNewAddress_PhoneNumberEle;
    }

    public WebElement newaddressnextstepbuttonEle(WebDriver driver)
    {
        By newaddressnextstepbutton = By.className("new-address-next-step-button");
        WebElement newaddressnextstepbuttonEle=driver.findElement(newaddressnextstepbutton);
        return newaddressnextstepbuttonEle;
    }

    public WebElement shippingmethodnextstepbuttonEle(WebDriver driver)
    {
        By shippingmethodnextstepbutton = By.className("shipping-method-next-step-button");
        WebElement shippingmethodnextstepbuttonEle=driver.findElement(shippingmethodnextstepbutton);
        return shippingmethodnextstepbuttonEle;
    }

    public WebElement paymentmethodnextstepbuttonEle(WebDriver driver)
    {
        By paymentmethodnextstepbutton = By.className("payment-method-next-step-button");
        WebElement paymentmethodnextstepbuttonEle=driver.findElement(paymentmethodnextstepbutton);
        return paymentmethodnextstepbuttonEle;
    }

    public WebElement CreditCardTypeEle(WebDriver driver)
    {
        By CreditCardType = By.id("CreditCardType");
        WebElement CreditCardTypeEle=driver.findElement(CreditCardType);
        return CreditCardTypeEle;
    }

    public WebElement CardholderNameEle(WebDriver driver)
    {
        By CardholderName = By.id("CardholderName");
        WebElement CardholderNameEle=driver.findElement(CardholderName);
        return CardholderNameEle;
    }

    public WebElement CardNumberEle(WebDriver driver)
    {
        By CardNumber = By.id("CardNumber");
        WebElement CardNumberEle=driver.findElement(CardNumber);
        return CardNumberEle;
    }

    public WebElement ExpireMonthEle(WebDriver driver)
    {
        By ExpireMonth = By.id("ExpireMonth");
        WebElement ExpireMonthEle=driver.findElement(ExpireMonth);
        return ExpireMonthEle;
    }

    public WebElement ExpireYearEle(WebDriver driver)
    {
        By ExpireYear = By.id("ExpireYear");
        WebElement ExpireYearEle=driver.findElement(ExpireYear);
        return ExpireYearEle;
    }

    public WebElement CardCodeEle(WebDriver driver)
    {
        By CardCode = By.id("CardCode");
        WebElement CardCodeEle=driver.findElement(CardCode);
        return CardCodeEle;
    }

    public WebElement paymentinfonextstepbuttonEle(WebDriver driver)
    {
        By paymentinfonextstepbutton = By.className("payment-info-next-step-button");
        WebElement paymentinfonextstepbuttonEle=driver.findElement(paymentinfonextstepbutton);
        return paymentinfonextstepbuttonEle;
    }
    public WebElement messageerrorEle(WebDriver driver)
    {
        By messageerror = By.className("message-error");
        WebElement messageerrorEle=driver.findElement(messageerror);
        return messageerrorEle;
    }

}
