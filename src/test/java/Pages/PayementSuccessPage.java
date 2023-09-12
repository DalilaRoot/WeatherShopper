package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PayementSuccessPage {
    WebDriver driver ;
    By  title = By.xpath("//h2[contains(.,'PAYMENT SUCCESS')]");

    public PayementSuccessPage(WebDriver driver) {
        this.driver=driver;
    }

    public void VerifyPaymentSuccess(){
        boolean b;
        b = driver.findElement(title).isDisplayed();
        Assert.assertTrue(b) ;

    }
}
