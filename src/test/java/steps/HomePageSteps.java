package steps;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static steps.ConfigSteps.getDriver;

public class HomePageSteps {

    HomePage  homePage=new HomePage(getDriver()) ;
    @Given("Go to home page")
    public void goToHomePage() {
        homePage.getTitle();
    }

    @When("click on moisturizers")
    public void clickOnMoisturizers() {
        homePage.clickButton_Buy_moisturizers();

    }
}
