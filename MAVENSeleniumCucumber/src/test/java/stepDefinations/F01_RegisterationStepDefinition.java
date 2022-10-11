package stepDefinations;

import Pages.Hoocks;
import Pages.LoginPage;
import Pages.Registeration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class F01_RegisterationStepDefinition extends Hoocks {



    @Before
    public void user_open_browser() throws InterruptedException {
        String chrompath =System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chrompath);
        driver = new ChromeDriver();

        // driver.navigate().to("https://the-internet.herokuapp.com/login");
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }






    Registeration Register =new Registeration();
    LoginPage Register2 =new LoginPage();
    @Given("user navigate to registeration page")
    public void user_navigate()  {

        Register.icoregisterEle(driver).click();

    }
    @When("user enter valid input data")
    public void user_enter_data()
    {
        Register.gendermaleEle(driver);
        Register.FirstNameEle(driver).sendKeys("Mina");
        Register.LastNameEle(driver).sendKeys("Fouad");
        Register2.emailEle(driver).sendKeys("minafouad153@gmail.com");
        Register2.passwordEle(driver).sendKeys("Mina@123@456");
        Register.ConfirmPasswordEle(driver).sendKeys("Mina@123@456");
        Register.registerbuttondEle(driver).click();
    }
    @Then("user could register successfully")
    public void user_register() throws InterruptedException {
        String expectedresult = "Your registration completed";
        String actualresult = Register.resultEle(driver).getText();
        Assert.assertTrue(actualresult.contains(expectedresult));
        Thread.sleep(5000);
        Register2.icologoutEle(driver).click();
    }


    @After
    public void user_close_browser()
    {
        driver.quit();
    }




}
