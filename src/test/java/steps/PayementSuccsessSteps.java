package steps;

import Pages.PayementSuccessPage;
import io.cucumber.java.en.Then;

import static steps.ConfigSteps.getDriver;


public class PayementSuccsessSteps {
    PayementSuccessPage payementSuccessPage = new PayementSuccessPage(getDriver());

    @Then("check if payement is Successed")
    public void checkifpayementisSuccessed(){
        payementSuccessPage.VerifyPaymentSuccess();

    }
}
