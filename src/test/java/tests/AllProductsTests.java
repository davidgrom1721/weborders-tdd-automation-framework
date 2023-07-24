package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AllOrdersPage;
import pages.AllProductsPage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

import java.time.Duration;
import java.util.List;

public class AllProductsTests extends TestBase{



    @Test(groups = {"smoke"})
    public void verifyDeleteSelectedButton(){

        new LoginPage().loginWithValidCredentials();

        Driver.getDriver().findElement(By.linkText("View all products")).click();
        WebElement element = Driver.getDriver().findElement(By.tagName("h2"));
        Assert.assertTrue(element.isDisplayed());
    }


    @Test
    public void verifyTableColumns(){
        new LoginPage().loginWithValidCredentials();
        List<String> expectedList = List.of("Product name", "Price", "Discount");

        new AllOrdersPage().getViewAllProductsLink().click();

        AllProductsPage allProductsPage = new AllProductsPage();

        List<String> actual = SeleniumUtils.getElementsText(allProductsPage.getHeaderCells());

        Assert.assertEquals(actual, expectedList);




    }

    @Test
    public void verifyProductNames(){

        new LoginPage().loginWithValidCredentials();
        List<String> expectedList = List.of("MyMoney", "FamilyAlbum", "ScreenSaver");

        new AllOrdersPage().getViewAllProductsLink().click();

        List<String> actual = SeleniumUtils.getElementsText(new AllProductsPage().getProductNameCells());

        Assert.assertEquals(actual, expectedList);


    }





}
