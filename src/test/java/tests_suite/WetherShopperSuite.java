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

        Assert.assertEquals ("Current temperature",homePage.getTitle());
        Assert.assertEquals ("Buy moisturizers",homePage.clickButton_Buy_moisturizers());
        Assert.assertEquals ("Moisturizers",pageBuyMoisturizers.getTitle());
        Assert.assertTrue(pageBuyMoisturizers.checkerTitrePrix());
        Assert.assertTrue(pageBuyMoisturizers.addProduct1ToCard());
        ChecoutPage  checoutPage= new ChecoutPage(driver);
        Assert.assertTrue(checoutPage.VerifyChecout());
        Assert.assertEquals (pageBuyMoisturizers.getPrix1(),checoutPage.getTotal());
        Assert.assertEquals (pageBuyMoisturizers.getProduit1(),checoutPage.getTitreProd());
        Assert.assertEquals ("Pay with Card",checoutPage.clickButtonpaywithcard());
        Assert.assertTrue(checoutPage.checkPopupStripe());
        PayementSuccessPage payementSuccessPage = new PayementSuccessPage(driver);
        //Assert.assertTrue(payementSuccessPage.VerifyPaymentSuccess());
    }
}
