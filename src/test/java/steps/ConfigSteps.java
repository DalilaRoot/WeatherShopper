package steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ConfigSteps {
     static WebDriver driver;

     @BeforeAll
     public static void Setup(){
            System.setProperty("webdriver.gecko.driver","C:\\Users\\dourba\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

            driver =new FirefoxDriver() ;
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
            driver.get("https://weathershopper.pythonanywhere.com/");
        }
        public static WebDriver getDriver(){
            return driver;
        }
        @AfterAll
        public static void Teardown(){
            driver.quit();
        }
}


