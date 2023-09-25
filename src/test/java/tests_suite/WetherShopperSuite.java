package tests_suite;

import Configuration.SetupTeardownTest;
import Pages.ChecoutPage;
import Pages.HomePage;
import Pages.PayementSuccessPage;
import Pages.buyMoisturizersPage;
import org.openqa.selenium.WebDriver;


public class WetherShopperSuite extends SetupTeardownTest {

   WebDriver driver ;


    public void CasTest1() throws InterruptedException {

        driver=getDriver();
        HomePage homePage = new HomePage(driver);
        buyMoisturizersPage pageBuyMoisturizers = new buyMoisturizersPage(driver);
        homePage.getTitle();
        homePage.clickButton_Buy_moisturizers();
        pageBuyMoisturizers.getTitle();
        pageBuyMoisturizers.checkerTitrePrix();
        pageBuyMoisturizers.addProduct1ToCard();
        ChecoutPage  checoutPage= new ChecoutPage(driver);
        checoutPage.VerifyChecout();
        checoutPage.CheckTotal();
        checoutPage.ChecktiteProduct();
        checoutPage.clickButtonpaywithcard();
        checoutPage.addInformationCard();
        PayementSuccessPage payementSuccessPage = new PayementSuccessPage(driver);
        payementSuccessPage.VerifyPaymentSuccess();
    }
}
