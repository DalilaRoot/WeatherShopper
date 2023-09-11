package Configuration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class SetupTeardownTest {
    static WebDriver driver;
    @BeforeMethod
    public static void launchBrowser(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\dourba\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

        driver =new FirefoxDriver() ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://weathershopper.pythonanywhere.com/");
    }
    public static WebDriver getDriver(){
        return driver;
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
