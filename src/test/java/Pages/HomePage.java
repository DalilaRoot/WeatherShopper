package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    By  title = By.xpath("//h2");
    By  buttonBuy_moisturizers = By.xpath("//button[contains(.,'Buy moisturizers')]");
    WebDriver driver ;
    public  HomePage(WebDriver driver){
        this.driver=driver;
    }
    public String getTitle(){
        String titre = driver.findElement(title).getText();
        return  titre;
    }
    public String clickButton_Buy_moisturizers(){
        String Buy_moisturizers = driver.findElement(buttonBuy_moisturizers).getText();
        driver.findElement(buttonBuy_moisturizers).click();
        return  Buy_moisturizers;
    }
}
