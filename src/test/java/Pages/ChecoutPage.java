package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChecoutPage {
    WebDriver driver ;
    By total = By.xpath("//p[@id='total']");
    By titre=By.xpath("//td[1]");
    By paywithcard = By.xpath("//span[contains(.,'Pay with Card')]");
    By stripe = By.xpath("//h1[contains(.,'Stripe.com')]");

    By email= By.xpath("//input[@id='email']");
    By cardNumber= By.xpath("//input[contains(@id,'card_number')]");
    By date=By.xpath("//input[contains(@id,'cc-exp')]");
    By cvv=By.xpath("//input[contains(@id,'cc-csc')]");
    By CP=By.xpath("//input[contains(@id,'billing-zip')]");
    By Acheter=By.xpath("//span[@class='iconTick']");
    public  ChecoutPage(WebDriver driver){
        this.driver=driver;
    }

    public boolean VerifyChecout(){
        boolean b=false;
        b = driver.findElement(total).isDisplayed();
        return  b;
    }

    public String getTotal() {
        String t=driver.findElement(total).getText();
        t = t.replaceAll("[^0-9]", "");
        return t;
    }

    public String getTitreProd() {

        return driver.findElement(titre).getText();
    }

    public String clickButtonpaywithcard(){

        String paywithcard1 = driver.findElement(paywithcard).getText();
        driver.findElement(paywithcard).click();
        return  paywithcard1;
    }
    public boolean checkPopupStripe() {
        boolean b=true;
        driver.switchTo().frame(0);
        driver.findElement(email).sendKeys("oudalila@gmail.com");
        driver.findElement(cardNumber).sendKeys("3434");
        driver.findElement(cardNumber).sendKeys("343434");
        driver.findElement(cardNumber).sendKeys("34343");
        driver.findElement(date).sendKeys("12");
        driver.findElement(date).sendKeys("2025");
        driver.findElement(cvv).sendKeys("177");
        driver.findElement(CP).sendKeys("AAA");
        driver.findElement(Acheter).click();
        //b = driver.findElement(stripe).isDisplayed();
        return  b;

    }

}
