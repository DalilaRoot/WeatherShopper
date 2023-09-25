package Pages;

import Constants.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ChecoutPage {
    WebDriver driver ;
    By total = By.xpath("//p[@id='total']");
    By titre=By.xpath("//td[1]");
    By paywithcard = By.xpath("//span[contains(.,'Pay with Card')]");
   // By stripe = By.xpath("//h1[contains(.,'Stripe.com')]");

    By email= By.xpath("//input[@id='email']");
    By cardNumber= By.xpath("//input[contains(@id,'card_number')]");
    By date=By.xpath("//input[contains(@id,'cc-exp')]");
    By cvv=By.xpath("//input[contains(@id,'cc-csc')]");
    By CP=By.xpath("//input[contains(@id,'billing-zip')]");
    By Acheter=By.xpath("//span[@class='iconTick']");
    public  ChecoutPage(WebDriver driver){
        this.driver=driver;
    }

    public void VerifyChecout(){
        boolean b;
        b = driver.findElement(total).isDisplayed();
        Assert.assertTrue(b);
    }

    public void CheckTotal() {
        String t=driver.findElement(total).getText();
        t = t.replaceAll("[^0-9]", "");
        Assert.assertEquals(t, buyMoisturizersPage.getPrix1());
    }
    public void ChecktiteProduct(){

        Assert.assertTrue(buyMoisturizersPage.getProduit1().equalsIgnoreCase(getTitreProd()));

    }
    public String getTitreProd() {

        return driver.findElement(titre).getText();
    }


    public void clickButtonpaywithcard(){

        String paywithcard1 = driver.findElement(paywithcard).getText();
        driver.findElement(paywithcard).click();
        Assert.assertEquals ("Pay with Card",paywithcard1);

    }
    public void addInformationCard() {

        driver.switchTo().frame(0);
        driver.findElement(email).sendKeys(Data.email);
        driver.findElement(cardNumber).sendKeys(Data.cardNumber.trim());
        driver.findElement(cardNumber).sendKeys(Data.cardNumber.trim());
        driver.findElement(cardNumber).sendKeys(Data.cardNumber.trim());
        driver.findElement(date).sendKeys(Data.expDateMonth);
        driver.findElement(date).sendKeys(Data.expDateYear);
        driver.findElement(cvv).sendKeys(Data.cvv);
        driver.findElement(CP).sendKeys(Data.postalCode);
        driver.findElement(Acheter).click();
        driver.switchTo().defaultContent();


    }

}
