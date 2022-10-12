package stepDefinations;

import Pages.Caller;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;

public class F00_Hooks extends Caller {

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
    @After
    public void user_close_browser()
    {
        driver.quit();
    }

    }






