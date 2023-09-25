package steps;

import Pages.buyMoisturizersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static steps.ConfigSteps.getDriver;

public class MoisturizersPageSteps {
    buyMoisturizersPage pageBuyMoisturizers = new buyMoisturizersPage(getDriver());
    @And("check if you are on moisturizers")
    public void checkIfYouAreOnOnMoisturizers() {
        pageBuyMoisturizers.getTitle();

    }
    @And("check if product titles and prices are visible")
    public void   checkifproducttitlesandpricesarevisible(){
        pageBuyMoisturizers.checkerTitrePrix();
    }
    @Then("Add first product to card")
    public void Addfirstproducttocard(){
        pageBuyMoisturizers.addProduct1ToCard();
    }

}
