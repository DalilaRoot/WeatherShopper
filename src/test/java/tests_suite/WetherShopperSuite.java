package tests_suite;

import Configuration.SetupTeardownTest;
import Pages.ChecoutPage;
import Pages.HomePage;
import Pages.PayementSuccessPage;
import Pages.buyMoisturizersPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WetherShopperSuite extends SetupTeardownTest {

   WebDriver driver ;

    @Test
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
        Assert.assertEquals (pageBuyMoisturizers.getPrix1(),checoutPage.getTotal());
        Assert.assertEquals (pageBuyMoisturizers.getProduit1(),checoutPage.getTitreProd());
        checoutPage.clickButtonpaywithcard();
        checoutPage.addInformationCard();
        PayementSuccessPage payementSuccessPage = new PayementSuccessPage(driver);
        payementSuccessPage.VerifyPaymentSuccess();
    }
}
