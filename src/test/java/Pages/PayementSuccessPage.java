package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PayementSuccessPage {
    WebDriver driver ;
    By  title = By.xpath("//h2[contains(.,'PAYMENT SUCCESS')]");

    public PayementSuccessPage(WebDriver driver) {
        this.driver=driver;
    }

    public boolean VerifyPaymentSuccess(){
        boolean b=false;
        b = driver.findElement(title).isDisplayed();
        return  b;
    }
}
