package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class buyMoisturizersPage {
    WebDriver driver ;
    public buyMoisturizersPage(WebDriver driver){
        this.driver=driver;

    }
    By title = By.xpath("//h2[contains(.,'Moisturizers')]");
    By addProduct1 = By.xpath("(//button[contains(.,'Add')])[1]");
    By cart1=By.xpath("//span[contains(.,'1 item(s)')]");
    By produits=By.xpath("//p[@class='font-weight-bold top-space-10']");
    By prix=By.xpath("//p[contains(text() , 'Price')]");

    String prix1;
    String produit1;
    public String getTitle(){
        String titre = driver.findElement(title).getText();
        return  titre;
    }

    public boolean checkerTitrePrix() {

        boolean result=false;
        List<WebElement> listePrix = driver.findElements(prix) ;
        List<WebElement> listProducts = driver.findElements(produits) ;
         prix1=listePrix.get(0).getText().replaceAll("[^0-9]", "");
         produit1=listProducts.get(0).getText();
        for (int i=0; i<6;i++) {

                result = listProducts.get(i).isDisplayed() && listePrix.get(i).isDisplayed();
                    if (!result) return result ;

            }
            return result;
    }

    public boolean addProduct1ToCard(){
        boolean b =false;
                //add item1 to cart
        driver.findElement(addProduct1).click();
        //check if item is in cart
        if (driver.findElement(cart1).isDisplayed()){
             b = true;
        }
        driver.findElement(cart1).click();
        return b;

    }

    public String getPrix1(){
        return prix1;
    }
    public String getProduit1(){
        return produit1;
    }
}