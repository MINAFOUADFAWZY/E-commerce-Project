import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Udacity {

  /*
  public static void main(String[] args) throws InterruptedException {

        String chrompath =System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chrompath);
        WebDriver driver = new ChromeDriver();


       // driver.navigate().to("https://the-internet.herokuapp.com/login");
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

       // driver.findElement(By.name("q")).click();
       // driver.findElement(By.name("q")).sendKeys("selenium");
       // driver.findElement(By.id("username")).sendKeys("tomsmith");
      //  driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
      //  driver.findElement(By.className("fa")).click();
      //  Thread.sleep(3000);
     //   String SuccessMsg =driver.findElement(By.id("flash")).getText();
      //  System.out.println(SuccessMsg);
        //driver.findElement(By.linkText("Elemental Selenium")).click();
       // driver.findElement(By.className("fa")).click();
       // driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
      //   driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
       // driver.findElement(By.cssSelector("form > button[type=\"submit\"]")).click();
      //  driver.findElement(By.xpath("//form//button[@type=\"submit\"]")).click();
        //string successclass=driver.findElement(By.id("flash")).getAttribute("class")
        //string BackgroundColor=driver.findElement(By.id("flash")).getCssValue(

      // My project:
             //new account
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male"));
        driver.findElement(By.id("FirstName")).sendKeys("Mina");
        driver.findElement(By.id("LastName")).sendKeys("Fouad");
        driver.findElement(By.id("Email")).sendKeys("minafouad100@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Mina@123@456");
        driver.findElement(By.id("register-button")).click();
        driver.findElement(By.cssSelector("a[href=\"/\"]")).click();
        driver.findElement(By.className("ico-logout")).click();

           //sign in
          driver.findElement(By.className("ico-login")).click();
          driver.findElement(By.name("Email")).sendKeys("minafouad789@gmail.com");
          driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
          driver.findElement(By.className("login-button")).click();


        // frorgot password
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]")).click();
        driver.findElement(By.id("Email")).sendKeys("minafouad100@gmail.com");
        driver.findElement(By.name("send-email")).click();
        Thread.sleep(3000);
        String SuccessMsg =driver.findElement(By.className("content")).getText();
        System.out.println(SuccessMsg);


          // search for product
        driver.findElement(By.name("q")).sendKeys("Laptop");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
//

        // change currencies
        driver.findElement(By.id("customerCurrency")).click();
        driver.findElement(By.id("customerCurrency")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("customerCurrency")).sendKeys(Keys.ENTER);






        // search category

        driver.findElement(By.linkText("Computers"));
        Actions action=  new Actions(driver);
        action.clickAndHold(driver.findElement(By.linkText("Computers")))
                   .perform();
        driver.findElement(By.linkText("Desktops")).click();
        driver.findElement(By.cssSelector("img[alt=\"nopCommerce demo store\"]")).click();
        driver.findElement(By.linkText("Apparel"));
        Actions action2=  new Actions(driver);
        action.clickAndHold(driver.findElement(By.linkText("Apparel")))
                .perform();
        driver.findElement(By.linkText("Shoes")).click();
        driver.findElement(By.id("attribute-option-14")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("attribute-option-14")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("attribute-option-16")).click();
        driver.findElement(By.linkText("View all"));
        driver.findElement(By.linkText("apparel"));

        // adding product to shopcart
        driver.findElement(By.cssSelector("img[alt=\"nopCommerce demo store\"]")).click();
        Actions action3=  new Actions(driver);
        action3.clickAndHold(driver.findElement(By.linkText("Apparel")))
                .perform();
        driver.findElement(By.linkText("Shoes")).click();
        driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000053_adidas-consortium-campus-80s-running-shoes_415.jpg\"")).click();
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).click();
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("select[data-attr=\"9\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("span[style=\"background-color:#363656\"]")).click();
        driver.findElement(By.id("add-to-cart-button-25")).click();
        Thread.sleep(3000);
        String SuccessMsg2 =driver.findElement(By.className("content")).getText();
        System.out.println(SuccessMsg2);


        //add to wishlist
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
        driver.findElement(By.cssSelector("span[style=\"background-color:#363656\"]")).click();
        driver.findElement(By.id("add-to-wishlist-button-25")).click();
        Thread.sleep(3000);
        String SuccessMsg3 =driver.findElement(By.className("content")).getText();
        System.out.println(SuccessMsg3);

        //add to compare list
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
        driver.findElement(By.cssSelector("span[style=\"background-color:#363656\"]")).click();
        driver.findElement(By.className("add-to-compare-list-button")).click();
        Thread.sleep(3000);
        String SuccessMsg4 =driver.findElement(By.className("content")).getText();
        System.out.println(SuccessMsg4);


        // checkout
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
        driver.findElement(By.cssSelector("span[style=\"background-color:#363656\"]")).click();
        driver.findElement(By.id("add-to-cart-button-25")).click();
        driver.findElement(By.className("cart-label")).click();
        driver.findElement(By.cssSelector("label[for=\"termsofservice\"]")).click();
        driver.findElement(By.className("checkout-button")).click();
        driver.findElement(By.id("billing-address-select")).click();
        driver.findElement(By.id("billing-address-select")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("billing-address-select")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("billing-address-select")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("billing-address-select")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Mina");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Fouad");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("minafouad789@gmail.com");
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
        Thread.sleep(4000);
        driver.findElement(By.className("shipping-method-next-step-button")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("label[for=\"paymentmethod_1\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.className("payment-method-next-step-button")).click();
        Thread.sleep(4000);
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



















           //Actions action2=  new Actions(driver);
           //action2.moveToElement(driver.findElement(By.linkText("Computers")), 0, -1) .click();


      //  driver.findElement(By.className("sc-bc85dbbd-5")).click();
      //  driver.findElement(By.className("sc-bc85dbbd-5")).sendKeys(Keys.ARROW_LEFT);
     //   driver.findElement(By.className("sc-1c14c10f-1"));




        Thread.sleep(10000);

        driver.close();



    }
    */
      WebDriver driver = null;

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


    @BeforeTest
    public void openBrowser() throws InterruptedException {

        String chrompath =System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chrompath);
         driver = new ChromeDriver();

        // driver.navigate().to("https://the-internet.herokuapp.com/login");
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }


    @Test
    public void F01newaccount() throws InterruptedException {
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male"));
        driver.findElement(By.id("FirstName")).sendKeys("Mina");
        driver.findElement(By.id("LastName")).sendKeys("Fouad");
        driver.findElement(By.id("Email")).sendKeys("minafouad129@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Mina@123@456");
        driver.findElement(By.id("register-button")).click();
        String expectedresult = "Your registration completed";
        String actualresult = driver.findElement(By.className("result")).getText();
        Assert.assertTrue(actualresult.contains(expectedresult));
        Thread.sleep(5000);
        driver.findElement(By.className("ico-logout")).click();
       // Thread.sleep(3000);
     //   driver.findElement(By.cssSelector("a[href=\"/\"]")).click();
      //  driver.findElement(By.className("ico-logout")).click();


    }


    @Test
    public void F02signin() throws InterruptedException {




        loginEle().click();
        emailEle().sendKeys("minafouad129@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.className("login-button")).click();
        String expectedresult = "My account";
        String actualresult = driver.findElement(By.linkText("My account")).getText();
        Assert.assertTrue(actualresult.contains(expectedresult));
        Thread.sleep(5000);
        driver.findElement(By.className("ico-logout")).click();

    }

    @Test
    public void F03frogotpassword() throws InterruptedException {
        loginEle().click();
        driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]")).click();
        driver.findElement(By.id("Email")).sendKeys("minafouad129@gmail.com");
        driver.findElement(By.name("send-email")).click();
        Thread.sleep(3000);
        String SuccessMsg =driver.findElement(By.className("content")).getText();
        System.out.println(SuccessMsg);
        String expectedresult = "Email with instructions has been sent to you.";
        String actualresult = driver.findElement(By.className("content")).getText();
        Assert.assertTrue(actualresult.contains(expectedresult),"Error Message: Text is wrong");
        driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png\"]")).click();
        Thread.sleep(5000);

    }

    @Test
    public void F04searchforproduct() throws InterruptedException {
        loginEle().click();
        emailEle().sendKeys("minafouad129@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.className("login-button")).click();
        driver.findElement(By.name("q")).sendKeys("Laptop");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=Laptop");
        Thread.sleep(5000);
        driver.findElement(By.className("ico-logout")).click();

    }


    @Test
    public void F05changecurrencies() throws InterruptedException {
        loginEle().click();
        emailEle().sendKeys("minafouad129@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.className("login-button")).click();
        driver.findElement(By.id("customerCurrency")).click();
        driver.findElement(By.id("customerCurrency")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("customerCurrency")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.className("ico-logout")).click();


    }

    @Test
    public void F06searchcategory() throws InterruptedException {
        loginEle().click();
        emailEle().sendKeys("minafouad129@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.className("login-button")).click();
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

    @Test
    public void F07addingproducttoshoppingcard() throws InterruptedException {

        loginEle().click();
        emailEle().sendKeys("minafouad129@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.className("login-button")).click();
        driver.findElement(By.cssSelector("img[alt=\"nopCommerce demo store\"]")).click();
        Actions action3=  new Actions(driver);
        action3.clickAndHold(driver.findElement(By.linkText("Apparel")))
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
        driver.findElement(By.id("add-to-cart-button-25")).click();
        Thread.sleep(3000);
        String actualresult =driver.findElement(By.className("content")).getText();
        String expectedresult = "The product has been added to your shopping cart";
        Assert.assertTrue(actualresult.contains(expectedresult));
        System.out.println(actualresult);
        Thread.sleep(5000);
        driver.findElement(By.className("ico-logout")).click();


    }


    @Test
    public void F08addtowhillist() throws InterruptedException {
        loginEle().click();
        emailEle().sendKeys("minafouad129@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.className("login-button")).click();
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
        String actualresult =driver.findElement(By.className("content")).getText();
        String expectedresult = "The product has been added to your wishlist";
        Assert.assertTrue(actualresult.contains(expectedresult));
        System.out.println(actualresult);
        Thread.sleep(5000);
        driver.findElement(By.className("ico-logout")).click();


    }

    @Test
    public void F09addtocomparelist() throws InterruptedException {
        loginEle().click();
        emailEle().sendKeys("minafouad129@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.className("login-button")).click();
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
        Thread.sleep(6000);
        driver.findElement(By.cssSelector("span[style=\"background-color:#363656\"]")).click();
        driver.findElement(By.className("add-to-compare-list-button")).click();
        Thread.sleep(3000);
        String actualresult =driver.findElement(By.className("content")).getText();
        String expectedresult = "The product has been added to your product comparison";
        Assert.assertTrue(actualresult.contains(expectedresult));
        System.out.println(actualresult);
        Thread.sleep(5000);
        driver.findElement(By.className("ico-logout")).click();


    }


    @Test
    public void F10checkout() throws InterruptedException {
        loginEle().click();
        emailEle().sendKeys("minafouad129@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.className("login-button")).click();

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


    @AfterTest
    public void closedriver() throws InterruptedException {

        Thread.sleep(10000);

        driver.close();

    }
}
