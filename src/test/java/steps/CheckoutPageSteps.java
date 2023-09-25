package steps;

import Pages.ChecoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static steps.ConfigSteps.getDriver;

public class CheckoutPageSteps {
    ChecoutPage checoutPage= new ChecoutPage(getDriver());
    @When("Go to checkout page")
    public void  Gotocheckoutpage(){
        checoutPage.VerifyChecout();

    }
    @Then("then check if the product in card is the first product")
    public void thencheckiftheproductincardisthefirstproduct(){
        checoutPage.CheckTotal();
        checoutPage.ChecktiteProduct();
    }
    @When("click to pay with card")
    public void clicktopaywithcard(){
        checoutPage.clickButtonpaywithcard();
    }
    @And("add card informations")
    public void addcardinformations(){
        checoutPage.addInformationCard();
    }


}

