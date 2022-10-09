package stepDefinations;

import Pages.Hoocks;
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






    @Given("user navigate to registeration page")
    public void user_navigate()  {

        driver.findElement(By.className("ico-register")).click();
    }
    @When("user enter valid input data")
    public void user_enter_data()
    {
        driver.findElement(By.id("gender-male"));
        driver.findElement(By.id("FirstName")).sendKeys("Mina");
        driver.findElement(By.id("LastName")).sendKeys("Fouad");
        driver.findElement(By.id("Email")).sendKeys("minafouad141@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Mina@123@456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Mina@123@456");
        driver.findElement(By.id("register-button")).click();
    }
    @Then("user could register successfully")
    public void user_register() throws InterruptedException {
        String expectedresult = "Your registration completed";
        String actualresult = driver.findElement(By.className("result")).getText();
        Assert.assertTrue(actualresult.contains(expectedresult));
        Thread.sleep(5000);
        driver.findElement(By.className("ico-logout")).click();
    }


    @After
    public void user_close_browser()
    {
        driver.quit();
    }




}
